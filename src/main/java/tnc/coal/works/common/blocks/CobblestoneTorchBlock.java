package tnc.coal.works.common.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class CobblestoneTorchBlock extends TorchBlock {
	public CobblestoneTorchBlock() {
		super(Properties.from(Blocks.TORCH), ParticleTypes.FLAME);
	}
	@Override
	public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
		return 15;
	}
}