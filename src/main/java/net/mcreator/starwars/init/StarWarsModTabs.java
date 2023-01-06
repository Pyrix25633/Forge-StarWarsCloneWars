
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class StarWarsModTabs {
	public static CreativeModeTab TAB_MATERIALS;
	public static CreativeModeTab TAB_SEPARATIST;
	public static CreativeModeTab TAB_REPUBLIC;

	public static void load() {
		TAB_MATERIALS = new CreativeModeTab("tabmaterials") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(StarWarsModItems.RAW_TITANIUM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SEPARATIST = new CreativeModeTab("tabseparatist") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(StarWarsModItems.MUSIC_DISK_SEPARATIST.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_REPUBLIC = new CreativeModeTab("tabrepublic") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(StarWarsModItems.CLONE_TROOPER_NORMAL_ARMOR_HELMET.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
