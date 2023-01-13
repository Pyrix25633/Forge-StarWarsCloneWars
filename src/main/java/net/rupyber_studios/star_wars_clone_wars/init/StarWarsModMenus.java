
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.rupyber_studios.star_wars_clone_wars.world.inventory.RepubblicTankGuiMenu;
import net.rupyber_studios.star_wars_clone_wars.world.inventory.CloneArmorCustomizerGuiMenu;
import net.rupyber_studios.star_wars_clone_wars.world.inventory.BackpackGuiMenu;
import net.rupyber_studios.star_wars_clone_wars.StarWarsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class StarWarsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StarWarsMod.MODID);
	public static final RegistryObject<MenuType<CloneArmorCustomizerGuiMenu>> CLONE_ARMOR_CUSTOMIZER_GUI = REGISTRY
			.register("clone_armor_customizer_gui", () -> IForgeMenuType.create(CloneArmorCustomizerGuiMenu::new));
	public static final RegistryObject<MenuType<RepubblicTankGuiMenu>> REPUBBLIC_TANK_GUI = REGISTRY.register("repubblic_tank_gui",
			() -> IForgeMenuType.create(RepubblicTankGuiMenu::new));
	public static final RegistryObject<MenuType<BackpackGuiMenu>> BACKPACK_GUI = REGISTRY.register("backpack_gui",
			() -> IForgeMenuType.create(BackpackGuiMenu::new));
}
