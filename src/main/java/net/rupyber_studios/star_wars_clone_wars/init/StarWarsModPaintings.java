
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.rupyber_studios.star_wars_clone_wars.StarWarsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

public class StarWarsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, StarWarsMod.MODID);
	public static final RegistryObject<PaintingVariant> SEPARATIST_PAINTING = REGISTRY.register("separatist_painting",
			() -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> REPUBLIC_PAINTING = REGISTRY.register("republic_painting", () -> new PaintingVariant(16, 16));
}
