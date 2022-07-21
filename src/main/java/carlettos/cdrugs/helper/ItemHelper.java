package carlettos.cdrugs.helper;

import carlettos.cdrugs.Drugs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;

public class ItemHelper {
	public static final Item createItem(Settings settings) {
		return new Item(settings.group(Drugs.DRUGS));
	}
	
	public static final Item createItem() {
		return createItem(new FabricItemSettings());
	}
	
	public static final BlockItem createBlockItem(Settings settings, Block block) {
		return new AliasedBlockItem(block, settings.group(Drugs.DRUGS));
	}
	
	public static final BlockItem createBlockItem(Block block) {
		return createBlockItem(new FabricItemSettings(), block);
	}
}
