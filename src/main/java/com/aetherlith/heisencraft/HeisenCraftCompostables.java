package com.aetherlith.heisencraft;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.ComposterBlock;

public class HeisenCraftCompostables {

    private static Map<ItemLike, Float> HEISENCRAFT_COMPOSTABLES;

    // Shouldn't be called until it's time to register
    static {
        HEISENCRAFT_COMPOSTABLES = new HashMap<>();
        add(0.3f, HeisenCraftItems.EPHEDRA.get());
        add(0.65f, HeisenCraftItems.EPHEDRA_SEEDS.get());
        add(0.5f, HeisenCraftItems.RYE_SEEDS.get());
        add(0.7f, HeisenCraftItems.LEMONGRASS_SEEDS.get());

    };

    private static void add(float chance, ItemLike item) {
        HEISENCRAFT_COMPOSTABLES.put(item.asItem(), chance);
    };

    @SuppressWarnings("deprecation")
    public static void register() {
        HEISENCRAFT_COMPOSTABLES.forEach((itemLike, chance) -> {
            ComposterBlock.COMPOSTABLES.put(itemLike.asItem(), chance);
        });
    };
};
