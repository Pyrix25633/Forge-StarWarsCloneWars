
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import org.lwjgl.glfw.GLFW;

import net.rupyber_studios.star_wars_clone_wars.network.TankShootMessage;
import net.rupyber_studios.star_wars_clone_wars.StarWarsMod;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarWarsModKeyMappings {
	public static final KeyMapping TANK_SHOOT = new KeyMapping("key.star_wars.tank_shoot", GLFW.GLFW_KEY_R, "key.categories.gameplay");
	private static long TANK_SHOOT_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(TANK_SHOOT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == TANK_SHOOT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						TANK_SHOOT_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - TANK_SHOOT_LASTPRESS);
						StarWarsMod.PACKET_HANDLER.sendToServer(new TankShootMessage(1, dt));
						TankShootMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
