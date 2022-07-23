package carlettos.cdrugs.lists;

import carlettos.cdrugs.base.CocaineType;
import carlettos.cdrugs.helper.ItemHelper;
import carlettos.cdrugs.helper.RegistryHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
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
	
	public static final Item KINWA_SEEDS;
	public static final Item KINWA_STEM;
	public static final Item KINWA_ASHES;
	public static final Item KINWA_ASH_BUN;
	
	static {
		AMAZONIAN_COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.AMAZONIAN_COCAINE);
		BOLIVIAN_COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.BOLIVIAN_COCAINE);
		TRUJILLO_COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.TRUJILLO_COCAINE);
		COLOMBIAN_COCAINE_SEEDS = ItemHelper.createBlockItem(Blocks.COLOMBIAN_COCAINE);
		COCAINE_SEEDS = new Item[] {AMAZONIAN_COCAINE_SEEDS, BOLIVIAN_COCAINE_SEEDS, TRUJILLO_COCAINE_SEEDS, COLOMBIAN_COCAINE_SEEDS};
		
		AMAZONIAN_COCAINE_LEAF = ItemHelper.createCocaineLeaf(CocaineType.ERYTHROXYLUM_COCA_VAR_IPADU);
		BOLIVIAN_COCAINE_LEAF = ItemHelper.createCocaineLeaf(CocaineType.ERYTHROXYLUM_COCA_VAR_COCA);
		TRUJILLO_COCAINE_LEAF = ItemHelper.createCocaineLeaf(CocaineType.ERYTHROXYLUM_NOVOGRANATENSE_VAR_TRUXILLENSE);
		COLOMBIAN_COCAINE_LEAF = ItemHelper.createCocaineLeaf(CocaineType.ERYTHROXYLUM_NOVOGRANATENSE_VAR_NOVOGRANATENSE);
		COCAINE_LEAVES = new Item[] {AMAZONIAN_COCAINE_LEAF, BOLIVIAN_COCAINE_LEAF, TRUJILLO_COCAINE_LEAF, COLOMBIAN_COCAINE_LEAF};
		
		KINWA_SEEDS = ItemHelper.createBlockItem(Blocks.KINWA);
		KINWA_STEM = ItemHelper.createItem(new FabricItemSettings().food(FoodComponents.KINWA_STEM));
		KINWA_ASHES = ItemHelper.createItem();
		KINWA_ASH_BUN = ItemHelper.createItem();
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
		
		RegistryHelper.registerItem(KINWA_SEEDS, "KINWA_SEEDS");
		RegistryHelper.registerItem(KINWA_STEM, "KINWA_STEM");
		RegistryHelper.registerItem(KINWA_ASHES, "KINWA_ASHES");
		RegistryHelper.registerItem(KINWA_ASH_BUN, "KINWA_ASH_BUN");
	}
}
