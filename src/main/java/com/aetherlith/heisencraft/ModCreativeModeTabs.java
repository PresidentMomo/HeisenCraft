package com.aetherlith.heisencraft;

import com.aetherlith.heisencraft.HeisenCraftItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeisenCraft.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS.register("tab", () -> CreativeModeTab.builder()
            .icon(() -> HeisenCraftItems.PEYOTE.get().getDefaultInstance())
            .title(Component.translatable("itemGroup.heisencraftcreativetab"))
            .displayItems((parameters, output) -> {
                output.accept(HeisenCraftItems.RED_PHOSPHORUS.get());
                output.accept(HeisenCraftItems.EPHEDRA.get());
                output.accept(HeisenCraftItems.EPHEDRA_SEEDS.get());
                output.accept(HeisenCraftItems.RYE.get());
                output.accept(HeisenCraftItems.RYE_SEEDS.get());
                output.accept(HeisenCraftItems.ERGOT.get());
                output.accept(HeisenCraftItems.PEYOTE.get());
                output.accept(HeisenCraftItems.CRUSHED_RAW_ALUMINIUM.get());
                output.accept(HeisenCraftItems.LEMONGRASS_SEEDS.get());
                output.accept(HeisenCraftItems.LEMONGRASS.get());

            })
            .build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
