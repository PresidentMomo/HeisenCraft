package com.aetherlith.heisencraft;

import static com.petrolpark.destroy.Destroy.REGISTRATE;

import com.petrolpark.destroy.Destroy;

import com.petrolpark.destroy.chemistry.minecraft.MixtureFluid;
import com.petrolpark.destroy.chemistry.minecraft.MixtureFluid.MixtureFluidType;
import com.petrolpark.destroy.core.fluid.ColoredFluidType;
import com.simibubi.create.AllTags;
import com.simibubi.create.Create;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.util.entry.FluidEntry;

import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class HeisenCraftFluids {

    public static final double AIR_MOLAR_DENSITY = 0.0420352380152d; // In moles/liter
    public static FluidStack air(int amount, float temperature) {
        return MixtureFluid.of(amount, MixtureFluid.airMixture(temperature), "fluid.destroy.air");
    };

    public static final FluidEntry<MixtureFluid> MIXTURE = REGISTRATE.virtualFluid("mixture",
            Destroy.asResource( "fluid/mixture_still"),
            Destroy.asResource( "fluid/mixture_flow"),
            MixtureFluidType::new,
            MixtureFluid::createSource,
            MixtureFluid::createFlowing
    ).register();

    public static final FluidEntry<MixtureFluid> GAS_MIXTURE = REGISTRATE.virtualFluid("gas", // For display purposes only
            Destroy.asResource("fluid/gas"),
            Destroy.asResource("fluid/gas"),
            MixtureFluidType::new,
            MixtureFluid::createSource,
            MixtureFluid::createFlowing
    ).register();

    public static final FluidEntry<VirtualFluid>

            EPHEDRA_SALT_SOLUTION = coloredWaterFluid("ephedra_salt_solution", 0xFFD8B060)
            .tag(AllTags.forgeFluidTag("ephedra_salt_solution"))
            .register(),

            EPHEDRA_BASE_SOLUTION = coloredWaterFluid("ephedra_base_solution", 0xC8FFFACD)
            .tag(AllTags.forgeFluidTag("ephedra_base_solution"))
            .register(),

            PSILOCYBE_SALT_SOLUTION = coloredWaterFluid("psilocybe_salt_solution", 0xFF8B5A2B)
            .tag(AllTags.forgeFluidTag("psilocybe_salt_solution"))
            .register(),

            PSILOCYBE_BASE_SOLUTION = coloredWaterFluid("psilocybe_base_solution", 0xFFE3C16F)
            .tag(AllTags.forgeFluidTag("psilocybe_base_solution"))
            .register(),

            AGUA_RICA = coloredWaterFluid("agua_rica", 0xFFE3C16F)
            .tag(AllTags.forgeFluidTag("agua_rica"))
            .register(),

            COCA_PASTE_SOLUTION = coloredWaterFluid("coca_paste_solution", 0xFF8B4513)
            .tag(AllTags.forgeFluidTag("coca_paste_solution"))
            .register(),

            COCA_BASE_SOLUTION = coloredWaterFluid("coca_base_solution", 0xFFF5F5DC)
            .tag(AllTags.forgeFluidTag("coca_base_solution"))
            .register(),

            CITRAL_SOLUTION = coloredWaterFluid("citral_solution", 0xFFD2D96A)
            .tag(AllTags.forgeFluidTag("citral_solution"))
            .register(),

            ERGOT_BASE_SOLUTION = coloredWaterFluid("ergot_base_solution", 0xFFFFFFCC)
            .tag(AllTags.forgeFluidTag("ergot_base_solution"))
            .register(),

            MESCALINE_SALT_SOLUTION = coloredWaterFluid("mescaline_salt_solution", 0xFFF0E6FF)
            .tag(AllTags.forgeFluidTag("mescaline_salt_solution"))
            .register(),

            MESCALINE_BASE_SOLUTION = coloredWaterFluid("mescaline_base_solution", 0xFFE8D4FF)
            .tag(AllTags.forgeFluidTag("mescaline_base_solution"))
            .register();





    private static FluidBuilder<VirtualFluid, CreateRegistrate> virtualFluid(String name) {
        return REGISTRATE.virtualFluid(name, Destroy.asResource("fluid/"+name), Destroy.asResource("fluid/"+name));
    };

    private static FluidBuilder<VirtualFluid, CreateRegistrate> coloredWaterFluid(String name, int color) {
        return coloredFluid(name, color, ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_still"), ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_flow"));
    };

    private static FluidBuilder<VirtualFluid, CreateRegistrate> coloredSwirlingFluid(String name, int color) {
        return coloredFluid(name, color, Destroy.asResource("fluid/swirling"), Destroy.asResource("fluid/swirling"));
    };

    private static FluidBuilder<VirtualFluid, CreateRegistrate> coloredPotionFluid(String name, int color) {
        return coloredFluid(name, color, Create.asResource("fluid/potion_still"), Create.asResource("fluid/potion_flow"));
    };

    private static FluidBuilder<VirtualFluid, CreateRegistrate> coloredFluid(String name, int color, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
        return REGISTRATE.virtualFluid(name, stillTexture, flowingTexture, (properties, st, ft) -> new ColoredFluidType(properties, st, ft, color), VirtualFluid::createSource, VirtualFluid::createFlowing);
    };

    public static boolean isMixture(FluidStack stack) {
        return stack != null && !stack.isEmpty() && isMixture(stack.getFluid()) && stack.getOrCreateTag().contains("Mixture", Tag.TAG_COMPOUND);
    };

    public static boolean isMixture(Fluid fluid) {
        return fluid.isSame(MIXTURE.get());
    };

    public static void register() {}

};
