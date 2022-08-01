package com.github.chasical.extended_minecraft.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class BlockPlacementChecks {
    public static boolean isSurroundedByAir(LevelAccessor world, double x, double y, double z) {
        double sx = x + 1;
        double sy = y + 1;
        double sz = z + 1;
        if ((world.getBlockState(new BlockPos(x, sy, z))).getBlock() == Blocks.AIR) {
            return true;
        } else if ((world.getBlockState(new BlockPos(sx, y, z))).getBlock() == Blocks.AIR) {
            sx = x - 1;
            return true;
        } else if ((world.getBlockState(new BlockPos(x, y, sz))).getBlock() == Blocks.AIR) {
            sz = z - 1;
            return true;
        } else if ((world.getBlockState(new BlockPos(x, sy, z))).getBlock() == Blocks.AIR) {
            return true;
        } else if ((world.getBlockState(new BlockPos(x, y, sz))).getBlock() == Blocks.AIR) {
            return true;
        } else return (world.getBlockState(new BlockPos(sx, y, z))).getBlock() == Blocks.AIR;

    }
}
