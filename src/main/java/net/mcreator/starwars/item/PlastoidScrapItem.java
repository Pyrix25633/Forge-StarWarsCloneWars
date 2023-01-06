
package net.mcreator.starwars.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.starwars.init.StarWarsModTabs;

public class PlastoidScrapItem extends Item {
	public PlastoidScrapItem() {
		super(new Item.Properties().tab(StarWarsModTabs.TAB_MATERIALS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
