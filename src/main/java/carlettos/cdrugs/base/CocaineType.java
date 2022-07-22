package carlettos.cdrugs.base;

import carlettos.cdrugs.lists.Blocks;
import carlettos.cdrugs.lists.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public enum CocaineType {
	ERYTHROXYLUM_COCA_VAR_IPADU(0.25F),
	ERYTHROXYLUM_COCA_VAR_COCA(0.63F),
	ERYTHROXYLUM_NOVOGRANATENSE_VAR_TRUXILLENSE(0.72F),
	ERYTHROXYLUM_NOVOGRANATENSE_VAR_NOVOGRANATENSE(0.77F);
	
	private final float cocaineRatio;
	
	CocaineType(final float cocaineRatio) {
		this.cocaineRatio = cocaineRatio;
	}
	
	public float getCocaineRatio() {
		return cocaineRatio;
	}
	
	public Block getBlock() {
		return switch (this) {
			case ERYTHROXYLUM_COCA_VAR_IPADU -> Blocks.AMAZONIAN_COCAINE;
			case ERYTHROXYLUM_COCA_VAR_COCA -> Blocks.BOLIVIAN_COCAINE;
			case ERYTHROXYLUM_NOVOGRANATENSE_VAR_TRUXILLENSE -> Blocks.TRUJILLO_COCAINE;
			case ERYTHROXYLUM_NOVOGRANATENSE_VAR_NOVOGRANATENSE -> Blocks.COLOMBIAN_COCAINE;
		};
	}
	
	public Item getSeeds() {
		return switch (this) {
			case ERYTHROXYLUM_COCA_VAR_IPADU -> Items.AMAZONIAN_COCAINE_SEEDS;
			case ERYTHROXYLUM_COCA_VAR_COCA -> Items.BOLIVIAN_COCAINE_SEEDS;
			case ERYTHROXYLUM_NOVOGRANATENSE_VAR_TRUXILLENSE -> Items.TRUJILLO_COCAINE_SEEDS;
			case ERYTHROXYLUM_NOVOGRANATENSE_VAR_NOVOGRANATENSE -> Items.COLOMBIAN_COCAINE_SEEDS;
		};
	}
	
	public Item getLeaf() {
		return switch (this) {
			case ERYTHROXYLUM_COCA_VAR_IPADU -> Items.AMAZONIAN_COCAINE_LEAF;
			case ERYTHROXYLUM_COCA_VAR_COCA -> Items.BOLIVIAN_COCAINE_LEAF;
			case ERYTHROXYLUM_NOVOGRANATENSE_VAR_TRUXILLENSE -> Items.TRUJILLO_COCAINE_LEAF;
			case ERYTHROXYLUM_NOVOGRANATENSE_VAR_NOVOGRANATENSE -> Items.COLOMBIAN_COCAINE_LEAF;
		};
	}
}
