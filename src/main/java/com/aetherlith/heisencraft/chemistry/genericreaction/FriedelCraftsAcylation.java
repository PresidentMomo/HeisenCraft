/*package com.aetherlith.heisencraft.chemistry.genericreaction;

import com.petrolpark.destroy.Destroy;
import com.petrolpark.destroy.chemistry.legacy.*;
import com.petrolpark.destroy.chemistry.legacy.genericreaction.GenericReactant;
import com.petrolpark.destroy.chemistry.legacy.genericreaction.SingleGroupGenericReaction;
import com.petrolpark.destroy.chemistry.legacy.index.DestroyGroupTypes;
import com.petrolpark.destroy.chemistry.legacy.index.DestroyMolecules;
import com.petrolpark.destroy.chemistry.legacy.index.group.AcylChlorideGroup;

public class FriedelCraftsAcylation extends SingleGroupGenericReaction<AcylChlorideGroup> {

    public FriedelCraftsAcylation() {
        super(Destroy.asResource("friedel_crafts_acylation"), DestroyGroupTypes.ACYL_CHLORIDE);
    };

    @Override
    public boolean isPossibleIn(ReadOnlyMixture mixture) {
        return mixture.getConcentrationOf(DestroyMolecules.BENZENE) > 0f;
    };

    @Override
    public LegacyReaction generateReaction(GenericReactant<AcylChlorideGroup> reactant) {
        LegacyMolecularStructure structure = reactant.getMolecule().shallowCopyStructure();
        AcylChlorideGroup group = reactant.getGroup();

        structure.moveTo(group.getCarbon())
                .remove(group.getChlorine());

        return reactionBuilder()
                .addReactant(reactant.getMolecule())
                .addReactant(DestroyMolecules.BENZENE)
                .addProduct(moleculeBuilder().structure(structure).build())
                .addProduct(DestroyMolecules.HYDROCHLORIC_ACID)
                .build();
    };

    @Override
    public LegacyReaction generateExampleReaction() {
        LegacyAtom carbon = new LegacyAtom(LegacyElement.CARBON);
        LegacyAtom oxygen = new LegacyAtom(LegacyElement.OXYGEN);
        LegacyAtom hydrogen = new LegacyAtom(LegacyElement.HYDROGEN);
        LegacyAtom r1 = new LegacyAtom(LegacyElement.R_GROUP);
        r1.rGroupNumber = 1;
        LegacyAtom r2 = new LegacyAtom(LegacyElement.R_GROUP);
        r2.rGroupNumber = 2;

        return generateReaction(
                new GenericReactant<AcylChlorideGroup>(
                        moleculeBuilder().structure(
                                LegacyMolecularStructure.deserialize("destroy:benzene:,,,,,").addGroupToPosition(LegacyMolecularStructure.atom(LegacyElement.CARBON),1)
                                        .addAtom(LegacyElement.HYDROGEN)
                                        .addAtom(r1)
                                        .addAtom(r2)

                        ).build(),
                        new LegacySpecies.MoleculeBuilder("destroy:benzene:,,,,,")
                )
        );
    };

};*/
