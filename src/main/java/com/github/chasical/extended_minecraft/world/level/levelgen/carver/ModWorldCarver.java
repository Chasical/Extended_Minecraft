package com.github.chasical.extended_minecraft.world.level.levelgen.carver;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.carver.CarverConfiguration;
import net.minecraft.world.level.levelgen.carver.CaveCarverConfiguration;
import net.minecraft.world.level.levelgen.carver.WorldCarver;

public abstract class ModWorldCarver<C extends CarverConfiguration> {
    //public static final ModWorldCarver<CaveCarverConfiguration> END_CAVE = register("end_cave", new EndWorldCarver(CaveCarverConfiguration.CODEC));

    //private static <C extends CarverConfiguration, F extends ModWorldCarver<C>> F register(String pkey, F pCarver) {
    //    return Registry.register(Registry.CARVER_REGISTRY, pKey, pCarver);
    //}
}
