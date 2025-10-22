package com.aetherlith.heisencraft.data;

import com.aetherlith.heisencraft.HeisenCraft;
import com.aetherlith.heisencraft.worldgen.HeisenCraftBiomeModifiers;
import com.aetherlith.heisencraft.worldgen.HeisenCraftConfiguredFeatures;
import com.aetherlith.heisencraft.worldgen.HeisenCraftPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.HashCache;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class HeisenCraftWorldGenProvider extends DatapackBuiltinEntriesProvider {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, HeisenCraftConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, HeisenCraftPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, HeisenCraftBiomeModifiers::bootstrap);

    public HeisenCraftWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(HeisenCraft.MODID));
        LOGGER.info("HeisenCraftWorldGenProvider initialized");
    }

}