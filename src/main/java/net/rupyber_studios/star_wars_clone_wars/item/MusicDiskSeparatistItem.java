
package net.rupyber_studios.star_wars_clone_wars.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiskSeparatistItem extends RecordItem {
	public MusicDiskSeparatistItem() {
		super(1, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("star_wars:record.separatist")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 5260);
	}
}
