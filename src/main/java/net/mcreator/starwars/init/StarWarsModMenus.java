
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.starwars.world.inventory.RepubblicTankGuiMenu;
import net.mcreator.starwars.world.inventory.CloneArmorCustomizerGuiMenu;
import net.mcreator.starwars.world.inventory.BackpackGuiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarWarsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CloneArmorCustomizerGuiMenu> CLONE_ARMOR_CUSTOMIZER_GUI = register("clone_armor_customizer_gui",
			(id, inv, extraData) -> new CloneArmorCustomizerGuiMenu(id, inv, extraData));
	public static final MenuType<RepubblicTankGuiMenu> REPUBBLIC_TANK_GUI = register("repubblic_tank_gui",
			(id, inv, extraData) -> new RepubblicTankGuiMenu(id, inv, extraData));
	public static final MenuType<BackpackGuiMenu> BACKPACK_GUI = register("backpack_gui",
			(id, inv, extraData) -> new BackpackGuiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
