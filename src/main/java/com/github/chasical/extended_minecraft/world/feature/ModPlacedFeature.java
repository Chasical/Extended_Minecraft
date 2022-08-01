package com.github.chasical.extended_minecraft.world.feature;

import com.github.chasical.extended_minecraft.ExtendedMinecraft;
import com.github.chasical.extended_minecraft.procedures.BlockPlacementChecks;
import com.github.chasical.extended_minecraft.world.level.levelgen.placement.WasteFilter;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementFilter;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeature  {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, ExtendedMinecraft.MOD_ID);
    public static final RegistryObject<PlacedFeature> ORE_COSMIC_WASTE_LARGE = PLACED_FEATURES.register("ore_cosmic_waste_large",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            ModConfigFeature.ORE_COSMIC_WASTE_LARGE, List.of(InSquarePlacement.spread(),
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(0),
                    VerticalAnchor.absolute(100)
                    ), WasteFilter.filter())));
    public static final RegistryObject<PlacedFeature> ORE_COSMIC_WASTE_SMALL = PLACED_FEATURES.register("ore_cosmic_waste_small",
            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
            ModConfigFeature.ORE_COSMIC_WASTE_SMALL, List.of(InSquarePlacement.spread(),
                    PlacementUtils.RANGE_8_8)));

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}
