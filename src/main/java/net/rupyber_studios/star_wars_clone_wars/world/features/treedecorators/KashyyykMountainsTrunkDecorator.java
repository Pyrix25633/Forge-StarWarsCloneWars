package net.rupyber_studios.star_wars_clone_wars.world.features.treedecorators;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.core.BlockPos;

import java.util.function.BiConsumer;
import java.util.Random;
import java.util.List;

public class KashyyykMountainsTrunkDecorator extends TrunkVineDecorator {
	public static final KashyyykMountainsTrunkDecorator INSTANCE = new KashyyykMountainsTrunkDecorator();
	public static com.mojang.serialization.Codec<KashyyykMountainsTrunkDecorator> codec;
	public static TreeDecoratorType<?> tdt;
	static {
		codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
		tdt.setRegistryName("kashyyyk_mountains_tree_trunk_decorator");
		ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(LevelSimulatedReader levelReader, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> listBlockPos,
			List<BlockPos> listBlockPos2) {
		listBlockPos.forEach(blockpos -> {
			if (random.nextInt(3) > 0) {
				BlockPos bp = blockpos.below();
				if (Feature.isAir(levelReader, bp)) {
					biConsumer.accept(blockpos, Blocks.VINE.defaultBlockState());
				}
			}
		});
	}
}