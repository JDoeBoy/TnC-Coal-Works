package tnc.coal.works.core.init;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tnc.coal.works.TnCCoalWorks;
import tnc.coal.works.common.blocks.CharcoalBlock;
import tnc.coal.works.common.blocks.CobblestoneLadderBlock;
import tnc.coal.works.common.blocks.CobblestoneTorchBlock;
import tnc.coal.works.common.blocks.CobblestoneWallTorchBlock;
import tnc.coal.works.common.blocks.CompCharcoalBlock;
import tnc.coal.works.common.blocks.DCompCharcoalBlock;
import tnc.coal.works.common.blocks.PolCharcoalBlock;
import tnc.coal.works.common.blocks.PolCompCharcoal;
import tnc.coal.works.common.blocks.PolDCompCharcoal;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TnCCoalWorks.MODID);
	public static final RegistryObject<Block> CHARCOALBLOCK = BLOCKS.register("charcoal_block", CharcoalBlock::new);
	public static final RegistryObject<Block> POLCHARCOALBLOCK = BLOCKS.register("pol_charcoal_block", PolCharcoalBlock::new);
	public static final RegistryObject<Block> COMPCHARCOALBLOCK = BLOCKS.register("comp_charcoal_block", CompCharcoalBlock::new);
	public static final RegistryObject<Block> DCOMPCHARCOALBLOCK = BLOCKS.register("dcomp_charcoal_block", DCompCharcoalBlock::new);
	public static final RegistryObject<Block> COBBLESTONETORCH = BLOCKS.register("cobblestone_torch", CobblestoneTorchBlock::new);
	public static final RegistryObject<Block> COBBLESTONEWALLTORCH = BLOCKS.register("cobblestone_wall_torch", CobblestoneWallTorchBlock::new);
	public static final RegistryObject<Block> POLCOMPCHARCOAL = BLOCKS.register("pol_comp_charcoal", PolCompCharcoal::new);
	public static final RegistryObject<Block> POLDCOMPCHARCOAL = BLOCKS.register("pol_dcomp_charcoal", PolDCompCharcoal::new);
	public static final RegistryObject<Block> COBBLESTONELADDERBLOCK = BLOCKS.register("cobblestone_ladder", CobblestoneLadderBlock::new);
}