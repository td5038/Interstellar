package dev.niostone.interstellar.impl.config;

import dev.niostone.interstellar.impl.Interstellar
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.minecraft.resources.ResourceLocation;

@Config(name = "gases")
class GasConfig: ConfigData {
    var id: String
    var quantity: Float

    constructor() : this(Interstellar.MOD_ID, "null", -1.0f)

    constructor(id: String, quantity: Float) {
        this.id = id;
        this.quantity = quantity;
    }

    constructor(id: ResourceLocation, quantity: Float) {
        this.id = id.toString();
        this.quantity = quantity;
    }

    constructor(namespace: String, id: String, quantity: Float) {
        this.id = "$namespace:$id";
        this.quantity = quantity;
    }
}
