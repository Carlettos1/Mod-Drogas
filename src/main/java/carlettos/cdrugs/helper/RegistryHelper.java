package carlettos.cdrugs.helper;

import carlettos.cdrugs.Drugs;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryHelper {
	private RegistryHelper() {}
	
	public static final void registerItem(final Item item, final String name) {
		Registry.register(Registry.ITEM, Identifier.of(Drugs.ID, name.toLowerCase()), item);
	}
}