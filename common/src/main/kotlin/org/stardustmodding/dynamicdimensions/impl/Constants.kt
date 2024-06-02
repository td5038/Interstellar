package org.stardustmodding.dynamicdimensions.impl

import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.stardustmodding.dynamicdimensions.impl.config.DynamicDimensionsConfig
import org.stardustmodding.dynamicdimensions.impl.platform.Services

object Constants {
    const val MOD_ID: String = "dynamicdimensions"

    val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)
    val CONFIG: DynamicDimensionsConfig = Services.PLATFORM.config

    val CREATE_WORLD_PACKET: Identifier = Identifier(MOD_ID, "create_world")
    val DELETE_WORLD_PACKET: Identifier = Identifier(MOD_ID, "delete_world")
}