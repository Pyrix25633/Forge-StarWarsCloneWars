
package net.mcreator.starwars.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.starwars.init.StarWarsModTabs;

public class BlasterMunitionsItem extends Item {
	public BlasterMunitionsItem() {
		super(new Item.Properties().tab(StarWarsModTabs.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
