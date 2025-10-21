package com.aetherlith.heisencraft.chemistry;

import com.aetherlith.heisencraft.HeisenCraft;
import com.petrolpark.destroy.chemistry.legacy.*;
import com.petrolpark.destroy.chemistry.legacy.LegacySpecies.MoleculeBuilder;
import com.petrolpark.destroy.chemistry.legacy.genericreaction.GenericReactant;
import com.petrolpark.destroy.chemistry.legacy.index.DestroyMolecules;
import com.petrolpark.destroy.chemistry.legacy.index.group.NitrileGroup;


public final class HeisenCraftMolecules {

    public static final LegacySpecies

    //Generic

    ALUMINIUM = builder()
            .id("aluminium")
            .structure(LegacyMolecularStructure.atom(LegacyElement.ALUMINIUM))
            .color(0xFFB2B2B2)
            .boilingPoint(2792f)
            .density(2700f)
            .molarHeatCapacity(24.2f)
            .build(),

    ALUMINIUM_OXIDE = builder()
            .id("aluminium_oxide")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=AlOAl=O"))
            .color(0xFFFFF0)
            .boilingPoint(3253f)
            .density(3950f)
            .molarHeatCapacity(79.04f)
            .build(),

    ALUMINIUM_CHLORIDE = builder()
            .id("aluminum_chloride")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:Al(Cl)(Cl)Cl"))
            .boilingPoint(180f)
            .density(2.48f)
            .build(),

    LITHIUM_ALUMINUM_HYDRIDE = builder()
            .id("lithium_aluminum_hydride")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:LiAl"))
            .boilingPoint(150.0f)
            .density(0.917f)
            .build(),

    BROMINE = builder()
            .id("bromine")
            .translationKey("bromine")
            .structure(LegacyMolecularStructure.atom(LegacyElement.BROMINE,-1))
            .color(0xFF872657)
            .boilingPoint(58.8f)
            .density(3.12f)
            .molarHeatCapacity(75.7f)
            .build(),

    MAGNESIUM = builder()
            .id("magnesium")
            .translationKey("magnesium")
            .structure(LegacyMolecularStructure.atom(LegacyElement.MAGNESIUM,2))
            .color(0xFFBFC1C2)
            .boilingPoint(1090f)
            .density(1738f)
            .molarHeatCapacity(24.8f)
            .build(),

    LITHIUM = builder()
            .id("lithium")
            .translationKey("lithium")
            .structure(LegacyMolecularStructure.atom(LegacyElement.LITHIUM,1))
            .color(0xFFCC80FF)
            .boilingPoint(1342f)
            .density(534f)
            .molarHeatCapacity(35.0f)
            .build(),

    GENERIC_KETONE = builder()
            .id("generic_ketone")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:RCC=(R)O"))
            .hypothetical()
            .translationKey("ketone")
            .build(),

    ETHYLENE_GLYCOL = builder()
            .id("ethylene_glycol")
            .translationKey("ethylene_glycol")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:OCCO"))
            .color(0xFFB3E5FC)
            .boilingPoint(197.3f)
            .density(1110f)
            .molarHeatCapacity(104f)
            .build(),

    DIOXOLANE = builder()
            .id("dioxolane")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:dioxolane:,,,,,"))
            .boilingPoint(75.0f)
            .density(1.06f)
            .build(),

    METHYLAMINOACETONE_ETHYLENE_KETAL = builder()
            .id("methylaminoacetone_ethylene_ketal")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:dioxolane:C,CNC,,,"))
            .color(0xFFB3E5FC)
            .boilingPoint(197.3f)
            .density(1110f)
            .molarHeatCapacity(104f)
            .build(),

    DIETHYL_ETHER = builder()
            .id("diethyl_ether")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:CCOCC"))
            .boilingPoint(34.6f)
            .density(0.7134f)
            .molarHeatCapacity(172.0f)
            .build(),

    DIMETHYLAMINE = builder()
            .id("dimethylamine")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:CNC"))
            .boilingPoint(7.0f)
            .density(0.680f)
            .build(),

    OXALYL_CHLORIDE = builder()
            .id("oxalyl_chloride")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:ClC(=O)C(=O)Cl"))
            .boilingPoint(63.0f)
            .density(1.488f)
            .build(),

    DIETHYLAMINE = builder()
            .id("diethylamine")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:CCNCC"))
            .boilingPoint(55.5f)
            .density(0.7074f)
            .molarHeatCapacity(167.0f)
            .build(),

    NITRITE = builder()
            .id("nitrite")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=NO^-1"))
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .build(),

    ZINC_CHLORIDE = builder()
            .id("zinc_chloride")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:ClZnCl"))
            .boilingPoint(732.0f)
            .density(2.91f)
            .build(),

    FIVE_OXOPENTANOIC_ACID = builder()
            .id("5_oxopentanoic_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=CCCCC(=O)O"))
            .boilingPoint(245.0f)
            .density(1.144f)
            .build(),

    GLUTARIC_ACID = builder()
            .id("glutaric_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=C(O)CCCC(=O)O"))
            .boilingPoint(97.5f)
            .density(1.424f)
            .build(),

    SUCCINIC_ACID = builder()
            .id("succinic_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=C(O)CC(=O)O"))
            .boilingPoint(185.0f)
            .density(1.56f)
            .build(),

    PENTANOYL_CHLORIDE = builder()
            .id("pentanoyl_chloride")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:CCCCC(=O)Cl"))
            .build(),

    NITROMETHANE = builder()
            .id("nitromethane")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:CN(=O)O"))
            .boilingPoint(101.0f)
            .density(1.137f)
            .build(),

    NITROETHYLENE = builder()
            .id("nitroethylene")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:C=CN(=O)O"))
            .boilingPoint(103.0f)
            .density(1.105f)
            .build(),

    PIMELIC_ACID = builder()
            .id("pimelic_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=C(O)CCCCCC(=O)O"))
            .boilingPoint(212.0f)
            .density(1.285f)
            .build(),

    CITRAL = builder()
            .id("citral")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:CC=(C)CCCC=(C)CC=O"))
            .boilingPoint(229.0f)
            .density(0.888f)
            .build(),

    PENTANOIC_ACID = builder()
            .id("pentanoic_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:CCCCC(=O)O"))
            .boilingPoint(186.0f)
            .density(0.939f)
            .build(),

    HYDROGEN_BROMIDE = builder()
            .id("hydrogen_bromide")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:Br"))
            .boilingPoint(-66.8f)
            .density(3.307f)
            .build(),

    BROMOMETHANE = builder()
            .id("bromomethane")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:CBr"))
            .boilingPoint(3.6f)
            .density(1.73f)
            .build(),

    //Cycloheptane

    CYCLOHEPTANE = builder()
            .id("cycloheptane")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:cycloheptane:,,,,,,,,,,"))
            .boilingPoint(118.4f)
            .density(0.811f)
            .molarHeatCapacity(185.5f)
            .build(),


    CYCLOHEPTENE = builder()
            .id("cycloheptene")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:cycloheptene:,,,,,,,,,,"))
            .boilingPoint(115.0f)
            .density(0.823f)
            .build(),

    CYCLOHEPTADIENE = builder()
            .id("cycloheptadiene")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:cycloheptadiene:,,,,,,,"))
            .boilingPoint(110.0f)
            .density(0.838f)
            .build(),

    CYCLOHEPTATRIENE = builder()
            .id("cycloheptatriene")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:cycloheptatriene:,,,,,,,"))
            .boilingPoint(105.0f)
            .density(0.855f)
            .build(),

    CYCLOHEPTANONE = builder()
            .id("cycloheptanone")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:cycloheptanone:O,,,,,,,"))
            .boilingPoint(181.0f)
            .density(0.950f)
            .build(),

    CYCLOHEPTYLAMINE = builder()
            .id("cycloheptylamine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:cycloheptane:,,N,H,H,,,,,,,"))
            .boilingPoint(168.0f)
            .density(0.887f)
            .build(),

    DIMETHYLCYCLOHEPTENAMINE_2 = builder()
            .id("dimethylcycloheptenamine_2")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:cycloheptene:,H,,N(C)C,,,,,,,"))
            .boilingPoint(185.0f)
            .density(0.865f)
            .build(),

    DIMETHYLCYCLOHEPTENAMINE_4 = builder()
            .id("dimethylcycloheptenamine_4")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:cycloheptene:,,,,H,H,H,N(C)C,H,"))
            .boilingPoint(185.0f)
            .density(0.865f)
            .build(),


    //Phosphorus Section

    TETRAPHOSPHORUS = builder()
            .id("tetraphosphorus")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:tetraphosphorus:nochain"))
            .boilingPoint(280.5f)
            .density(1.82f)
            .molarHeatCapacity(122.0f)
            .build(),

    PHOSPHITE = builder()
            .id("phosphite")
            .structure(LegacyMolecularStructure.atom(LegacyElement.PHOSPHORUS, 0)
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
            )
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .tag(Tags.REDUCING_AGENT)
            .build(),

    DIHYDROGEN_PHOSPHITE = builder()
            .id("dihydrogen_phosphite")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=P(O)(O^-1)H"))
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .tag(Tags.REDUCING_AGENT)
            .build(),

    HYDROGEN_PHOSPHITE = builder()
            .id("hydrogen_phosphite")
            .structure(LegacyMolecularStructure.atom(LegacyElement.PHOSPHORUS, 0)
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
                    .addGroup(LegacyMolecularStructure.atom(LegacyElement.OXYGEN)
                            .addAtom(LegacyElement.HYDROGEN))
            )
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .tag(Tags.REDUCING_AGENT)
            .build(),

    PHOSPHOROUS_ACID = builder()
            .id("phosphorous_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:OP(OH)OH"))
            .boilingPoint(200f)
            .density(1650f)
            .molarHeatCapacity(96f)
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .tag(Tags.REDUCING_AGENT)
            .tag(Tags.CORROSIVE)
            .build(),

    PHOSPHATE = builder()
            .id("phosphate")
            .structure(LegacyMolecularStructure.atom(LegacyElement.PHOSPHORUS, 0)
                    .addAtom(LegacyElement.OXYGEN, LegacyBond.BondType.DOUBLE)
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
            )
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .build(),

    DIHYDROGEN_PHOSPHATE = builder()
            .id("dihydrogen_phosphate")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=P(O)(O)O^-1"))
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .build(),

    HYDROGEN_PHOSPHATE = builder()
            .id("hydrogen_phosphate")
            .structure(LegacyMolecularStructure.atom(LegacyElement.PHOSPHORUS, 0)
                    .addAtom(LegacyElement.OXYGEN, LegacyBond.BondType.DOUBLE)
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
                    .addAtom(new LegacyAtom(LegacyElement.OXYGEN, -1))
                    .addGroup(LegacyMolecularStructure.atom(LegacyElement.OXYGEN)
                            .addAtom(LegacyElement.HYDROGEN))
            )
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .build(),

    PHOSPHORIC_ACID = builder()
            .id("phosphoric_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=P(OH)(OH)OH"))
            .boilingPoint(158f)
            .density(1880f)
            .specificHeatCapacity(106f)
            .tag(DestroyMolecules.Tags.ACID_RAIN)
            .tag(DestroyMolecules.Tags.ACUTELY_TOXIC)
            .build(),

    PHOSPHIDE = builder()
            .id("phosphide")
            .structure(LegacyMolecularStructure.atom(LegacyElement.PHOSPHORUS, -3))
            .build(),

    PHOSPHORUS_TRICHLORIDE = builder()
            .id("phosphorus_trichloride")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:ClP(Cl)Cl"))
            .boilingPoint(76.1f)
            .density(1.574f)
            .molarHeatCapacity(85.2f)
            .build(),

    PHOSPHORUS_PENTACHLORIDE = builder()
            .id("phosphorus_pentachloride")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:phosphorus_pentachloride:nochain"))
            .density(2.1f)
            .molarHeatCapacity(106.7f)
            .build(),

    PHOSPHORUS_TRIIODIDE = builder()
            .id("phosphorus_triiodide")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:IP(I)I"))
            .boilingPoint(407.5f)
            .density(4.18f)
            .molarHeatCapacity(95.0f)
            .build(),

    PHOSPHORUS_PENTAIODIDE = builder()
            .id("phosphorus_pentaiodide")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:phosphorus_pentaiodide:nochain"))
            .density(4.56f)
            .molarHeatCapacity(120.0f)
            .build(),

    PHOSPHINE = builder()
            .id("phosphine")
            .structure(LegacyMolecularStructure.atom(LegacyElement.PHOSPHORUS, 0)
                    .addAtom(LegacyElement.HYDROGEN, LegacyBond.BondType.SINGLE)
                    .addAtom(LegacyElement.HYDROGEN, LegacyBond.BondType.SINGLE)
                    .addAtom(LegacyElement.HYDROGEN, LegacyBond.BondType.SINGLE)
            )
            .boilingPoint(-87.7f)
            .density(1.36f)
            .molarHeatCapacity(33.7f)
            .tag(DestroyMolecules.Tags.ACUTELY_TOXIC)
            .build(),

    PYROPHOSPHORIC_ACID = builder()
            .id("pyrophosphoric_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:linear:O=P(O)(O)OP=(O)(O)O"))
            .boilingPoint(71.5f)
            .density(2.04f)
            .build(),






    //Benzene


    BENZYL_ALCOHOL = builder()
            .id("benzyl_alcohol")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:COH,,,,,"))
            .boilingPoint(205.0f)
            .density(1.045f)
            .build(),

    SBENZENE = builder()
            .id("sbenzene")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:sbenzene:,,,,,"))
            .boilingPoint(80.1f)
            .density(876.5f)
            .molarHeatCapacity(134.8f)
            .build(),

    PHENYL = builder()
            .id("phenyl")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:R,,,,,"))
            .build(),

    BENZOIC_ACID = builder()
            .id("benzoic_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:C(=O)O,,,,,"))
            .boilingPoint(249.2f)
            .density(1.2659f)
            .build(),

    BENZOATE = builder()
            .id("benzoate")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:C(=O)O^-1,,,,,"))
            .boilingPoint(249.2f)
            .density(1.2659f)
            .build(),

    BENZOYL_CHLORIDE = builder()
            .id("benzoyl_chloride")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:C(=O)Cl,,,,,"))
            .boilingPoint(197.2f)
            .density(1.21f)
            .build(),

    NITROBENZENE = builder()
            .id("nitrobenzene")
            .density(1190f)
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:N(=O)OH,,,,,"))
            .boilingPoint(483.15f)
            .build(),

    ANILINE = builder()
            .id("aniline")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:N,,,,,"))
            .boilingPoint(184.13f)
            .density(1.0217f)
            .molarHeatCapacity(192.5f)
            .build(),

    PHENYLHYDRAZINE = builder()
            .id("phenylhydrazine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:NN,,,,,"))
            .boilingPoint(243.5f)
            .density(1.10f)
            .build(),

    META_NITROPHENOL = builder()
            .id("3_nitrophenol")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:OH,,N(=O)OH,,,"))
            .boilingPoint(194.0f)
            .density(1.485f)
            .build(),

    META_AMINOPHENOL = builder()
            .id("3_aminophenol")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:OH,,N,,,,"))
            .boilingPoint(284.0f)
            .density(1.195f)
            .molarHeatCapacity(180.0f)
            .build(),

    META_HYDROXYPHENYLHYDRAZINE = builder()
            .id("3_hydroxyphenylhydrazine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:OH,,NN,,,"))
            .boilingPoint(112.0f)
            .density(1.25f)
            .build(),

    RESORCINOL = builder()
            .id("resorcinol")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:O,,O,,"))
            .boilingPoint(281.0f)
            .density(1.28f)
            .build(),

    OLIVETOL = builder()
            .id("olivetol")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:O,,O,,CCCCC"))
            .boilingPoint(185.0f)
            .density(1.10f)
            .build(),



    //Tropane

    NORTROPANE = builder()
            .id("nortropane")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:nortropane:,,,,,,,,,,,,"))
            .boilingPoint(254.0f)
            .density(0.998f)
            .molarHeatCapacity(235.0f)
            .build(),

    TROPANE = builder()
            .id("tropane")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:nortropane:,,,,,,,,,,,,C"))
            .boilingPoint(280.0f)
            .density(0.91f)
            .molarHeatCapacity(230.0f)
            .build(),

    BENZOYLNORTROPANE = builder()
            .id("benzoylnortropane")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:benzoylnortropane:,,,,,,,,,,,,"))
            .boilingPoint(420.0f)
            .density(1.12f)
            .molarHeatCapacity(280.0f)
            .build(),

    PSEUDOTROPINE = builder()
            .id("pseudotropine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:nortropane:,,,O,,,,,,,,,C"))
            .boilingPoint(290.0f)
            .density(1.25f)
            .build(),

    ECGONINE = builder()
            .id("ecgonine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:nortropane:,C(=O)O,,O,,,,,,,,C"))
            .boilingPoint(205.0f)
            .build(),

    METHYLECGONINE = builder()
            .id("mehtylecgonine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:nortropane:,C(=O)OC,,O,,,,,,,,C"))
            .boilingPoint(207.0f)
            .build(),

    COCAINE = builder()
            .id("cocaine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:benzoylnortropane:,C(=O)OC,,,,,,,,,,,,,,,C"))
            .boilingPoint(187.0f)
            .density(1.22f)
            .molarHeatCapacity(310.0f)
            .build(),


    //Meth Section

    BENZYL_CYANIDE = builder()
            .id("benzyl_cyanide")
            .density(1000f)
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:CC#N,,,,,"))
            .boilingPoint(486.15f)
            .tag(DestroyMolecules.Tags.ACUTELY_TOXIC)
            .build(),

    BENZYL_ACYL_CHLORIDE = builder()
            .id("benzyl_acyl_chloride")
            .density(1100f)
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:CC=O(Cl),,,,,"))
            .boilingPoint(473.15f)
            .tag(DestroyMolecules.Tags.ACUTELY_TOXIC)
            .build(),


    EPHEDRINE = builder()
            .id("ephedrine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:C(C(C)NC)OH,,,,,"))
            .boilingPoint(485.15f)
            .density(1030f)
            .build(),

    PSEUDOEPHEDRINE = builder()
            .id("pseudoephedrine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:sbenzene:C(C(C)NC)OH,,,,,"))
            .boilingPoint(485.15f)
            .density(1030f)
            .build(),

    NOREPHEDRINE = builder()
            .id("norephedrine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:C(C(C)N)OH,,,,,"))
            .boilingPoint(475.15f)
            .density(1020f)
            .build(),

    METHYLEPHEDRINE = builder()
            .id("methylephedrine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:C(C(C)N(C)C)OH,,,,,"))
            .boilingPoint(495.15f)
            .density(1040f)
            .build(),

    IODOEPHEDRINE = builder()
            .id("iodoephedrine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:C(C(C)NC)I,,,,,"))
            .boilingPoint(510.15f)
            .density(1450f)
            .build(),

    IODOPSEUDOEPHEDRINE = builder()
            .id("iodopseudoephedrine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:sbenzene:C(C(C)NC)I,,,,,"))
            .boilingPoint(510.15f)
            .density(1450f)
            .build(),

    METHAMPHETAMINE = builder()
            .id("methamphetamine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:CC(NC)C,,,,,"))
            .boilingPoint(465.15f)
            .density(950f)
            .build(),

    LMETHAMPHETAMINE = builder()
            .id("lmethamphetamine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:sbenzene:CC(NC)C,,,,,"))
            .boilingPoint(465.15f)
            .density(950f)
            .build(),

    N_METHYLPHENETHYLAMINE = builder()
            .id("n_methylphenethylamine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:CCNC,,,,,"))
            .boilingPoint(465.15f)
            .density(950f)
            .build(),

    N_METHYL_1_PHENYLPROPAN_2_IMINE = builder()
            .id("n_methyl_1_phenylpropan_2_imine")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:CC(=NC)C,,,,,"))
            .boilingPoint(150f)
            .density(900f)
            .molarHeatCapacity(150f)
            .build(),

    //Indole

    INDOLE = builder()
            .id("indole")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,,"))
            .boilingPoint(254.0f)
            .density(1.22f)
            .molarHeatCapacity(180.0f)
            .build(),

    HYDROXYINDOLE = builder()
            .id("hydroxyindole")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,H,H,OH,,"))
            .boilingPoint(300.0f)
            .density(1.32f)
            .build(),

    THREE_CARBOXYETHYL_DIHYDROINDOLE = builder()
            .id("3_carboxyethyl_dihydroindole")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,CCC(=O)O,,,"))
            .boilingPoint(320.0f)
            .density(1.25f)
            .build(),

    /*ALDEHYDE_DIHYDROINDOLE = builder()
            .id("aldehyde_dihydroindole")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,H,CCC=O,H,,"))
            .boilingPoint(250.0f)
            .build(),

    ALCOHOL_DIHYDROINDOLE = builder()
            .id("alcohol_dihydroindole")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,H,CCCO,H,,"))
            .boilingPoint(200.0f)
            .build(),

    DIALCOHOL_DIHYDROINDOLE = builder()
            .id("dialcohol_dihydroindole")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,H,CCC(O)O,H,,"))
            .boilingPoint(220.0f)
            .build(),

    CHLORO_DIHYDROINDOLE = builder()
            .id("chloro_dihydroindole")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,CCC(Cl)O,,,"))
            .boilingPoint(220.0f)
            .build(),*/

    CHLOROETHYL_HYROXYINDOLE = builder()
            .id("chloroethyl_indole")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,C(=O)C(=O)Cl,OH,"))
            .boilingPoint(190.0f)
            .density(1.25f)
            .build(),

    TRYPTAMINE = builder()
            .id("tryptamine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,CCN,,"))
            .boilingPoint(220.0f)
            .density(1.23f)
            .build(),

    HYDROXYTRYPTAMINE = builder()
            .id("hydroxytryptamine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,CCN,OH,"))
            .boilingPoint(167.0f)
            .density(1.25f)
            .build(),





    //KETONE 8

    KETONE_8 = builder()
            .id("ketone8")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:ketone8:,,,,,,O,"))
            .build(),

    AMINOBENZOINDOLONE = builder()
            .id("4_methyl_2_oxopropyl_amino_dihydro_benzoindolone")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:ketone8:,,H,H,N(C)CC(=O)C,H,O,"))
            .color(0xFFD1C4E9)
            .build(),

    ALCOHOL_BENZOINDOLONE = builder()
            .id("alcohol_benzoindolone")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:ketone8:,,H,H,N(C)CC(O)C,H,O,"))
            .build(),

    CHLORO_BENZOINDOLONE = builder()
            .id("chloro_benzoindolone")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:ketone8:,,H,H,N(C)CC(Cl)C,H,O,"))
            .build(),

    METHYL_HYDROINDOLO_QUINOLINONE = builder()
            .id("methyl_hydroindolo_quinolinone")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:hydroindoloquinolinone:,,,,,C,H,H,O,H,,"))
            .color(0xFFB39DDB)
            .build(),

    METHYL_DIDEHYDROERGOLINOL = builder()
            .id("methyl_didehydroergolinol")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,C,H,H,O,H"))
            .color(0xFFB39DDB)
            .build(),

    CHLORO_METHYL_DIDEHYDROERGOLINE = builder()
            .id("chloro_methyl_didehydroergoline")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,C,H,H,Cl,H"))
            .boilingPoint(250.0f)
            .density(1.35f)
            .color(0xFFFFCC80)
            .build(),

    METHYL_DIDEHYDROERGOLINE_CARBONITRILE = builder()
            .id("methyl_didehydroergoline_carbonitrile")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,C,H,H,C#N,H"))
            .boilingPoint(200.0f)
            .density(1.40f)
            .color(0xFFFFCC80)
            .build(),

    METHYL_DIDEHYDROERGOLINE_AMINE = builder()
            .id("methyl_didehydroergoline_amine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,C,H,H,CN,H"))
            .boilingPoint(200.0f)
            .density(1.40f)
            .color(0xFFFFCC80)
            .build(),

    LYSERGIC_ACID = builder()
            .id("lysergic_acid")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,C,H,H,C(=O)O,H"))
            .boilingPoint(500.0f)
            .density(1.30f)
            .molarHeatCapacity(315.0f)
            .build(),

    ERGOLINE = builder()
            .id("ergoline")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:ergoline:,,,,,,,,,,,,,,,"))
            .boilingPoint(450.0f)
            .density(1.23f)
            .molarHeatCapacity(320.0f)
            .build(),

    DIDEHYDROERGOLINE = builder()
            .id("didehydroergoline")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,,,,"))
            .boilingPoint(480.0f)
            .density(1.25f)
            .molarHeatCapacity(310.0f)
            .build(),

    //LSD

    LYSERGAMIDE = builder()
            .id("lysergamide")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,CH,H,H,C(=O)N,H"))
            .boilingPoint(480.0f)
            .density(1.25f)
            .molarHeatCapacity(305.0f)
            .build(),

    D_ISO_LYSERGIC_ACID_HYDRAZIDE = builder()
            .id("d_iso_lysergic_acid_hydrazide")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,CH,H,H,C(=O)NN,H"))
            .boilingPoint(525.0f)
            .density(1.35f)
            .molarHeatCapacity(345.0f)
            .build(),

    D_ISO_LYSERGIC_ACID_AZIDE = builder()
            .id("d_iso_lysergic_acid_azide")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,C,H,H,C(=O)N#N,H"))
            .boilingPoint(490.0f)
            .density(1.32f)
            .molarHeatCapacity(330.0f)
            .build(),

    ISO_LSD = builder()
            .id("iso_lsd")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,C,H,H,C(=O)N(CC)CC,H"))
            .boilingPoint(527.0f)
            .density(1.34f)
            .molarHeatCapacity(312.5f)
            .build(),


    D_LSD = builder()
            .id("d_lsd")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:didehydroergoline:,,,,,C,H,H,H,C(=O)N(CC)CC,H"))
            .boilingPoint(500.0f)
            .density(1.27f)
            .molarHeatCapacity(380.0f)
            .build(),

    //Psilocybin

    DIMETHYLTRYPTAMINE = builder()
            .id("dimethyltryptamine")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,CCN(C)C,,"))
            .boilingPoint(160.0f)
            .density(1.099f)
            .build(),

    PSILOCIN = builder()
            .id("psilocin")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,CCN(C)C,OH,"))
            .boilingPoint(173.0f)
            .density(1.24f)
            .build(),

    PSILOCYBIN = builder()
            .id("psilocybin")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:indole:,,CCN(C)C,OP(=O)(OH)O,,"))
            .boilingPoint(220.0f)
            .density(1.35f)
            .molarHeatCapacity(280.0f)
            .build(),

    //Mescaline Section

    PYROGALLOL = builder()
            .id("pyrogallol")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:O,O,O,,"))
            .boilingPoint(309.0f)
            .density(1.45f)
            .build(),

    GALLIC_ACID = builder()
            .id("gallic_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:O,O,O,,C(=O)O"))
            .boilingPoint(260.0f)
            .density(1.69f)
            .build(),

    TRIMETHOXYBENZOIC_ACID = builder()
            .id("trimethoxybenzoic_acid")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:OC,OC,OC,,C(=O)O"))
            .density(1.35f)
            .build(),

    TRIMETHOXYBENZALDEHYDE = builder()
            .id("trimethoxybenzaldehyde")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:OC,OC,OC,,C=O"))
            .boilingPoint(295.0f)
            .density(1.23f)
            .build(),

    TRIMETHOXY_NITROSTYRENE = builder()
            .id("trimethoxy_nitroethenyl_benzene")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:OC,OC,OC,,C=CN(=O)O"))
            .boilingPoint(315.0f)
            .density(1.34f)
            .build(),

    MESCALINE = builder()
            .id("mescaline")
            .structure(LegacyMolecularStructure.deserialize("destroy:benzene:OC,OC,OC,,CCN"))
            .boilingPoint(523.15f)
            .density(1250f)
            .build(),


    BENZOCCHROMENE = builder()
            .id("benzocchromene")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:benzocchromene:,,,,,,,,,,,,"))
            .boilingPoint(350.0f)
            .density(1.25f)
            .molarHeatCapacity(300.0f)
            .build(),

    THC = builder()
            .id("thc")
            .structure(LegacyMolecularStructure.deserialize("heisencraft:benzocchromene:OH,,CCCCC,,C,C,,,,,,C,"))
            .boilingPoint(157.0f)
            .density(1.02f)
            .molarHeatCapacity(350.0f)
            .build();



    public static void register() {
    }

    private static MoleculeBuilder builder() {
        return new MoleculeBuilder(HeisenCraft.MODID);
    }

    public static class Tags {

        public static final LegacySpeciesTag

                PSYCHOACTIVE = new LegacySpeciesTag("heisencraft", "psychoactive")
                .withColor(0x6FEF40),
                REDUCING_AGENT = new LegacySpeciesTag("heisencraft", "reducing_agent")
                .withColor(0x6FEF40),
                CORROSIVE = new LegacySpeciesTag("heisencraft", "corrosive")
                .withColor(0x6FEF40),
                ARYL = new LegacySpeciesTag("heisencraft", "aryl")
                .withColor(0x6FEF40);


    }
}
