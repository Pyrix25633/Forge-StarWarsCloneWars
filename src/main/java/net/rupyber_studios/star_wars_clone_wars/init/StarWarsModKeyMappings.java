
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import org.lwjgl.glfw.GLFW;

import net.rupyber_studios.star_wars_clone_wars.network.TankShootMessage;
import net.rupyber_studios.star_wars_clone_wars.StarWarsMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarWarsModKeyMappings {
	public static final KeyMapping TANK_SHOOT = new KeyMapping("key.star_wars.tank_shoot", GLFW.GLFW_KEY_R, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				TANK_SHOOT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - TANK_SHOOT_LASTPRESS);
				StarWarsMod.PACKET_HANDLER.sendToServer(new TankShootMessage(1, dt));
				TankShootMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long TANK_SHOOT_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TANK_SHOOT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TANK_SHOOT.consumeClick();
			}
		}
	}
}
