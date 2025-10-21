package com.aetherlith.heisencraft.block;

import com.aetherlith.heisencraft.HeisenCraftItems;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;

import java.util.ArrayList;
import java.util.List;

public class EphedraBlock extends BeetrootBlock {

    public EphedraBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return HeisenCraftItems.EPHEDRA_SEEDS.get();
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> drops = new ArrayList<>();
        if (state.getValue(this.getAgeProperty()) >= this.getMaxAge()) {
            drops.add(new ItemStack(HeisenCraftItems.EPHEDRA.get()));
            int seeds = builder.getLevel().random.nextInt(4);
            drops.add(new ItemStack(HeisenCraftItems.EPHEDRA_SEEDS.get(), seeds));
        } else {
            drops.add(new ItemStack(HeisenCraftItems.EPHEDRA_SEEDS.get()));
        }
        return drops;
    }
}