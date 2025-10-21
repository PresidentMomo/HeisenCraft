package com.aetherlith.heisencraft.chemistry;

import com.aetherlith.heisencraft.HeisenCraft;
import com.petrolpark.data.advancement.SimpleAdvancementTrigger;
import com.petrolpark.destroy.chemistry.legacy.LegacyReaction;
import com.petrolpark.destroy.chemistry.legacy.ReactionResult;
import net.createmod.catnip.lang.Lang;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public enum HeisenCraftAdvancementTrigger {

    BICYCLE_DAY("bicycle_day");

    private String triggerId;
    private String[] advancementIds;
    private SimpleAdvancementTrigger trigger;

    HeisenCraftAdvancementTrigger() {
        triggerId = Lang.asId(name());
        advancementIds = new String[]{Lang.asId(name())};
        trigger = new SimpleAdvancementTrigger(HeisenCraft.asResource(triggerId));
    };

    HeisenCraftAdvancementTrigger(String triggerAndAdvancementId) {
        this(triggerAndAdvancementId, triggerAndAdvancementId);
    };

    HeisenCraftAdvancementTrigger(String triggerId, String ...advancementIds) {
        this.triggerId = triggerId;
        this.advancementIds = advancementIds;
        trigger = new SimpleAdvancementTrigger(HeisenCraft.asResource(triggerId));
    };

    public void award(Level level, Player player) {
        if (level.isClientSide()) return;
        if (player instanceof ServerPlayer serverPlayer) {
            trigger.trigger(serverPlayer);
        } else {
            HeisenCraft.LOGGER.warn("Could not award HeisenCraft Advancement "+triggerId+" to client-side Player.");
        };
    };

    public boolean isAlreadyAwardedTo(LivingEntity player) {
        if (!(player instanceof ServerPlayer sp)) return true;
        for (String advancementId : advancementIds) {
            Advancement advancement = sp.getServer().getAdvancements().getAdvancement(HeisenCraft.asResource(advancementId));
            if (advancement == null || sp.getAdvancements().getOrStartProgress(advancement).isDone()) return true;
        };
        return false;
    };

    public ReactionResult asReactionResult(Float moles, LegacyReaction reaction) {
        return new HeisenCraftAdvancementReactionResult(moles, reaction, this);
    }

    public static void register() {
        for (HeisenCraftAdvancementTrigger e : values()) {
            CriteriaTriggers.register(e.trigger);
        };
    };
}
