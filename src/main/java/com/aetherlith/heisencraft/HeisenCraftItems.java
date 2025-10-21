package com.aetherlith.heisencraft;


import com.aetherlith.heisencraft.item.EphedraItem;
import com.aetherlith.heisencraft.item.LemongrassItem;
import com.aetherlith.heisencraft.item.PeyoteItem;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;


public class HeisenCraftItems {

    public static ItemEntry<Item> CRUSHED_EPHEDRA;
    public static ItemEntry<PeyoteItem> PEYOTE;
    public static ItemEntry<Item> DRIED_PEYOTE;
    public static ItemEntry<Item> PEYOTE_POWDER;
    public static ItemEntry<Item> MESCALINE_POWDER;
    public static ItemEntry<Item> RED_PHOSPHORUS;
    public static ItemEntry<EphedraItem> EPHEDRA;
    public static ItemEntry<ItemNameBlockItem> EPHEDRA_SEEDS;
    public static ItemEntry<ItemNameBlockItem> RYE_SEEDS;
    public static ItemEntry<Item> RYE;
    public static ItemEntry<ItemNameBlockItem> LEMONGRASS_SEEDS;
    public static ItemEntry<LemongrassItem> LEMONGRASS;
    public static ItemEntry<Item> ERGOT;
    /*public static ItemEntry<Item> CANNABIS_LEAF;
    public static ItemEntry<Item> CANNABIS_BUDS;
    public static ItemEntry<ItemNameBlockItem> CANNABIS_SEEDS;
    public static ItemEntry<ItemNameBlockItem> COCA_SEEDS;
    public static ItemEntry<Item> COCA_LEAVES;*/
    public static ItemEntry<Item> CRUSHED_RAW_ALUMINIUM;
    public static ItemEntry<Item> METH_CRYSTAL;
    public static ItemEntry<Item> PSILOCYBE_POWDER;
    public static ItemEntry<Item> PSILOCYBIN_CRYSTAL;

    public static void register(Registrate REGISTRATE) {

        RED_PHOSPHORUS = REGISTRATE.item("red_phosphorus", Item::new)
                .register();
        CRUSHED_EPHEDRA = REGISTRATE.item("crushed_ephedra", Item::new)
                .register();
        EPHEDRA = REGISTRATE.item("ephedra", EphedraItem::new)
                .register();
        EPHEDRA_SEEDS = REGISTRATE.item("ephedra_seeds", p -> new ItemNameBlockItem(HeisenCraftBlocks.EPHEDRA_CROP_BLOCK.get(), p))
                .register();
        RYE_SEEDS = REGISTRATE.item("rye_seeds", p -> new ItemNameBlockItem(HeisenCraftBlocks.RYE_CROP_BLOCK.get(), p))
                .register();
        RYE = REGISTRATE.item("rye", Item::new)
                .register();
        ERGOT = REGISTRATE.item("ergot",  Item::new)
                .register();
        LEMONGRASS = REGISTRATE.item("lemongrass", LemongrassItem::new)
                .register();
        LEMONGRASS_SEEDS = REGISTRATE.item("lemongrass_seeds", p -> new ItemNameBlockItem(HeisenCraftBlocks.LEMONGRASS_CROP.get(), p))
                .register();
        PEYOTE = REGISTRATE.item("peyote", PeyoteItem::new)
                .register();
        DRIED_PEYOTE = REGISTRATE.item("dried_peyote", Item::new)
                .register();
        PEYOTE_POWDER = REGISTRATE.item("peyote_powder", Item::new)
                .register();
        MESCALINE_POWDER = REGISTRATE.item("mescaline_powder", Item::new)
                .register();
        /*CANNABIS_LEAF = REGISTRATE.item("cannabis_leaf", Item::new)
                .register();
        CANNABIS_BUDS = REGISTRATE.item("cannabis_buds", Item::new)
                .register();
        CANNABIS_SEEDS = REGISTRATE.item("cannabis_seeds", p -> new ItemNameBlockItem(HeisenCraftBlocks.CANNABIS.get(), p))
                .register();
        COCA_SEEDS = REGISTRATE.item("coca_seeds", p -> new ItemNameBlockItem(HeisenCraftBlocks.COCA.get(), p))
                .register();
        COCA_LEAVES = REGISTRATE.item("coca_leaves", Item::new)
                .register();*/
        CRUSHED_RAW_ALUMINIUM = REGISTRATE.item("crushed_raw_aluminium", Item::new)
                .register();
        METH_CRYSTAL = REGISTRATE.item("meth_crystal", Item::new)
                .register();
        PSILOCYBE_POWDER = REGISTRATE.item("psilocybe_powder", Item::new)
                .register();
        PSILOCYBIN_CRYSTAL = REGISTRATE.item("psilocybin_crystal", Item::new)
                .register();
    }
}
