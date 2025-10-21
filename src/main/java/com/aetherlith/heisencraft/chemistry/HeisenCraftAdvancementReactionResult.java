package com.aetherlith.heisencraft.chemistry;


import com.aetherlith.heisencraft.data.advancement.HeisenCraftAdvancementBehaviour;
import com.petrolpark.destroy.chemistry.legacy.LegacyReaction;
import com.petrolpark.destroy.chemistry.legacy.ReactionResult;
import com.petrolpark.destroy.core.chemistry.vat.VatControllerBlockEntity;
import com.petrolpark.destroy.core.data.advancement.DestroyAdvancementBehaviour;
import com.simibubi.create.content.processing.basin.BasinBlockEntity;

import net.minecraft.advancements.Advancement;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class HeisenCraftAdvancementReactionResult extends ReactionResult {

    private final HeisenCraftAdvancementTrigger advancement;

    public HeisenCraftAdvancementReactionResult(float moles, LegacyReaction reaction, HeisenCraftAdvancementTrigger advancement) {
        super(moles, reaction);
        this.advancement = advancement;
    };

    @Override
    public void onBasinReaction(Level level, BasinBlockEntity basin) {
        HeisenCraftAdvancementBehaviour behaviour = basin.getBehaviour(HeisenCraftAdvancementBehaviour.TYPE);
        if (behaviour != null) behaviour.awardHeisenCraftAdvancement(advancement);
    };

    @Override
    public void onVatReaction(Level level, VatControllerBlockEntity vatController) {
        vatController.getBehaviour(HeisenCraftAdvancementBehaviour.TYPE).awardHeisenCraftAdvancement(advancement);
    };

};