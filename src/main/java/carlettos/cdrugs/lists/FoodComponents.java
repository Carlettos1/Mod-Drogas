package carlettos.cdrugs.lists;

import net.minecraft.item.FoodComponent;

public class FoodComponents {
	public static final FoodComponent KINWA_STEM;
	
	static {
		KINWA_STEM = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build();
	}
}
