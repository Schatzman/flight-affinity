package flightaffinity.mixin;

import flightaffinity.FlightAffinityMod;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * Neutralizes the vanilla airborne mining penalty (the {@code !onGround()} branch in
 * {@link Player#getDestroySpeed}) when the player wears Flight Affinity on any armor slot.
 * Underwater slowdown is a separate branch and is unchanged.
 */
@Mixin(Player.class)
public abstract class PlayerDestroySpeedMixin {
	@Redirect(
		method = "getDestroySpeed(Lnet/minecraft/world/level/block/state/BlockState;)F",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/world/entity/player/Player;onGround()Z"
		)
	)
	private boolean flightAffinity$skipAirborneMiningPenalty(Player player) {
		if (EnchantmentHelper.getEnchantmentLevel(FlightAffinityMod.FLIGHT_AFFINITY, player) > 0) {
			return true;
		}
		return player.onGround();
	}
}
