package carlettos.cdrugs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import carlettos.cdrugs.lists.Blocks;
import carlettos.cdrugs.lists.Items;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Drugs implements ModInitializer {
	public static final String ID = "cdrugs";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);
	public static final ItemGroup DRUGS = FabricItemGroupBuilder.build(Identifier.of(ID, ID), () -> new ItemStack(Items.COLOMBIAN_COCAINE_SEEDS));

	@Override
	public void onInitialize() {
		Items.register();
		Blocks.register();
	}
}
