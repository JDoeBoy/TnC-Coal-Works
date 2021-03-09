package tnc.coal.works.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraftforge.common.ToolType;

public class PolDCompCharcoal extends Block {
	public PolDCompCharcoal() {
		super(Properties.create(Material.ROCK).hardnessAndResistance(6.0F, 9.0F).sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE).setRequiresTool());
	}
}