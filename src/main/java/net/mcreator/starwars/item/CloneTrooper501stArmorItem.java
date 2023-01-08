
package net.mcreator.starwars.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.starwars.init.StarWarsModTabs;
import net.mcreator.starwars.init.StarWarsModItems;
import net.mcreator.starwars.client.model.ModelHelmetPlain;
import net.mcreator.starwars.client.model.ModelChestplatePlain;

import java.util.Map;
import java.util.Collections;

public abstract class CloneTrooper501stArmorItem extends ArmorItem {
	public CloneTrooper501stArmorItem(EquipmentSlot slot, Item.Properties properties) {
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
				return "clone_trooper_501st_armor";
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

	public static class Helmet extends CloneTrooper501stArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("head",
									new ModelHelmetPlain(Minecraft.getInstance().getEntityModels().bakeLayer(ModelHelmetPlain.LAYER_LOCATION)).head,
									"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "star_wars:textures/entities/clone_armor_armor_501st_layer_helmet.png";
		}
	}

	public static class Chestplate extends CloneTrooper501stArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("body",
									new ModelChestplatePlain(
											Minecraft.getInstance().getEntityModels().bakeLayer(ModelChestplatePlain.LAYER_LOCATION)).body,
									"left_arm",
									new ModelChestplatePlain(
											Minecraft.getInstance().getEntityModels().bakeLayer(ModelChestplatePlain.LAYER_LOCATION)).left_arm,
									"right_arm",
									new ModelChestplatePlain(
											Minecraft.getInstance().getEntityModels().bakeLayer(ModelChestplatePlain.LAYER_LOCATION)).right_arm,
									"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "star_wars:textures/models/armor/clone_armor_armor_501st_layer_1.png";
		}
	}

	public static class Leggings extends CloneTrooper501stArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "star_wars:textures/models/armor/clone_armor_armor_501st_layer_2.png";
		}
	}

	public static class Boots extends CloneTrooper501stArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "star_wars:textures/models/armor/clone_armor_armor_501st_layer_1.png";
		}
	}
}
