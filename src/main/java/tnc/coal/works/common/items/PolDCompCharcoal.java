package tnc.coal.works.common.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import tnc.coal.works.TnCCoalWorks;
import tnc.coal.works.core.init.BlockInit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class PolDCompCharcoal extends BlockItem {

	public PolDCompCharcoal() {
		super(BlockInit.POLDCOMPCHARCOAL.get(), new BlockItem.Properties().group(TnCCoalWorks.TNCCOALWORKS_GROUP));
	}
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		if (InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
			tooltip.add(new StringTextComponent("TnC Coal Works").mergeStyle(TextFormatting.DARK_RED));
		} else {
			tooltip.add(new TranslationTextComponent("Cooks 23,328 items").mergeStyle(TextFormatting.BLUE));
		}
	}
	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		return new TranslationTextComponent(this.getTranslationKey(stack)).mergeStyle(TextFormatting.WHITE);
	}
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return (200 * 8 * 9 * 9 * 9 * 4);
	}
}