package com.github.chasical.extended_minecraft.gui;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeTab {
    public static final CreativeModeTab EM_END_TAB = new CreativeModeTab("em_end_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.END_STONE);
        }
    };
}
