
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.rupyber_studios.star_wars_clone_wars.client.gui.RepubblicTankGuiScreen;
import net.rupyber_studios.star_wars_clone_wars.client.gui.CloneArmorCustomizerGuiScreen;
import net.rupyber_studios.star_wars_clone_wars.client.gui.BackpackGuiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarWarsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StarWarsModMenus.CLONE_ARMOR_CUSTOMIZER_GUI, CloneArmorCustomizerGuiScreen::new);
			MenuScreens.register(StarWarsModMenus.REPUBBLIC_TANK_GUI, RepubblicTankGuiScreen::new);
			MenuScreens.register(StarWarsModMenus.BACKPACK_GUI, BackpackGuiScreen::new);
		});
	}
}
