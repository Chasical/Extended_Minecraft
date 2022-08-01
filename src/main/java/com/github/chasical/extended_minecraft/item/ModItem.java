package com.github.chasical.extended_minecraft.item;

import com.github.chasical.extended_minecraft.ExtendedMinecraft;
import com.github.chasical.extended_minecraft.gui.ModCreativeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtendedMinecraft.MOD_ID);

    public static final RegistryObject<Item> END_ROCK = ITEMS.register("end_rock",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeTab.EM_END_TAB)
            ));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
