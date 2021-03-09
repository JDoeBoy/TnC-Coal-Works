package tnc.coal.works.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraftforge.common.ToolType;

public class CharcoalBlock extends Block {
	public CharcoalBlock() {
		super(Properties.create(Material.ROCK).hardnessAndResistance(4.0F, 6.0F).sound(SoundType.STONE)
				.harvestTool(ToolType.PICKAXE).setRequiresTool());
	}
}
