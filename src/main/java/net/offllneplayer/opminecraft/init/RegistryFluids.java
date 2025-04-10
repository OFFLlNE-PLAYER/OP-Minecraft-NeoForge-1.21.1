
package net.offllneplayer.opminecraft.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.offllneplayer.opminecraft.fluid.CryingEssenceFluid;

import static net.offllneplayer.opminecraft.OPMinecraft.Mod_ID;


public class RegistryFluids {

	public static final DeferredRegister<Fluid> FLUIDSREGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, Mod_ID);

	public static final DeferredHolder<Fluid, FlowingFluid> CRYING_ESSENCE = FLUIDSREGISTRY.register("crying_essence", CryingEssenceFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_CRYING_ESSENCE = FLUIDSREGISTRY.register("flowing_crying_essence", CryingEssenceFluid.Flowing::new);
}
