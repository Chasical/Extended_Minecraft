package com.github.chasical.extended_minecraft;

import com.github.chasical.extended_minecraft.block.ModBlock;
import com.github.chasical.extended_minecraft.item.ModItem;
import com.github.chasical.extended_minecraft.world.biomemods.ModBiomeModifier;
import com.github.chasical.extended_minecraft.world.feature.ModPlacedFeature;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtendedMinecraft.MOD_ID)
public class ExtendedMinecraft
{
    public static final String MOD_ID = "extended_minecraft";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ExtendedMinecraft() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItem.register(eventBus);
        ModBlock.register(eventBus);

        ModBiomeModifier.register(eventBus);

        ModPlacedFeature.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
    }
}
