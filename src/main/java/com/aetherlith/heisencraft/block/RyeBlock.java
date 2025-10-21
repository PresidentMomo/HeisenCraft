package com.aetherlith.heisencraft.block;

import com.aetherlith.heisencraft.HeisenCraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;

public class RyeBlock extends BeetrootBlock {

    public RyeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return HeisenCraftItems.RYE_SEEDS.get();
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> drops = new ArrayList<>();
        RandomSource random = builder.getLevel().random;

        if (state.getValue(this.getAgeProperty()) >= this.getMaxAge()) {
            drops.add(new ItemStack(HeisenCraftItems.RYE.get()));

            int seeds = 1 + random.nextInt(3);
            drops.add(new ItemStack(HeisenCraftItems.RYE_SEEDS.get(), seeds));

            if (random.nextFloat() < 0.05f) {
                drops.add(new ItemStack(HeisenCraftItems.ERGOT.get()));
            }

        } else {
            drops.add(new ItemStack(HeisenCraftItems.RYE_SEEDS.get()));
        }

        return drops;
    }
}