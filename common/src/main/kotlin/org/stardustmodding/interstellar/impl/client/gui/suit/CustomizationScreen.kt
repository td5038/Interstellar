package org.stardustmodding.interstellar.impl.client.gui.suit

import net.minecraft.entity.player.PlayerInventory
import net.minecraft.text.Text
import org.stardustmodding.interstellar.api.client.gui.SharedScreen

@Suppress("UNUSED_PARAMETER")
class CustomizationScreen(handler: CustomizationScreenHandler) : SharedScreen<CustomizationScreenHandler>(
    handler,
    Text.translatable("interstellar.screens.suit.customization"),
    600,
    400
) {
    constructor(handler: CustomizationScreenHandler, inv: PlayerInventory, title: Text) : this(handler)
}
