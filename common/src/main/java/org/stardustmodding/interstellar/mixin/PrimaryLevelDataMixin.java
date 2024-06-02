/*
 * Copyright (c) 2021-2023 Team Galacticraft
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.stardustmodding.interstellar.mixin;

import org.stardustmodding.dynamicdimensions.impl.accessor.PrimaryLevelDataAccessor;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.level.LevelProperties;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(LevelProperties.class)
public abstract class PrimaryLevelDataMixin implements PrimaryLevelDataAccessor {
    private @Unique List<RegistryKey<World>> dynamicDimensions = null;

    @Inject(method = "updateProperties", at = @At("RETURN"))
    private void skipWritingDynamicDimensions(DynamicRegistryManager registryManager, @NotNull NbtCompound levelNbt, NbtCompound playerNbt, CallbackInfo ci) {
        if (this.dynamicDimensions != null) {
            NbtCompound dimensions = levelNbt.getCompound("WorldGenSettings").getCompound("dimensions");
            for (RegistryKey<World> dynamicDimension : this.dynamicDimensions) {
                dimensions.remove(dynamicDimension.getValue().toString());
            }
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setDynamicList(@NotNull List<? extends RegistryKey<World>> dynamicDimensions) {
        this.dynamicDimensions = (List<RegistryKey<World>>) dynamicDimensions;
    }
}
