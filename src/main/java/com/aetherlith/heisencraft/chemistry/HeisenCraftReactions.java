package com.aetherlith.heisencraft.chemistry;

import com.aetherlith.heisencraft.HeisenCraftItems;
import com.petrolpark.destroy.DestroyAdvancementTrigger;
import com.petrolpark.destroy.DestroyItems;
import com.petrolpark.destroy.chemistry.legacy.*;
import com.petrolpark.destroy.chemistry.legacy.LegacyReaction.ReactionBuilder;
import com.petrolpark.destroy.chemistry.legacy.index.DestroyMolecules;
import com.petrolpark.destroy.chemistry.legacy.reactionresult.CombinedReactionResult;
import com.petrolpark.destroy.chemistry.legacy.reactionresult.PrecipitateReactionResult;

public class HeisenCraftReactions {

    public static final LegacyReaction

    //Generic reactions

    ALUMINIUM_DISSOLUTION = builder()
            .id("aluminium_dissolution")
            .addReactant(DestroyMolecules.PROTON, 3, 1)
            .addSimpleItemReactant(HeisenCraftItems.CRUSHED_RAW_ALUMINIUM::get, 1.0f)
            .addProduct(DestroyMolecules.HYDROGEN, 3)
            .addProduct(HeisenCraftMolecules.ALUMINIUM, 2)
            .build(),

    /*ALUMINIUM_CHLORIDE_FORMATION = builder()
            .id("aluminum_chloride_formation")
            .addReactant(HeisenCraftMolecules.ALUMINIUM)
            .addReactant(DestroyMolecules.CHLORINE, 3)
            .addProduct(HeisenCraftMolecules.ALUMINIUM_CHLORIDE)
            .activationEnergy(40f).preexponentialFactor(1e13f)
            .build(),*/

    LITHIUM_ALUMINUM_HYDRIDE_SYNTHESIS = builder()
            .id("lithium_aluminum_hydride_synthesis")
            .addCatalyst(DestroyMolecules.SODIUM_ION, 0)
            .addReactant(HeisenCraftMolecules.ALUMINIUM)
            .addReactant(DestroyMolecules.HYDROGEN, 4)
            .addCatalyst(DestroyMolecules.CHLORIDE, 0)
            .addReactant(HeisenCraftMolecules.LITHIUM)
            .addProduct(HeisenCraftMolecules.LITHIUM_ALUMINUM_HYDRIDE)
            .activationEnergy(55f).preexponentialFactor(1e8f)
            .build(),

    ETHANOL_DEHYDRATION = builder()
            .id("ethanol_dehydration")
            .addReactant(DestroyMolecules.ETHANOL, 2)
            .addReactant(DestroyMolecules.SULFURIC_ACID, 1)
            .addProduct(HeisenCraftMolecules.DIETHYL_ETHER, 1)
            .addProduct(DestroyMolecules.WATER, 1)
            .activationEnergy(55f).preexponentialFactor(1e11f)
            .build(),

    NITRATE_REDUCTION = builder()
            .id("nitrate_reduction")
            .addReactant(DestroyMolecules.NITRATE, 1)
            .addReactant(DestroyMolecules.SULFUR_DIOXIDE, 1)
            .addProduct(HeisenCraftMolecules.NITRITE, 1)
            .addProduct(DestroyMolecules.SULFUR_TRIOXIDE, 1)
            .activationEnergy(45f).preexponentialFactor(1e12f)
            .build(),

    ADIPIC_ACID_PYROLYSIS = builder()
            .id("adipic_acid_pyrolysis")
            .addReactant(DestroyMolecules.ADIPIC_ACID,4)
            .addSimpleItemCatalyst(DestroyItems.ZEOLITE, 1)
            .addProduct(HeisenCraftMolecules.FIVE_OXOPENTANOIC_ACID, 1)
            .addProduct(HeisenCraftMolecules.GLUTARIC_ACID, 1)
            .addProduct(HeisenCraftMolecules.SUCCINIC_ACID, 1)
            .addProduct(DestroyMolecules.ACETALDEHYDE, 3)
            .addProduct(DestroyMolecules.CARBON_DIOXIDE, 5)
            .activationEnergy(55f).preexponentialFactor(1e14f)
            .build(),

    BUTADIENE_HYDROXYCARBOXYLATION = builder()
            .id("butadiene_hydrocarboxylation")
            .addReactant(DestroyMolecules.BUTADIENE)
            .addReactant(DestroyMolecules.CARBON_MONOXIDE, 1)
            .addReactant(DestroyMolecules.WATER, 1)
            .addProduct(HeisenCraftMolecules.PENTANOIC_ACID)
            .build(),

    ETHYLENE_EPOXIDATION = builder()
            .id("ethylene_oxidation")
            .addReactant(DestroyMolecules.ETHENE)
            .addReactant(DestroyMolecules.HYDROGEN_PEROXIDE, 2)
            .addCatalyst(DestroyMolecules.COPPER_II,0)
            .addProduct(HeisenCraftMolecules.ETHYLENE_GLYCOL)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(60f).preexponentialFactor(1e10f)
            .build(),

    OXALYL_CHLORIDE_SYNTHESIS = builder()
            .id("oxalyl_chloride_synthesis")
            .addReactant(HeisenCraftMolecules.ETHYLENE_GLYCOL)
            .addReactant(DestroyMolecules.DICHROMATE, 2)
            .addReactant(DestroyMolecules.PHOSGENE, 2)
            .addReactant(DestroyMolecules.PROTON, 8)
            .addProduct(HeisenCraftMolecules.OXALYL_CHLORIDE)
            .addProduct(DestroyMolecules.CHROMIUM_III, 4)
            .addProduct(DestroyMolecules.CHLORIDE, 4)
            .addProduct(DestroyMolecules.CARBON_DIOXIDE, 2)
            .addProduct(DestroyMolecules.WATER, 7)
            .activationEnergy(50f).preexponentialFactor(1e9f)
            .build(),

    METHYLAMINOACETONE_ETHYLENE_KETAL_SYNTHESIS = builder()
            .id("methylaminoacetone_ethylene_ketal_synthesis")
            .addReactant(HeisenCraftMolecules.ETHYLENE_GLYCOL)
            .addReactant(DestroyMolecules.ACETONE)
            .addReactant(DestroyMolecules.METHYLAMINE)
            .addReactant(DestroyMolecules.PROTON, 2)
            .addProduct(HeisenCraftMolecules.METHYLAMINOACETONE_ETHYLENE_KETAL)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(58f).preexponentialFactor(1e9f)
            .build(),

    METHYLAMINES_SYNTHESIS = builder()
            .id("methylamines_synthesis")
            .addReactant(DestroyMolecules.METHANOL, 6)
            .addReactant(DestroyMolecules.AMMONIA, 3)
            .addSimpleItemCatalyst(DestroyItems.ZEOLITE, 0)
            .addProduct(DestroyMolecules.METHYLAMINE)
            .addProduct(HeisenCraftMolecules.DIETHYLAMINE)
            .addProduct(DestroyMolecules.TRIMETHYLAMINE)
            .addProduct(DestroyMolecules.WATER, 6)
            .activationEnergy(65f)
            .preexponentialFactor(1e11f)
            .build(),

    ACETIC_ANHYDRIDE_SYNTHESIS = builder()
            .id("acetic_anhydride_synthesis")
            .addReactant(DestroyMolecules.METHYL_ACETATE)
            .addReactant(DestroyMolecules.CARBON_MONOXIDE)
            .addSimpleItemCatalyst(DestroyItems.PALLADIUM_POWDER,1)
            .addCatalyst(DestroyMolecules.IODIDE,0)
            .addProduct(DestroyMolecules.ACETIC_ANHYDRIDE)
            .addProduct(DestroyMolecules.METHANOL)

            .build(),

    NITROMETHANE_SYNTHESIS = builder()
            .id("nitromethane_synthesis")
            .addReactant(DestroyMolecules.METHANE)
            .addReactant(DestroyMolecules.NITRIC_ACID)
            .addCatalyst(DestroyMolecules.PROTON, 0)
            .addProduct(HeisenCraftMolecules.NITROMETHANE)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(40f).preexponentialFactor(1e10f)
            .build(),

    NITROETHYLENE_SYNTHESIS = builder()
            .id("nitroethylene_synthesis")
            .addReactant(HeisenCraftMolecules.NITROMETHANE)
            .addReactant(DestroyMolecules.FORMALDEHYDE)
            .addReactant(DestroyMolecules.ACETIC_ANHYDRIDE)
            .addCatalyst(DestroyMolecules.HYDROXIDE,1)
            .addProduct(HeisenCraftMolecules.NITROETHYLENE)
            .addProduct(DestroyMolecules.ACETIC_ACID, 2)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(55f).preexponentialFactor(4e9f)
            .build(),

    BUTADIENE_TELOMERIZATION = builder()
            .id("butadiene_telomerization")
            .addReactant(DestroyMolecules.BUTADIENE, 2)
            .addReactant(DestroyMolecules.CARBON_DIOXIDE)
            .addReactant(DestroyMolecules.METHANOL)
            .addSimpleItemCatalyst(DestroyItems.PALLADIUM_POWDER,0)
            .addProduct(HeisenCraftMolecules.PIMELIC_ACID)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(40f).preexponentialFactor(1e12f)
            .build(),

    PIMELIC_ACID_CYCLIZATION = builder()
            .id("pimelic_acid_cyclization")
            .addReactant(HeisenCraftMolecules.PIMELIC_ACID)
            .addReactant(DestroyMolecules.THIONYL_CHLORIDE, 2)
            .addProduct(HeisenCraftMolecules.CYCLOHEPTANONE)
            .addProduct(DestroyMolecules.SULFUR_DIOXIDE, 2)
            .addProduct(DestroyMolecules.HYDROCHLORIC_ACID, 2)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(40f).preexponentialFactor(2e10f)
            .build(),

    SODIUM_METHOXIDE_FORMATION = builder()
            .id("sodium_methoxide_formation")
            .addReactant(DestroyMolecules.METHANOL,2)
            .addReactant(DestroyMolecules.SODIUM_METAL, 2)
            .addProduct(DestroyMolecules.METHOXIDE,2)
            .addProduct(DestroyMolecules.SODIUM_ION, 2)
            .addProduct(DestroyMolecules.HYDROGEN, 1)
            .activationEnergy(25f).preexponentialFactor(2e12f)
            .build(),

    HYDROGEN_BROMIDE_SYNTHESIS = builder()
            .id("hydrogen_bromide_synthesis")
            .addReactant(HeisenCraftMolecules.BROMINE, 2)
            .addReactant(DestroyMolecules.WATER,2)
            .addProduct(HeisenCraftMolecules.HYDROGEN_BROMIDE, 4)
            .addProduct(DestroyMolecules.OXYGEN)
            .activationEnergy(10f).preexponentialFactor(1e12f)
            .build(),

    METHANOL_HYDROBROMATION = builder()
            .id("methanol_hydrobromation")
            .addReactant(DestroyMolecules.METHANOL)
            .addReactant(HeisenCraftMolecules.HYDROGEN_BROMIDE)
            .addProduct(HeisenCraftMolecules.BROMOMETHANE)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(5f).preexponentialFactor(2e12f)
            .build(),


    //Benzene Section

    NITROBENZENE_SYNTHESIS = builder()
            .id("nitrobenzene_synthesis")
            .addReactant(DestroyMolecules.BENZENE)
            .addReactant(DestroyMolecules.NITRIC_ACID, 1)
            .addCatalyst(DestroyMolecules.PROTON, 0)
            .addProduct(HeisenCraftMolecules.NITROBENZENE)
            .addProduct(DestroyMolecules.WATER,2)
            .activationEnergy(45f).preexponentialFactor(1e12f)
            .build(),

    /*ANILINE_SYNTHESIS = builder()
            .id("aniline_synthesis")
            .addReactant(HeisenCraftMolecules.NITROBENZENE)
            .addReactant(DestroyMolecules.HYDROGEN, 1)
            .addSimpleItemCatalyst(DestroyItems.PALLADIUM_POWDER, 0)
            .addProduct(HeisenCraftMolecules.ANILINE)
            .addProduct(DestroyMolecules.WATER,2)
            .activationEnergy(55f).preexponentialFactor(1e10f)
            .build(),*/

    ANILINE_DIAZOTIZATION = builder()
            .id("aniline_diazotization")
            .addReactant(HeisenCraftMolecules.ANILINE)
            .addReactant(HeisenCraftMolecules.NITRITE, 1)
            .addReactant(DestroyMolecules.PROTON, 2)
            .addCatalyst(DestroyMolecules.CHLORIDE,0)
            .addCatalyst(DestroyMolecules.ZINC_ION, 0)
            .addProduct(HeisenCraftMolecules.PHENYLHYDRAZINE)
            .addProduct(DestroyMolecules.WATER,2)
            .activationEnergy(40f).preexponentialFactor(1e13f)
            .build(),

    /*BENZENEDIAZONIUM_REDUCTION = builder()
            .id("benzenediazonium_reduction")
            .addReactant(HeisenCraftMolecules.BENZENEDIAZONIUM)
            .addReactant(DestroyMolecules.PROTON, 2)
            .addCatalyst(DestroyMolecules.CHLORIDE,0)
            .addCatalyst(DestroyMolecules.ZINC_ION, 0)
            .addProduct(HeisenCraftMolecules.PHENYLHYDRAZINE)
            .addProduct(DestroyMolecules.NITROGEN)
            .activationEnergy(55f).preexponentialFactor(1e11f)
            .build(),*/

    PHENOL_NITRATION_META = builder()
            .id("phenol_nitration_meta")
            .addReactant(DestroyMolecules.PHENOL)
            .addReactant(DestroyMolecules.NITRONIUM)
            .addProduct(HeisenCraftMolecules.META_NITROPHENOL)
            .activationEnergy(35f).preexponentialFactor(1e10f)
            .build(),

    META_AMINOPHENOL_SYNTHESIS = builder()
            .id("meta_aminophenol_synthesis")
            .addReactant(HeisenCraftMolecules.META_NITROPHENOL)
            .addReactant(DestroyMolecules.PROTON, 4)
            .addSimpleItemCatalyst(DestroyItems.PALLADIUM_POWDER,1)
            .addProduct(HeisenCraftMolecules.META_AMINOPHENOL)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(55f).preexponentialFactor(1e10f)
            .build(),

    META_AMINOPHENOL_DIAZOTIZATION = builder()
            .id("meta_aminophenol_diazotization")
            .addReactant(HeisenCraftMolecules.META_AMINOPHENOL)
            .addReactant(HeisenCraftMolecules.NITRITE, 1)
            .addReactant(DestroyMolecules.PROTON, 2)
            .addCatalyst(DestroyMolecules.CHLORIDE,0)
            .addCatalyst(DestroyMolecules.ZINC_ION, 0)
            .addProduct(HeisenCraftMolecules.META_HYDROXYPHENYLHYDRAZINE)
            .addProduct(DestroyMolecules.WATER,2)
            .activationEnergy(40f).preexponentialFactor(1e13f)
            .build(),

    BENZOIC_ACID_SYNTHESIS = builder()
            .id("benzoic_acid_synthesis")
            .addReactant(DestroyMolecules.TOLUENE)
            .addReactant(DestroyMolecules.DICHROMATE)
            .addReactant(DestroyMolecules.PROTON, 0)
            .addProduct(HeisenCraftMolecules.BENZOIC_ACID)
            .addProduct(DestroyMolecules.WATER)
            .addProduct(DestroyMolecules.CHROMIUM_III)
            .preexponentialFactor(1e11f)
            .build(),

    BENZOATE_FORMATION = builder()
            .id("benzoate_from_benzoic_acid")
            .addReactant(HeisenCraftMolecules.BENZOIC_ACID)
            .addReactant(DestroyMolecules.HYDROXIDE)
            .addProduct(HeisenCraftMolecules.BENZOATE)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(30f).preexponentialFactor(1e14f)
            .build(),

    BENZYL_CYANIDE_SYNTHESIS = builder()
            .id("benzyl_cyanide_synthesis")
            .addReactant(DestroyMolecules.BENZYL_CHLORIDE)
            .addReactant(DestroyMolecules.CYANIDE)
            .addProduct(HeisenCraftMolecules.BENZYL_CYANIDE)
            .addProduct(DestroyMolecules.CHLORIDE)
            .activationEnergy(48f).preexponentialFactor(1e11f)
            .build(),

    PHENYLACETONE_SYNTHESIS = builder()
            .id("phenylacetone_synthesis")
            .addReactant(DestroyMolecules.PHENYLACETIC_ACID)
            .addReactant(DestroyMolecules.ACETIC_ANHYDRIDE)
            .addSimpleItemCatalyst(DestroyItems.COPPER_POWDER, 1f)
            .addProduct(DestroyMolecules.PHENYLACETONE)
            .addProduct(DestroyMolecules.CARBON_DIOXIDE)
            .addProduct(DestroyMolecules.ACETIC_ACID)
            .activationEnergy(62f).preexponentialFactor(1e13f)
            .build(),

    CUMENE_PROCESS_2 = builder()
            .id("cumene_process_2")
            .addReactant(DestroyMolecules.BENZENE)
            .addReactant(DestroyMolecules.PROPENE)
            .addReactant(DestroyMolecules.OXYGEN)
            .addCatalyst(HeisenCraftMolecules.PHOSPHORIC_ACID, 0)
            .addProduct(DestroyMolecules.PHENOL)
            .addProduct(DestroyMolecules.ACETONE)
            .build(),

    HOCK_REARRANGEMENT = builder()
            .id("hock_rearrangement")
            .addReactant(DestroyMolecules.BENZENE)
            .addReactant(DestroyMolecules.PROPENE,2)
            .addReactant(DestroyMolecules.OXYGEN)
            .addCatalyst(HeisenCraftMolecules.PHOSPHORIC_ACID, 0)
            .addProduct(HeisenCraftMolecules.RESORCINOL)
            .addProduct(DestroyMolecules.ACETONE)
            .activationEnergy(30.5f)
            .preexponentialFactor(1e10f)
            .build(),

    OLIVETOL_SYNTHESIS = builder()
            .id("olivetol_synthesis")
            .addReactant(HeisenCraftMolecules.RESORCINOL, 1)
            .addReactant(HeisenCraftMolecules.PENTANOYL_CHLORIDE, 1)
            .addCatalyst(HeisenCraftMolecules.ALUMINIUM, 0)
            .addCatalyst(DestroyMolecules.CHLORIDE, 0)
            .addReactant(DestroyMolecules.WATER, 1)
            .addProduct(HeisenCraftMolecules.OLIVETOL, 1)
            .addProduct(DestroyMolecules.HYDROCHLORIC_ACID, 2)
            .activationEnergy(55.5f)
            .preexponentialFactor(1e10f)
            .build(),



    //Heptanone

    CYCLOHEPTANONE_AMINATION = builder()
            .id("cycloheptanone_amination")
            .addReactant(HeisenCraftMolecules.CYCLOHEPTANONE)
            .addReactant(DestroyMolecules.AMMONIA)
            .addReactant(DestroyMolecules.HYDROXIDE)
            .addCatalyst(DestroyMolecules.SODIUM_ION,0)
            .addProduct(HeisenCraftMolecules.CYCLOHEPTYLAMINE)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(40f).preexponentialFactor(1e8f)
            .build(),

    HOFMANN_DEGRADATION_CYCLOHEPTYLAMINE = builder()
            .id("hofmann_degradation_cycloheptylamine")
            .addReactant(HeisenCraftMolecules.CYCLOHEPTYLAMINE)
            .addReactant(HeisenCraftMolecules.BROMOMETHANE,3)
            .addReactant(DestroyMolecules.HYDROXIDE, 2)
            .addProduct(HeisenCraftMolecules.CYCLOHEPTENE)
            .addProduct(DestroyMolecules.TRIMETHYLAMINE)
            .addProduct(HeisenCraftMolecules.BROMINE, 3)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(5f).preexponentialFactor(1e17f)
            .build(),

    CYCLOHEPTENE_AMINATION = builder()
            .id("cycloheptene_amination")
            .addReactant(HeisenCraftMolecules.CYCLOHEPTENE)
            .addReactant(DestroyMolecules.METHYLAMINE,2)
            .addCatalyst(HeisenCraftMolecules.BROMINE,0)
            .addCatalyst(DestroyMolecules.HYDROGEN_PEROXIDE,0)
            .addProduct(HeisenCraftMolecules.DIMETHYLCYCLOHEPTENAMINE_2)
            .addProduct(DestroyMolecules.HYDROGEN)
            .activationEnergy(5f).preexponentialFactor(1e15f)
            .build(),

    HOFMANN_DEGRADATION_CYCLOHEPTENYLAMINE = builder()
            .id("hofmann_degradation_cycloheptenylamine")
            .addReactant(HeisenCraftMolecules.DIMETHYLCYCLOHEPTENAMINE_2)
            .addReactant(HeisenCraftMolecules.BROMOMETHANE, 3)
            .addReactant(DestroyMolecules.HYDROXIDE, 2)
            .addProduct(HeisenCraftMolecules.CYCLOHEPTADIENE)
            .addProduct(DestroyMolecules.TRIMETHYLAMINE)
            .addProduct(HeisenCraftMolecules.BROMINE, 3)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(5f).preexponentialFactor(1e17f)
            .build(),

    CYCLOHEPTADIENE_TO_TRIENE = builder()
            .id("cycloheptadiene_to_triene")
            .addReactant(HeisenCraftMolecules.CYCLOHEPTADIENE)
            .addCatalyst(HeisenCraftMolecules.BROMINE,0)
            .addReactant(DestroyMolecules.HYDROXIDE, 2)
            .addProduct(HeisenCraftMolecules.CYCLOHEPTATRIENE)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(5f).preexponentialFactor(1e15f)
            .build(),

    CYCLOHEPTATRIENE_AMINATION = builder()
            .id("cycloheptatriene_amination")
            .addReactant(HeisenCraftMolecules.CYCLOHEPTATRIENE)
            .addCatalyst(HeisenCraftMolecules.BROMINE,0)
            .addReactant(DestroyMolecules.METHYLAMINE, 2)
            .addProduct(HeisenCraftMolecules.DIMETHYLCYCLOHEPTENAMINE_4)
            .addProduct(DestroyMolecules.AMMONIUM)
            .activationEnergy(5f).preexponentialFactor(1e15f)
            .build(),

    PSEUDOTROPINE_SYNTHESIS = builder()
            .id("pseudotropine_synthesis")
            .addReactant(HeisenCraftMolecules.DIMETHYLCYCLOHEPTENAMINE_4)
            .addCatalyst(HeisenCraftMolecules.BROMINE,0)
            .addCatalyst(DestroyMolecules.SULFURIC_ACID,0)
            .addReactant(DestroyMolecules.CHLORINE)
            .addReactant(DestroyMolecules.HYDROXIDE, 2)
            .addProduct(HeisenCraftMolecules.PSEUDOTROPINE)
            .addProduct(DestroyMolecules.CHLORIDE)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(58f).preexponentialFactor(2e17f)
            .build(),

    PSEUDOTROPINE_TO_ECGONINE = builder()
            .id("pseudotropine_to_ecgonine")
            .addReactant(HeisenCraftMolecules.PSEUDOTROPINE)
            .addReactant(DestroyMolecules.DICHROMATE, 2)
            .addReactant(DestroyMolecules.CARBON_DIOXIDE)
            .addReactant(DestroyMolecules.PROTON, 6)
            .addProduct(HeisenCraftMolecules.ECGONINE)
            .addProduct(DestroyMolecules.CHROMIUM_III, 2)
            .activationEnergy(40f).preexponentialFactor(1e16f)
            .build(),

    ECGONINE_METHYL_ESTERIFICATION = builder()
            .id("ecgonine_methyl_esterification")
            .addReactant(HeisenCraftMolecules.ECGONINE)
            .addReactant(DestroyMolecules.METHANOL)
            .addReactant(DestroyMolecules.PROTON, 1)
            .addProduct(HeisenCraftMolecules.METHYLECGONINE)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(62f).preexponentialFactor(1e18f)
            .build(),

    METHYLECGONINE_BENZOYLATION = builder()
            .id("methylecgonine_benzoylation")
            .addReactant(HeisenCraftMolecules.METHYLECGONINE)
            .addReactant(HeisenCraftMolecules.BENZOYL_CHLORIDE)
            .addReactant(DestroyMolecules.HYDROXIDE, 1)
            .addProduct(HeisenCraftMolecules.COCAINE)
            .addProduct(DestroyMolecules.CHLORIDE)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(45f).preexponentialFactor(1e16f)
            .build(),


    //Phosphorus section

    PHOSPHORUS_TRICHLORIDE_SYNTHESIS = builder()
            .id("phosphorus_trichloride_synthesis")
            .addReactant(HeisenCraftMolecules.TETRAPHOSPHORUS, 1, 1)
            .addReactant(DestroyMolecules.CHLORINE, 6,2)
            .addProduct(HeisenCraftMolecules.PHOSPHORUS_TRICHLORIDE, 4)
            .activationEnergy(50f).preexponentialFactor(1e15f)
            .build(),

    PHOSPHORUS_PENTACHLORIDE_SYNTHESIS = builder()
            .id("phosphorus_pentachloride_synthesis")
            .addReactant(HeisenCraftMolecules.TETRAPHOSPHORUS,1, 1)
            .addReactant(DestroyMolecules.CHLORINE, 10,2)
            .addProduct(HeisenCraftMolecules.PHOSPHORUS_PENTACHLORIDE, 4)
            .activationEnergy(45f).preexponentialFactor(1e14f)
            .build(),

    PHOSPHORUS_TRIIODIDE_SYNTHESIS = builder()
            .id("pi3_synthesis")
            .addReactant(DestroyMolecules.IODINE, 3, 1)
            .addSimpleItemReactant(HeisenCraftItems.RED_PHOSPHORUS, 1)
            .addProduct(HeisenCraftMolecules.PHOSPHORUS_TRIIODIDE, 1)
            .activationEnergy(60f).preexponentialFactor(1e9f)
            .build(),

    PHOSPHORUS_PENTAIODIDE_SYNTHESIS = builder()
            .id("pi5_synthesis")
            .addReactant(DestroyMolecules.IODINE, 5, 1)
            .addSimpleItemReactant(HeisenCraftItems.RED_PHOSPHORUS, 1)
            .addProduct(HeisenCraftMolecules.PHOSPHORUS_PENTAIODIDE, 1)
            .activationEnergy(65f).preexponentialFactor(1e8f)
            .build(),

    PHOSPHORUS_TRIIODIDE_HYDROLYSIS = builder()
            .id("pi3_hydrolysis")
            .addReactant(HeisenCraftMolecules.PHOSPHORUS_TRIIODIDE, 1)
            .addReactant(DestroyMolecules.WATER, 3, 1)
            .addProduct(HeisenCraftMolecules.PHOSPHOROUS_ACID, 1)
            .addProduct(DestroyMolecules.HYDROGEN_IODIDE, 3)
            .activationEnergy(30f).preexponentialFactor(1e13f)
            .build(),

    PHOSPHORUS_PENTAIODIDE_HYDROLYSIS = builder()
            .id("pi5_hydrolysis")
            .addReactant(HeisenCraftMolecules.PHOSPHORUS_PENTAIODIDE, 1)
            .addReactant(DestroyMolecules.WATER, 4, 1)
            .addProduct(HeisenCraftMolecules.PHOSPHORIC_ACID, 1)
            .addProduct(DestroyMolecules.HYDROGEN_IODIDE, 5)
            .activationEnergy(35f).preexponentialFactor(1e12f)
            .build(),

    PHOSPHORUS_TRIIODIDE_REDUCTIVE_HYDROLYSIS = builder()
            .id("pi3_reductive_hydrolysis")
            .addReactant(HeisenCraftMolecules.PHOSPHORUS_TRIIODIDE, 1)
            .addReactant(DestroyMolecules.WATER, 12, 1)
            .addProduct(HeisenCraftMolecules.PHOSPHORIC_ACID, 3)
            .addProduct(DestroyMolecules.HYDROGEN_IODIDE, 3)
            .addProduct(HeisenCraftMolecules.PHOSPHINE, 1)
            .activationEnergy(40f).preexponentialFactor(1e11f)
            .build(),

    PHOSPHORUS_PENTAIODIDE_REDUCTIVE_HYDROLYSIS = builder()
            .id("pi5_reductive_hydrolysis")
            .addReactant(HeisenCraftMolecules.PHOSPHORUS_PENTAIODIDE, 1)
            .addReactant(DestroyMolecules.WATER, 16, 1)
            .addProduct(HeisenCraftMolecules.PHOSPHORIC_ACID, 4)
            .addProduct(DestroyMolecules.HYDROGEN_IODIDE, 5)
            .addProduct(HeisenCraftMolecules.PHOSPHINE, 1)
            .activationEnergy(45f).preexponentialFactor(1e10f)
            .build(),


    PHOSPHORIC_ACID_DEHYDRATION = builder()
            .id("phosphoric_acid_dehydration")
            .addReactant(HeisenCraftMolecules.PHOSPHORIC_ACID, 2)
            .addProduct(HeisenCraftMolecules.PYROPHOSPHORIC_ACID)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(40f).preexponentialFactor(1e11f)
            .reverseReaction(r -> r
                    .preexponentialFactor(1e12f)
            )
            .build(),

    PENTACHLORIDE_HYDROLYSIS = builder()
            .id("pentachloride_hydrolysis")
            .addReactant(HeisenCraftMolecules.PHOSPHORUS_PENTACHLORIDE,2)
            .addReactant(DestroyMolecules.WATER, 7)
            .addProduct(HeisenCraftMolecules.PYROPHOSPHORIC_ACID)
            .addProduct(DestroyMolecules.HYDROCHLORIC_ACID, 10)
            .activationEnergy(38f).preexponentialFactor(1e12f)
            .build(),



    //Meth Section

    NAUGHTY_REACTION = builder()
            .id("naughty_reaction")
            .addReactant(DestroyMolecules.PHENYLACETONE)
            .addReactant(DestroyMolecules.METHYLAMINE)
            .addCatalyst(HeisenCraftMolecules.ALUMINIUM, 0)
            .addProduct(HeisenCraftMolecules.METHAMPHETAMINE)
            .withResult(0f, (m, r) -> new CombinedReactionResult(m, r)
                    .with(DestroyAdvancementTrigger.TRY_TO_MAKE_METH::asReactionResult))
            .build(),

    IODOEPHEDRINE_FORMATION = builder()
            .id("iodoephedrine_formation")
            .addReactant(HeisenCraftMolecules.EPHEDRINE)
            .addCatalyst(DestroyMolecules.PROTON,0)
            .addReactant(DestroyMolecules.IODIDE)
            .addProduct(HeisenCraftMolecules.IODOEPHEDRINE)
            .build(),

    IODOPSEUDOEPHEDRINE_FORMATION = builder()
            .id("iodopseudoephedrine_formation")
            .addReactant(HeisenCraftMolecules.PSEUDOEPHEDRINE)
            .addCatalyst(DestroyMolecules.PROTON,0)
            .addReactant(DestroyMolecules.IODIDE)
            .addProduct(HeisenCraftMolecules.IODOPSEUDOEPHEDRINE)
            .build(),

    METH_SYNTHESIS1 = builder()
            .id("meth_from_iodoephedrine")
            .addReactant(HeisenCraftMolecules.IODOEPHEDRINE, 2)
            .addCatalyst(DestroyMolecules.PROTON,0)
            .addReactant(DestroyMolecules.IODIDE)
            .addProduct(HeisenCraftMolecules.METHAMPHETAMINE, 2)
            .addProduct(DestroyMolecules.IODINE)
            .activationEnergy(35f).preexponentialFactor(1e12f)
            .build(),

    METH_SYNTHESIS2 = builder()
            .id("meth_from_iodopseudoephedrine")
            .addReactant(HeisenCraftMolecules.IODOPSEUDOEPHEDRINE, 2)
            .addCatalyst(DestroyMolecules.PROTON,0)
            .addReactant(DestroyMolecules.IODIDE)
            .addProduct(HeisenCraftMolecules.METHAMPHETAMINE, 2)
            .addProduct(DestroyMolecules.IODINE, 1)
            .activationEnergy(35f).preexponentialFactor(1e12f)
            .build(),

    /*METH_SYNTHESIS3 = builder()
            .id("meth_from_amalgam")
            .addReactant(HeisenCraftMolecules.N_METHYL_1_PHENYLPROPAN_2_IMINE, 2)
            .addReactant(DestroyMolecules.HYDROGEN, 4)
            .addCatalyst(HeisenCraftMolecules.ALUMINIUM, 0)
            .addProduct(HeisenCraftMolecules.METHAMPHETAMINE, 2)
            .addProduct(HeisenCraftMolecules.ALUMINIUM_OXIDE, 1)
            .activationEnergy(45f).preexponentialFactor(1e11f)
            .build(),*/

    /*IODOEPHEDRINE_DEGRADATION = builder()
            .id("iodoephedrine_degradation")
            .addReactant(HeisenCraftMolecules.IODOEPHEDRINE)
            .addReactant(DestroyMolecules.WATER)
            .addReactant(DestroyMolecules.PROTON, 6)
            .addReactant(DestroyMolecules.IODIDE, 6)
            .addProduct(HeisenCraftMolecules.N_METHYLPHENETHYLAMINE)
            .addProduct(HeisenCraftMolecules.IODOMETHANE)
            .build(),

    IODOPSEUDOEPHEDRINE_DEGRADATION = builder()
            .id("iodopseudoephedrine_degradation")
            .addReactant(HeisenCraftMolecules.IODOPSEUDOEPHEDRINE)
            .addReactant(DestroyMolecules.PROTON, 6)
            .addReactant(DestroyMolecules.IODIDE, 6)
            .addProduct(HeisenCraftMolecules.N_METHYLPHENETHYLAMINE)
            .addProduct(HeisenCraftMolecules.IODOMETHANE)
            .build(),*/

    //Indole Section

    FISCHER_INDOLE_SYNTHESIS = builder()
            .id("fischer_indole_synthesis")
            .addReactant(HeisenCraftMolecules.PHENYLHYDRAZINE)
            .addReactant(DestroyMolecules.ACETALDEHYDE)
            .addReactant(DestroyMolecules.PROTON, 2)
            .addProduct(HeisenCraftMolecules.INDOLE)
            .addProduct(DestroyMolecules.WATER,2)
            .addProduct(DestroyMolecules.AMMONIUM)
            .activationEnergy(28f).preexponentialFactor(1e8f)
            .build(),

    HYDROXYINDOLE_SYNTHESIS = builder()
            .id("fischer_hydroxyindole_synthesis")
            .addReactant(HeisenCraftMolecules.META_HYDROXYPHENYLHYDRAZINE)
            .addReactant(DestroyMolecules.ACETALDEHYDE)
            .addReactant(DestroyMolecules.PROTON, 2)
            .addProduct(HeisenCraftMolecules.HYDROXYINDOLE)
            .addProduct(DestroyMolecules.WATER, 2)
            .addProduct(DestroyMolecules.AMMONIUM)
            .activationEnergy(28f).preexponentialFactor(3e11f)
            .build(),

    HYDROXYINDOLE_OXALYL_CHLORIDE_REACTION = builder()
            .id("hydroxyindole_oxalyl_chloride_reaction")
            .addReactant(HeisenCraftMolecules.HYDROXYINDOLE)
            .addReactant(HeisenCraftMolecules.OXALYL_CHLORIDE)
            .addProduct(HeisenCraftMolecules.CHLOROETHYL_HYROXYINDOLE)
            .addProduct(DestroyMolecules.HYDROCHLORIC_ACID)
            .addProduct(DestroyMolecules.CARBON_MONOXIDE)

            .build(),

    TRYPTAMINE_SYNTHESIS = builder()
            .id("tryptamine_synthesis")
            .addReactant(HeisenCraftMolecules.INDOLE)
            .addReactant(HeisenCraftMolecules.NITROETHYLENE)
            .addReactant(DestroyMolecules.PROTON, 6)
            .addSimpleItemCatalyst(DestroyItems.PALLADIUM_POWDER,1)
            .addProduct(HeisenCraftMolecules.TRYPTAMINE)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(52f).preexponentialFactor(2e12f)
            .build(),

    HYDROXYTRYPTAMINE_SYNTHESIS = builder()
            .id("hydroxytriptamine_synthesis")
            .addReactant(HeisenCraftMolecules.HYDROXYINDOLE)
            .addReactant(HeisenCraftMolecules.NITROETHYLENE)
            .addReactant(DestroyMolecules.PROTON, 6)
            .addSimpleItemCatalyst(DestroyItems.PALLADIUM_POWDER,1)
            .addProduct(HeisenCraftMolecules.HYDROXYTRYPTAMINE)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(32f)
            .preexponentialFactor(2e12f)
            .build(),

    TRYPTAMINE_METHYLATION = builder()
            .id("tryptamine_methylation")
            .addReactant(HeisenCraftMolecules.TRYPTAMINE)
            .addReactant(DestroyMolecules.FORMALDEHYDE, 2)
            .addReactant(DestroyMolecules.FORMIC_ACID, 2)
            .addProduct(HeisenCraftMolecules.DIMETHYLTRYPTAMINE)
            .addProduct(DestroyMolecules.CARBON_DIOXIDE, 2)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(1f)
            .preexponentialFactor(2e10f)
            .build(),

    HYDROXYTRYPTAMINE_METHYLATION = builder()
            .id("hydroxytryptamine_methylation")
            .addReactant(HeisenCraftMolecules.HYDROXYTRYPTAMINE)
            .addReactant(DestroyMolecules.FORMALDEHYDE, 2)
            .addReactant(DestroyMolecules.FORMIC_ACID, 2)
            .addProduct(HeisenCraftMolecules.PSILOCIN)
            .addProduct(DestroyMolecules.CARBON_DIOXIDE, 2)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(1f).preexponentialFactor(1e9f)
            .build(),


    //Psilocybin

    PSILOCYBIN_ESTERIFICATION = builder()
            .id("psilocybin_esterification")
            .addReactant(HeisenCraftMolecules.PSILOCIN)
            .addReactant(HeisenCraftMolecules.PYROPHOSPHORIC_ACID)
            .addProduct(HeisenCraftMolecules.PSILOCYBIN)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(40f).preexponentialFactor(1e11f)
            .build(),


    //Lysergic acid

    CARBOXYETHYL_INDOLE_SYNTHESIS = builder()
            .id("carboxyethyl_indole_synthesis_fischer")
            .addReactant(HeisenCraftMolecules.PHENYLHYDRAZINE)
            .addReactant(HeisenCraftMolecules.FIVE_OXOPENTANOIC_ACID)
            .addReactant(DestroyMolecules.PROTON, 2)
            .addProduct(HeisenCraftMolecules.THREE_CARBOXYETHYL_DIHYDROINDOLE)
            .addProduct(DestroyMolecules.WATER)
            .addProduct(DestroyMolecules.AMMONIA)
            .activationEnergy(45f).preexponentialFactor(1e11f)
            .build(),

    FRIEDEL_CRAFTS_INDOLE_ACYLATION = builder()
            .id("friedel_crafts_indole_acylation")
            .addReactant(HeisenCraftMolecules.THREE_CARBOXYETHYL_DIHYDROINDOLE)
            .addCatalyst(HeisenCraftMolecules.ALUMINIUM, 0)
            .addCatalyst(DestroyMolecules.CHLORIDE, 0)
            .addProduct(HeisenCraftMolecules.KETONE_8)
            .addProduct(DestroyMolecules.WATER)
            .activationEnergy(55f).preexponentialFactor(1e10f)
            .build(),

    BENZOINDOLYL_KETONE_AMINATION = builder()
            .id("benzoindolyl_ketone_amination")
            .addReactant(HeisenCraftMolecules.KETONE_8)
            .addReactant(HeisenCraftMolecules.METHYLAMINOACETONE_ETHYLENE_KETAL)
            .addReactant(DestroyMolecules.WATER)
            .addCatalyst(HeisenCraftMolecules.BROMINE,0)
            .addCatalyst(DestroyMolecules.PROTON,0)
            .addProduct(HeisenCraftMolecules.AMINOBENZOINDOLONE)
            .addProduct(HeisenCraftMolecules.ETHYLENE_GLYCOL)
            .activationEnergy(40f).preexponentialFactor(1e11f)
            .build(),

    INDOLE_QUINOLONE_CYCLIZATION = builder()
            .id("indole_quinolone_cyclization")
            .addReactant(HeisenCraftMolecules.AMINOBENZOINDOLONE)
            .addReactant(DestroyMolecules.METHOXIDE)
            .addProduct(HeisenCraftMolecules.METHYL_HYDROINDOLO_QUINOLINONE)
            .addProduct(DestroyMolecules.METHANOL)
            .addProduct(DestroyMolecules.HYDROXIDE)
            .activationEnergy(60f).preexponentialFactor(1e12f)
            .build(),

    INDOLE_QUINOLONE_REDUCTION = builder()
            .id("indole_quinolone_reduction")
            .addReactant(HeisenCraftMolecules.METHYL_HYDROINDOLO_QUINOLINONE)
            .addReactant(DestroyMolecules.BOROHYDRIDE)
            .addReactant(DestroyMolecules.WATER, 4)
            .addProduct(HeisenCraftMolecules.METHYL_DIDEHYDROERGOLINOL)
            .addProduct(DestroyMolecules.TETRAHYDROXYBORATE)
            .activationEnergy(55f).preexponentialFactor(3e9f)
            .build(),

    ALCOHOL_TO_CHLORIDE_THIONYL = builder()
            .id("alcohol_to_chloride_thionyl")
            .addReactant(HeisenCraftMolecules.METHYL_DIDEHYDROERGOLINOL)
            .addReactant(DestroyMolecules.THIONYL_CHLORIDE)
            .addProduct(HeisenCraftMolecules.CHLORO_METHYL_DIDEHYDROERGOLINE)
            .addProduct(DestroyMolecules.SULFUR_DIOXIDE)
            .addProduct(DestroyMolecules.CHLORIDE,2)

            .build(),

    CHLORIDE_TO_NITRILE_CYANIDE = builder()
            .id("chloride_to_nitrile_cyanide")
            .addReactant(HeisenCraftMolecules.CHLORO_METHYL_DIDEHYDROERGOLINE)
            .addReactant(DestroyMolecules.CYANIDE)
            .addProduct(HeisenCraftMolecules.METHYL_DIDEHYDROERGOLINE_CARBONITRILE)
            .addProduct(DestroyMolecules.CHLORIDE)
            .activationEnergy(20f).preexponentialFactor(1e10f)
            .build(),

    //LSD

    CURTIS_REACTION = builder()
            .id("curtis_reaction")
            .addReactant(HeisenCraftMolecules.LYSERGAMIDE)
            .addReactant(DestroyMolecules.HYDRAZINE, 1)
            .addCatalyst(DestroyMolecules.ACETIC_ACID,1)
            .addProduct(HeisenCraftMolecules.D_ISO_LYSERGIC_ACID_HYDRAZIDE)
            .activationEnergy(45f).preexponentialFactor(1e18f)
            .build(),

    GARBRECHT_SYNTHESIS = builder()
            .id("garbrecht_synthesis")
            .addReactant(HeisenCraftMolecules.LYSERGIC_ACID, 1)
            .addReactant(DestroyMolecules.SULFURIC_ACID, 1)
            .addReactant(HeisenCraftMolecules.DIETHYLAMINE,1)
            .addCatalyst(DestroyMolecules.POTASSIUM_ION,1)
            .addProduct(HeisenCraftMolecules.ISO_LSD, 1)
            .addProduct(DestroyMolecules.SULFUR_TRIOXIDE, 1)
            .addProduct(DestroyMolecules.WATER, 1)
            .activationEnergy(30f).preexponentialFactor(1e13f)
            .build(),

    LYSERGIC_HYDRAZIDE_DIAZOTIZATION = builder()
            .id("lysergic_hydrazide_diazotization")
            .addReactant(HeisenCraftMolecules.D_ISO_LYSERGIC_ACID_HYDRAZIDE, 1)
            .addReactant(HeisenCraftMolecules.NITRITE, 1)
            .addCatalyst(DestroyMolecules.PROTON,1)
            .addProduct(HeisenCraftMolecules.D_ISO_LYSERGIC_ACID_AZIDE, 1)
            .addProduct(DestroyMolecules.NITROGEN, 1)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(30f).preexponentialFactor(1e10f)
            .build(),

    LYSERGIC_AZIDE_TO_DIETHYLAMIDE = builder()
            .id("lysergic_azide_to_diethylamide")
            .addReactant(HeisenCraftMolecules.D_ISO_LYSERGIC_ACID_AZIDE, 1)
            .addReactant(HeisenCraftMolecules.DIETHYLAMINE, 1)
            .addProduct(HeisenCraftMolecules.ISO_LSD, 1)
            .addProduct(DestroyMolecules.NITROGEN, 1)
            .activationEnergy(35f).preexponentialFactor(1e10f)
            .build(),

    ISO_LSD_EPIMERIZATION = builder()
            .id("iso_lsd_epimerization")
            .addReactant(HeisenCraftMolecules.ISO_LSD, 1)
            .addCatalyst(DestroyMolecules.POTASSIUM_ION, 0)
            .addCatalyst(DestroyMolecules.HYDROXIDE, 0)
            .addProduct(HeisenCraftMolecules.D_LSD, 1)
            .activationEnergy(38f).preexponentialFactor(1e8f)
            //.withResult(0f, HeisenCraftAdvancementTrigger.BICYCLE_DAY::asReactionResult)
            .build(),

    //Mescaline

    PYROGALLOL_SYNTHESIS = builder()
            .id("pyrogallol_synthesis")
            .addReactant(DestroyMolecules.PHENOL) // C6H5OH
            .addReactant(DestroyMolecules.HYDROXIDE, 3)
            .addReactant(DestroyMolecules.HYDROGEN_PEROXIDE, 1)
            .addCatalyst(DestroyMolecules.SULFURIC_ACID, 0)
            .addProduct(HeisenCraftMolecules.PYROGALLOL)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(45f).preexponentialFactor(3e13f)
            .build(),

    GALLIC_ACID_FORMATION = builder()
            .id("gallic_acid_formation")
            .addReactant(DestroyMolecules.CARBON_DIOXIDE)
            .addReactant(HeisenCraftMolecules.PYROGALLOL)
            .addCatalyst(DestroyMolecules.SODIUM_ION, 1)
            .addCatalyst(DestroyMolecules.PROTON, 1)
            .addProduct(HeisenCraftMolecules.GALLIC_ACID)
            .activationEnergy(45f).preexponentialFactor(3e10f)
            .build(),

    TRIMETHOXYBENZOIC_ACID_SYNTHESIS = builder()
            .id("trimethoxybenzoic_acid_synthesis")
            .addReactant(HeisenCraftMolecules.GALLIC_ACID)
            .addReactant(DestroyMolecules.METHANOL, 3)
            .addCatalyst(DestroyMolecules.SULFURIC_ACID, 1)
            .addProduct(HeisenCraftMolecules.TRIMETHOXYBENZOIC_ACID)
            .addProduct(DestroyMolecules.WATER, 3)
            .activationEnergy(35f).preexponentialFactor(1e10f)
            .build(),

    TRIMETHOXY_NITROSTYRENE_SYNTHESIS = builder()
            .id("trimethoxy_nitrostyrene_synthesis")
            .addReactant(HeisenCraftMolecules.TRIMETHOXYBENZALDEHYDE)
            .addReactant(HeisenCraftMolecules.NITROMETHANE)
            .addProduct(HeisenCraftMolecules.TRIMETHOXY_NITROSTYRENE)
            .addProduct(DestroyMolecules.WATER, 1)
            .activationEnergy(5f).preexponentialFactor(1e10f)
            .build(),

    MESCALINE_SYNTHESIS = builder()
            .id("mescaline_synthesis")
            .addReactant(HeisenCraftMolecules.TRIMETHOXY_NITROSTYRENE)
            .addReactant(DestroyMolecules.HYDROGEN, 4)
            .addSimpleItemCatalyst(DestroyItems.PALLADIUM_POWDER, 0)
            .addProduct(HeisenCraftMolecules.MESCALINE)
            .addProduct(DestroyMolecules.WATER, 2)
            .activationEnergy(25f).preexponentialFactor(1e11f)
            .build(),

    //THC

    THC_SYNTHESIS = builder()
            .id("thc_synthesis")
            .addReactant(HeisenCraftMolecules.OLIVETOL, 1)
            .addReactant(HeisenCraftMolecules.CITRAL, 1)
            .addCatalyst(HeisenCraftMolecules.ALUMINIUM_CHLORIDE, 1)
            .addProduct(HeisenCraftMolecules.THC, 1)
            .addProduct(DestroyMolecules.WATER, 1)
            .activationEnergy(52.3f)
            .preexponentialFactor(1e8f)
            .build();








    static {
        builder().acid(HeisenCraftMolecules.PHOSPHORIC_ACID, HeisenCraftMolecules.DIHYDROGEN_PHOSPHATE, 2.15f);
        builder().acid(HeisenCraftMolecules.HYDROGEN_PHOSPHITE, HeisenCraftMolecules.PHOSPHITE, 2.15f);
        builder().acid(HeisenCraftMolecules.DIHYDROGEN_PHOSPHITE, HeisenCraftMolecules.HYDROGEN_PHOSPHITE, 2.15f);
        builder().acid(HeisenCraftMolecules.PHOSPHOROUS_ACID, HeisenCraftMolecules.DIHYDROGEN_PHOSPHITE, 2.15f);
    };

    private static ReactionBuilder builder() {

        return new ReactionBuilder(com.aetherlith.heisencraft.HeisenCraft.MODID);
    };

    public static void register() {};
}
