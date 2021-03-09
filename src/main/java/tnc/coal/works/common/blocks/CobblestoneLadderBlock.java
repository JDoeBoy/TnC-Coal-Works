package tnc.coal.works.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CobblestoneLadderBlock extends LadderBlock {
    public CobblestoneLadderBlock() {
        super(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.4F).sound(SoundType.BASALT).notSolid());
    }
}