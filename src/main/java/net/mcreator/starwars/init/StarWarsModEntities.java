
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.starwars.entity.ThermalDetonatorEntity;
import net.mcreator.starwars.entity.SeparatistTankShotEntity;
import net.mcreator.starwars.entity.SeparatistTankEntity;
import net.mcreator.starwars.entity.RepublicTankEntity;
import net.mcreator.starwars.entity.RepublicTankAutoEntity;
import net.mcreator.starwars.entity.RepublicSpeederEntity;
import net.mcreator.starwars.entity.RepubblicTankShotEntity;
import net.mcreator.starwars.entity.DroidSecurityKashyyykEntity;
import net.mcreator.starwars.entity.DroidSecurityEntity;
import net.mcreator.starwars.entity.DroidPilotKashyyykEntity;
import net.mcreator.starwars.entity.DroidPilotEntity;
import net.mcreator.starwars.entity.DroidKashyyykEntity;
import net.mcreator.starwars.entity.DroidEntity;
import net.mcreator.starwars.entity.DroidCommanderKashyyykEntity;
import net.mcreator.starwars.entity.DroidCommanderEntity;
import net.mcreator.starwars.entity.CloneTrooperSergeantEntity;
import net.mcreator.starwars.entity.CloneTrooperLiutenantEntity;
import net.mcreator.starwars.entity.CloneTrooperGuardEntity;
import net.mcreator.starwars.entity.CloneTrooperEntity;
import net.mcreator.starwars.entity.CloneTrooperCommanderWolffeEntity;
import net.mcreator.starwars.entity.CloneTrooperCommanderPondsEntity;
import net.mcreator.starwars.entity.CloneTrooperCommanderGreeEntity;
import net.mcreator.starwars.entity.CloneTrooperCommanderFoxEntity;
import net.mcreator.starwars.entity.CloneTrooperCommanderEntity;
import net.mcreator.starwars.entity.CloneTrooperCommanderCodyEntity;
import net.mcreator.starwars.entity.CloneTrooperCommanderBlyEntity;
import net.mcreator.starwars.entity.CloneTrooperCommanderAppoEntity;
import net.mcreator.starwars.entity.CloneTrooperCaptainRexEntity;
import net.mcreator.starwars.entity.CloneTrooperCaptainEntity;
import net.mcreator.starwars.entity.CloneTrooperBombEntity;
import net.mcreator.starwars.entity.CloneTrooper91stEntity;
import net.mcreator.starwars.entity.CloneTrooper501stEntity;
import net.mcreator.starwars.entity.CloneTrooper41stEntity;
import net.mcreator.starwars.entity.CloneTrooper327thEntity;
import net.mcreator.starwars.entity.CloneTrooper25633rdEntity;
import net.mcreator.starwars.entity.CloneTrooper212thEntity;
import net.mcreator.starwars.entity.CloneTrooper104thEntity;
import net.mcreator.starwars.entity.BlasterE5Entity;
import net.mcreator.starwars.entity.BlasterDc17Entity;
import net.mcreator.starwars.entity.BlasterDc15sEntity;
import net.mcreator.starwars.StarWarsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarWarsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, StarWarsMod.MODID);
	public static final RegistryObject<EntityType<BlasterDc15sEntity>> BLASTER_DC_15S = register("projectile_blaster_dc_15s",
			EntityType.Builder.<BlasterDc15sEntity>of(BlasterDc15sEntity::new, MobCategory.MISC).setCustomClientFactory(BlasterDc15sEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlasterDc17Entity>> BLASTER_DC_17 = register("projectile_blaster_dc_17",
			EntityType.Builder.<BlasterDc17Entity>of(BlasterDc17Entity::new, MobCategory.MISC).setCustomClientFactory(BlasterDc17Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CloneTrooperEntity>> CLONE_TROOPER = register("clone_trooper",
			EntityType.Builder.<CloneTrooperEntity>of(CloneTrooperEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperBombEntity>> CLONE_TROOPER_BOMB = register("clone_trooper_bomb",
			EntityType.Builder.<CloneTrooperBombEntity>of(CloneTrooperBombEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooperBombEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperSergeantEntity>> CLONE_TROOPER_SERGEANT = register("clone_trooper_sergeant",
			EntityType.Builder.<CloneTrooperSergeantEntity>of(CloneTrooperSergeantEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperSergeantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperLiutenantEntity>> CLONE_TROOPER_LIUTENANT = register("clone_trooper_liutenant",
			EntityType.Builder.<CloneTrooperLiutenantEntity>of(CloneTrooperLiutenantEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperLiutenantEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCaptainEntity>> CLONE_TROOPER_CAPTAIN = register("clone_trooper_captain",
			EntityType.Builder.<CloneTrooperCaptainEntity>of(CloneTrooperCaptainEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCaptainEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCommanderEntity>> CLONE_TROOPER_COMMANDER = register("clone_trooper_commander",
			EntityType.Builder.<CloneTrooperCommanderEntity>of(CloneTrooperCommanderEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCommanderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooper41stEntity>> CLONE_TROOPER_41ST = register("clone_trooper_41st",
			EntityType.Builder.<CloneTrooper41stEntity>of(CloneTrooper41stEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooper41stEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCommanderGreeEntity>> CLONE_TROOPER_COMMANDER_GREE = register(
			"clone_trooper_commander_gree",
			EntityType.Builder.<CloneTrooperCommanderGreeEntity>of(CloneTrooperCommanderGreeEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCommanderGreeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooper91stEntity>> CLONE_TROOPER_91ST = register("clone_trooper_91st",
			EntityType.Builder.<CloneTrooper91stEntity>of(CloneTrooper91stEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooper91stEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCommanderPondsEntity>> CLONE_TROOPER_COMMANDER_PONDS = register(
			"clone_trooper_commander_ponds",
			EntityType.Builder.<CloneTrooperCommanderPondsEntity>of(CloneTrooperCommanderPondsEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCommanderPondsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooper104thEntity>> CLONE_TROOPER_104TH = register("clone_trooper_104th",
			EntityType.Builder.<CloneTrooper104thEntity>of(CloneTrooper104thEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooper104thEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCommanderWolffeEntity>> CLONE_TROOPER_COMMANDER_WOLFFE = register(
			"clone_trooper_commander_wolffe",
			EntityType.Builder.<CloneTrooperCommanderWolffeEntity>of(CloneTrooperCommanderWolffeEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCommanderWolffeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooper212thEntity>> CLONE_TROOPER_212TH = register("clone_trooper_212th",
			EntityType.Builder.<CloneTrooper212thEntity>of(CloneTrooper212thEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooper212thEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCommanderCodyEntity>> CLONE_TROOPER_COMMANDER_CODY = register(
			"clone_trooper_commander_cody",
			EntityType.Builder.<CloneTrooperCommanderCodyEntity>of(CloneTrooperCommanderCodyEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCommanderCodyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooper327thEntity>> CLONE_TROOPER_327TH = register("clone_trooper_327th",
			EntityType.Builder.<CloneTrooper327thEntity>of(CloneTrooper327thEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooper327thEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCommanderBlyEntity>> CLONE_TROOPER_COMMANDER_BLY = register(
			"clone_trooper_commander_bly",
			EntityType.Builder.<CloneTrooperCommanderBlyEntity>of(CloneTrooperCommanderBlyEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCommanderBlyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooper501stEntity>> CLONE_TROOPER_501ST = register("clone_trooper_501st",
			EntityType.Builder.<CloneTrooper501stEntity>of(CloneTrooper501stEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooper501stEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCaptainRexEntity>> CLONE_TROOPER_CAPTAIN_REX = register("clone_trooper_captain_rex",
			EntityType.Builder.<CloneTrooperCaptainRexEntity>of(CloneTrooperCaptainRexEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCaptainRexEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCommanderAppoEntity>> CLONE_TROOPER_COMMANDER_APPO = register(
			"clone_trooper_commander_appo",
			EntityType.Builder.<CloneTrooperCommanderAppoEntity>of(CloneTrooperCommanderAppoEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCommanderAppoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperGuardEntity>> CLONE_TROOPER_GUARD = register("clone_trooper_guard",
			EntityType.Builder.<CloneTrooperGuardEntity>of(CloneTrooperGuardEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CloneTrooperGuardEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooperCommanderFoxEntity>> CLONE_TROOPER_COMMANDER_FOX = register(
			"clone_trooper_commander_fox",
			EntityType.Builder.<CloneTrooperCommanderFoxEntity>of(CloneTrooperCommanderFoxEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooperCommanderFoxEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CloneTrooper25633rdEntity>> CLONE_TROOPER_25633RD = register("clone_trooper_25633rd",
			EntityType.Builder.<CloneTrooper25633rdEntity>of(CloneTrooper25633rdEntity::new, MobCategory.AMBIENT)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CloneTrooper25633rdEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RepublicTankEntity>> REPUBLIC_TANK = register("republic_tank",
			EntityType.Builder.<RepublicTankEntity>of(RepublicTankEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RepublicTankEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<RepublicTankAutoEntity>> REPUBLIC_TANK_AUTO = register("republic_tank_auto",
			EntityType.Builder.<RepublicTankAutoEntity>of(RepublicTankAutoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RepublicTankAutoEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<RepublicSpeederEntity>> REPUBLIC_SPEEDER = register("republic_speeder",
			EntityType.Builder.<RepublicSpeederEntity>of(RepublicSpeederEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RepublicSpeederEntity::new)

					.sized(2f, 1.5f));
	public static final RegistryObject<EntityType<ThermalDetonatorEntity>> THERMAL_DETONATOR = register("projectile_thermal_detonator",
			EntityType.Builder.<ThermalDetonatorEntity>of(ThermalDetonatorEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ThermalDetonatorEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DroidEntity>> DROID = register("droid",
			EntityType.Builder.<DroidEntity>of(DroidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DroidEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroidCommanderEntity>> DROID_COMMANDER = register("droid_commander",
			EntityType.Builder.<DroidCommanderEntity>of(DroidCommanderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DroidCommanderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroidPilotEntity>> DROID_PILOT = register("droid_pilot",
			EntityType.Builder.<DroidPilotEntity>of(DroidPilotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DroidPilotEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroidSecurityEntity>> DROID_SECURITY = register("droid_security",
			EntityType.Builder.<DroidSecurityEntity>of(DroidSecurityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DroidSecurityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroidKashyyykEntity>> DROID_KASHYYYK = register("droid_kashyyyk",
			EntityType.Builder.<DroidKashyyykEntity>of(DroidKashyyykEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DroidKashyyykEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroidCommanderKashyyykEntity>> DROID_COMMANDER_KASHYYYK = register("droid_commander_kashyyyk",
			EntityType.Builder.<DroidCommanderKashyyykEntity>of(DroidCommanderKashyyykEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(DroidCommanderKashyyykEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroidPilotKashyyykEntity>> DROID_PILOT_KASHYYYK = register("droid_pilot_kashyyyk",
			EntityType.Builder.<DroidPilotKashyyykEntity>of(DroidPilotKashyyykEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DroidPilotKashyyykEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroidSecurityKashyyykEntity>> DROID_SECURITY_KASHYYYK = register("droid_security_kashyyyk",
			EntityType.Builder.<DroidSecurityKashyyykEntity>of(DroidSecurityKashyyykEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(DroidSecurityKashyyykEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SeparatistTankEntity>> SEPARATIST_TANK = register("separatist_tank",
			EntityType.Builder.<SeparatistTankEntity>of(SeparatistTankEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SeparatistTankEntity::new)

					.sized(2f, 2f));
	public static final RegistryObject<EntityType<BlasterE5Entity>> BLASTER_E_5 = register("projectile_blaster_e_5",
			EntityType.Builder.<BlasterE5Entity>of(BlasterE5Entity::new, MobCategory.MISC).setCustomClientFactory(BlasterE5Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RepubblicTankShotEntity>> REPUBBLIC_TANK_SHOT = register("projectile_repubblic_tank_shot",
			EntityType.Builder.<RepubblicTankShotEntity>of(RepubblicTankShotEntity::new, MobCategory.MISC)
					.setCustomClientFactory(RepubblicTankShotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SeparatistTankShotEntity>> SEPARATIST_TANK_SHOT = register("projectile_separatist_tank_shot",
			EntityType.Builder.<SeparatistTankShotEntity>of(SeparatistTankShotEntity::new, MobCategory.MISC)
					.setCustomClientFactory(SeparatistTankShotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CloneTrooperEntity.init();
			CloneTrooperBombEntity.init();
			CloneTrooperSergeantEntity.init();
			CloneTrooperLiutenantEntity.init();
			CloneTrooperCaptainEntity.init();
			CloneTrooperCommanderEntity.init();
			CloneTrooper41stEntity.init();
			CloneTrooperCommanderGreeEntity.init();
			CloneTrooper91stEntity.init();
			CloneTrooperCommanderPondsEntity.init();
			CloneTrooper104thEntity.init();
			CloneTrooperCommanderWolffeEntity.init();
			CloneTrooper212thEntity.init();
			CloneTrooperCommanderCodyEntity.init();
			CloneTrooper327thEntity.init();
			CloneTrooperCommanderBlyEntity.init();
			CloneTrooper501stEntity.init();
			CloneTrooperCaptainRexEntity.init();
			CloneTrooperCommanderAppoEntity.init();
			CloneTrooperGuardEntity.init();
			CloneTrooperCommanderFoxEntity.init();
			CloneTrooper25633rdEntity.init();
			RepublicTankEntity.init();
			RepublicTankAutoEntity.init();
			RepublicSpeederEntity.init();
			DroidEntity.init();
			DroidCommanderEntity.init();
			DroidPilotEntity.init();
			DroidSecurityEntity.init();
			DroidKashyyykEntity.init();
			DroidCommanderKashyyykEntity.init();
			DroidPilotKashyyykEntity.init();
			DroidSecurityKashyyykEntity.init();
			SeparatistTankEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CLONE_TROOPER.get(), CloneTrooperEntity.createAttributes().build());
		event.put(CLONE_TROOPER_BOMB.get(), CloneTrooperBombEntity.createAttributes().build());
		event.put(CLONE_TROOPER_SERGEANT.get(), CloneTrooperSergeantEntity.createAttributes().build());
		event.put(CLONE_TROOPER_LIUTENANT.get(), CloneTrooperLiutenantEntity.createAttributes().build());
		event.put(CLONE_TROOPER_CAPTAIN.get(), CloneTrooperCaptainEntity.createAttributes().build());
		event.put(CLONE_TROOPER_COMMANDER.get(), CloneTrooperCommanderEntity.createAttributes().build());
		event.put(CLONE_TROOPER_41ST.get(), CloneTrooper41stEntity.createAttributes().build());
		event.put(CLONE_TROOPER_COMMANDER_GREE.get(), CloneTrooperCommanderGreeEntity.createAttributes().build());
		event.put(CLONE_TROOPER_91ST.get(), CloneTrooper91stEntity.createAttributes().build());
		event.put(CLONE_TROOPER_COMMANDER_PONDS.get(), CloneTrooperCommanderPondsEntity.createAttributes().build());
		event.put(CLONE_TROOPER_104TH.get(), CloneTrooper104thEntity.createAttributes().build());
		event.put(CLONE_TROOPER_COMMANDER_WOLFFE.get(), CloneTrooperCommanderWolffeEntity.createAttributes().build());
		event.put(CLONE_TROOPER_212TH.get(), CloneTrooper212thEntity.createAttributes().build());
		event.put(CLONE_TROOPER_COMMANDER_CODY.get(), CloneTrooperCommanderCodyEntity.createAttributes().build());
		event.put(CLONE_TROOPER_327TH.get(), CloneTrooper327thEntity.createAttributes().build());
		event.put(CLONE_TROOPER_COMMANDER_BLY.get(), CloneTrooperCommanderBlyEntity.createAttributes().build());
		event.put(CLONE_TROOPER_501ST.get(), CloneTrooper501stEntity.createAttributes().build());
		event.put(CLONE_TROOPER_CAPTAIN_REX.get(), CloneTrooperCaptainRexEntity.createAttributes().build());
		event.put(CLONE_TROOPER_COMMANDER_APPO.get(), CloneTrooperCommanderAppoEntity.createAttributes().build());
		event.put(CLONE_TROOPER_GUARD.get(), CloneTrooperGuardEntity.createAttributes().build());
		event.put(CLONE_TROOPER_COMMANDER_FOX.get(), CloneTrooperCommanderFoxEntity.createAttributes().build());
		event.put(CLONE_TROOPER_25633RD.get(), CloneTrooper25633rdEntity.createAttributes().build());
		event.put(REPUBLIC_TANK.get(), RepublicTankEntity.createAttributes().build());
		event.put(REPUBLIC_TANK_AUTO.get(), RepublicTankAutoEntity.createAttributes().build());
		event.put(REPUBLIC_SPEEDER.get(), RepublicSpeederEntity.createAttributes().build());
		event.put(DROID.get(), DroidEntity.createAttributes().build());
		event.put(DROID_COMMANDER.get(), DroidCommanderEntity.createAttributes().build());
		event.put(DROID_PILOT.get(), DroidPilotEntity.createAttributes().build());
		event.put(DROID_SECURITY.get(), DroidSecurityEntity.createAttributes().build());
		event.put(DROID_KASHYYYK.get(), DroidKashyyykEntity.createAttributes().build());
		event.put(DROID_COMMANDER_KASHYYYK.get(), DroidCommanderKashyyykEntity.createAttributes().build());
		event.put(DROID_PILOT_KASHYYYK.get(), DroidPilotKashyyykEntity.createAttributes().build());
		event.put(DROID_SECURITY_KASHYYYK.get(), DroidSecurityKashyyykEntity.createAttributes().build());
		event.put(SEPARATIST_TANK.get(), SeparatistTankEntity.createAttributes().build());
	}
}
