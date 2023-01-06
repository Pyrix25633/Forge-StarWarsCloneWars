
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.starwars.client.gui.RepubblicTankGuiScreen;
import net.mcreator.starwars.client.gui.CloneArmorCustomizerGuiScreen;
import net.mcreator.starwars.client.gui.BackpackGuiScreen;

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
