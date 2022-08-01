package com.github.chasical.extended_minecraft.world.feature;

import com.github.chasical.extended_minecraft.procedures.BlockPlacementChecks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementFilter;

public class ModPlacedFeature  {
    public static final Holder<PlacedFeature> ORE_COSMIC_WASTE_LARGE = PlacementUtils.register("ore_cosmic_waste_large",
            ModConfigFeature.ORE_COSMIC_WASTE_LARGE, InSquarePlacement.spread(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(0),
                    VerticalAnchor.absolute(100)));
    public static final Holder<PlacedFeature> ORE_COSMIC_WASTE_SMALL = PlacementUtils.register("ore_cosmic_waste_small",
            ModConfigFeature.ORE_COSMIC_WASTE_SMALL, InSquarePlacement.spread(),
                    PlacementUtils.RANGE_8_8);
}
