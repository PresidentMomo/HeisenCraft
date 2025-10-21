package com.aetherlith.heisencraft.data.advancement;

import java.util.Set;
import java.util.function.Supplier;

import com.petrolpark.compat.create.block.entity.behaviour.AbstractRememberPlacerBehaviour;
import com.aetherlith.heisencraft.chemistry.HeisenCraftAdvancementTrigger;
import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import com.simibubi.create.foundation.blockEntity.behaviour.BehaviourType;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

public class HeisenCraftAdvancementBehaviour extends AbstractRememberPlacerBehaviour {

    public static final BehaviourType<HeisenCraftAdvancementBehaviour> TYPE = new BehaviourType<>();

    private final Set<HeisenCraftAdvancementTrigger> advancements;

    public HeisenCraftAdvancementBehaviour(SmartBlockEntity be, HeisenCraftAdvancementTrigger ...advancements) {
        super(be);
        this.advancements = Set.of(advancements);
    }

    public void awardHeisenCraftAdvancement(HeisenCraftAdvancementTrigger advancement) {
        awardHeisenCraftAdvancementIf(advancement, () -> true);
    }

    public void awardHeisenCraftAdvancementIf(HeisenCraftAdvancementTrigger advancement, Supplier<Boolean> condition) {
        Player placer = getPlayer();
        if (placer == null || !(placer instanceof ServerPlayer player) || advancement.isAlreadyAwardedTo(player)) return;
        if (condition.get()) advancement.award(getWorld(), player);
    }

    @Override
    public BehaviourType<?> getType() {
        return TYPE;
    }

    @Override
    public boolean shouldRememberPlacer(Player placer) {
        return placer instanceof ServerPlayer player && (advancements.size() == 0 || !advancements.stream().allMatch(advancement -> advancement.isAlreadyAwardedTo(player)));
    }

}
