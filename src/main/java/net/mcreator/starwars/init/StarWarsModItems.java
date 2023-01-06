
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.starwars.item.TitaniumIngotItem;
import net.mcreator.starwars.item.ThermalDetonatorItem;
import net.mcreator.starwars.item.SoldierGradeItem;
import net.mcreator.starwars.item.SergeantGradeItem;
import net.mcreator.starwars.item.SeparatistTankShotItem;
import net.mcreator.starwars.item.RepubblicTankShotItem;
import net.mcreator.starwars.item.RedLightsaberItem;
import net.mcreator.starwars.item.RawTitaniumItem;
import net.mcreator.starwars.item.PlastoidSwordItem;
import net.mcreator.starwars.item.PlastoidShovelItem;
import net.mcreator.starwars.item.PlastoidScrapItem;
import net.mcreator.starwars.item.PlastoidPlateItem;
import net.mcreator.starwars.item.PlastoidPickaxeItem;
import net.mcreator.starwars.item.PlastoidHoeItem;
import net.mcreator.starwars.item.PlastoidAxeItem;
import net.mcreator.starwars.item.MusicDiskSeparatistItem;
import net.mcreator.starwars.item.MusicDiskRepublicItem;
import net.mcreator.starwars.item.LiutenantGradeItem;
import net.mcreator.starwars.item.KashyyykDimensionItem;
import net.mcreator.starwars.item.JetpackArmorItem;
import net.mcreator.starwars.item.JetpackArmor501stItem;
import net.mcreator.starwars.item.JetpackArmor104thItem;
import net.mcreator.starwars.item.GreenLightsaberItem;
import net.mcreator.starwars.item.GeonosisDimensionItem;
import net.mcreator.starwars.item.FeluciaDimensionItem;
import net.mcreator.starwars.item.CommanderGradeItem;
import net.mcreator.starwars.item.CloneTrooperSergeantArmorItem;
import net.mcreator.starwars.item.CloneTrooperPilotArmorItem;
import net.mcreator.starwars.item.CloneTrooperLiutenantArmorItem;
import net.mcreator.starwars.item.CloneTrooperGunnerArmorItem;
import net.mcreator.starwars.item.CloneTrooperGuardArmorItem;
import net.mcreator.starwars.item.CloneTrooperComunicatorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderWolffeArmorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderPyrixArmorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderPondsArmorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderGreeArmorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderFoxArmorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderCodyArmorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderBlyArmorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderArmorItem;
import net.mcreator.starwars.item.CloneTrooperCommanderAppoArmorItem;
import net.mcreator.starwars.item.CloneTrooperCaptainRexArmorItem;
import net.mcreator.starwars.item.CloneTrooperCaptainCryptoArmorItem;
import net.mcreator.starwars.item.CloneTrooperCaptainArmorItem;
import net.mcreator.starwars.item.CloneTrooperBombArmorItem;
import net.mcreator.starwars.item.CloneTrooperArmorArmorItem;
import net.mcreator.starwars.item.CloneTrooper91stArmorItem;
import net.mcreator.starwars.item.CloneTrooper501stArmorItem;
import net.mcreator.starwars.item.CloneTrooper41stArmorItem;
import net.mcreator.starwars.item.CloneTrooper327thArmorItem;
import net.mcreator.starwars.item.CloneTrooper25633rdArmorItem;
import net.mcreator.starwars.item.CloneTrooper212thArmorItem;
import net.mcreator.starwars.item.CloneTrooper104thArmorItem;
import net.mcreator.starwars.item.CaptainGradeItem;
import net.mcreator.starwars.item.BlueLightsaberItem;
import net.mcreator.starwars.item.BlasterMunitionsItem;
import net.mcreator.starwars.item.BlasterE5Item;
import net.mcreator.starwars.item.BlasterDc17Item;
import net.mcreator.starwars.item.BlasterDc15sItem;
import net.mcreator.starwars.item.BackpackItem;
import net.mcreator.starwars.StarWarsMod;

public class StarWarsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StarWarsMod.MODID);
	public static final RegistryObject<Item> MUSIC_DISK_REPUBLIC = REGISTRY.register("music_disk_republic", () -> new MusicDiskRepublicItem());
	public static final RegistryObject<Item> CLONE_TROOPER_COMUNICATOR = REGISTRY.register("clone_trooper_comunicator",
			() -> new CloneTrooperComunicatorItem());
	public static final RegistryObject<Item> BLASTER_DC_15S = REGISTRY.register("blaster_dc_15s", () -> new BlasterDc15sItem());
	public static final RegistryObject<Item> BLASTER_DC_17 = REGISTRY.register("blaster_dc_17", () -> new BlasterDc17Item());
	public static final RegistryObject<Item> BLUE_LIGHTSABER = REGISTRY.register("blue_lightsaber", () -> new BlueLightsaberItem());
	public static final RegistryObject<Item> GREEN_LIGHTSABER = REGISTRY.register("green_lightsaber", () -> new GreenLightsaberItem());
	public static final RegistryObject<Item> REPUBLIC_OUTPOST_BOX = block(StarWarsModBlocks.REPUBLIC_OUTPOST_BOX, StarWarsModTabs.TAB_REPUBLIC);
	public static final RegistryObject<Item> SOLDIER_GRADE = REGISTRY.register("soldier_grade", () -> new SoldierGradeItem());
	public static final RegistryObject<Item> SERGEANT_GRADE = REGISTRY.register("sergeant_grade", () -> new SergeantGradeItem());
	public static final RegistryObject<Item> LIUTENANT_GRADE = REGISTRY.register("liutenant_grade", () -> new LiutenantGradeItem());
	public static final RegistryObject<Item> CAPTAIN_GRADE = REGISTRY.register("captain_grade", () -> new CaptainGradeItem());
	public static final RegistryObject<Item> COMMANDER_GRADE = REGISTRY.register("commander_grade", () -> new CommanderGradeItem());
	public static final RegistryObject<Item> CLONE_TROOPER = REGISTRY.register("clone_trooper_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER, -1, -16777216, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_BOMB = REGISTRY.register("clone_trooper_bomb_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_BOMB, -37376, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_SERGEANT = REGISTRY.register("clone_trooper_sergeant_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_SERGEANT, -7620096, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_LIUTENANT = REGISTRY.register("clone_trooper_liutenant_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_LIUTENANT, -16716545, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN = REGISTRY.register("clone_trooper_captain_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_CAPTAIN, -2614493, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER = REGISTRY.register("clone_trooper_commander_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_COMMANDER, -9984, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_41ST = REGISTRY.register("clone_trooper_41st_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_41ST, -11759588, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_GREE = REGISTRY.register("clone_trooper_commander_gree_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_COMMANDER_GREE, -11759588, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_91ST = REGISTRY.register("clone_trooper_91st_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_91ST, -6879488, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PONDS = REGISTRY.register("clone_trooper_commander_ponds_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_COMMANDER_PONDS, -6879488, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_104TH = REGISTRY.register("clone_trooper_104th_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_104TH, -12895915, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_WOLFFE = REGISTRY.register("clone_trooper_commander_wolffe_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_COMMANDER_WOLFFE, -12895915, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_212TH = REGISTRY.register("clone_trooper_212th_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_212TH, -944092, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_CODY = REGISTRY.register("clone_trooper_commander_cody_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_COMMANDER_CODY, -944092, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_327TH = REGISTRY.register("clone_trooper_327th_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_327TH, -4015872, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_BLY = REGISTRY.register("clone_trooper_commander_bly_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_COMMANDER_BLY, -4015872, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_501ST = REGISTRY.register("clone_trooper_501st_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_501ST, -16768669, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_REX = REGISTRY.register("clone_trooper_captain_rex_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_CAPTAIN_REX, -16768669, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_APPO = REGISTRY.register("clone_trooper_commander_appo_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_COMMANDER_APPO, -16768669, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_GUARD = REGISTRY.register("clone_trooper_guard_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_GUARD, -6488064, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_FOX = REGISTRY.register("clone_trooper_commander_fox_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_COMMANDER_FOX, -6488064, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> CLONE_TROOPER_25633RD = REGISTRY.register("clone_trooper_25633rd_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.CLONE_TROOPER_25633RD, -16748112, -16572869,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> REPUBLIC_TANK = REGISTRY.register("republic_tank_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.REPUBLIC_TANK, -3407872, -1, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> REPUBLIC_TANK_AUTO = REGISTRY.register("republic_tank_auto_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.REPUBLIC_TANK_AUTO, -3407872, -1,
					new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> REPUBLIC_SPEEDER = REGISTRY.register("republic_speeder_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.REPUBLIC_SPEEDER, -3407872, -1, new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC)));
	public static final RegistryObject<Item> JETPACK_ARMOR_CHESTPLATE = REGISTRY.register("jetpack_armor_chestplate",
			() -> new JetpackArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_NORMAL_ARMOR_HELMET = REGISTRY.register("clone_trooper_normal_armor_helmet",
			() -> new CloneTrooperArmorArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_NORMAL_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_normal_armor_chestplate",
			() -> new CloneTrooperArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_NORMAL_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_normal_armor_leggings",
			() -> new CloneTrooperArmorArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_NORMAL_ARMOR_BOOTS = REGISTRY.register("clone_trooper_normal_armor_boots",
			() -> new CloneTrooperArmorArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_BOMB_ARMOR_HELMET = REGISTRY.register("clone_trooper_bomb_armor_helmet",
			() -> new CloneTrooperBombArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_BOMB_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_bomb_armor_chestplate",
			() -> new CloneTrooperBombArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_BOMB_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_bomb_armor_leggings",
			() -> new CloneTrooperBombArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_BOMB_ARMOR_BOOTS = REGISTRY.register("clone_trooper_bomb_armor_boots",
			() -> new CloneTrooperBombArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_PILOT_ARMOR_HELMET = REGISTRY.register("clone_trooper_pilot_armor_helmet",
			() -> new CloneTrooperPilotArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_PILOT_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_pilot_armor_chestplate",
			() -> new CloneTrooperPilotArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_GUNNER_ARMOR_HELMET = REGISTRY.register("clone_trooper_gunner_armor_helmet",
			() -> new CloneTrooperGunnerArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_GUNNER_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_gunner_armor_chestplate",
			() -> new CloneTrooperGunnerArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_SERGEANT_ARMOR_HELMET = REGISTRY.register("clone_trooper_sergeant_armor_helmet",
			() -> new CloneTrooperSergeantArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_SERGEANT_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_sergeant_armor_chestplate",
			() -> new CloneTrooperSergeantArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_SERGEANT_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_sergeant_armor_leggings",
			() -> new CloneTrooperSergeantArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_SERGEANT_ARMOR_BOOTS = REGISTRY.register("clone_trooper_sergeant_armor_boots",
			() -> new CloneTrooperSergeantArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_LIUTENANT_ARMOR_HELMET = REGISTRY.register("clone_trooper_liutenant_armor_helmet",
			() -> new CloneTrooperLiutenantArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_LIUTENANT_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_liutenant_armor_chestplate",
			() -> new CloneTrooperLiutenantArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_LIUTENANT_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_liutenant_armor_leggings",
			() -> new CloneTrooperLiutenantArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_LIUTENANT_ARMOR_BOOTS = REGISTRY.register("clone_trooper_liutenant_armor_boots",
			() -> new CloneTrooperLiutenantArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_ARMOR_HELMET = REGISTRY.register("clone_trooper_captain_armor_helmet",
			() -> new CloneTrooperCaptainArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_captain_armor_chestplate",
			() -> new CloneTrooperCaptainArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_captain_armor_leggings",
			() -> new CloneTrooperCaptainArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_ARMOR_BOOTS = REGISTRY.register("clone_trooper_captain_armor_boots",
			() -> new CloneTrooperCaptainArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_ARMOR_HELMET = REGISTRY.register("clone_trooper_commander_armor_helmet",
			() -> new CloneTrooperCommanderArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_commander_armor_chestplate",
			() -> new CloneTrooperCommanderArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_commander_armor_leggings",
			() -> new CloneTrooperCommanderArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_ARMOR_BOOTS = REGISTRY.register("clone_trooper_commander_armor_boots",
			() -> new CloneTrooperCommanderArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_41ST_ARMOR_HELMET = REGISTRY.register("clone_trooper_41st_armor_helmet",
			() -> new CloneTrooper41stArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_41ST_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_41st_armor_chestplate",
			() -> new CloneTrooper41stArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_41ST_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_41st_armor_leggings",
			() -> new CloneTrooper41stArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_41ST_ARMOR_BOOTS = REGISTRY.register("clone_trooper_41st_armor_boots",
			() -> new CloneTrooper41stArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_GREE_ARMOR_HELMET = REGISTRY
			.register("clone_trooper_commander_gree_armor_helmet", () -> new CloneTrooperCommanderGreeArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_GREE_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_commander_gree_armor_chestplate", () -> new CloneTrooperCommanderGreeArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_GREE_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_commander_gree_armor_leggings", () -> new CloneTrooperCommanderGreeArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_GREE_ARMOR_BOOTS = REGISTRY.register("clone_trooper_commander_gree_armor_boots",
			() -> new CloneTrooperCommanderGreeArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_91ST_ARMOR_HELMET = REGISTRY.register("clone_trooper_91st_armor_helmet",
			() -> new CloneTrooper91stArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_91ST_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_91st_armor_chestplate",
			() -> new CloneTrooper91stArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_91ST_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_91st_armor_leggings",
			() -> new CloneTrooper91stArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_91ST_ARMOR_BOOTS = REGISTRY.register("clone_trooper_91st_armor_boots",
			() -> new CloneTrooper91stArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PONDS_ARMOR_HELMET = REGISTRY
			.register("clone_trooper_commander_ponds_armor_helmet", () -> new CloneTrooperCommanderPondsArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PONDS_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_commander_ponds_armor_chestplate", () -> new CloneTrooperCommanderPondsArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PONDS_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_commander_ponds_armor_leggings", () -> new CloneTrooperCommanderPondsArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PONDS_ARMOR_BOOTS = REGISTRY
			.register("clone_trooper_commander_ponds_armor_boots", () -> new CloneTrooperCommanderPondsArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_104TH_ARMOR_HELMET = REGISTRY.register("clone_trooper_104th_armor_helmet",
			() -> new CloneTrooper104thArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_104TH_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_104th_armor_chestplate",
			() -> new CloneTrooper104thArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_104TH_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_104th_armor_leggings",
			() -> new CloneTrooper104thArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_104TH_ARMOR_BOOTS = REGISTRY.register("clone_trooper_104th_armor_boots",
			() -> new CloneTrooper104thArmorItem.Boots());
	public static final RegistryObject<Item> JETPACK_ARMOR_104TH_HELMET = REGISTRY.register("jetpack_armor_104th_helmet",
			() -> new JetpackArmor104thItem.Helmet());
	public static final RegistryObject<Item> JETPACK_ARMOR_104TH_CHESTPLATE = REGISTRY.register("jetpack_armor_104th_chestplate",
			() -> new JetpackArmor104thItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_WOLFFE_ARMOR_HELMET = REGISTRY
			.register("clone_trooper_commander_wolffe_armor_helmet", () -> new CloneTrooperCommanderWolffeArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_WOLFFE_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_commander_wolffe_armor_chestplate", () -> new CloneTrooperCommanderWolffeArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_WOLFFE_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_commander_wolffe_armor_leggings", () -> new CloneTrooperCommanderWolffeArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_WOLFFE_ARMOR_BOOTS = REGISTRY
			.register("clone_trooper_commander_wolffe_armor_boots", () -> new CloneTrooperCommanderWolffeArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_212TH_ARMOR_HELMET = REGISTRY.register("clone_trooper_212th_armor_helmet",
			() -> new CloneTrooper212thArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_212TH_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_212th_armor_chestplate",
			() -> new CloneTrooper212thArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_212TH_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_212th_armor_leggings",
			() -> new CloneTrooper212thArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_212TH_ARMOR_BOOTS = REGISTRY.register("clone_trooper_212th_armor_boots",
			() -> new CloneTrooper212thArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_CODY_ARMOR_HELMET = REGISTRY
			.register("clone_trooper_commander_cody_armor_helmet", () -> new CloneTrooperCommanderCodyArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_CODY_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_commander_cody_armor_chestplate", () -> new CloneTrooperCommanderCodyArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_CODY_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_commander_cody_armor_leggings", () -> new CloneTrooperCommanderCodyArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_CODY_ARMOR_BOOTS = REGISTRY.register("clone_trooper_commander_cody_armor_boots",
			() -> new CloneTrooperCommanderCodyArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_327TH_ARMOR_HELMET = REGISTRY.register("clone_trooper_327th_armor_helmet",
			() -> new CloneTrooper327thArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_327TH_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_327th_armor_chestplate",
			() -> new CloneTrooper327thArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_327TH_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_327th_armor_leggings",
			() -> new CloneTrooper327thArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_327TH_ARMOR_BOOTS = REGISTRY.register("clone_trooper_327th_armor_boots",
			() -> new CloneTrooper327thArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_BLY_ARMOR_HELMET = REGISTRY.register("clone_trooper_commander_bly_armor_helmet",
			() -> new CloneTrooperCommanderBlyArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_BLY_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_commander_bly_armor_chestplate", () -> new CloneTrooperCommanderBlyArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_BLY_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_commander_bly_armor_leggings", () -> new CloneTrooperCommanderBlyArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_BLY_ARMOR_BOOTS = REGISTRY.register("clone_trooper_commander_bly_armor_boots",
			() -> new CloneTrooperCommanderBlyArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_501ST_ARMOR_HELMET = REGISTRY.register("clone_trooper_501st_armor_helmet",
			() -> new CloneTrooper501stArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_501ST_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_501st_armor_chestplate",
			() -> new CloneTrooper501stArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_501ST_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_501st_armor_leggings",
			() -> new CloneTrooper501stArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_501ST_ARMOR_BOOTS = REGISTRY.register("clone_trooper_501st_armor_boots",
			() -> new CloneTrooper501stArmorItem.Boots());
	public static final RegistryObject<Item> JETPACK_ARMOR_501ST_HELMET = REGISTRY.register("jetpack_armor_501st_helmet",
			() -> new JetpackArmor501stItem.Helmet());
	public static final RegistryObject<Item> JETPACK_ARMOR_501ST_CHESTPLATE = REGISTRY.register("jetpack_armor_501st_chestplate",
			() -> new JetpackArmor501stItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_REX_ARMOR_HELMET = REGISTRY.register("clone_trooper_captain_rex_armor_helmet",
			() -> new CloneTrooperCaptainRexArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_REX_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_captain_rex_armor_chestplate", () -> new CloneTrooperCaptainRexArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_REX_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_captain_rex_armor_leggings",
			() -> new CloneTrooperCaptainRexArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_REX_ARMOR_BOOTS = REGISTRY.register("clone_trooper_captain_rex_armor_boots",
			() -> new CloneTrooperCaptainRexArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_APPO_ARMOR_HELMET = REGISTRY
			.register("clone_trooper_commander_appo_armor_helmet", () -> new CloneTrooperCommanderAppoArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_APPO_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_commander_appo_armor_chestplate", () -> new CloneTrooperCommanderAppoArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_APPO_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_commander_appo_armor_leggings", () -> new CloneTrooperCommanderAppoArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_APPO_ARMOR_BOOTS = REGISTRY.register("clone_trooper_commander_appo_armor_boots",
			() -> new CloneTrooperCommanderAppoArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_GUARD_ARMOR_HELMET = REGISTRY.register("clone_trooper_guard_armor_helmet",
			() -> new CloneTrooperGuardArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_GUARD_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_guard_armor_chestplate",
			() -> new CloneTrooperGuardArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_GUARD_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_guard_armor_leggings",
			() -> new CloneTrooperGuardArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_GUARD_ARMOR_BOOTS = REGISTRY.register("clone_trooper_guard_armor_boots",
			() -> new CloneTrooperGuardArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_FOX_ARMOR_HELMET = REGISTRY.register("clone_trooper_commander_fox_armor_helmet",
			() -> new CloneTrooperCommanderFoxArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_FOX_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_commander_fox_armor_chestplate", () -> new CloneTrooperCommanderFoxArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_FOX_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_commander_fox_armor_leggings", () -> new CloneTrooperCommanderFoxArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_FOX_ARMOR_BOOTS = REGISTRY.register("clone_trooper_commander_fox_armor_boots",
			() -> new CloneTrooperCommanderFoxArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_25633RD_ARMOR_HELMET = REGISTRY.register("clone_trooper_25633rd_armor_helmet",
			() -> new CloneTrooper25633rdArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_25633RD_ARMOR_CHESTPLATE = REGISTRY.register("clone_trooper_25633rd_armor_chestplate",
			() -> new CloneTrooper25633rdArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_25633RD_ARMOR_LEGGINGS = REGISTRY.register("clone_trooper_25633rd_armor_leggings",
			() -> new CloneTrooper25633rdArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_25633RD_ARMOR_BOOTS = REGISTRY.register("clone_trooper_25633rd_armor_boots",
			() -> new CloneTrooper25633rdArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_HELMET = REGISTRY
			.register("clone_trooper_captain_crypto_armor_helmet", () -> new CloneTrooperCaptainCryptoArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_captain_crypto_armor_chestplate", () -> new CloneTrooperCaptainCryptoArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_captain_crypto_armor_leggings", () -> new CloneTrooperCaptainCryptoArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_CAPTAIN_CRYPTO_ARMOR_BOOTS = REGISTRY.register("clone_trooper_captain_crypto_armor_boots",
			() -> new CloneTrooperCaptainCryptoArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_HELMET = REGISTRY
			.register("clone_trooper_commander_pyrix_armor_helmet", () -> new CloneTrooperCommanderPyrixArmorItem.Helmet());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_CHESTPLATE = REGISTRY
			.register("clone_trooper_commander_pyrix_armor_chestplate", () -> new CloneTrooperCommanderPyrixArmorItem.Chestplate());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_LEGGINGS = REGISTRY
			.register("clone_trooper_commander_pyrix_armor_leggings", () -> new CloneTrooperCommanderPyrixArmorItem.Leggings());
	public static final RegistryObject<Item> CLONE_TROOPER_COMMANDER_PYRIX_ARMOR_BOOTS = REGISTRY
			.register("clone_trooper_commander_pyrix_armor_boots", () -> new CloneTrooperCommanderPyrixArmorItem.Boots());
	public static final RegistryObject<Item> CLONE_ARMOR_CUSTOMIZER = block(StarWarsModBlocks.CLONE_ARMOR_CUSTOMIZER, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> RADAR = block(StarWarsModBlocks.RADAR, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> TITANIUM_ORE = block(StarWarsModBlocks.TITANIUM_ORE, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(StarWarsModBlocks.TITANIUM_BLOCK, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> RAW_TITANIUM = REGISTRY.register("raw_titanium", () -> new RawTitaniumItem());
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> PLASTOID_SCRAP = REGISTRY.register("plastoid_scrap", () -> new PlastoidScrapItem());
	public static final RegistryObject<Item> PLASTOID_PLATE = REGISTRY.register("plastoid_plate", () -> new PlastoidPlateItem());
	public static final RegistryObject<Item> PLASTOID_PICKAXE = REGISTRY.register("plastoid_pickaxe", () -> new PlastoidPickaxeItem());
	public static final RegistryObject<Item> PLASTOID_AXE = REGISTRY.register("plastoid_axe", () -> new PlastoidAxeItem());
	public static final RegistryObject<Item> PLASTOID_SWORD = REGISTRY.register("plastoid_sword", () -> new PlastoidSwordItem());
	public static final RegistryObject<Item> PLASTOID_SHOVEL = REGISTRY.register("plastoid_shovel", () -> new PlastoidShovelItem());
	public static final RegistryObject<Item> PLASTOID_HOE = REGISTRY.register("plastoid_hoe", () -> new PlastoidHoeItem());
	public static final RegistryObject<Item> BLASTER_MUNITIONS = REGISTRY.register("blaster_munitions", () -> new BlasterMunitionsItem());
	public static final RegistryObject<Item> THERMAL_DETONATOR = REGISTRY.register("thermal_detonator", () -> new ThermalDetonatorItem());
	public static final RegistryObject<Item> BACKPACK = REGISTRY.register("backpack", () -> new BackpackItem());
	public static final RegistryObject<Item> GEONOSIS_DIMENSION = REGISTRY.register("geonosis_dimension", () -> new GeonosisDimensionItem());
	public static final RegistryObject<Item> KASHYYYK_DIMENSION = REGISTRY.register("kashyyyk_dimension", () -> new KashyyykDimensionItem());
	public static final RegistryObject<Item> FELUCIA_DIMENSION = REGISTRY.register("felucia_dimension", () -> new FeluciaDimensionItem());
	public static final RegistryObject<Item> FELUCIA_BLUE_WOOD = block(StarWarsModBlocks.FELUCIA_BLUE_WOOD, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_LOG = block(StarWarsModBlocks.FELUCIA_BLUE_LOG, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_PLANKS = block(StarWarsModBlocks.FELUCIA_BLUE_PLANKS, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_LEAVES = block(StarWarsModBlocks.FELUCIA_BLUE_LEAVES, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_STAIRS = block(StarWarsModBlocks.FELUCIA_BLUE_STAIRS, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_SLAB = block(StarWarsModBlocks.FELUCIA_BLUE_SLAB, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_FENCE = block(StarWarsModBlocks.FELUCIA_BLUE_FENCE, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_FENCE_GATE = block(StarWarsModBlocks.FELUCIA_BLUE_FENCE_GATE,
			StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_PRESSURE_PLATE = block(StarWarsModBlocks.FELUCIA_BLUE_PRESSURE_PLATE,
			StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_BLUE_BUTTON = block(StarWarsModBlocks.FELUCIA_BLUE_BUTTON, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_WOOD = block(StarWarsModBlocks.FELUCIA_RED_WOOD, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_LOG = block(StarWarsModBlocks.FELUCIA_RED_LOG, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_PLANKS = block(StarWarsModBlocks.FELUCIA_RED_PLANKS, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_LEAVES = block(StarWarsModBlocks.FELUCIA_RED_LEAVES, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_STAIRS = block(StarWarsModBlocks.FELUCIA_RED_STAIRS, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_SLAB = block(StarWarsModBlocks.FELUCIA_RED_SLAB, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_FENCE = block(StarWarsModBlocks.FELUCIA_RED_FENCE, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_FENCE_GATE = block(StarWarsModBlocks.FELUCIA_RED_FENCE_GATE, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_PRESSURE_PLATE = block(StarWarsModBlocks.FELUCIA_RED_PRESSURE_PLATE,
			StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_RED_BUTTON = block(StarWarsModBlocks.FELUCIA_RED_BUTTON, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_WOOD = block(StarWarsModBlocks.FELUCIA_YELLOW_WOOD, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_LOG = block(StarWarsModBlocks.FELUCIA_YELLOW_LOG, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_PLANKS = block(StarWarsModBlocks.FELUCIA_YELLOW_PLANKS, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_LEAVES = block(StarWarsModBlocks.FELUCIA_YELLOW_LEAVES, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_STAIRS = block(StarWarsModBlocks.FELUCIA_YELLOW_STAIRS, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_SLAB = block(StarWarsModBlocks.FELUCIA_YELLOW_SLAB, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_FENCE = block(StarWarsModBlocks.FELUCIA_YELLOW_FENCE, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_FENCE_GATE = block(StarWarsModBlocks.FELUCIA_YELLOW_FENCE_GATE,
			StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_PRESSURE_PLATE = block(StarWarsModBlocks.FELUCIA_YELLOW_PRESSURE_PLATE,
			StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> FELUCIA_YELLOW_BUTTON = block(StarWarsModBlocks.FELUCIA_YELLOW_BUTTON, StarWarsModTabs.TAB_MATERIALS);
	public static final RegistryObject<Item> MUSIC_DISK_SEPARATIST = REGISTRY.register("music_disk_separatist", () -> new MusicDiskSeparatistItem());
	public static final RegistryObject<Item> RED_LIGHTSABER = REGISTRY.register("red_lightsaber", () -> new RedLightsaberItem());
	public static final RegistryObject<Item> DROID = REGISTRY.register("droid_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.DROID, -5859970, -16777216, new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> DROID_COMMANDER = REGISTRY.register("droid_commander_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.DROID_COMMANDER, -3373568, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> DROID_PILOT = REGISTRY.register("droid_pilot_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.DROID_PILOT, -14864496, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> DROID_SECURITY = REGISTRY.register("droid_security_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.DROID_SECURITY, -3915493, -16777216,
					new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> DROID_KASHYYYK = REGISTRY.register("droid_kashyyyk_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.DROID_KASHYYYK, -5859970, -12893672,
					new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> DROID_COMMANDER_KASHYYYK = REGISTRY.register("droid_commander_kashyyyk_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.DROID_COMMANDER_KASHYYYK, -3373568, -12893672,
					new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> DROID_PILOT_KASHYYYK = REGISTRY.register("droid_pilot_kashyyyk_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.DROID_PILOT_KASHYYYK, -14864496, -12893672,
					new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> DROID_SECURITY_KASHYYYK = REGISTRY.register("droid_security_kashyyyk_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.DROID_SECURITY_KASHYYYK, -3915493, -12893672,
					new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> SEPARATIST_TANK = REGISTRY.register("separatist_tank_spawn_egg",
			() -> new ForgeSpawnEggItem(StarWarsModEntities.SEPARATIST_TANK, -5150464, -5154560,
					new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST)));
	public static final RegistryObject<Item> BLASTER_E_5 = REGISTRY.register("blaster_e_5", () -> new BlasterE5Item());
	public static final RegistryObject<Item> REPUBBLIC_TANK_SHOT = REGISTRY.register("repubblic_tank_shot", () -> new RepubblicTankShotItem());
	public static final RegistryObject<Item> SEPARATIST_TANK_SHOT = REGISTRY.register("separatist_tank_shot", () -> new SeparatistTankShotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
