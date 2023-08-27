package net.rupyber_studios.star_wars_clone_wars.procedures;

import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

public class HelmetOverlayBProcedureProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean helmet_overlay_b = false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == StarWarsModItems.CLONE_TROOPER_91ST_ARMOR_HELMET.get()) {
			helmet_overlay_b = true;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == StarWarsModItems.CLONE_TROOPER_COMMANDER_CODY_ARMOR_HELMET.get()) {
			helmet_overlay_b = true;
		} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == StarWarsModItems.CLONE_TROOPER_COMMANDER_FOX_ARMOR_HELMET.get()) {
			helmet_overlay_b = true;
		}
		return helmet_overlay_b;
	}
}
