package carlettos.cdrugs.lists;

import carlettos.cdrugs.helper.ItemHelper;
import carlettos.cdrugs.helper.RegistryHelper;
import net.minecraft.item.Item;

public class Items {
	public static final Item AMAZONIAN_COCAINE_SEEDS;
	public static final Item BOLIVIAN_COCAINE_SEEDS;
	public static final Item TRUJILLO_COCAINE_SEEDS;
	public static final Item COLOMBIAN_COCAINE_SEEDS;
	public static final Item[] COCAINE_SEEDS;
	
	public static final Item AMAZONIAN_COCAINE_LEAF;
	public static final Item BOLIVIAN_COCAINE_LEAF;
	public static final Item TRUJILLO_COCAINE_LEAF;
	public static final Item COLOMBIAN_COCAINE_LEAF;
	public static final Item[] COCAINE_LEAVES;
	
	static {
		AMAZONIAN_COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.AMAZONIAN_COCAINE);
		BOLIVIAN_COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.BOLIVIAN_COCAINE);
		TRUJILLO_COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.TRUJILLO_COCAINE);
		COLOMBIAN_COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.COLOMBIAN_COCAINE);
		COCAINE_SEEDS = new Item[] {AMAZONIAN_COCAINE_SEEDS, BOLIVIAN_COCAINE_SEEDS, TRUJILLO_COCAINE_SEEDS, COLOMBIAN_COCAINE_SEEDS};
		
		AMAZONIAN_COCAINE_LEAF = ItemHelper.createItem();
		BOLIVIAN_COCAINE_LEAF = ItemHelper.createItem();
		TRUJILLO_COCAINE_LEAF = ItemHelper.createItem();
		COLOMBIAN_COCAINE_LEAF = ItemHelper.createItem();
		COCAINE_LEAVES = new Item[] {AMAZONIAN_COCAINE_LEAF, BOLIVIAN_COCAINE_LEAF, TRUJILLO_COCAINE_LEAF, COLOMBIAN_COCAINE_LEAF};
	}
	
	public static void register() {
		RegistryHelper.registerItem(AMAZONIAN_COCAINE_SEEDS, "AMAZONIAN_COCAINE_SEEDS");
		RegistryHelper.registerItem(BOLIVIAN_COCAINE_SEEDS, "BOLIVIAN_COCAINE_SEEDS");
		RegistryHelper.registerItem(TRUJILLO_COCAINE_SEEDS, "TRUJILLO_COCAINE_SEEDS");
		RegistryHelper.registerItem(COLOMBIAN_COCAINE_SEEDS, "COLOMBIAN_COCAINE_SEEDS");
		
		RegistryHelper.registerItem(AMAZONIAN_COCAINE_LEAF, "AMAZONIAN_COCAINE_LEAF");
		RegistryHelper.registerItem(BOLIVIAN_COCAINE_LEAF, "BOLIVIAN_COCAINE_LEAF");
		RegistryHelper.registerItem(TRUJILLO_COCAINE_LEAF, "TRUJILLO_COCAINE_LEAF");
		RegistryHelper.registerItem(COLOMBIAN_COCAINE_LEAF, "COLOMBIAN_COCAINE_LEAF");
	}
}
