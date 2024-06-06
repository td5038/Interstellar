package org.stardustmodding.interstellar.impl.client.init

import dev.architectury.registry.menu.MenuRegistry
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.client.MinecraftClient
import net.minecraft.screen.ScreenHandler
import org.stardustmodding.interstellar.api.client.gui.SharedScreen
import org.stardustmodding.interstellar.api.init.InitializedClient
import org.stardustmodding.interstellar.impl.client.gui.suit.CustomizationScreen
import org.stardustmodding.interstellar.impl.client.gui.suit.CustomizationScreenHandler
import org.stardustmodding.interstellar.impl.init.Screens

@Environment(EnvType.CLIENT)
object ClientScreens: InitializedClient {
    override fun init(it: MinecraftClient) {
        MenuRegistry.registerScreenFactory(Screens.SUIT_CUSTOMIZATION_HANDLER, ::CustomizationScreen)
    }
}
