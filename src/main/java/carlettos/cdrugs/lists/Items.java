package carlettos.cdrugs.lists;

import carlettos.cdrugs.helper.ItemHelper;
import carlettos.cdrugs.helper.RegistryHelper;
import net.minecraft.item.Item;

public class Items {
	public static final Item COCAINE_SEEDS;
	public static final Item COCAINE_LEAF;
	
	static {
		COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.COCAINE);
		COCAINE_LEAF = ItemHelper.createItem();
	}
	
	public static void register() {
		RegistryHelper.registerItem(COCAINE_SEEDS, "COCAINE_SEEDS");
		RegistryHelper.registerItem(COCAINE_LEAF, "COCAINE_LEAF");
	}
}
