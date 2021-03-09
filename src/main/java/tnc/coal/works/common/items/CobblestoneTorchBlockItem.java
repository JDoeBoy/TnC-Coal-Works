package tnc.coal.works.common.items;

import tnc.coal.works.TnCCoalWorks;
import tnc.coal.works.core.init.BlockInit;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.WallOrFloorItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class CobblestoneTorchBlockItem extends WallOrFloorItem {
	public CobblestoneTorchBlockItem() {
		super(BlockInit.COBBLESTONETORCH.get(), BlockInit.COBBLESTONEWALLTORCH.get(),
				new WallOrFloorItem.Properties().group(TnCCoalWorks.TNCCOALWORKS_GROUP));
	}
	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		return new TranslationTextComponent(this.getTranslationKey(stack)).mergeStyle(TextFormatting.WHITE);
	}
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("Too Easy").mergeStyle(TextFormatting.BLUE));
	}
}