package tnc.coal.works.common.blocks;

import tnc.coal.works.core.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class CobblestoneWallTorchBlock extends WallTorchBlock {
	@SuppressWarnings("deprecation")
	public CobblestoneWallTorchBlock() {
		super(Block.Properties.from(Blocks.WALL_TORCH).lootFrom(BlockInit.COBBLESTONETORCH.get()), ParticleTypes.FLAME);
	}
	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
		return 15;
	}
}