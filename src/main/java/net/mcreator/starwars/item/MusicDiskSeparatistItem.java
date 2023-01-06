
package net.mcreator.starwars.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwars.init.StarWarsModTabs;
import net.mcreator.starwars.init.StarWarsModSounds;

public class MusicDiskSeparatistItem extends RecordItem {
	public MusicDiskSeparatistItem() {
		super(0, StarWarsModSounds.REGISTRY.get(new ResourceLocation("star_wars:record.separatist")),
				new Item.Properties().tab(StarWarsModTabs.TAB_SEPARATIST).stacksTo(1).rarity(Rarity.RARE));
	}
}
