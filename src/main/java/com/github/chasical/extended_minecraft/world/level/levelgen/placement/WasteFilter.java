package com.github.chasical.extended_minecraft.world.level.levelgen.placement;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementFilter;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

public class WasteFilter extends PlacementFilter {

    private static final WasteFilter INSTANCE = new WasteFilter();
    public static Codec<WasteFilter> CODEC = Codec.unit(() -> {
        return INSTANCE;
    });

    public static WasteFilter filter() {
        return INSTANCE;
    }

    @Override
    protected boolean shouldPlace(PlacementContext p_226382_, RandomSource p_226383_, BlockPos p_226384_) {
        System.out.println("Placement Context" + p_226382_);
        System.out.println("Random Source" + p_226383_);
        System.out.println("BlockPos" + p_226384_);
        return true;
    }

    @Override
    public PlacementModifierType<?> type() {
        return PlacementModifierType.BIOME_FILTER;
    }
}
