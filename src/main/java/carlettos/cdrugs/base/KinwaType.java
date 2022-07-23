package carlettos.cdrugs.base;

import java.util.Random;

import net.minecraft.util.StringIdentifiable;

public enum KinwaType implements StringIdentifiable {
	PURPLE,
	BLACK,
	RED,
	YELLOW;
	
	public static final Random rng = new Random();
	
	@Override
	public String asString() {
		return this.name().toLowerCase();
	}
	
	public static KinwaType getRandom() {
		return KinwaType.values()[rng.nextInt(4)];
	}
}
