
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starwars.client.model.ModelHelmetSunvisor;
import net.mcreator.starwars.client.model.ModelHelmetPlain;
import net.mcreator.starwars.client.model.ModelHelmetMacros;
import net.mcreator.starwars.client.model.ModelHelmetAntenna;
import net.mcreator.starwars.client.model.ModelChestplatePlain;
import net.mcreator.starwars.client.model.ModelChestplatePauldron;
import net.mcreator.starwars.client.model.ModelChestplateJetpack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarWarsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelChestplateJetpack.LAYER_LOCATION, ModelChestplateJetpack::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetPlain.LAYER_LOCATION, ModelHelmetPlain::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetMacros.LAYER_LOCATION, ModelHelmetMacros::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetAntenna.LAYER_LOCATION, ModelHelmetAntenna::createBodyLayer);
		event.registerLayerDefinition(ModelChestplatePauldron.LAYER_LOCATION, ModelChestplatePauldron::createBodyLayer);
		event.registerLayerDefinition(ModelChestplatePlain.LAYER_LOCATION, ModelChestplatePlain::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetSunvisor.LAYER_LOCATION, ModelHelmetSunvisor::createBodyLayer);
	}
}
