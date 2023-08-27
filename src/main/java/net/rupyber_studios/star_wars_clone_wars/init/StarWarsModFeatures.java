
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.rupyber_studios.star_wars_clone_wars.world.features.ores.TitaniumOreFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.LaatTFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.LaatIFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.KashyyykSeparatistLandingCruiserFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.KashyyykPillarFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.KashyyykOutpost1Feature;
import net.rupyber_studios.star_wars_clone_wars.world.features.GeonosisSeparatist1Feature;
import net.rupyber_studios.star_wars_clone_wars.world.features.GeonosisOutpost501stFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.GeonosisOutpost3Feature;
import net.rupyber_studios.star_wars_clone_wars.world.features.GeonosisOutpost2Feature;
import net.rupyber_studios.star_wars_clone_wars.world.features.GeonosisOutpost1Feature;
import net.rupyber_studios.star_wars_clone_wars.world.features.FeluciaSeparatistBaseFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.FeluciaOutpost2Feature;
import net.rupyber_studios.star_wars_clone_wars.world.features.FeluciaOutpost1Feature;
import net.rupyber_studios.star_wars_clone_wars.world.features.CloneTankFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.AtTeFeature;
import net.rupyber_studios.star_wars_clone_wars.world.features.AtApFeature;
import net.rupyber_studios.star_wars_clone_wars.StarWarsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class StarWarsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, StarWarsMod.MODID);
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = REGISTRY.register("titanium_ore", TitaniumOreFeature::new);
	public static final RegistryObject<Feature<?>> AT_AP = REGISTRY.register("at_ap", AtApFeature::new);
	public static final RegistryObject<Feature<?>> LAAT_I = REGISTRY.register("laat_i", LaatIFeature::new);
	public static final RegistryObject<Feature<?>> LAAT_T = REGISTRY.register("laat_t", LaatTFeature::new);
	public static final RegistryObject<Feature<?>> AT_TE = REGISTRY.register("at_te", AtTeFeature::new);
	public static final RegistryObject<Feature<?>> GEONOSIS_OUTPOST_1 = REGISTRY.register("geonosis_outpost_1", GeonosisOutpost1Feature::new);
	public static final RegistryObject<Feature<?>> GEONOSIS_OUTPOST_2 = REGISTRY.register("geonosis_outpost_2", GeonosisOutpost2Feature::new);
	public static final RegistryObject<Feature<?>> GEONOSIS_OUTPOST_3 = REGISTRY.register("geonosis_outpost_3", GeonosisOutpost3Feature::new);
	public static final RegistryObject<Feature<?>> GEONOSIS_OUTPOST_501ST = REGISTRY.register("geonosis_outpost_501st", GeonosisOutpost501stFeature::new);
	public static final RegistryObject<Feature<?>> GEONOSIS_SEPARATIST_1 = REGISTRY.register("geonosis_separatist_1", GeonosisSeparatist1Feature::new);
	public static final RegistryObject<Feature<?>> KASHYYYK_SEPARATIST_LANDING_CRUISER = REGISTRY.register("kashyyyk_separatist_landing_cruiser", KashyyykSeparatistLandingCruiserFeature::new);
	public static final RegistryObject<Feature<?>> KASHYYYK_OUTPOST_1 = REGISTRY.register("kashyyyk_outpost_1", KashyyykOutpost1Feature::new);
	public static final RegistryObject<Feature<?>> KASHYYYK_PILLAR = REGISTRY.register("kashyyyk_pillar", KashyyykPillarFeature::new);
	public static final RegistryObject<Feature<?>> CLONE_TANK = REGISTRY.register("clone_tank", CloneTankFeature::new);
	public static final RegistryObject<Feature<?>> FELUCIA_SEPARATIST_BASE = REGISTRY.register("felucia_separatist_base", FeluciaSeparatistBaseFeature::new);
	public static final RegistryObject<Feature<?>> FELUCIA_OUTPOST_1 = REGISTRY.register("felucia_outpost_1", FeluciaOutpost1Feature::new);
	public static final RegistryObject<Feature<?>> FELUCIA_OUTPOST_2 = REGISTRY.register("felucia_outpost_2", FeluciaOutpost2Feature::new);
}
