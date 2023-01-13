
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarWarsModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("star_wars", "entity.living.clone"),
				new SoundEvent(new ResourceLocation("star_wars", "entity.living.clone")));
		REGISTRY.put(new ResourceLocation("star_wars", "record.separatist"), new SoundEvent(new ResourceLocation("star_wars", "record.separatist")));
		REGISTRY.put(new ResourceLocation("star_wars", "entity.walk.speeder"),
				new SoundEvent(new ResourceLocation("star_wars", "entity.walk.speeder")));
		REGISTRY.put(new ResourceLocation("star_wars", "entity.hurt.speeder"),
				new SoundEvent(new ResourceLocation("star_wars", "entity.hurt.speeder")));
		REGISTRY.put(new ResourceLocation("star_wars", "record.republic"), new SoundEvent(new ResourceLocation("star_wars", "record.republic")));
		REGISTRY.put(new ResourceLocation("star_wars", "entity.hurt.tank"), new SoundEvent(new ResourceLocation("star_wars", "entity.hurt.tank")));
		REGISTRY.put(new ResourceLocation("star_wars", "entity.walk.tank"), new SoundEvent(new ResourceLocation("star_wars", "entity.walk.tank")));
		REGISTRY.put(new ResourceLocation("star_wars", "entity.laser.shot"), new SoundEvent(new ResourceLocation("star_wars", "entity.laser.shot")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
