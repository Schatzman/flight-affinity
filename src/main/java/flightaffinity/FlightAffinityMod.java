package flightaffinity;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlightAffinityMod implements ModInitializer {
	public static final String MOD_ID = "flight_affinity";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Enchantment FLIGHT_AFFINITY;

	@Override
	public void onInitialize() {
		FLIGHT_AFFINITY = Registry.register(
			BuiltInRegistries.ENCHANTMENT,
			new ResourceLocation(MOD_ID, "flight_affinity"),
			new FlightAffinityEnchantment()
		);
		LOGGER.info("Registered {}", FLIGHT_AFFINITY.getDescriptionId());
	}
}
