
package net.offllneplayer.opminecraft.block.charcoal;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BlockofCharcoalBlock extends Block {

	public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

	public BlockofCharcoalBlock() {
		super(BlockBehaviour.Properties.of()
				.ignitedByLava()
				.mapColor(MapColor.COLOR_BLACK)
				.sound(SoundType.STONE).strength(5f, 6f)
				.strength(3f, 8f)
				.requiresCorrectToolForDrops());
		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}


@Override
protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
	super.createBlockStateDefinition(builder);
	builder.add(AXIS);
}

@Override
public BlockState getStateForPlacement(BlockPlaceContext context) {
	return super.getStateForPlacement(context).setValue(AXIS, context.getClickedFace().getAxis());
}

@Override
public BlockState rotate(BlockState state, Rotation rot) {
	if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
		if (state.getValue(AXIS) == Direction.Axis.X) {
			return state.setValue(AXIS, Direction.Axis.Z);
		} else if (state.getValue(AXIS) == Direction.Axis.Z) {
			return state.setValue(AXIS, Direction.Axis.X);
		}
	}
	return state;
	}
}
