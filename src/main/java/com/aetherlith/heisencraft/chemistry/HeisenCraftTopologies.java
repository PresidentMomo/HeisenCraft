package com.aetherlith.heisencraft.chemistry;

import com.aetherlith.heisencraft.HeisenCraft;
import com.petrolpark.destroy.chemistry.legacy.LegacyElement;
import com.petrolpark.destroy.chemistry.legacy.LegacyBond.BondType;
import com.petrolpark.destroy.chemistry.legacy.LegacyMolecularStructure.Topology;

import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

public class HeisenCraftTopologies {

    public static final Topology

    CYCLOHEPTANE = create(LegacyElement.CARBON) // C0
            .sideChain(new Vec3(0, -0.775, -0.633), new Vec3(0, -0.775, -0.633), BondType.SINGLE)
            .sideChain(new Vec3(0, -0.775, 0.633), new Vec3(0, -0.775, 0.633), BondType.SINGLE)

            // C1
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(2*Math.PI/7), 1 - Math.cos(2*Math.PI/7), 0))
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(0.606, -0.483, -0.633), new Vec3(0.606, -0.483, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(0.606, -0.483, 0.633), new Vec3(0.606, -0.483, 0.633), BondType.SINGLE)
            .attach()

            // C2
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(4*Math.PI/7), 1 - Math.cos(4*Math.PI/7), 0))
            .withBondTo(1, BondType.SINGLE)
            .withSideBranch(new Vec3(0.755, 0.172, -0.633), new Vec3(0.755, 0.172, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(0.755, 0.172, 0.633), new Vec3(0.755, 0.172, 0.633), BondType.SINGLE)
            .attach()

            // C3
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(6*Math.PI/7), 1 - Math.cos(6*Math.PI/7), 0))
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(0.336, 0.698, -0.633), new Vec3(0.336, 0.698, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(0.336, 0.698, 0.633), new Vec3(0.336, 0.698, 0.633), BondType.SINGLE)
            .attach()

            // C4
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(8*Math.PI/7), 1 - Math.cos(8*Math.PI/7), 0))
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.336, 0.698, -0.633), new Vec3(-0.336, 0.698, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.336, 0.698, 0.633), new Vec3(-0.336, 0.698, 0.633), BondType.SINGLE)
            .attach()

            // C5
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(10*Math.PI/7), 1 - Math.cos(10*Math.PI/7), 0))
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.755, 0.172, -0.633), new Vec3(-0.755, 0.172, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.755, 0.172, 0.633), new Vec3(-0.755, 0.172, 0.633), BondType.SINGLE)
            .attach()

            // C6
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(12*Math.PI/7), 1 - Math.cos(12*Math.PI/7), 0))
            .withBondTo(5, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, -0.633), new Vec3(-0.606, -0.483, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, 0.633), new Vec3(-0.606, -0.483, 0.633), BondType.SINGLE)
            .attach()
            .reflections(new int[][] {

                    new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13},
                    new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,0},
                    new int[]{2,3,4,5,6,7,8,9,10,11,12,13,0,1},
                    new int[]{3,4,5,6,7,8,9,10,11,12,13,0,1,2},
                    new int[]{4,5,6,7,8,9,10,11,12,13,0,1,2,3},
                    new int[]{5,6,7,8,9,10,11,12,13,0,1,2,3,4},
                    new int[]{6,7,8,9,10,11,12,13,0,1,2,3,4,5},
                    new int[]{7,8,9,10,11,12,13,0,1,2,3,4,5,6},
                    new int[]{8,9,10,11,12,13,0,1,2,3,4,5,6,7},
                    new int[]{9,10,11,12,13,0,1,2,3,4,5,6,7,8},
                    new int[]{10,11,12,13,0,1,2,3,4,5,6,7,8,9},
                    new int[]{11,12,13,0,1,2,3,4,5,6,7,8,9,10},
                    new int[]{12,13,0,1,2,3,4,5,6,7,8,9,10,11},
                    new int[]{13,0,1,2,3,4,5,6,7,8,9,10,11,12},

                    new int[]{13,12,11,10,9,8,7,6,5,4,3,2,1,0},
                    new int[]{12,11,10,9,8,7,6,5,4,3,2,1,0,13},
                    new int[]{11,10,9,8,7,6,5,4,3,2,1,0,13,12},
                    new int[]{10,9,8,7,6,5,4,3,2,1,0,13,12,11},
                    new int[]{9,8,7,6,5,4,3,2,1,0,13,12,11,10},
                    new int[]{8,7,6,5,4,3,2,1,0,13,12,11,10,9},
                    new int[]{7,6,5,4,3,2,1,0,13,12,11,10,9,8},
                    new int[]{6,5,4,3,2,1,0,13,12,11,10,9,8,7},
                    new int[]{5,4,3,2,1,0,13,12,11,10,9,8,7,6},
                    new int[]{4,3,2,1,0,13,12,11,10,9,8,7,6,5},
                    new int[]{3,2,1,0,13,12,11,10,9,8,7,6,5,4},
                    new int[]{2,1,0,13,12,11,10,9,8,7,6,5,4,3},
                    new int[]{1,0,13,12,11,10,9,8,7,6,5,4,3,2},
                    new int[]{0,13,12,11,10,9,8,7,6,5,4,3,2,1}
            })

            .build("cycloheptane"),

    CYCLOHEPTENE = create(LegacyElement.CARBON) // C0
            .sideChain(new Vec3(0, -1, 0), new Vec3(0, -1, 0), BondType.SINGLE)

            // C1
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(2*Math.PI/7), 1 - Math.cos(2*Math.PI/7), 0))
            .withBondTo(0, BondType.DOUBLE)
            .withSideBranch(new Vec3(Math.sin(2*Math.PI/7 + Math.PI/2), Math.cos(2*Math.PI/7 + Math.PI/2), 0),
                    new Vec3(Math.sin(2*Math.PI/7 + Math.PI/2), Math.cos(2*Math.PI/7 + Math.PI/2), 0), BondType.SINGLE)
            .attach()

            // C2
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(4*Math.PI/7), 1 - Math.cos(4*Math.PI/7), 0))
            .withBondTo(1, BondType.SINGLE)
            .withSideBranch(new Vec3(0.755, 0.172, -0.633), new Vec3(0.755, 0.172, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(0.755, 0.172, 0.633), new Vec3(0.755, 0.172, 0.633), BondType.SINGLE)
            .attach()

            // C3
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(6*Math.PI/7), 1 - Math.cos(6*Math.PI/7), 0))
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(0.336, 0.698, -0.633), new Vec3(0.336, 0.698, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(0.336, 0.698, 0.633), new Vec3(0.336, 0.698, 0.633), BondType.SINGLE)
            .attach()

            // C4
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(8*Math.PI/7), 1 - Math.cos(8*Math.PI/7), 0))
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.336, 0.698, -0.633), new Vec3(-0.336, 0.698, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.336, 0.698, 0.633), new Vec3(-0.336, 0.698, 0.633), BondType.SINGLE)
            .attach()

            // C5
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(10*Math.PI/7), 1 - Math.cos(10*Math.PI/7), 0))
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.755, 0.172, -0.633), new Vec3(-0.755, 0.172, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.755, 0.172, 0.633), new Vec3(-0.755, 0.172, 0.633), BondType.SINGLE)
            .attach()

            // C6
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(12*Math.PI/7), 1 - Math.cos(12*Math.PI/7), 0))
            .withBondTo(5, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, -0.633), new Vec3(-0.606, -0.483, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, 0.633), new Vec3(-0.606, -0.483, 0.633), BondType.SINGLE)
            .attach()
            .reflections(new int[][]{

                    new int[]{0,1,2,3,4,5,6,7,8,9,10,11},
                    new int[]{0,1,2,3,4,5,6,8,7,10,9,11},

                    new int[]{0,6,5,4,3,2,1,11,10,9,8,7},
                    new int[]{0,6,5,4,3,2,1,10,11,8,9,7}
            })

            .build("cycloheptene"),

    CYCLOHEPTADIENE = create(LegacyElement.CARBON) // C0
            .sideChain(new Vec3(0, -1, 0), new Vec3(0, -1, 0), BondType.SINGLE)

            // C1
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(2*Math.PI/7), 1 - Math.cos(2*Math.PI/7), 0))
            .withBondTo(0, BondType.DOUBLE)
            .withSideBranch(new Vec3(Math.sin(2*Math.PI/7 + Math.PI/2), Math.cos(2*Math.PI/7 + Math.PI/2), 0),
                    new Vec3(Math.sin(2*Math.PI/7 + Math.PI/2), Math.cos(2*Math.PI/7 + Math.PI/2), 0), BondType.SINGLE)
            .attach()

            // C2
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(4*Math.PI/7), 1 - Math.cos(4*Math.PI/7), 0))
            .withBondTo(1, BondType.SINGLE)
            .withSideBranch(new Vec3(Math.sin(4*Math.PI/7), -Math.cos(4*Math.PI/7), 0),
                    new Vec3(Math.sin(4*Math.PI/7), -Math.cos(4*Math.PI/7), 0), BondType.SINGLE)
            .attach()

            // C3
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(6*Math.PI/7), 1 - Math.cos(6*Math.PI/7), 0))
            .withBondTo(2, BondType.DOUBLE)
            .withSideBranch(new Vec3(Math.sin(6*Math.PI/7), -Math.cos(6*Math.PI/7), 0),
                    new Vec3(Math.sin(6*Math.PI/7), -Math.cos(6*Math.PI/7), 0), BondType.SINGLE)
            .attach()

            // C4
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(8*Math.PI/7), 1 - Math.cos(8*Math.PI/7), 0))
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.336, 0.698, -0.633), new Vec3(-0.336, 0.698, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.336, 0.698, 0.633), new Vec3(-0.336, 0.698, 0.633), BondType.SINGLE)
            .attach()

            // C5
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(10*Math.PI/7), 1 - Math.cos(10*Math.PI/7), 0))
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.755, 0.172, -0.633), new Vec3(-0.755, 0.172, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.755, 0.172, 0.633), new Vec3(-0.755, 0.172, 0.633), BondType.SINGLE)
            .attach()

            // C6
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(12*Math.PI/7), 1 - Math.cos(12*Math.PI/7), 0))
            .withBondTo(5, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, -0.633), new Vec3(-0.606, -0.483, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, 0.633), new Vec3(-0.606, -0.483, 0.633), BondType.SINGLE)
            .attach()
            .reflections(new int[][]{

                    new int[]{0,1,2,3,4,5,6,7,8,9}
            })

            .build("cycloheptadiene"),

    CYCLOHEPTATRIENE = create(LegacyElement.CARBON) // C0
            .sideChain(new Vec3(0, -1, 0), new Vec3(0, -1, 0), BondType.SINGLE)

            // C1
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(2*Math.PI/7), 1 - Math.cos(2*Math.PI/7), 0))
            .withBondTo(0, BondType.DOUBLE)
            .withSideBranch(new Vec3(Math.sin(2*Math.PI/7 + Math.PI/2), Math.cos(2*Math.PI/7 + Math.PI/2), 0),
                    new Vec3(Math.sin(2*Math.PI/7 + Math.PI/2), Math.cos(2*Math.PI/7 + Math.PI/2), 0), BondType.SINGLE)
            .attach()

            // C2
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(4*Math.PI/7), 1 - Math.cos(4*Math.PI/7), 0))
            .withBondTo(1, BondType.SINGLE)
            .withSideBranch(new Vec3(Math.sin(4*Math.PI/7), -Math.cos(4*Math.PI/7), 0),
                    new Vec3(Math.sin(4*Math.PI/7), -Math.cos(4*Math.PI/7), 0), BondType.SINGLE)
            .attach()

            // C3
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(6*Math.PI/7), 1 - Math.cos(6*Math.PI/7), 0))
            .withBondTo(2, BondType.DOUBLE)
            .withSideBranch(new Vec3(Math.sin(6*Math.PI/7), -Math.cos(6*Math.PI/7), 0),
                    new Vec3(Math.sin(6*Math.PI/7), -Math.cos(6*Math.PI/7), 0), BondType.SINGLE)
            .attach()

            // C4
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(8*Math.PI/7), 1 - Math.cos(8*Math.PI/7), 0))
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(Math.sin(8*Math.PI/7), -Math.cos(8*Math.PI/7), 0),
                    new Vec3(Math.sin(8*Math.PI/7), -Math.cos(8*Math.PI/7), 0), BondType.SINGLE)
            .attach()

            // C5
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(10*Math.PI/7), 1 - Math.cos(10*Math.PI/7), 0))
            .withBondTo(4, BondType.DOUBLE)
            .withSideBranch(new Vec3(Math.sin(10*Math.PI/7), -Math.cos(10*Math.PI/7), 0),
                    new Vec3(Math.sin(10*Math.PI/7), -Math.cos(10*Math.PI/7), 0), BondType.SINGLE)
            .attach()

            // C6
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(12*Math.PI/7), 1 - Math.cos(12*Math.PI/7), 0))
            .withBondTo(5, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, -0.633), new Vec3(-0.606, -0.483, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, 0.633), new Vec3(-0.606, -0.483, 0.633), BondType.SINGLE)
            .attach()
            .reflections(new int[][]{

                    new int[]{0,1,2,3,4,5,6,7},
                    new int[]{7,6,5,4,3,2,1,0},
                    new int[]{4,5,6,7,0,1,2,3},
                    new int[]{3,2,1,0,7,6,5,4}
            })

            .build("cycloheptatriene"),

    CYCLOHEPTANONE = create(LegacyElement.CARBON) // C0
            .sideChain(new Vec3(0, -1, 0), new Vec3(0, -1, 0), BondType.DOUBLE)

            // C1
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(2*Math.PI/7), 1 - Math.cos(2*Math.PI/7), 0))
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(Math.sin(2*Math.PI/7 + Math.PI/2), Math.cos(2*Math.PI/7 + Math.PI/2), 0),
                    new Vec3(Math.sin(2*Math.PI/7 + Math.PI/2), Math.cos(2*Math.PI/7 + Math.PI/2), 0), BondType.SINGLE)
            .attach()

            // C2
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(4*Math.PI/7), 1 - Math.cos(4*Math.PI/7), 0))
            .withBondTo(1, BondType.SINGLE)
            .withSideBranch(new Vec3(0.755, 0.172, -0.633), new Vec3(0.755, 0.172, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(0.755, 0.172, 0.633), new Vec3(0.755, 0.172, 0.633), BondType.SINGLE)
            .attach()

            // C3
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(6*Math.PI/7), 1 - Math.cos(6*Math.PI/7), 0))
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(0.336, 0.698, -0.633), new Vec3(0.336, 0.698, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(0.336, 0.698, 0.633), new Vec3(0.336, 0.698, 0.633), BondType.SINGLE)
            .attach()

            // C4
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(8*Math.PI/7), 1 - Math.cos(8*Math.PI/7), 0))
            .withBondTo(3, BondType.DOUBLE)
            .withSideBranch(new Vec3(-0.336, 0.698, -0.633), new Vec3(-0.336, 0.698, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.336, 0.698, 0.633), new Vec3(-0.336, 0.698, 0.633), BondType.SINGLE)
            .attach()

            // C5
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(10*Math.PI/7), 1 - Math.cos(10*Math.PI/7), 0))
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.755, 0.172, -0.633), new Vec3(-0.755, 0.172, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.755, 0.172, 0.633), new Vec3(-0.755, 0.172, 0.633), BondType.SINGLE)
            .attach()

            // C6
            .atom(LegacyElement.CARBON, new Vec3(Math.sin(12*Math.PI/7), 1 - Math.cos(12*Math.PI/7), 0))
            .withBondTo(5, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, -0.633), new Vec3(-0.606, -0.483, -0.633), BondType.SINGLE)
            .withSideBranch(new Vec3(-0.606, -0.483, 0.633), new Vec3(-0.606, -0.483, 0.633), BondType.SINGLE)
            .attach()
            .reflections(new int[][] {

                    {0,1,2,3,4,5,6,7,8,9,10,11},

                    {0,11,10,9,8,7,6,5,4,3,2,1},
                    {0,10,9,8,7,6,5,4,3,2,1,11},
                    {0,9,8,7,6,5,4,3,2,1,11,10},
                    {0,8,7,6,5,4,3,2,1,11,10,9},
                    {0,7,6,5,4,3,2,1,11,10,9,8},
                    {0,6,5,4,3,2,1,11,10,9,8,7}
            })


            .build("cycloheptanone"),

    NORTROPANE = create(LegacyElement.CARBON) // C1 (0.0000, 0.0000, 0.0000)
            .sideChain(new Vec3(0.2920, 0.7864, -0.4011).normalize(), new Vec3(0.2920, 0.7864, -0.4011).normalize(), BondType.SINGLE) // H9

            .atom(LegacyElement.CARBON, new Vec3(-1.2642, 0.1007, 0.3154)) // C2
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.4969, 0.1746, -0.8911).normalize(), new Vec3(-0.4969, 0.1746, -0.8911).normalize(), BondType.SINGLE) // H15
            .withSideBranch(new Vec3(-0.1294, 0.7240, 0.8533).normalize(), new Vec3(-0.1294, 0.7240, 0.8533).normalize(), BondType.SINGLE) // H16
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.7261, -0.9773, 0.8809)) // C3
            .withBondTo(1, BondType.SINGLE)
            .withSideBranch(new Vec3(0.3349, -0.0002, 1.0721).normalize(), new Vec3(0.3349, -0.0002, 1.0721).normalize(), BondType.SINGLE) // H20
            .withSideBranch(new Vec3(-1.1773, 0.0003, -0.0755).normalize(), new Vec3(-1.1773, 0.0003, -0.0755).normalize(), BondType.SINGLE) // H21
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.2647, -2.0556, 0.3152)) // C4
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.1276, -1.2601, 0.5742).normalize(), new Vec3(-0.1276, -1.2601, 0.5742).normalize(), BondType.SINGLE) // H17
            .withSideBranch(new Vec3(-0.4940, -0.1742, -0.7201).normalize(), new Vec3(-0.4940, -0.1742, -0.7201).normalize(), BondType.SINGLE) // H18
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.0003 * 0.85, -2.3004 * 0.85, 0.0006 * 0.85)) // C5 ≈ (−0.0003, −1.9553, 0.0005)
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(0.2916, -1.0883, -0.4027).normalize(), new Vec3(0.2916, -1.0883, -0.4027).normalize(), BondType.SINGLE) // H10
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(0.7509, -1.6279, 1.0096)) // C6
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(0.9789, -0.5516, -0.1283).normalize(), new Vec3(0.9789, -0.5516, -0.1283).normalize(), BondType.SINGLE) // H13
            .withSideBranch(new Vec3(-0.1952, -0.6999, 0.7784).normalize(), new Vec3(-0.1952, -0.6999, 0.7784).normalize(), BondType.SINGLE) // H14
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(0.7503, -0.3273, 1.0081)) // C7
            .withBondTo(5, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.1948, 0.2998, 0.9595).normalize(), new Vec3(-0.1948, 0.2998, 0.9595).normalize(), BondType.SINGLE) // H11
            .withSideBranch(new Vec3(0.9825, 0.2573, -0.1452).normalize(), new Vec3(0.9825, 0.2573, -0.1452).normalize(), BondType.SINGLE) // H12
            .attach()

            .atom(LegacyElement.NITROGEN, new Vec3(0.1318, -0.9780, -0.7707)) // N1
            .withBondTo(0, BondType.SINGLE)
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.5969, 0.0000, -0.7231).normalize(), new Vec3(-0.5969, 0.0000, -0.7231).normalize(), BondType.SINGLE) // H19
            .attach()
            .reflections(new int[][]{
                    new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12},
                    new int[]{12,11,10,9,8,7,6,5,4,3,2,1,0}
            })

            .build("nortropane"),

    BENZOYLNORTROPANE = create(LegacyElement.CARBON) // 0
            .sideChain(new Vec3(-0.4559, 0.7812, -0.2174), new Vec3(-0.4559, 0.7812, -0.2174), BondType.SINGLE) // H18

            .atom(LegacyElement.CARBON, new Vec3(1.2752, 0.1420, -0.2446)) // 1
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(0.1322, 0.2216, -0.8963), new Vec3(0.1322, 0.2216, -0.8963), BondType.SINGLE) // H24
            .withSideBranch(new Vec3(0.3382, 0.7217, 0.4860), new Vec3(0.3382, 0.7217, 0.4860), BondType.SINGLE) // H25
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(1.9580, -0.9329, 0.0354)) // 2
            .withBondTo(1, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.1220, -0.6074, -0.7008), new Vec3(-0.1220, -0.6074, -0.7008), BondType.SINGLE) // H28
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(1.5570, -1.4727, 1.1518)) // 3
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(0.3857, 0.4441, 0.7265), new Vec3(0.3857, 0.4441, 0.7265), BondType.SINGLE) // H26
            .withSideBranch(new Vec3(0.2712, -0.8843, 0.0707), new Vec3(0.2712, -0.8843, 0.0707), BondType.SINGLE) // H27
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(0.2561, -1.4674, 1.2689)) // 4
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.2516, -0.3983, 0.8026), new Vec3(-0.2516, -0.3983, 0.8026), BondType.SINGLE) // H19
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.3487, -2.0118, 0.2556)) // 5
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.8294, -0.3317, 0.2576), new Vec3(-0.8294, -0.3317, 0.2576), BondType.SINGLE) // H22
            .withSideBranch(new Vec3(0.4822, -0.7041, -0.3832), new Vec3(0.4822, -0.7041, -0.3832), BondType.SINGLE) // H23
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.5195, -1.0359, -0.5876)) // 6
            .withBondTo(5, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(0.3892, -0.1800, -0.8267), new Vec3(0.3892, -0.1800, -0.8267), BondType.SINGLE) // H20
            .withSideBranch(new Vec3(-0.9114, 0.1280, -0.1397), new Vec3(-0.9114, 0.1280, -0.1397), BondType.SINGLE) // H21
            .attach()

            .atom(LegacyElement.OXYGEN, new Vec3(3.1380, -0.6751, 0.0938)) // 7
            .withBondTo(2, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(3.8420, -1.5685, 0.3073)) // 8
            .withBondTo(7, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(5.0450, -1.1894, 0.3481)) // 9
            .withBondTo(8, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(5.8871, -1.9401, 0.0276)) // 10
            .withBondTo(9, BondType.AROMATIC)
            .withSideBranch(new Vec3(-0.1945, -0.8577, -0.2825), new Vec3(-0.1945, -0.8577, -0.2825), BondType.SINGLE) // H30
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(7.0173, -1.5837, 0.0659)) // 11
            .withBondTo(10, BondType.AROMATIC)
            .withSideBranch(new Vec3(0.6761, -0.5777, -0.2506), new Vec3(0.6761, -0.5777, -0.2506), BondType.SINGLE) // H32
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(7.2806, -0.4844, 0.4235)) // 12
            .withBondTo(11, BondType.AROMATIC)
            .withSideBranch(new Vec3(0.8786, 0.2760, 0.0300), new Vec3(0.8786, 0.2760, 0.0300), BondType.SINGLE) // H34
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(6.4136, 0.2586, 0.7431)) // 13
            .withBondTo(12, BondType.AROMATIC)
            .withSideBranch(new Vec3(0.2051, 0.8556, 0.2815), new Vec3(0.2051, 0.8556, 0.2815), BondType.SINGLE) // H33
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(5.2835, -0.0979, 0.7051)) // 14
            .withBondTo(13, BondType.AROMATIC)
            .withBondTo(9, BondType.AROMATIC)
            .withSideBranch(new Vec3(-0.6564, 0.5912, 0.2646), new Vec3(-0.6564, 0.5912, 0.2646), BondType.SINGLE) // H31
            .attach()

            .atom(LegacyElement.NITROGEN, new Vec3(-0.1317, -0.2778, 1.2143)) // 15
            .withBondTo(0, BondType.SINGLE)
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(0.4981, 0.5102, 0.4905), new Vec3(0.4981, 0.5102, 0.4905), BondType.SINGLE) // H29
            .attach()

            .atom(LegacyElement.OXYGEN, new Vec3(3.5505, -2.5544, 0.4502)) // O2
            .withBondTo(8, BondType.DOUBLE)
            .attach()
            .reflections(new int[][]{
                    new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}
            })



            .build("benzoylnortropane"),

    BENZOCCHROMENE = create(LegacyElement.CARBON) // 0
            .sideChain(new Vec3(-0.3750 - 0, 0.8128 - 0, -0.2263 - 0).normalize(), new Vec3(-0.3750 - 0, 0.8128 - 0, -0.2263 - 0).normalize(), BondType.SINGLE) // H1

            .atom(LegacyElement.CARBON, new Vec3(1.1682, -0.0320, 0.2103)) // 1
            .withBondTo(0, BondType.SINGLE)
            .withSideBranch(new Vec3(1.6670 - 1.1682, 0.7410 - (-0.0320), 0.1588 - 0.2103).normalize(), new Vec3(1.6670 - 1.1682, 0.7410 - (-0.0320), 0.1588 - 0.2103).normalize(), BondType.SINGLE) // H2
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(1.6943, -1.0572, 0.4801)) // 2
            .withBondTo(1, BondType.DOUBLE)
            .withSideBranch(new Vec3(2.6023 - 1.6943, -1.0804 - (-1.0572), 0.6443 - 0.4801).normalize(), new Vec3(2.6023 - 1.6943, -1.0804 - (-1.0572), 0.6443 - 0.4801).normalize(), BondType.SINGLE) // H3
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(1.0554, -2.0519, 0.5254)) // 3
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(1.4744 - 1.0554, -2.8516 - (-2.0519), 0.7227 - 0.5254).normalize(), new Vec3(1.4744 - 1.0554, -2.8516 - (-2.0519), 0.7227 - 0.5254).normalize(), BondType.SINGLE) // H4
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.1134, -2.0232, 0.3069)) // 4
            .withBondTo(3, BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.OXYGEN, new Vec3(-0.6513, -3.0582, 0.3563)) // 5 [O]
            .withBondTo(4, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.7949, -3.0804, -0.0596)) // 6
            .withBondTo(5, BondType.SINGLE)
            .withSideBranch(new Vec3(-2.1823 - (-1.7949), -3.8660 - (-3.0804), 0.2564 - (-0.0596)).normalize(), new Vec3(-2.1823 - (-1.7949), -3.8660 - (-3.0804), 0.2564 - (-0.0596)).normalize(), BondType.SINGLE) // H6
            .withSideBranch(new Vec3(-1.7789 - (-1.7949), -3.1346 - (-3.0804), -0.9903 - (-0.0596)).normalize(), new Vec3(-1.7789 - (-1.7949), -3.1346 - (-3.0804), -0.9903 - (-0.0596)).normalize(), BondType.SINGLE) // H7
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.4613, -2.0538, 0.3590)) // 7
            .withBondTo(6, BondType.SINGLE)
            .withSideBranch(new Vec3(-2.3633 - (-2.4613), -2.0126 - (-2.0538), 1.2895 - 0.3590).normalize(), new Vec3(-2.3633 - (-2.4613), -2.0126 - (-2.0538), 1.2895 - 0.3590).normalize(), BondType.SINGLE) // H8
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.7298, -2.1131, 0.0836)) // 8
            .withBondTo(7, BondType.SINGLE)
            .withSideBranch(new Vec3(-4.1049 - (-3.7298), -2.8998 - (-2.1131), 0.4144 - 0.0836).normalize(), new Vec3(-4.1049 - (-3.7298), -2.8998 - (-2.1131), 0.4144 - 0.0836).normalize(), BondType.SINGLE) // H9
            .withSideBranch(new Vec3(-3.8546 - (-3.7298), -2.1229 - (-2.1131), -0.8400 - 0.0836).normalize(), new Vec3(-3.8546 - (-3.7298), -2.1229 - (-2.1131), -0.8400 - 0.0836).normalize(), BondType.SINGLE) // H10
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-4.3493, -1.0888, 0.5983)) // 9
            .withBondTo(8, BondType.SINGLE)
            .withSideBranch(new Vec3(-4.5311 - (-4.3493), -1.2584 - (-1.0888), 1.4968 - 0.5983).normalize(), new Vec3(-4.5311 - (-4.3493), -1.2584 - (-1.0888), 1.4968 - 0.5983).normalize(), BondType.SINGLE) // H12
            .withSideBranch(new Vec3(-5.1709 - (-4.3493), -0.9811 - (-1.0888), 0.1709 - 0.5983).normalize(), new Vec3(-5.1709 - (-4.3493), -0.9811 - (-1.0888), 0.1709 - 0.5983).normalize(), BondType.SINGLE) // H13
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.6849, -0.0011, 0.5289)) // 10
            .withBondTo(9, BondType.SINGLE)
            .withSideBranch(new Vec3(-4.1203 - (-3.6849), 0.7765 - (-0.0011), 0.7707 - 0.5289).normalize(), new Vec3(-4.1203 - (-3.6849), 0.7765 - (-0.0011), 0.7707 - 0.5289).normalize(), BondType.SINGLE) // H11
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.5992, 0.0567, 0.1819)) // 11
            .withBondTo(10, BondType.DOUBLE)
            .withSideBranch(new Vec3(-2.2113 - (-2.5992), 0.8921 - 0.0567, 0.1309 - 0.1819).normalize(), new Vec3(-2.2113 - (-2.5992), 0.8921 - 0.0567, 0.1309 - 0.1819).normalize(), BondType.SINGLE) // H14
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.9327, -0.9800, -0.1774)) // 12
            .withBondTo(11, BondType.SINGLE)
            .withBondTo(7, BondType.SINGLE)
            .withSideBranch(new Vec3(-2.0038 - (-1.9327), -1.0316 - (-0.9800), -1.1086 - (-0.1774)).normalize(), new Vec3(-2.0038 - (-1.9327), -1.0316 - (-0.9800), -1.1086 - (-0.1774)).normalize(), BondType.SINGLE) // H15
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.6660, -0.9889, 0.0716)) // 13
            .withBondTo(12, BondType.SINGLE)
            .withBondTo(0, BondType.DOUBLE)
            .withBondTo(4, BondType.SINGLE)
            .attach()
            .reflections(new int[][]{
                    new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13}
            })

            .build("benzocchromene"),

    ERGOLINE = create(LegacyElement.CARBON) // 0
            .sideChain(new Vec3(0.5282, 0.7522, -0.0892).normalize(), new Vec3(0.5282, 0.7522, -0.0892).normalize(), BondType.SINGLE) // H1

            .atom(LegacyElement.CARBON, new Vec3(-1.1753, 0.1437, 0.1522)) // 1
            .withBondTo(0, BondType.DOUBLE)
            .withSideBranch(new Vec3(-0.3466, 0.8567, 0.0327).normalize(), new Vec3(-0.3466, 0.8567, 0.0327).normalize(), BondType.SINGLE) // H2
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.9190, -0.7846, 0.2576)) // 2
            .withBondTo(1, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.9061, 0.1212, 0.1150).normalize(), new Vec3(-0.9061, 0.1212, 0.1150).normalize(), BondType.SINGLE) // H3
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.4319, -1.8635, 0.1984)) // 3
            .withBondTo(2, BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.NITROGEN, new Vec3(-1.8810, -2.9441, 0.2565)) // 4
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.8329, -0.1816, 0.1060).normalize(), new Vec3(-0.8329, -0.1816, 0.1060).normalize(), BondType.SINGLE) // H4
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.0310, -3.7459, 0.1476)) // 5
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.2018, -0.8960, 0.0265).normalize(), new Vec3(-0.2018, -0.8960, 0.0265).normalize(), BondType.SINGLE) // H5
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.0188, -3.1760, 0.0202)) // 6
            .withBondTo(5, BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(1.1845, -3.5476, -0.1280)) // 7
            .withBondTo(6, BondType.SINGLE)
            .withSideBranch(new Vec3(0.1582, -0.7808, 0.4836).normalize(), new Vec3(0.1582, -0.7808, 0.4836).normalize(), BondType.SINGLE) // H6
            .withSideBranch(new Vec3(0.1492, -1.0373, -0.9014).normalize(), new Vec3(0.1492, -1.0373, -0.9014).normalize(), BondType.SINGLE) // H7
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(2.0049, -2.5839, 0.2838)) // 8
            .withBondTo(7, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.1002, 0.0547, 0.9292).normalize(), new Vec3(-0.1002, 0.0547, 0.9292).normalize(), BondType.SINGLE) // H8
            .attach()

            .atom(LegacyElement.NITROGEN, new Vec3(3.1828, -2.9147, 0.0359)) // 9
            .withBondTo(8, BondType.SINGLE)
            .withSideBranch(new Vec3(0.1076, -0.0435, -0.8593).normalize(), new Vec3(0.1076, -0.0435, -0.8593).normalize(), BondType.SINGLE) // H9
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(3.9850, -2.0881, 0.5069)) // 10
            .withBondTo(9, BondType.SINGLE)
            .withSideBranch(new Vec3(0.8662, -0.2735, -0.2055).normalize(), new Vec3(0.8662, -0.2735, -0.2055).normalize(), BondType.SINGLE) // H10
            .withSideBranch(new Vec3(-0.0623, 0.0047, 0.9302).normalize(), new Vec3(-0.0623, 0.0047, 0.9302).normalize(), BondType.SINGLE) // H11
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(3.7892, -0.8940, 0.0382)) // 11
            .withBondTo(10, BondType.SINGLE)
            .withSideBranch(new Vec3(0.1927, 0.0121, -0.9127).normalize(), new Vec3(0.1927, 0.0121, -0.9127).normalize(), BondType.SINGLE) // H12
            .withSideBranch(new Vec3(0.5870, 0.5973, 0.4081).normalize(), new Vec3(0.5870, 0.5973, 0.4081).normalize(), BondType.SINGLE) // H13
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(2.5664, -0.4981, 0.2241)) // 12
            .withBondTo(11, BondType.SINGLE)
            .withSideBranch(new Vec3(-0.1478, 0.1375, 0.9109).normalize(), new Vec3(-0.1478, 0.1375, 0.9109).normalize(), BondType.SINGLE) // H14
            .withSideBranch(new Vec3(-0.1165, 0.8227, -0.4202).normalize(), new Vec3(-0.1165, 0.8227, -0.4202).normalize(), BondType.SINGLE) // H15
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(1.7231, -1.3794, -0.2394)) // 13
            .withBondTo(12, BondType.SINGLE)
            .withBondTo(8, BondType.SINGLE)
            .withSideBranch(new Vec3(0.1126, -0.0505, -0.9265).normalize(), new Vec3(0.1126, -0.0505, -0.9265).normalize(), BondType.SINGLE) // H16
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(0.4824, -1.0868, -0.0406)) // 14
            .withBondTo(13, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.2752, -2.0035, 0.0505)) // 15
            .withBondTo(14, BondType.DOUBLE)
            .withBondTo(6, BondType.SINGLE)
            .withBondTo(3, BondType.SINGLE)
            .attach()
            .reflections(new int[][]{
                    new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}
            })

            .build("ergoline"),

    INDOLE = create(LegacyElement.NITROGEN)// 0 (N1)
            .sideChain(new Vec3(0.2454, 0.8231, -0.0001), new Vec3(0.2454, 0.8231, -0.0001), BondType.SINGLE)// H10

            .atom(LegacyElement.CARBON, new Vec3(0.7234, -0.9115, 0.0001)) // 1 (C7)
            .withSideBranch(new Vec3(1.6336 - 0.7234, -0.7866 - -0.9115, 0.0001 - 0.0001).normalize(),
                    new Vec3(1.6336 - 0.7234, -0.7866 - -0.9115, 0.0001 - 0.0001).normalize(), BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(0.0756, -1.8852, 0.0003)) // 2 (C4)
            .withBondTo(1, BondType.DOUBLE)
            .withSideBranch(new Vec3(0.4044 - 0.0756, -2.7436 - -1.8852, 0.0003 - 0.0003).normalize(),
                    new Vec3(0.4044 - 0.0756, -2.7436 - -1.8852, 0.0003 - 0.0003).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.0876, -1.5536, 0.0001)) // 3 (C3)
            .withBondTo(2, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.1255, -2.1509, -0.0002)) // 4 (C6)
            .withBondTo(3, BondType.AROMATIC)
            .withSideBranch(new Vec3(-2.1395 - -2.1255, -3.0741 - -2.1509, -0.0002 - -0.0002).normalize(),
                    new Vec3(-2.1395 - -2.1255, -3.0741 - -2.1509, -0.0002 - -0.0002).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.1466, -1.5403, 0.0002)) // 5 (C9)
            .withBondTo(4, BondType.AROMATIC)
            .withSideBranch(new Vec3(-3.9499 - -3.1466, -1.9965 - -1.5403, 0.0003 - 0.0002).normalize(),
                    new Vec3(-3.9499 - -3.1466, -1.9965 - -1.5403, 0.0003 - 0.0002).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.1444, -0.3557, 0.0002)) // 6 (C8)
            .withBondTo(5, BondType.AROMATIC)
            .withSideBranch(new Vec3(-3.9473 - -3.1444, 0.1015 - -0.3557, 0.0003 - 0.0002).normalize(),
                    new Vec3(-3.9473 - -3.1444, 0.1015 - -0.3557, 0.0003 - 0.0002).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.1253, 0.2550, 0.0000)) // 7 (C5)
            .withBondTo(6, BondType.AROMATIC)
            .withSideBranch(new Vec3(-2.1250 - -2.1253, 1.1772 - 0.2550, -0.0001 - 0.0000).normalize(),
                    new Vec3(-2.1250 - -2.1253, 1.1772 - 0.2550, -0.0001 - 0.0000).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.1113, -0.3668, 0.0001)) // 8 (C2)
            .withBondTo(7, BondType.AROMATIC)
            .withBondTo(0, BondType.SINGLE)
            .withBondTo(3, BondType.AROMATIC)
            .attach()
            .reflections(new int[][]{

                    new int[]{0, 1, 2, 3, 4, 5, 6},

                    new int[]{6, 5, 4, 3, 2, 1, 0}
            })

            .build("indole"),


    UHLE_S_RING = create(LegacyElement.NITROGEN) // 0
            .sideChain(new Vec3(0.5146, -0.6867, 0.0375), new Vec3(0.5146, -0.6867, 0.0375), BondType.SINGLE) // H1

            .atom(LegacyElement.CARBON, new Vec3(-1.1727, -0.0454, -0.0530)) // 1
            .withSideBranch(new Vec3(-1.6046 - -1.1727, -0.8563 - -0.0454, -0.0564 - -0.0530).normalize(),
                    new Vec3(-1.6046 - -1.1727, -0.8563 - -0.0454, -0.0564 - -0.0530).normalize(), BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.5708, 1.0527, -0.0948)) // 2
            .withBondTo(1, BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.7251, 1.5708, -0.1648)) // 3
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(-3.0054 - -2.7251, 1.5722 - 1.5708, -1.0536 - -0.1648).normalize(),
                    new Vec3(-3.0054 - -2.7251, 1.5722 - 1.5708, -1.0536 - -0.1648).normalize(), BondType.SINGLE) // H3
            .withSideBranch(new Vec3(-3.3388 - -2.7251, 1.0732 - 1.5708, 0.3278 - -0.1648).normalize(),
                    new Vec3(-3.3388 - -2.7251, 1.0732 - 1.5708, 0.3278 - -0.1648).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.6996, 2.8164, 0.2870)) // 4
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-2.6237 - -2.6996, 2.7838 - 2.8164, 1.2176 - 0.2870).normalize(),
                    new Vec3(-2.6237 - -2.6996, 2.7838 - 2.8164, 1.2176 - 0.2870).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-3.5129 - -2.6996, 3.2306 - 2.8164, 0.1000 - 0.2870).normalize(),
                    new Vec3(-3.5129 - -2.6996, 3.2306 - 2.8164, 0.1000 - 0.2870).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.7071, 3.5634, -0.1779)) // 5
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-1.6788 - -1.7071, 4.3616 - 3.5634, 0.3012 - -0.1779).normalize(),
                    new Vec3(-1.6788 - -1.7071, 4.3616 - 3.5634, 0.3012 - -0.1779).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-1.8648 - -1.7071, 3.7676 - 3.5634, -1.0732 - -0.1779).normalize(),
                    new Vec3(-1.8648 - -1.7071, 3.7676 - 3.5634, -1.0732 - -0.1779).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.5840, 2.9554, -0.0868)) // 6
            .withBondTo(5, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(0.4847, 3.4722, -0.0697)) // 7
            .withBondTo(6, BondType.AROMATIC)
            .withSideBranch(new Vec3(0.5554 - 0.4847, 4.3928 - 3.4722, -0.1000 - -0.0697).normalize(),
                    new Vec3(0.5554 - 0.4847, 4.3928 - 3.4722, -0.1000 - -0.0697).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(1.4756, 2.8098, -0.0111)) // 8
            .withBondTo(7, BondType.AROMATIC)
            .withSideBranch(new Vec3(2.2977 - 1.4756, 3.2327 - 2.8098, 0.0064 - -0.0111).normalize(),
                    new Vec3(2.2977 - 1.4756, 3.2327 - 2.8098, 0.0064 - -0.0111).normalize(), BondType.SINGLE) // H6
            .attach()
            .atom(LegacyElement.CARBON, new Vec3(1.4396, 1.6147, 0.0226)) // 9
            .withBondTo(8, BondType.AROMATIC)
            .withSideBranch(new Vec3(2.2110 - 1.4396, 1.1127 - 1.6147, 0.0667 - 0.0226).normalize(),
                    new Vec3(2.2110 - 1.4396, 1.1127 - 1.6147, 0.0667 - 0.0226).normalize(), BondType.SINGLE) // H6
            .attach()
            .atom(LegacyElement.CARBON, new Vec3(0.3652, 1.1132, -0.0102)) // 10
            .withBondTo(9, BondType.AROMATIC)
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.CARBON, new Vec3(-0.6081, 1.7666, -0.0676)) // 11
            .withBondTo(2, BondType.SINGLE)
            .withBondTo(6, BondType.AROMATIC)
            .withBondTo(10, BondType.AROMATIC)
            .attach()
            .reflections(new int[][]{
                    new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
            })

            .build("uhlesring"),

    KETONE_8 = create(LegacyElement.NITROGEN) // 0
            .sideChain(new Vec3(0.8051, -0.1776, 0.0063), new Vec3(0.8051, -0.1776, 0.0063), BondType.SINGLE) // H1

            .atom(LegacyElement.CARBON, new Vec3(-0.8699, -0.7903, -0.0384)) // 1
            .withSideBranch(new Vec3(-0.7531 - -0.8699, -1.7003 - -0.7903, -0.0714 - -0.0384).normalize(),
                    new Vec3(-0.7531 - -0.8699, -1.7003 - -0.7903, -0.0714 - -0.0384).normalize(), BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.8735, -0.2640, -0.0296)) // 2
            .withBondTo(1, BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.0885, -0.6695, -0.0703)) // 3
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(-3.3456 - -3.0885, -0.7876 - -0.6695, -0.9525 - -0.0703).normalize(),
                    new Vec3(-3.3456 - -3.0885, -0.7876 - -0.6695, -0.9525 - -0.0703).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-3.1616 - -3.0885, -1.4736 - -0.6695, 0.3839 - -0.0703).normalize(),
                    new Vec3(-3.1616 - -3.0885, -1.4736 - -0.6695, 0.3839 - -0.0703).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.8594, 0.2202, 0.4926)) // 4
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-3.7210 - -3.8594, 0.2020 - 0.2202, 1.4085 - 0.4926).normalize(),
                    new Vec3(-3.7210 - -3.8594, 0.2020 - 0.2202, 1.4085 - 0.4926).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-4.7438 - -3.8594, 0.0053 - 0.2202, 0.3188 - 0.4926).normalize(),
                    new Vec3(-4.7438 - -3.8594, 0.0053 - 0.2202, 0.3188 - 0.4926).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.6241, 1.4118, 0.0565)) // 5
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-4.3862, 2.0201, -0.2796).normalize(),
                    new Vec3(-4.3862, 2.0201, -0.2796).normalize(), BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.4426, 1.7973, 0.0580)) // 6
            .withBondTo(5, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.0068, 2.8874, 0.0956)) // 7
            .withBondTo(6, BondType.AROMATIC)
            .withSideBranch(new Vec3(-2.5739 - -2.0068, 3.6089 - 2.8874, 0.1202 - 0.0956).normalize(),
                    new Vec3(-2.5739 - -2.0068, 3.6089 - 2.8874, 0.1202 - 0.0956).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.8372, 3.0537, 0.1013)) // 8
            .withBondTo(7, BondType.AROMATIC)
            .withSideBranch(new Vec3(-0.5254 - -0.8372, 3.9167 - 3.0537, 0.1299 - 0.1013).normalize(),
                    new Vec3(-0.5254 - -0.8372, 3.9167 - 3.0537, 0.1299 - 0.1013).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.0426, 2.1779, 0.0723)) // 9
            .withBondTo(8, BondType.AROMATIC)
            .withSideBranch(new Vec3(0.8586 - -0.0426, 2.3531 - 2.1779, 0.0798 - 0.0723).normalize(),
                    new Vec3(0.8586 - -0.0426, 2.3531 - 2.1779, 0.0798 - 0.0723).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.4508, 1.0675, 0.0329)) // 10
            .withBondTo(9, BondType.AROMATIC)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.6297, 0.9086, 0.0213)) // 11
            .withBondTo(10, BondType.AROMATIC)
            .withBondTo(2, BondType.SINGLE)
            .withBondTo(6, BondType.AROMATIC)
            .attach()

            //.atom(LegacyElement.OXYGEN, new Vec3(-4.3862, 2.0201, -0.2796)) // 13 (O)
            //.withBondTo(5, BondType.DOUBLE)
            //.attach()
            .reflections(new int[][]{
                    new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
            })

            .build("ketone8"),


    DIDEHYDROERGOLINE = create(LegacyElement.NITROGEN) // 0 (N2)
            .sideChain(new Vec3(0.8356, 0.1986, -0.0075), new Vec3(0.8356, 0.1986, -0.0075), BondType.SINGLE) // H28

            .atom(LegacyElement.CARBON, new Vec3(-0.8717, 0.7806, 0.0623)) // 1 (C13)
            .withSideBranch(new Vec3(-0.6879 - -0.8717, 1.6795 - 0.7806, 0.1102 - 0.0623).normalize(),
                    new Vec3(-0.6879 - -0.8717, 1.6795 - 0.7806, 0.1102 - 0.0623).normalize(), BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.8789, 0.1884, 0.0569)) // 2 (C6)
            .withBondTo(1, BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.0905, 0.5414, 0.1286)) // 3 (C4)
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(-3.2987 - -3.0905, 0.6945 - 0.5414, 1.0256 - 0.1286).normalize(),
                    new Vec3(-3.2987 - -3.0905, 0.6945 - 0.5414, 1.0256 - 0.1286).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-3.2238 - -3.0905, 1.3412 - 0.5414, -0.3314 - 0.1286).normalize(),
                    new Vec3(-3.2238 - -3.0905, 1.3412 - 0.5414, -0.3314 - 0.1286).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.8785, -0.4063, -0.3703)) // 4 (C3)
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-3.8016 - -3.8785, -0.3683 - -0.4063, -1.3022 - -0.3703).normalize(),
                    new Vec3(-3.8016 - -3.8785, -0.3683 - -0.4063, -1.3022 - -0.3703).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.NITROGEN, new Vec3(-5.0565, -0.1032, -0.0670)) // 5 (N1)
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-5.2751 - -5.0565, 0.6332 - -0.1032, -0.4685 - -0.0670).normalize(),
                    new Vec3(-5.2751 - -5.0565, 0.6332 - -0.1032, -0.4685 - -0.0670).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-5.8500, -1.0033, -0.3855)) // 6 (C9)
            .withBondTo(5, BondType.SINGLE)
            .withSideBranch(new Vec3(-5.8121 - -5.8500, -1.1559 - -1.0033, -1.3049 - -0.3855).normalize(),
                    new Vec3(-5.8121 - -5.8500, -1.1559 - -1.0033, -1.3049 - -0.3855).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-6.7193 - -5.8500, -0.7305 - -1.0033, -0.1930 - -0.3855).normalize(),
                    new Vec3(-6.7193 - -5.8500, -0.7305 - -1.0033, -0.1930 - -0.3855).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-5.5916, -2.0961, 0.2701)) // 7 (C11)
            .withBondTo(6, BondType.SINGLE)
            .withSideBranch(new Vec3(-6.0665 - -5.5916, -2.7988 - -2.0961, -0.1154 - 0.2701).normalize(),
                    new Vec3(-6.0665 - -5.5916, -2.7988 - -2.0961, -0.1154 - 0.2701).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-5.8839 - -5.5916, -2.0169 - -2.0961, 1.1519 - 0.2701).normalize(),
                    new Vec3(-5.8839 - -5.5916, -2.0169 - -2.0961, 1.1519 - 0.2701).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-4.3495, -2.3859, 0.2825)) // 8 (C10)
            .withBondTo(7, BondType.SINGLE)
            .withSideBranch(new Vec3(-4.1301 - -4.3495, -3.2400 - -2.3859, 0.5547 - 0.2825).normalize(),
                    new Vec3(-4.1301 - -4.3495, -3.2400 - -2.3859, 0.5547 - 0.2825).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.5482, -1.6323, -0.0277)) // 9 (C5)
            .withBondTo(8, BondType.DOUBLE)
            .withBondTo(4, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.3254, -1.9254, -0.0463)) // 10 (C8)
            .withBondTo(9, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.8148, -2.9985, -0.1043)) // 11 (C14)
            .withBondTo(10, BondType.AROMATIC)
            .withSideBranch(new Vec3(-2.3277 - -1.8148, -3.7659 - -2.9985, -0.1404 - -0.1043).normalize(),
                    new Vec3(-2.3277 - -1.8148, -3.7659 - -2.9985, -0.1404 - -0.1043).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.6279, -3.1042, -0.1299)) // 12 (C16)
            .withBondTo(11, BondType.AROMATIC)
            .withSideBranch(new Vec3(-0.2525 - -0.6279, -3.9480 - -3.1042, -0.1774 - -0.1299).normalize(),
                    new Vec3(-0.2525 - -0.6279, -3.9480 - -3.1042, -0.1774 - -0.1299).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(0.0913, -2.1523, -0.1003)) // 13 (C15)
            .withBondTo(12, BondType.AROMATIC)
            .withSideBranch(new Vec3(1.0079 - 0.0913, -2.2438 - -2.1523, -0.1224 - -0.1003).normalize(),
                    new Vec3(1.0079 - 0.0913, -2.2438 - -2.1523, -0.1224 - -0.1003).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.4310, -1.0886, -0.0415)) // 14 (C12)
            .withBondTo(13, BondType.AROMATIC)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.6027, -0.9783, -0.0132)) // 15 (C7)
            .withBondTo(14, BondType.AROMATIC)
            .withBondTo(2, BondType.SINGLE)
            .withBondTo(10, BondType.AROMATIC)
            .attach()
            .reflections(new int[][]{
                    new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}
            })

            .build("didehydroergoline"),

    HYDROINDOLOQUINOLINONE = create(LegacyElement.NITROGEN) // 0 (N2)
            .sideChain(new Vec3(0.8356, 0.1986, -0.0075), new Vec3(0.8356, 0.1986, -0.0075), BondType.SINGLE) // H28

            .atom(LegacyElement.CARBON, new Vec3(-0.8717, 0.7806, 0.0623)) // 1 (C13)
            .withSideBranch(new Vec3(-0.6879 - -0.8717, 1.6795 - 0.7806, 0.1102 - 0.0623).normalize(),
                    new Vec3(-0.6879 - -0.8717, 1.6795 - 0.7806, 0.1102 - 0.0623).normalize(), BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.8789, 0.1884, 0.0569)) // 2 (C6)
            .withBondTo(1, BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.0905, 0.5414, 0.1286)) // 3 (C4)
            .withBondTo(2, BondType.SINGLE)
            .withSideBranch(new Vec3(-3.2987 - -3.0905, 0.6945 - 0.5414, 1.0256 - 0.1286).normalize(),
                    new Vec3(-3.2987 - -3.0905, 0.6945 - 0.5414, 1.0256 - 0.1286).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-3.2238 - -3.0905, 1.3412 - 0.5414, -0.3314 - 0.1286).normalize(),
                    new Vec3(-3.2238 - -3.0905, 1.3412 - 0.5414, -0.3314 - 0.1286).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.8785, -0.4063, -0.3703)) // 4 (C3)
            .withBondTo(3, BondType.SINGLE)
            .withSideBranch(new Vec3(-3.8016 - -3.8785, -0.3683 - -0.4063, -1.3022 - -0.3703).normalize(),
                    new Vec3(-3.8016 - -3.8785, -0.3683 - -0.4063, -1.3022 - -0.3703).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.NITROGEN, new Vec3(-5.0565, -0.1032, -0.0670)) // 5 (N1)
            .withBondTo(4, BondType.SINGLE)
            .withSideBranch(new Vec3(-5.2751 - -5.0565, 0.6332 - -0.1032, -0.4685 - -0.0670).normalize(),
                    new Vec3(-5.2751 - -5.0565, 0.6332 - -0.1032, -0.4685 - -0.0670).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-5.8500, -1.0033, -0.3855)) // 6 (C9)
            .withBondTo(5, BondType.SINGLE)
            .withSideBranch(new Vec3(-5.8121 - -5.8500, -1.1559 - -1.0033, -1.3049 - -0.3855).normalize(),
                    new Vec3(-5.8121 - -5.8500, -1.1559 - -1.0033, -1.3049 - -0.3855).normalize(), BondType.SINGLE)
            .withSideBranch(new Vec3(-6.7193 - -5.8500, -0.7305 - -1.0033, -0.1930 - -0.3855).normalize(),
                    new Vec3(-6.7193 - -5.8500, -0.7305 - -1.0033, -0.1930 - -0.3855).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-5.5916, -2.0961, 0.2701)) // 7 (C11)
            .withBondTo(6, BondType.SINGLE)
            .withSideBranch(new Vec3(-6.0665 - -5.5916, -2.7988 - -2.0961, -0.1154 - 0.2701).normalize(),
                    new Vec3(-6.0665 - -5.5916, -2.7988 - -2.0961, -0.1154 - 0.2701).normalize(), BondType.DOUBLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-4.3495, -2.3859, 0.2825)) // 8 (C10)
            .withBondTo(7, BondType.SINGLE)
            .withSideBranch(new Vec3(-4.1301 - -4.3495, -3.2400 - -2.3859, 0.5547 - 0.2825).normalize(),
                    new Vec3(-4.1301 - -4.3495, -3.2400 - -2.3859, 0.5547 - 0.2825).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-3.5482, -1.6323, -0.0277)) // 9 (C5)
            .withBondTo(8, BondType.DOUBLE)
            .withBondTo(4, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-2.3254, -1.9254, -0.0463)) // 10 (C8)
            .withBondTo(9, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.8148, -2.9985, -0.1043)) // 11 (C14)
            .withBondTo(10, BondType.AROMATIC)
            .withSideBranch(new Vec3(-2.3277 - -1.8148, -3.7659 - -2.9985, -0.1404 - -0.1043).normalize(),
                    new Vec3(-2.3277 - -1.8148, -3.7659 - -2.9985, -0.1404 - -0.1043).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.6279, -3.1042, -0.1299)) // 12 (C16)
            .withBondTo(11, BondType.AROMATIC)
            .withSideBranch(new Vec3(-0.2525 - -0.6279, -3.9480 - -3.1042, -0.1774 - -0.1299).normalize(),
                    new Vec3(-0.2525 - -0.6279, -3.9480 - -3.1042, -0.1774 - -0.1299).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(0.0913, -2.1523, -0.1003)) // 13 (C15)
            .withBondTo(12, BondType.AROMATIC)
            .withSideBranch(new Vec3(1.0079 - 0.0913, -2.2438 - -2.1523, -0.1224 - -0.1003).normalize(),
                    new Vec3(1.0079 - 0.0913, -2.2438 - -2.1523, -0.1224 - -0.1003).normalize(), BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.4310, -1.0886, -0.0415)) // 14 (C12)
            .withBondTo(13, BondType.AROMATIC)
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.6027, -0.9783, -0.0132)) // 15 (C7)
            .withBondTo(14, BondType.AROMATIC)
            .withBondTo(2, BondType.SINGLE)
            .withBondTo(10, BondType.AROMATIC)
            .attach()
            .reflections(new int[][]{
                    new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
            })

            .build("hydroindoloquinolinone"),


    DIOXOLANE = create(LegacyElement.OXYGEN) // 0

            .atom(LegacyElement.CARBON, new Vec3(-0.9913, -0.6951, -0.1135)) // 1
            .withSideBranch(new Vec3(-0.9095 - -0.9913, -1.2334 - -0.6951, -0.8674 - -0.1135).normalize(),
                    new Vec3(-0.9095 - -0.9913, -1.2334 - -0.6951, -0.8674 - -0.1135).normalize(), BondType.SINGLE) // H10
            .withSideBranch(new Vec3(-1.0733 - -0.9913, -1.2343 - -0.6951, 0.6399 - -0.1135).normalize(),
                    new Vec3(-1.0733 - -0.9913, -1.2343 - -0.6951, 0.6399 - -0.1135).normalize(), BondType.SINGLE) // H11
            .withBondTo(0, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.OXYGEN, new Vec3(-1.9826, 0.0003, -0.2260)) // 2
            .withBondTo(1, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-1.6036, 1.1135, 0.0695)) // 3
            .withSideBranch(new Vec3(-1.6857 - -1.6036, 1.2111 - 1.1135, 0.9919 - 0.0695).normalize(),
                    new Vec3(-1.6857 - -1.6036, 1.2111 - 1.1135, 0.9919 - 0.0695).normalize(), BondType.SINGLE) // H8
            .withSideBranch(new Vec3(-2.1162 - -1.6036, 1.7607 - 1.1135, -0.3561 - 0.0695).normalize(),
                    new Vec3(-2.1162 - -1.6036, 1.7607 - 1.1135, -0.3561 - 0.0695).normalize(), BondType.SINGLE) // H9
            .withBondTo(2, BondType.SINGLE)
            .attach()

            .atom(LegacyElement.CARBON, new Vec3(-0.3783, 1.1131, -0.2961)) // 4
            .withSideBranch(new Vec3(-0.2963 - -0.3783, 1.2102 - 1.1131, -1.2186 - -0.2961).normalize(),
                    new Vec3(-0.2963 - -0.3783, 1.2102 - 1.1131, -1.2186 - -0.2961).normalize(), BondType.SINGLE) // H6
            .withSideBranch(new Vec3(0.1345 - -0.3783, 1.7602 - 1.1131, 0.1291 - -0.2961).normalize(),
                    new Vec3(0.1345 - -0.3783, 1.7602 - 1.1131, 0.1291 - -0.2961).normalize(), BondType.SINGLE) // H7
            .withBondTo(3, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .reflections(new int[][]{
                    new int[]{0, 1, 2, 3, 4, 5},
                    new int[]{1, 0, 2, 3, 4, 5}, // Swap C1
                    new int[]{0, 1, 3, 2, 4, 5}, // Swap C3
                    new int[]{0, 1, 2, 3, 5, 4}, // Swap C4
                    new int[]{2, 3, 0, 1, 4, 5}, // Swap C1 <-> C3
                    new int[]{2, 3, 1, 0, 4, 5}, // Swap C1 <-> C3 + Swap C1
                    new int[]{3, 2, 0, 1, 4, 5}, // Swap C1 <-> C3 + Swap C3
                    new int[]{3, 2, 1, 0, 4, 5}, // Swap C1 <-> C3 + Swap ambos
                    new int[]{0, 1, 4, 5, 2, 3}, // Swap C3 <-> C4
                    new int[]{1, 0, 4, 5, 2, 3}, // Swap C1 + Swap C3 <-> C4
                    new int[]{0, 1, 5, 4, 2, 3}, // Swap C4 + Swap C3 <-> C4
                    new int[]{1, 0, 5, 4, 2, 3}, // Swap C1 + Swap C4 + Swap C3 <-> C4
                    new int[]{4, 5, 2, 3, 0, 1}, // Swap C1 <-> C4
                    new int[]{5, 4, 2, 3, 0, 1}, // Swap C4 + Swap C1 <-> C4
                    new int[]{4, 5, 3, 2, 0, 1}, // Swap C3 + Swap C1 <-> C4
                    new int[]{5, 4, 3, 2, 0, 1}  // Swap C3 + Swap C4 + Swap C1 <-> C4
            })

            .build("dioxolane"),

    TETRAPHOSPHORUS = create(LegacyElement.PHOSPHORUS)

            .atom(LegacyElement.PHOSPHORUS, new Vec3(0.4374, 0.9367, 0.4792))
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.PHOSPHORUS, new Vec3(0.3848, 0.8489, -0.6556))
            .withBondTo(1, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.PHOSPHORUS, new Vec3(-0.5708, 0.9850, -0.0498))
            .withBondTo(2, BondType.SINGLE)
            .withBondTo(0, BondType.SINGLE)
            .withBondTo(1, BondType.SINGLE)
            .attach()
            .build("tetraphosphorus"),

    PHOSPHORUS_PENTACHLORIDE = create(LegacyElement.PHOSPHORUS)

            .atom(LegacyElement.CHLORINE, new Vec3(-2.08, 0, 0).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.CHLORINE, new Vec3(2.08, 0, 0).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.CHLORINE, new Vec3(0, 2.08, 0).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.CHLORINE, new Vec3(0, -1.04, 1.8013).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.CHLORINE, new Vec3(0, -1.04, -1.8013).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .build("phosphorus_pentachloride"),

    PHOSPHORUS_PENTAIODIDE = create(LegacyElement.PHOSPHORUS)

            .atom(LegacyElement.IODINE, new Vec3(-2.08, 0, 0).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.IODINE, new Vec3(2.08, 0, 0).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.IODINE, new Vec3(0, 2.08, 0).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.IODINE, new Vec3(0, -1.04, 1.8013).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .atom(LegacyElement.IODINE, new Vec3(0, -1.04, -1.8013).normalize())
            .withBondTo(0, BondType.SINGLE)
            .attach()
            .build("phosphorus_pentaiodide"),

    SBENZENE = create(LegacyElement.CARBON) // 0
            .sideChain(new Vec3(cos(30), -sin(30), 0d), new Vec3(cos(60), -sin(60), 0d))
            .atom(LegacyElement.CARBON, new Vec3(0d, 1d, 0d)) // 1
            .withSideBranch(new Vec3(cos(30), sin(30), 0d).normalize(), new Vec3(1d, 0d, 0d).normalize())
            .withBondTo(0, BondType.AROMATIC)
            .attach()
            .atom(LegacyElement.CARBON, new Vec3(-cos(30), 1d + sin(30), 0d)) // 2
            .withSideBranch(new Vec3(0d, 1d, 0d), new Vec3(cos(60), sin(60), 0d))
            .withBondTo(1, BondType.AROMATIC)
            .attach()
            .atom(LegacyElement.CARBON, new Vec3(-2d * cos(30), 1d, 0d)) // 3
            .withSideBranch(new Vec3(-cos(30), sin(30), 0d), new Vec3(-cos(60), sin(60), 0d))
            .withBondTo(2, BondType.AROMATIC)
            .attach()
            .atom(LegacyElement.CARBON, new Vec3(-2d * cos(30), 0d, 0d)) // 4
            .withSideBranch(new Vec3(-cos(30), -sin(30), 0d), new Vec3(-1d, 0d, 0d))
            .withBondTo(3, BondType.AROMATIC)
            .attach()
            .atom(LegacyElement.CARBON, new Vec3(-cos(30), -sin(30), 0d)) // 5
            .withSideBranch(new Vec3(0d, -1d, 0d), new Vec3(-cos(60), -sin(60), 0d))
            .withBondTo(4, BondType.AROMATIC)
            .withBondTo(0, BondType.AROMATIC)
            .attach()
            .reflections(new int[][]{
                    new int[]{1, 2, 3, 4, 5, 0}, new int[]{2, 3, 4, 5, 0, 1}, new int[]{3, 4, 5, 0, 1, 2}, new int[]{4, 5, 0, 1, 2, 3}, new int[]{5, 0, 1, 2, 3, 4}, // Rotations
                    new int[]{5, 4, 3, 2, 1, 0}, new int[]{4, 3, 2, 1, 0, 5}, new int[]{3, 2, 1, 0, 5, 4}, new int[]{2, 1, 0, 5, 4, 3}, new int[]{1, 0, 5, 4, 3, 2}, new int[]{0, 5, 4, 3, 2, 1} // Mirrors
            })
            .build("sbenzene");


    private static double cos(float value) {
        return Mth.cos(value * Mth.PI / 180f);
    }

    private static double sin(float value) {
        return Mth.sin(value * Mth.PI / 180f);
    }

    private static Topology.Builder create(LegacyElement startingElement) {
        return new Topology.Builder(HeisenCraft.MODID).startWith(startingElement);
    }

    private static Topology.Builder create(LegacyElement startingElement, double charge) {
        return new Topology.Builder(HeisenCraft.MODID).startWith(startingElement, charge);
    }

    public static void register() {
    }
}