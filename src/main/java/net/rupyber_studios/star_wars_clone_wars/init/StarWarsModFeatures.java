
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
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class StarWarsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, StarWarsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = register("titanium_ore", TitaniumOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TitaniumOreFeature.GENERATE_BIOMES, TitaniumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AT_AP = register("at_ap", AtApFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AtApFeature.GENERATE_BIOMES, AtApFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAAT_I = register("laat_i", LaatIFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LaatIFeature.GENERATE_BIOMES, LaatIFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAAT_T = register("laat_t", LaatTFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LaatTFeature.GENERATE_BIOMES, LaatTFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AT_TE = register("at_te", AtTeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AtTeFeature.GENERATE_BIOMES, AtTeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEONOSIS_OUTPOST_1 = register("geonosis_outpost_1", GeonosisOutpost1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GeonosisOutpost1Feature.GENERATE_BIOMES,
					GeonosisOutpost1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GEONOSIS_OUTPOST_2 = register("geonosis_outpost_2", GeonosisOutpost2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GeonosisOutpost2Feature.GENERATE_BIOMES,
					GeonosisOutpost2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GEONOSIS_OUTPOST_3 = register("geonosis_outpost_3", GeonosisOutpost3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GeonosisOutpost3Feature.GENERATE_BIOMES,
					GeonosisOutpost3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GEONOSIS_OUTPOST_501ST = register("geonosis_outpost_501st", GeonosisOutpost501stFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GeonosisOutpost501stFeature.GENERATE_BIOMES,
					GeonosisOutpost501stFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GEONOSIS_SEPARATIST_1 = register("geonosis_separatist_1", GeonosisSeparatist1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GeonosisSeparatist1Feature.GENERATE_BIOMES,
					GeonosisSeparatist1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> KASHYYYK_SEPARATIST_LANDING_CRUISER = register("kashyyyk_separatist_landing_cruiser",
			KashyyykSeparatistLandingCruiserFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					KashyyykSeparatistLandingCruiserFeature.GENERATE_BIOMES, KashyyykSeparatistLandingCruiserFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KASHYYYK_OUTPOST_1 = register("kashyyyk_outpost_1", KashyyykOutpost1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, KashyyykOutpost1Feature.GENERATE_BIOMES,
					KashyyykOutpost1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> KASHYYYK_PILLAR = register("kashyyyk_pillar", KashyyykPillarFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, KashyyykPillarFeature.GENERATE_BIOMES,
					KashyyykPillarFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CLONE_TANK = register("clone_tank", CloneTankFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CloneTankFeature.GENERATE_BIOMES, CloneTankFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FELUCIA_SEPARATIST_BASE = register("felucia_separatist_base",
			FeluciaSeparatistBaseFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					FeluciaSeparatistBaseFeature.GENERATE_BIOMES, FeluciaSeparatistBaseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FELUCIA_OUTPOST_1 = register("felucia_outpost_1", FeluciaOutpost1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, FeluciaOutpost1Feature.GENERATE_BIOMES,
					FeluciaOutpost1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> FELUCIA_OUTPOST_2 = register("felucia_outpost_2", FeluciaOutpost2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, FeluciaOutpost2Feature.GENERATE_BIOMES,
					FeluciaOutpost2Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
