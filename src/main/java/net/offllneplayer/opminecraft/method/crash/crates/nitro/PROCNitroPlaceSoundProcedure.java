package net.offllneplayer.opminecraft.method.crash.crates.nitro;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import java.util.Objects;

public class PROCNitroPlaceSoundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide()) {
			int randomIndex = Mth.nextInt(RandomSource.create(), 1, 3);
			ResourceLocation soundId = ResourceLocation.parse("opminecraft:nitro_idle_" + randomIndex);
			_level.playSound(null, BlockPos.containing(x, y, z), Objects.requireNonNull(BuiltInRegistries.SOUND_EVENT.get(soundId)), SoundSource.NEUTRAL, 1, 1);
		}
	}
}
