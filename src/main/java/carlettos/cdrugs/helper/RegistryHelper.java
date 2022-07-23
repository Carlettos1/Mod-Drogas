package carlettos.cdrugs.helper;

import static carlettos.cdrugs.Drugs.ID;

import carlettos.cdrugs.Drugs;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHelper {
	private RegistryHelper() {}
	
	public static final void registerItem(final Item item, final String name) {
		Registry.register(Registry.ITEM, Identifier.of(ID, name.toLowerCase()), item);
	}
	
	public static final void registerBlock(final Block block, final String name) {
		Registry.register(Registry.BLOCK, Identifier.of(ID, name.toLowerCase()), block);
	}
}
