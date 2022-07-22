package carlettos.cdrugs.block;

import carlettos.cdrugs.base.CocaineType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class CocaineBlock extends CropBlock {
	private final CocaineType type;

	public CocaineBlock(Settings settings, CocaineType type) {
		super(settings);
		this.type = type;
	}

	public CocaineType getType() {
		return type;
	}

	@Override
	protected ItemConvertible getSeedsItem() {
		return type.getSeeds();
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isIn(BlockTags.DIRT) || floor.isOf(Blocks.FARMLAND);
	}
}
