
package net.rupyber_studios.star_wars_clone_wars.item;

import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModTabs;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiskRepublicItem extends RecordItem {
	public MusicDiskRepublicItem() {
		super(0, StarWarsModSounds.REGISTRY.get(new ResourceLocation("star_wars:record.republic")),
				new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC).stacksTo(1).rarity(Rarity.RARE));
	}
}
