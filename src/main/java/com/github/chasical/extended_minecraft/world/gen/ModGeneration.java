package com.github.chasical.extended_minecraft.world.gen;

import com.github.chasical.extended_minecraft.world.feature.ModPlacedFeature;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeature.ORE_COSMIC_WASTE_LARGE);
        base.add(ModPlacedFeature.ORE_COSMIC_WASTE_SMALL);

    }
}
