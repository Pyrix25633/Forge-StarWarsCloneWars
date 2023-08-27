
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.rupyber_studios.star_wars_clone_wars.StarWarsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class StarWarsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StarWarsMod.MODID);
	public static final RegistryObject<SoundEvent> ENTITY_LIVING_CLONE = REGISTRY.register("entity.living.clone", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("star_wars", "entity.living.clone")));
	public static final RegistryObject<SoundEvent> RECORD_SEPARATIST = REGISTRY.register("record.separatist", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("star_wars", "record.separatist")));
	public static final RegistryObject<SoundEvent> ENTITY_WALK_SPEEDER = REGISTRY.register("entity.walk.speeder", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("star_wars", "entity.walk.speeder")));
	public static final RegistryObject<SoundEvent> ENTITY_HURT_SPEEDER = REGISTRY.register("entity.hurt.speeder", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("star_wars", "entity.hurt.speeder")));
	public static final RegistryObject<SoundEvent> RECORD_REPUBLIC = REGISTRY.register("record.republic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("star_wars", "record.republic")));
	public static final RegistryObject<SoundEvent> ENTITY_HURT_TANK = REGISTRY.register("entity.hurt.tank", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("star_wars", "entity.hurt.tank")));
	public static final RegistryObject<SoundEvent> ENTITY_WALK_TANK = REGISTRY.register("entity.walk.tank", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("star_wars", "entity.walk.tank")));
	public static final RegistryObject<SoundEvent> ENTITY_LASER_SHOT = REGISTRY.register("entity.laser.shot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("star_wars", "entity.laser.shot")));
}
