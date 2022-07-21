package carlettos.cdrugs;

import carlettos.cdrugs.lists.Blocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class ClientDrugs implements ClientModInitializer {
	
	@Override
	public void onInitializeClient() {
		Blocks.registerClient();
	}
}
