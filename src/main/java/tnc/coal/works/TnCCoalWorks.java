package tnc.coal.works;

import tnc.coal.works.core.init.BlockInit;
import tnc.coal.works.core.init.ItemInit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TnCCoalWorks.MODID)
public class TnCCoalWorks {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "tnccoalworks";
	public static final ItemGroup TNCCOALWORKS_GROUP = new TnCCoalWorksGroup("tnccoalworkstab");

	public TnCCoalWorks() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		bus.addListener(this::doClientStuff);
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		MinecraftForge.EVENT_BUS.register(this);
	}
	private void setup(final FMLCommonSetupEvent event) {
	}
	private void doClientStuff(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONETORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONEWALLTORCH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(BlockInit.COBBLESTONELADDERBLOCK.get(), RenderType.getCutout());
	}
	public static class TnCCoalWorksGroup extends ItemGroup {
		public TnCCoalWorksGroup(String label) {
			super(label);
		}
		@Override
		public ItemStack createIcon() {
			return ItemInit.CHARCOALBLOCK.get().getDefaultInstance();
		}
	}
}