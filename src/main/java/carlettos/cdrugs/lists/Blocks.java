package carlettos.cdrugs.lists;

import static net.minecraft.block.Blocks.WHEAT;
import static net.minecraft.block.Blocks.SWEET_BERRY_BUSH;

import carlettos.cdrugs.base.CocaineType;
import carlettos.cdrugs.block.CocaineBlock;
import carlettos.cdrugs.block.KinwaBlock;
import carlettos.cdrugs.helper.BlockHelper;
import carlettos.cdrugs.helper.RegistryHelper;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;

public class Blocks {
	public static final Block AMAZONIAN_COCAINE;
	public static final Block BOLIVIAN_COCAINE;
	public static final Block TRUJILLO_COCAINE;
	public static final Block COLOMBIAN_COCAINE;
	public static final Block[] COCAINES;
	
	public static final Block KINWA;
	
	static {
		AMAZONIAN_COCAINE = new CocaineBlock(Settings.copy(WHEAT), CocaineType.ERYTHROXYLUM_COCA_VAR_IPADU);
		BOLIVIAN_COCAINE = new CocaineBlock(Settings.copy(WHEAT), CocaineType.ERYTHROXYLUM_COCA_VAR_COCA);
		TRUJILLO_COCAINE = new CocaineBlock(Settings.copy(WHEAT), CocaineType.ERYTHROXYLUM_NOVOGRANATENSE_VAR_TRUXILLENSE);
		COLOMBIAN_COCAINE = new CocaineBlock(Settings.copy(WHEAT), CocaineType.ERYTHROXYLUM_NOVOGRANATENSE_VAR_NOVOGRANATENSE);
		COCAINES = new Block[]{AMAZONIAN_COCAINE, BOLIVIAN_COCAINE, TRUJILLO_COCAINE, COLOMBIAN_COCAINE};
		
		KINWA = new KinwaBlock(Settings.copy(SWEET_BERRY_BUSH));
	}
	
	public static void register() {
		RegistryHelper.registerBlock(AMAZONIAN_COCAINE, "AMAZONIAN_COCAINE");
		RegistryHelper.registerBlock(BOLIVIAN_COCAINE, "BOLIVIAN_COCAINE");
		RegistryHelper.registerBlock(TRUJILLO_COCAINE, "TRUJILLO_COCAINE");
		RegistryHelper.registerBlock(COLOMBIAN_COCAINE, "COLOMBIAN_COCAINE");
		RegistryHelper.registerBlock(KINWA, "KINWA");
		
		for (Block cocaine : COCAINES) {
			BlockHelper.putRenderLayerCutoutMipped(cocaine);
		}
		BlockHelper.putRenderLayerCutoutMipped(KINWA);
	}
	
	public static void registerClient() {
	}
}
