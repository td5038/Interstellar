package org.stardustmodding.interstellar.impl.config.defaults

import org.stardustmodding.interstellar.api.builder.PlanetConfigBuilder
import org.stardustmodding.interstellar.impl.Interstellar
import org.stardustmodding.interstellar.impl.config.GasConfig

/**
 * Quick note: If this is off, sorry, I am trying to be
 * scientifically correct here. This was what
 * I could find as of October 10, 2023.
 * - RedstoneWizard08
 */
object DefaultPlanetConfigs {
    val MERCURY =
        PlanetConfigBuilder(Interstellar.MOD_ID, "mercury")
            .enable(true)
            .dimension(1001)
            .radiation(0.0f)
            .enableOxygen(true)
            .enablePressure(true)
            .enableRadiation(true)
            .tier(4)
            .build()

    val VENUS =
        PlanetConfigBuilder(Interstellar.MOD_ID, "venus")
            .enable(true)
            .dimension(1002)
            .radiation(0.0004166666f)
            // 97% carbon dioxide, 3% nitrogen
            .gas(GasConfig(Interstellar.MOD_ID, "carbon_dioxide", 8827.0f))
            .gas(GasConfig(Interstellar.MOD_ID, "nitrogen", 273.0f))
            .enableOxygen(true)
            .enablePressure(true)
            .enableRadiation(true)
            .tier(3)
            .build()

    val EARTH =
        PlanetConfigBuilder(Interstellar.MOD_ID, "earth")
            .enable(true)
            .dimension(0)
            .radiation(0.0f)
            // 78% nitrogen, 20.95% oxygen, 1% argon, 0.05% carbon dioxide
            .gas(GasConfig(Interstellar.MOD_ID, "nitrogen", 78.0f))
            .gas(GasConfig(Interstellar.MOD_ID, "oxygen", 20.95f))
            .gas(GasConfig(Interstellar.MOD_ID, "argon", 1.0f))
            .gas(GasConfig(Interstellar.MOD_ID, "carbon_dioxide", 0.05f))
            .enableOxygen(true)
            .enablePressure(true)
            // No radiation on earth
            .enableRadiation(false)
            // Anything can access this from any tier
            .tier(0)
            .build()

    val MOON =
        PlanetConfigBuilder(Interstellar.MOD_ID, "moon")
            .enable(true)
            .dimension(1003)
            .radiation(0.0008333333f)
            .enableOxygen(true)
            .enablePressure(true)
            .enableRadiation(true)
            .tier(1)
            .build()

    val MARS =
        PlanetConfigBuilder(Interstellar.MOD_ID, "mars")
            .enable(true)
            .dimension(1004)
            .radiation(0.00106481f)
            // 95% carbon dioxide, 3% nitrogen, 1.6% argon, 0.4% methane
            .gas(GasConfig(Interstellar.MOD_ID, "carbon_dioxide", 0.57f))
            .gas(GasConfig(Interstellar.MOD_ID, "nitrogen", 0.018f))
            .gas(GasConfig(Interstellar.MOD_ID, "argon", 0.0096f))
            .gas(GasConfig(Interstellar.MOD_ID, "methane", 0.0024f))
            .enableOxygen(true)
            .enablePressure(true)
            .enableRadiation(true)
            .tier(2)
            .build()

    val SATURN =
        PlanetConfigBuilder(Interstellar.MOD_ID, "saturn")
            .enable(true)
            .dimension(1005)
            // I couldn't find anything. :(
            .radiation(0.0f)
            // 75% hydrogen, 25% helium
            .gas(GasConfig(Interstellar.MOD_ID, "hydrogen", 105.0f))
            .gas(GasConfig(Interstellar.MOD_ID, "helium", 35.0f))
            .enableOxygen(true)
            .enablePressure(true)
            .enableRadiation(true)
            .tier(5)
            .build()

    val URANUS =
        PlanetConfigBuilder(Interstellar.MOD_ID, "uranus")
            .enable(true)
            .dimension(1006)
            // I couldn't find anything. :(
            .radiation(0.0f)
            // 60% hydrogen, 38% helium, 2% ammonia (based on estimates)
            .gas(GasConfig(Interstellar.MOD_ID, "hydrogen", 60000.0f))
            .gas(GasConfig(Interstellar.MOD_ID, "helium", 38000.0f))
            .gas(GasConfig(Interstellar.MOD_ID, "ammonia", 2000.0f))
            .enableOxygen(true)
            .enablePressure(true)
            .enableRadiation(true)
            .tier(6)
            .build()

    val NEPTUNE =
        PlanetConfigBuilder(Interstellar.MOD_ID, "neptune")
            .enable(true)
            .dimension(1007)
            // I couldn't find anything. :(
            .radiation(0.0f)
            // 60% hydrogen, 38% helium, 2% methane (based on estimates)
            .gas(GasConfig(Interstellar.MOD_ID, "hydrogen", 6000000.0f))
            .gas(GasConfig(Interstellar.MOD_ID, "helium", 3800000.0f))
            .gas(GasConfig(Interstellar.MOD_ID, "methane", 200000.0f))
            .enableOxygen(true)
            .enablePressure(true)
            .enableRadiation(true)
            .tier(7)
            .build()

    val PLUTO =
        PlanetConfigBuilder(Interstellar.MOD_ID, "pluto")
            .enable(true)
            .dimension(1008)
            // I couldn't find anything. :(
            .radiation(0.0f)
            .enableOxygen(true)
            .enablePressure(true)
            .enableRadiation(true)
            .tier(8)
            .build()
}
