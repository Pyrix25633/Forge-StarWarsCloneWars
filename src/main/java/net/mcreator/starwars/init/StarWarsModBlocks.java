
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.starwars.block.TitaniumOreBlock;
import net.mcreator.starwars.block.TitaniumBlockBlock;
import net.mcreator.starwars.block.RepublicOutpostBoxBlock;
import net.mcreator.starwars.block.RadarBlock;
import net.mcreator.starwars.block.KashyyykDimensionPortalBlock;
import net.mcreator.starwars.block.GeonosisDimensionPortalBlock;
import net.mcreator.starwars.block.FeluciaYellowWoodBlock;
import net.mcreator.starwars.block.FeluciaYellowStairsBlock;
import net.mcreator.starwars.block.FeluciaYellowSlabBlock;
import net.mcreator.starwars.block.FeluciaYellowPressurePlateBlock;
import net.mcreator.starwars.block.FeluciaYellowPlanksBlock;
import net.mcreator.starwars.block.FeluciaYellowLogBlock;
import net.mcreator.starwars.block.FeluciaYellowLeavesBlock;
import net.mcreator.starwars.block.FeluciaYellowFenceGateBlock;
import net.mcreator.starwars.block.FeluciaYellowFenceBlock;
import net.mcreator.starwars.block.FeluciaYellowButtonBlock;
import net.mcreator.starwars.block.FeluciaRedWoodBlock;
import net.mcreator.starwars.block.FeluciaRedStairsBlock;
import net.mcreator.starwars.block.FeluciaRedSlabBlock;
import net.mcreator.starwars.block.FeluciaRedPressurePlateBlock;
import net.mcreator.starwars.block.FeluciaRedPlanksBlock;
import net.mcreator.starwars.block.FeluciaRedLogBlock;
import net.mcreator.starwars.block.FeluciaRedLeavesBlock;
import net.mcreator.starwars.block.FeluciaRedFenceGateBlock;
import net.mcreator.starwars.block.FeluciaRedFenceBlock;
import net.mcreator.starwars.block.FeluciaRedButtonBlock;
import net.mcreator.starwars.block.FeluciaDimensionPortalBlock;
import net.mcreator.starwars.block.FeluciaBlueWoodBlock;
import net.mcreator.starwars.block.FeluciaBlueStairsBlock;
import net.mcreator.starwars.block.FeluciaBlueSlabBlock;
import net.mcreator.starwars.block.FeluciaBluePressurePlateBlock;
import net.mcreator.starwars.block.FeluciaBluePlanksBlock;
import net.mcreator.starwars.block.FeluciaBlueLogBlock;
import net.mcreator.starwars.block.FeluciaBlueLeavesBlock;
import net.mcreator.starwars.block.FeluciaBlueFenceGateBlock;
import net.mcreator.starwars.block.FeluciaBlueFenceBlock;
import net.mcreator.starwars.block.FeluciaBlueButtonBlock;
import net.mcreator.starwars.block.CloneArmorCustomizerBlock;
import net.mcreator.starwars.StarWarsMod;

public class StarWarsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StarWarsMod.MODID);
	public static final RegistryObject<Block> REPUBLIC_OUTPOST_BOX = REGISTRY.register("republic_outpost_box", () -> new RepublicOutpostBoxBlock());
	public static final RegistryObject<Block> CLONE_ARMOR_CUSTOMIZER = REGISTRY.register("clone_armor_customizer",
			() -> new CloneArmorCustomizerBlock());
	public static final RegistryObject<Block> RADAR = REGISTRY.register("radar", () -> new RadarBlock());
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> GEONOSIS_DIMENSION_PORTAL = REGISTRY.register("geonosis_dimension_portal",
			() -> new GeonosisDimensionPortalBlock());
	public static final RegistryObject<Block> KASHYYYK_DIMENSION_PORTAL = REGISTRY.register("kashyyyk_dimension_portal",
			() -> new KashyyykDimensionPortalBlock());
	public static final RegistryObject<Block> FELUCIA_DIMENSION_PORTAL = REGISTRY.register("felucia_dimension_portal",
			() -> new FeluciaDimensionPortalBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_WOOD = REGISTRY.register("felucia_blue_wood", () -> new FeluciaBlueWoodBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_LOG = REGISTRY.register("felucia_blue_log", () -> new FeluciaBlueLogBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_PLANKS = REGISTRY.register("felucia_blue_planks", () -> new FeluciaBluePlanksBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_LEAVES = REGISTRY.register("felucia_blue_leaves", () -> new FeluciaBlueLeavesBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_STAIRS = REGISTRY.register("felucia_blue_stairs", () -> new FeluciaBlueStairsBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_SLAB = REGISTRY.register("felucia_blue_slab", () -> new FeluciaBlueSlabBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_FENCE = REGISTRY.register("felucia_blue_fence", () -> new FeluciaBlueFenceBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_FENCE_GATE = REGISTRY.register("felucia_blue_fence_gate",
			() -> new FeluciaBlueFenceGateBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_PRESSURE_PLATE = REGISTRY.register("felucia_blue_pressure_plate",
			() -> new FeluciaBluePressurePlateBlock());
	public static final RegistryObject<Block> FELUCIA_BLUE_BUTTON = REGISTRY.register("felucia_blue_button", () -> new FeluciaBlueButtonBlock());
	public static final RegistryObject<Block> FELUCIA_RED_WOOD = REGISTRY.register("felucia_red_wood", () -> new FeluciaRedWoodBlock());
	public static final RegistryObject<Block> FELUCIA_RED_LOG = REGISTRY.register("felucia_red_log", () -> new FeluciaRedLogBlock());
	public static final RegistryObject<Block> FELUCIA_RED_PLANKS = REGISTRY.register("felucia_red_planks", () -> new FeluciaRedPlanksBlock());
	public static final RegistryObject<Block> FELUCIA_RED_LEAVES = REGISTRY.register("felucia_red_leaves", () -> new FeluciaRedLeavesBlock());
	public static final RegistryObject<Block> FELUCIA_RED_STAIRS = REGISTRY.register("felucia_red_stairs", () -> new FeluciaRedStairsBlock());
	public static final RegistryObject<Block> FELUCIA_RED_SLAB = REGISTRY.register("felucia_red_slab", () -> new FeluciaRedSlabBlock());
	public static final RegistryObject<Block> FELUCIA_RED_FENCE = REGISTRY.register("felucia_red_fence", () -> new FeluciaRedFenceBlock());
	public static final RegistryObject<Block> FELUCIA_RED_FENCE_GATE = REGISTRY.register("felucia_red_fence_gate",
			() -> new FeluciaRedFenceGateBlock());
	public static final RegistryObject<Block> FELUCIA_RED_PRESSURE_PLATE = REGISTRY.register("felucia_red_pressure_plate",
			() -> new FeluciaRedPressurePlateBlock());
	public static final RegistryObject<Block> FELUCIA_RED_BUTTON = REGISTRY.register("felucia_red_button", () -> new FeluciaRedButtonBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_WOOD = REGISTRY.register("felucia_yellow_wood", () -> new FeluciaYellowWoodBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_LOG = REGISTRY.register("felucia_yellow_log", () -> new FeluciaYellowLogBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_PLANKS = REGISTRY.register("felucia_yellow_planks",
			() -> new FeluciaYellowPlanksBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_LEAVES = REGISTRY.register("felucia_yellow_leaves",
			() -> new FeluciaYellowLeavesBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_STAIRS = REGISTRY.register("felucia_yellow_stairs",
			() -> new FeluciaYellowStairsBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_SLAB = REGISTRY.register("felucia_yellow_slab", () -> new FeluciaYellowSlabBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_FENCE = REGISTRY.register("felucia_yellow_fence", () -> new FeluciaYellowFenceBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_FENCE_GATE = REGISTRY.register("felucia_yellow_fence_gate",
			() -> new FeluciaYellowFenceGateBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_PRESSURE_PLATE = REGISTRY.register("felucia_yellow_pressure_plate",
			() -> new FeluciaYellowPressurePlateBlock());
	public static final RegistryObject<Block> FELUCIA_YELLOW_BUTTON = REGISTRY.register("felucia_yellow_button",
			() -> new FeluciaYellowButtonBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RepublicOutpostBoxBlock.registerRenderLayer();
			CloneArmorCustomizerBlock.registerRenderLayer();
			RadarBlock.registerRenderLayer();
			GeonosisDimensionPortalBlock.registerRenderLayer();
			KashyyykDimensionPortalBlock.registerRenderLayer();
			FeluciaDimensionPortalBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			FeluciaBlueLeavesBlock.blockColorLoad(event);
			FeluciaRedLeavesBlock.blockColorLoad(event);
			FeluciaYellowLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			FeluciaBlueLeavesBlock.itemColorLoad(event);
			FeluciaRedLeavesBlock.itemColorLoad(event);
			FeluciaYellowLeavesBlock.itemColorLoad(event);
		}
	}
}
