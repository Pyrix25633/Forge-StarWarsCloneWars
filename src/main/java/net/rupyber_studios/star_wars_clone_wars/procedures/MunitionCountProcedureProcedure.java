package net.rupyber_studios.star_wars_clone_wars.procedures;

import net.rupyber_studios.star_wars_clone_wars.network.StarWarsModVariables;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModItems;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.concurrent.atomic.AtomicReference;

public class MunitionCountProcedureProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		double loop_num = 0;
		double item_num = 0;
		loop_num = 0;
		item_num = 0;
		for (int index0 = 0; index0 < 36; index0++) {
			if (StarWarsModItems.BLASTER_MUNITIONS.get() == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loop_num, entity)).getItem()) {
				item_num = item_num + (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack((int) loop_num, entity)).getCount();
			}
			loop_num = loop_num + 1;
		}
		if (StarWarsModItems.BLASTER_MUNITIONS.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			item_num = item_num + (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getCount();
		}
		{
			double _setval = item_num;
			entity.getCapability(StarWarsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.munition_num = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (StarWarsModItems.BLASTER_DC_15S.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()
				|| StarWarsModItems.BLASTER_DC_15S.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			return true;
		} else if (StarWarsModItems.BLASTER_DC_17.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()
				|| StarWarsModItems.BLASTER_DC_17.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			return true;
		}
		return false;
	}
}
