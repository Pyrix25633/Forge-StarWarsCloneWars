
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.rupyber_studios.star_wars_clone_wars.world.biome.KashyyykMountainsBiome;
import net.rupyber_studios.star_wars_clone_wars.world.biome.KashyyykBiome;
import net.rupyber_studios.star_wars_clone_wars.world.biome.KashyyykBeachesBiome;
import net.rupyber_studios.star_wars_clone_wars.world.biome.GeonosisPlainsBiome;
import net.rupyber_studios.star_wars_clone_wars.world.biome.GeonosisMountainsBiome;
import net.rupyber_studios.star_wars_clone_wars.world.biome.GeonosisBiome;
import net.rupyber_studios.star_wars_clone_wars.world.biome.FeluciaYellowPlainsBiome;
import net.rupyber_studios.star_wars_clone_wars.world.biome.FeluciaRedPlainsBiome;
import net.rupyber_studios.star_wars_clone_wars.world.biome.FeluciaBluePlainsBiome;
import net.rupyber_studios.star_wars_clone_wars.StarWarsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

public class StarWarsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, StarWarsMod.MODID);
	public static final RegistryObject<Biome> GEONOSIS = REGISTRY.register("geonosis", GeonosisBiome::createBiome);
	public static final RegistryObject<Biome> GEONOSIS_PLAINS = REGISTRY.register("geonosis_plains", GeonosisPlainsBiome::createBiome);
	public static final RegistryObject<Biome> GEONOSIS_MOUNTAINS = REGISTRY.register("geonosis_mountains", GeonosisMountainsBiome::createBiome);
	public static final RegistryObject<Biome> KASHYYYK = REGISTRY.register("kashyyyk", KashyyykBiome::createBiome);
	public static final RegistryObject<Biome> KASHYYYK_BEACHES = REGISTRY.register("kashyyyk_beaches", KashyyykBeachesBiome::createBiome);
	public static final RegistryObject<Biome> KASHYYYK_MOUNTAINS = REGISTRY.register("kashyyyk_mountains", KashyyykMountainsBiome::createBiome);
	public static final RegistryObject<Biome> FELUCIA_BLUE_PLAINS = REGISTRY.register("felucia_blue_plains", FeluciaBluePlainsBiome::createBiome);
	public static final RegistryObject<Biome> FELUCIA_RED_PLAINS = REGISTRY.register("felucia_red_plains", FeluciaRedPlainsBiome::createBiome);
	public static final RegistryObject<Biome> FELUCIA_YELLOW_PLAINS = REGISTRY.register("felucia_yellow_plains",
			FeluciaYellowPlainsBiome::createBiome);
}
