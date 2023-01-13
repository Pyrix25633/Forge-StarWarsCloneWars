
package net.rupyber_studios.star_wars_clone_wars.item;

import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CloneTrooperComunicatorItem extends Item {
	public CloneTrooperComunicatorItem() {
		super(new Item.Properties().tab(StarWarsModTabs.TAB_REPUBLIC).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
