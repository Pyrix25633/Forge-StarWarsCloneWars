
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class StarWarsModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_BLUE_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_BLUE_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_BLUE_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_BLUE_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_BLUE_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_BLUE_FENCE_GATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_BLUE_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_BLUE_SLAB.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_RED_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_RED_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_RED_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_RED_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_RED_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_RED_FENCE_GATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_RED_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_RED_SLAB.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_YELLOW_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_YELLOW_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_YELLOW_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_YELLOW_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_YELLOW_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_YELLOW_FENCE_GATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_YELLOW_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == StarWarsModBlocks.FELUCIA_YELLOW_SLAB.get().asItem())
			event.setBurnTime(300);
	}
}
