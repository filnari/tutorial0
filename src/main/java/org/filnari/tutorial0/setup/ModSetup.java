package org.filnari.tutorial0.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.filnari.tutorial0.blocks.ModBlocks;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("tutorial0") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init() {

    }
}
