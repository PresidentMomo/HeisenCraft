package com.aetherlith.heisencraft;

import com.aetherlith.heisencraft.block.*;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Blocks;

import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.ForgeBiomeModifiers;

public class HeisenCraftBlocks {
    public static BlockEntry<EphedraBlock> EPHEDRA_CROP_BLOCK;
    public static BlockEntry<RyeBlock> RYE_CROP_BLOCK;
    public static BlockEntry<LemongrassBlock> LEMONGRASS_CROP;
    public static BlockEntry<PeyoteBlock> PEYOTE_BLOCK;
    /*public static BlockEntry<CannabisPlantBlock> CANNABIS;
    public static BlockEntry<CocaPlantBlock> COCA;*/

    public static void register(Registrate REGISTRATE) {
        EPHEDRA_CROP_BLOCK = REGISTRATE.block("ephedra_crop_block", EphedraBlock::new)
                .initialProperties(() -> Blocks.BEETROOTS)
                .register();

        RYE_CROP_BLOCK = REGISTRATE.block("rye_crop_block", RyeBlock::new)
                .initialProperties(() -> Blocks.BEETROOTS)
                .register();

        PEYOTE_BLOCK = REGISTRATE.block("peyote_block", PeyoteBlock::new)
                .initialProperties(() -> Blocks.CACTUS)
                .simpleItem()
                .register();
        /*CANNABIS = REGISTRATE.block("cannabis", CannabisPlantBlock::new)
                .initialProperties(() -> Blocks.BEETROOTS)
                .register();
        COCA = REGISTRATE.block("coca", CocaPlantBlock::new)
                .initialProperties(() -> Blocks.BEETROOTS)
                .register();*/
        LEMONGRASS_CROP = REGISTRATE.block("lemongrass_crop", LemongrassBlock::new)
                .initialProperties(() -> Blocks.WHEAT)
                .register();

    }
}
