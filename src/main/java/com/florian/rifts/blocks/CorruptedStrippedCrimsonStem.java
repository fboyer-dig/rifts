package com.florian.rifts.blocks;

import com.florian.rifts.Rifts;
import com.florian.rifts.util.AbstractCorruptedBlock;
import com.florian.rifts.util.Corruptor;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class CorruptedStrippedCrimsonStem extends AbstractCorruptedBlock {
    public CorruptedStrippedCrimsonStem() {
        super(FabricBlockSettings.of(Material.AGGREGATE)
                .strength(1f, 5f));
    }

    @Override
    public Block backwardReplacementMap(Block old) {
        return Rifts.Blocks.BURNED_STRIPPED_CRIMSON_STEM;
    }

    @Override
    public boolean doesReplace(World world, BlockPos pos) {
        return world.getBlockState(pos).isOf(STRIPPED_CRIMSON_STEM);
    }
}
