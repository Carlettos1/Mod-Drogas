package carlettos.cdrugs.helper;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class BlockHelper {
	private BlockHelper() {}
	public static final void putRenderLayerCutoutMipped(Block block) {
		BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutoutMipped());
	}
}
