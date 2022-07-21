package carlettos.cdrugs.lists;

import static carlettos.cdrugs.Drugs.ID;
import static net.minecraft.block.Blocks.WHEAT;

import carlettos.cdrugs.block.CocaineBlock;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
	public static final Block COCAINE;
	
	static {
		COCAINE = new CocaineBlock(Settings.copy(WHEAT));
	}
	
	public static void register() {
		Registry.register(Registry.BLOCK, Identifier.of(ID, "cocaine"), COCAINE);
		BlockRenderLayerMap.INSTANCE.putBlock(COCAINE, RenderLayer.getCutoutMipped());
	}
	
	public static void registerClient() {
	}
}
