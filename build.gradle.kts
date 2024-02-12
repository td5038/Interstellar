import net.fabricmc.loom.api.LoomGradleExtensionAPI

plugins {
    id("java")
    kotlin("jvm") version "1.8.22"
    id("architectury-plugin") version "3.4-SNAPSHOT"
    id("dev.architectury.loom") version "1.2-SNAPSHOT" apply false
    id("com.github.johnrengelman.shadow") version "8.1.1" apply false
}

architectury {
    minecraft = rootProject.property("minecraft_version").toString()
}

allprojects {
    apply(plugin = "java")
    apply(plugin = "kotlin")
    apply(plugin = "architectury-plugin")
    apply(plugin = "maven-publish")
    apply(plugin = "com.github.johnrengelman.shadow")

    base.archivesName.set(rootProject.property("archives_base_name").toString())
    version = rootProject.property("mod_version").toString()
    group = rootProject.property("maven_group").toString()

    repositories {
        mavenCentral()

        maven {
            name = "TerraformersMC Maven"
            url = uri("https://maven.terraformersmc.com/releases")
        }

        maven {
            name = "Shedaniel Maven"
            url = uri("https://maven.shedaniel.me")
        }

        maven {
            name = "WispForest Maven"
            url = uri("https://maven.wispforest.io")
        }

        maven {
            name = "Galacticraft Maven"
            url = uri("https://maven.galacticraft.net/repository/maven-releases/")
        }

        maven {
            name = "Kyrptonaught Maven"
            url = uri("https://maven.kyrptonaught.dev")
        }

        maven {
            name = "BadAsIntended Maven"
            url = uri("https://maven2.bai.lol")
        }

        maven {
            name = "ParchmentMC Maven"
            url = uri("https://maven.parchmentmc.org")
        }
    }

    dependencies {
        compileOnly("org.jetbrains.kotlin:kotlin-stdlib")
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release.set(17)
    }

    kotlin.target.compilations.all {
        kotlinOptions.jvmTarget = "17"
    }

    java {
        withSourcesJar()
    }
}

subprojects {
    apply(plugin = "dev.architectury.loom")

    val loom = project.extensions.getByName<LoomGradleExtensionAPI>("loom")

    dependencies {
        "minecraft"("com.mojang:minecraft:${rootProject.property("minecraft_version")}")

        "mappings"(loom.layered {
            officialMojangMappings()
            parchment("org.parchmentmc.data:parchment-1.20.1:2023.09.03@zip")
        })
    }
}
