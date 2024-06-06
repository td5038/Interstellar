package org.stardustmodding.interstellar.api.registry

import com.mojang.serialization.Lifecycle
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.SimpleDefaultedRegistry
import org.stardustmodding.interstellar.api.gas.Gas
import org.stardustmodding.interstellar.api.planet.Planet
import org.stardustmodding.interstellar.api.planet.PlanetSettings
import org.stardustmodding.interstellar.api.starsystem.StarSystem
import org.stardustmodding.interstellar.impl.Interstellar.id

object InterstellarRegistries {
    // Keys

    private val PLANET_SETTINGS_KEY = RegistryKey.ofRegistry<PlanetSettings>(id("planet_settings"))!!
    private val PLANETS_KEY = RegistryKey.ofRegistry<Planet>(id("planets"))!!
    private val STAR_SYSTEMS_KEY = RegistryKey.ofRegistry<StarSystem>(id("star_systems"))!!
    private val GASES_KEY = RegistryKey.ofRegistry<Gas>(id("gases"))!!

    // Registries

    @JvmField
    val PLANET_SETTINGS = SimpleDefaultedRegistry(id("planet_settings").toString(), PLANET_SETTINGS_KEY, Lifecycle.experimental(), false)

    @JvmField
    val PLANETS = SimpleDefaultedRegistry(id("planet").toString(), PLANETS_KEY, Lifecycle.experimental(), false)

    @JvmField
    val STAR_SYSTEMS = SimpleDefaultedRegistry(id("star_system").toString(), STAR_SYSTEMS_KEY, Lifecycle.experimental(), false)

    @JvmField
    val GASES = SimpleDefaultedRegistry(id("gas").toString(), GASES_KEY, Lifecycle.experimental(), false)
}