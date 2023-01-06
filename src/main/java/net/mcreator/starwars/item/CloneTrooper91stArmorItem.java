
package net.mcreator.starwars.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwars.init.StarWarsModTabs;
import net.mcreator.starwars.init.StarWarsModItems;

public abstract class CloneTrooper91stArmorItem extends ArmorItem {
	public CloneTrooper91stArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 70;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{10, 26, 22, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 15;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(StarWarsModItems.PLASTOID_PLATE.get()));
			}

			@Override
			public String getName() {
				return "clone_trooper_91st_armor";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CloneTrooper91stArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "star_wars:textures/entities/clone_armor_armor_91st_layer_helmet.png";
		}
	}

	public static class Chestplate extends CloneTrooper91stArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "star_wars:textures/models/armor/clone_armor_armor_91st__layer_1.png";
		}
	}

	public static class Leggings extends CloneTrooper91stArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "star_wars:textures/models/armor/clone_armor_armor_91st__layer_2.png";
		}
	}

	public static class Boots extends CloneTrooper91stArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "star_wars:textures/models/armor/clone_armor_armor_91st__layer_1.png";
		}
	}
}
