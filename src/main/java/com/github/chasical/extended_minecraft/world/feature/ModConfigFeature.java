package com.github.chasical.extended_minecraft.world.feature;

import com.github.chasical.extended_minecraft.block.ModBlock;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfigFeature {
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_COSMIC_WASTE_LARGE = FeatureUtils.register("ore_cosmic_waste_large",
           Feature.SCATTERED_ORE, new OreConfiguration(
                   new BlockMatchTest(Blocks.END_STONE),
                   ModBlock.COSMIC_WASTE.get().defaultBlockState(),
                   3));

   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_COSMIC_WASTE_SMALL = FeatureUtils.register("ore_cosmic_waste_small",
           Feature.SCATTERED_ORE, new OreConfiguration(
                   new BlockMatchTest(Blocks.END_STONE),
                   ModBlock.COSMIC_WASTE.get().defaultBlockState(),
                   2));


}
