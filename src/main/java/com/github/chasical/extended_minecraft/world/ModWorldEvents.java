package com.github.chasical.extended_minecraft.world;

import com.github.chasical.extended_minecraft.ExtendedMinecraft;
import com.github.chasical.extended_minecraft.world.gen.ModGeneration;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExtendedMinecraft.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModGeneration.generateOres(event);
        System.out.println("WOAH THIS IS BEING REGisTeRED1111");

    }

}
