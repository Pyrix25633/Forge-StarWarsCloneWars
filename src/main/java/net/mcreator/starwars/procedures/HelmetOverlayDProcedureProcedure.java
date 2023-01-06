package net.mcreator.starwars.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.starwars.init.StarWarsModItems;

public class HelmetOverlayDProcedureProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean helmet_overlay_d = false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == StarWarsModItems.CLONE_TROOPER_COMMANDER_BLY_ARMOR_HELMET.get()) {
			helmet_overlay_d = true;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == StarWarsModItems.CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_HELMET.get()) {
			helmet_overlay_d = true;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == StarWarsModItems.CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_HELMET.get()) {
			helmet_overlay_d = true;
		}
		return helmet_overlay_d;
	}
}
