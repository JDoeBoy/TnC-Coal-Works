package tnc.coal.works.core.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tnc.coal.works.TnCCoalWorks;
import tnc.coal.works.common.items.PolCompCharcoal;
import tnc.coal.works.common.items.PolDCompCharcoal;
import tnc.coal.works.common.items.CharcoalBlock;
import tnc.coal.works.common.items.CharcoalChunk;
import tnc.coal.works.common.items.CoalChunk;
import tnc.coal.works.common.items.CoalTippedRung;
import tnc.coal.works.common.items.CobblestoneLadderBlock;
import tnc.coal.works.common.items.CobblestoneStick;
import tnc.coal.works.common.items.CobblestoneTorchBlockItem;
import tnc.coal.works.common.items.CompCharcoalBlock;
import tnc.coal.works.common.items.DCompCharcoalBlock;
import tnc.coal.works.common.items.PolCharcoalBlock;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TnCCoalWorks.MODID);
	public static final RegistryObject<Item> CHARCOALCHUNK = ITEMS.register("charcoal_chunk", CharcoalChunk::new);
	public static final RegistryObject<Item> COALCHUNK = ITEMS.register("coal_chunk", CoalChunk::new);
	public static final RegistryObject<Item> CHARCOALBLOCK = ITEMS.register("charcoal_block", CharcoalBlock::new);
	public static final RegistryObject<Item> POLCHARCOALBLOCK = ITEMS.register("pol_charcoal_block", PolCharcoalBlock::new);
	public static final RegistryObject<Item> COMPCHARCOALBLOCK = ITEMS.register("comp_charcoal_block", CompCharcoalBlock::new);
	public static final RegistryObject<Item> DCOMPCHARCOALBLOCK = ITEMS.register("dcomp_charcoal_block", DCompCharcoalBlock::new);
	public static final RegistryObject<Item> COBBLESTONETORCH = ITEMS.register("cobblestone_torch",CobblestoneTorchBlockItem::new);
	public static final RegistryObject<Item> COBBLESTONESTICK = ITEMS.register("cobblestone_stick",CobblestoneStick::new);
	public static final RegistryObject<Item> POLCOMPCHARCOAL = ITEMS.register("pol_comp_charcoal", PolCompCharcoal::new);
	public static final RegistryObject<Item> POLDCOMPCHARCOAL = ITEMS.register("pol_dcomp_charcoal", PolDCompCharcoal::new);
	public static final RegistryObject<Item> COBBLESTONELADDERBLOCK = ITEMS.register("cobblestone_ladder", CobblestoneLadderBlock::new);
	public static final RegistryObject<Item> COALTIPPEDRUNG = ITEMS.register("coaltipped_rung", CoalTippedRung::new);
}