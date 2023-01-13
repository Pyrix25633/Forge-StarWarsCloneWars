
package net.rupyber_studios.star_wars_clone_wars.item;

import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class RawTitaniumItem extends Item {
	public RawTitaniumItem() {
		super(new Item.Properties().tab(StarWarsModTabs.TAB_MATERIALS).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
