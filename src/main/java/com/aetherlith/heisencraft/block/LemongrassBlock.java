package com.aetherlith.heisencraft.block;

import com.aetherlith.heisencraft.HeisenCraftItems;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.ArrayList;
import java.util.List;

public class LemongrassBlock extends BeetrootBlock {

    public LemongrassBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return HeisenCraftItems.LEMONGRASS_SEEDS.get();
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> drops = new ArrayList<>();
        RandomSource random = builder.getLevel().random;

        if (state.getValue(this.getAgeProperty()) >= this.getMaxAge()) {
            drops.add(new ItemStack(HeisenCraftItems.LEMONGRASS.get()));

            int seeds = 1 + random.nextInt(3);
            drops.add(new ItemStack(HeisenCraftItems.LEMONGRASS_SEEDS.get(), seeds));

        } else {
            drops.add(new ItemStack(HeisenCraftItems.LEMONGRASS_SEEDS.get()));
        }

        return drops;
    }
}
