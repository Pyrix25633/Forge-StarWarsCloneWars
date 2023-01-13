
package net.rupyber_studios.star_wars_clone_wars.item;

import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModTabs;
import net.rupyber_studios.star_wars_clone_wars.init.StarWarsModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PlastoidPickaxeItem extends PickaxeItem {
	public PlastoidPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1741;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(StarWarsModItems.PLASTOID_PLATE.get()));
			}
		}, 1, -2.8f, new Item.Properties().tab(StarWarsModTabs.TAB_MATERIALS));
	}
}
