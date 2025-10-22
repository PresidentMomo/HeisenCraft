package com.aetherlith.heisencraft.worldgen;

import com.aetherlith.heisencraft.HeisenCraft;
import com.aetherlith.heisencraft.HeisenCraftBlocks;
import com.aetherlith.heisencraft.block.PeyoteBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;

import java.util.List;

public class HeisenCraftConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEYOTE_PATCH = FeatureUtils.createKey(HeisenCraft.MODID + ":peyote_patch");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        FeatureUtils.register(context, PEYOTE_PATCH, Feature.RANDOM_PATCH, new RandomPatchConfiguration(
                32, // tries
                7,  // xzSpread
                3,  // ySpread
                PlacementUtils.filtered(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(
                                BlockStateProvider.simple(
                                        HeisenCraftBlocks.PEYOTE_BLOCK.get().defaultBlockState().setValue(PeyoteBlock.AGE, 3)
                                )
                        ),
                        BlockPredicate.allOf(
                                BlockPredicate.replaceable(),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.SAND, Blocks.RED_SAND)
                        )
                )
        ));
    }
}