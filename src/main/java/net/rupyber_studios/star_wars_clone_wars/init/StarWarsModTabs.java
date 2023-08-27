
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarWarsModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("star_wars", "materials"),
				builder -> builder.title(Component.translatable("item_group.star_wars.materials")).icon(() -> new ItemStack(StarWarsModItems.RAW_TITANIUM.get())).displayItems((parameters, tabData) -> {
					tabData.accept(StarWarsModBlocks.CLONE_ARMOR_CUSTOMIZER.get().asItem());
					tabData.accept(StarWarsModBlocks.RADAR.get().asItem());
					tabData.accept(StarWarsModBlocks.TITANIUM_ORE.get().asItem());
					tabData.accept(StarWarsModBlocks.TITANIUM_BLOCK.get().asItem());
					tabData.accept(StarWarsModItems.RAW_TITANIUM.get());
					tabData.accept(StarWarsModItems.TITANIUM_INGOT.get());
					tabData.accept(StarWarsModItems.PLASTOID_SCRAP.get());
					tabData.accept(StarWarsModItems.PLASTOID_PLATE.get());
					tabData.accept(StarWarsModItems.PLASTOID_PICKAXE.get());
					tabData.accept(StarWarsModItems.PLASTOID_AXE.get());
					tabData.accept(StarWarsModItems.PLASTOID_SWORD.get());
					tabData.accept(StarWarsModItems.PLASTOID_SHOVEL.get());
					tabData.accept(StarWarsModItems.PLASTOID_HOE.get());
					tabData.accept(StarWarsModItems.BLASTER_MUNITIONS.get());
					tabData.accept(StarWarsModItems.THERMAL_DETONATOR.get());
					tabData.accept(StarWarsModItems.BACKPACK.get());
					tabData.accept(StarWarsModItems.GEONOSIS_DIMENSION.get());
					tabData.accept(StarWarsModItems.KASHYYYK_DIMENSION.get());
					tabData.accept(StarWarsModItems.FELUCIA_DIMENSION.get());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_WOOD.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_LOG.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_PLANKS.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_LEAVES.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_STAIRS.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_SLAB.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_FENCE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_FENCE_GATE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_PRESSURE_PLATE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_BLUE_BUTTON.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_WOOD.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_LOG.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_PLANKS.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_LEAVES.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_STAIRS.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_SLAB.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_FENCE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_FENCE_GATE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_PRESSURE_PLATE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_RED_BUTTON.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_WOOD.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_LOG.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_PLANKS.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_LEAVES.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_STAIRS.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_SLAB.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_FENCE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_FENCE_GATE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_PRESSURE_PLATE.get().asItem());
					tabData.accept(StarWarsModBlocks.FELUCIA_YELLOW_BUTTON.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("star_wars", "separatist"),
				builder -> builder.title(Component.translatable("item_group.star_wars.separatist")).icon(() -> new ItemStack(StarWarsModItems.MUSIC_DISK_SEPARATIST.get())).displayItems((parameters, tabData) -> {
					tabData.accept(StarWarsModItems.MUSIC_DISK_SEPARATIST.get());
					tabData.accept(StarWarsModItems.RED_LIGHTSABER.get());
					tabData.accept(StarWarsModItems.DROID_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.DROID_COMMANDER_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.DROID_PILOT_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.DROID_SECURITY_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.DROID_KASHYYYK_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.DROID_COMMANDER_KASHYYYK_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.DROID_PILOT_KASHYYYK_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.DROID_SECURITY_KASHYYYK_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.SEPARATIST_TANK_SPAWN_EGG.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("star_wars", "republic"),
				builder -> builder.title(Component.translatable("item_group.star_wars.republic")).icon(() -> new ItemStack(StarWarsModItems.CLONE_TROOPER_NORMAL_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
					tabData.accept(StarWarsModItems.MUSIC_DISK_REPUBLIC.get());
					tabData.accept(StarWarsModItems.BLASTER_DC_15S.get());
					tabData.accept(StarWarsModItems.BLASTER_DC_17.get());
					tabData.accept(StarWarsModItems.BLUE_LIGHTSABER.get());
					tabData.accept(StarWarsModItems.GREEN_LIGHTSABER.get());
					tabData.accept(StarWarsModBlocks.REPUBLIC_OUTPOST_BOX.get().asItem());
					tabData.accept(StarWarsModItems.SOLDIER_GRADE.get());
					tabData.accept(StarWarsModItems.SERGEANT_GRADE.get());
					tabData.accept(StarWarsModItems.LIUTENANT_GRADE.get());
					tabData.accept(StarWarsModItems.CAPTAIN_GRADE.get());
					tabData.accept(StarWarsModItems.COMMANDER_GRADE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_BOMB_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_SERGEANT_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_LIUTENANT_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_41ST_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_GREE_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_91ST_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PONDS_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_104TH_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_WOLFFE_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_212TH_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_CODY_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_327TH_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_BLY_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_501ST_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_REX_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_APPO_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_GUARD_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_FOX_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_25633RD_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.REPUBLIC_TANK_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.REPUBLIC_TANK_AUTO_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.REPUBLIC_SPEEDER_SPAWN_EGG.get());
					tabData.accept(StarWarsModItems.JETPACK_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_NORMAL_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_NORMAL_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_NORMAL_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_NORMAL_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_BOMB_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_BOMB_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_BOMB_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_BOMB_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_PILOT_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_PILOT_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_GUNNER_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_GUNNER_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_SERGEANT_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_SERGEANT_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_SERGEANT_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_SERGEANT_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_LIUTENANT_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_LIUTENANT_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_LIUTENANT_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_LIUTENANT_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_41ST_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_41ST_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_41ST_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_41ST_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_GREE_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_GREE_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_GREE_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_GREE_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_91ST_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_91ST_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_91ST_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_91ST_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PONDS_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PONDS_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PONDS_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PONDS_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_104TH_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_104TH_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_104TH_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_104TH_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.JETPACK_ARMOR_104TH_HELMET.get());
					tabData.accept(StarWarsModItems.JETPACK_ARMOR_104TH_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_WOLFFE_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_WOLFFE_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_WOLFFE_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_WOLFFE_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_212TH_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_212TH_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_212TH_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_212TH_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_CODY_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_CODY_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_CODY_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_CODY_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_327TH_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_327TH_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_327TH_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_327TH_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_BLY_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_BLY_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_BLY_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_BLY_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_501ST_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_501ST_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_501ST_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_501ST_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.JETPACK_ARMOR_501ST_HELMET.get());
					tabData.accept(StarWarsModItems.JETPACK_ARMOR_501ST_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_REX_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_REX_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_REX_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_REX_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_APPO_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_APPO_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_APPO_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_APPO_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_GUARD_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_GUARD_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_GUARD_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_GUARD_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_FOX_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_FOX_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_FOX_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_FOX_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_25633RD_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_25633RD_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_25633RD_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_25633RD_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_HELMET.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_CHESTPLATE.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_LEGGINGS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_BOOTS.get());
					tabData.accept(StarWarsModItems.CLONE_TROOPER_COMMUNICATOR.get());
				}).withSearchBar());
	}
}
