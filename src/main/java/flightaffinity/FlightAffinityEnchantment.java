package flightaffinity;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class FlightAffinityEnchantment extends Enchantment {
	private static final EquipmentSlot[] ARMOR_SLOTS = new EquipmentSlot[] {
		EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET
	};

	public FlightAffinityEnchantment() {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.ARMOR, ARMOR_SLOTS);
	}

	@Override
	public boolean canEnchant(ItemStack stack) {
		return LivingEntity.getEquipmentSlotForItem(stack).isArmor();
	}

	@Override
	public int getMinCost(int level) {
		return 1;
	}

	@Override
	public int getMaxCost(int level) {
		return this.getMinCost(level) + 40;
	}

	/**
	 * Keep in sync with {@code assets/flight_affinity/lang/en_us.json}.
	 */
	@Override
	public String getDescriptionId() {
		return "enchantment.flight_affinity.flight_affinity";
	}
}
