
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.rupyber_studios.star_wars_clone_wars.client.model.ModelSeparatistTank;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelRepublicTank;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelRepublicSpeeder;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelLeggingsSkirt;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelLeggingsPlain;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelLaserShot;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelHelmetSunvisor;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelHelmetPlain;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelHelmetMacros;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelHelmetAntenna;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelDroid;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelChestplatePlain;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelChestplatePauldron;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelChestplateJetpack;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelBootsPlain;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarWarsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelChestplateJetpack.LAYER_LOCATION, ModelChestplateJetpack::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetPlain.LAYER_LOCATION, ModelHelmetPlain::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetMacros.LAYER_LOCATION, ModelHelmetMacros::createBodyLayer);
		event.registerLayerDefinition(ModelLeggingsSkirt.LAYER_LOCATION, ModelLeggingsSkirt::createBodyLayer);
		event.registerLayerDefinition(ModelBootsPlain.LAYER_LOCATION, ModelBootsPlain::createBodyLayer);
		event.registerLayerDefinition(ModelRepublicTank.LAYER_LOCATION, ModelRepublicTank::createBodyLayer);
		event.registerLayerDefinition(ModelSeparatistTank.LAYER_LOCATION, ModelSeparatistTank::createBodyLayer);
		event.registerLayerDefinition(ModelLeggingsPlain.LAYER_LOCATION, ModelLeggingsPlain::createBodyLayer);
		event.registerLayerDefinition(ModelDroid.LAYER_LOCATION, ModelDroid::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetAntenna.LAYER_LOCATION, ModelHelmetAntenna::createBodyLayer);
		event.registerLayerDefinition(ModelChestplatePauldron.LAYER_LOCATION, ModelChestplatePauldron::createBodyLayer);
		event.registerLayerDefinition(ModelChestplatePlain.LAYER_LOCATION, ModelChestplatePlain::createBodyLayer);
		event.registerLayerDefinition(ModelRepublicSpeeder.LAYER_LOCATION, ModelRepublicSpeeder::createBodyLayer);
		event.registerLayerDefinition(ModelHelmetSunvisor.LAYER_LOCATION, ModelHelmetSunvisor::createBodyLayer);
		event.registerLayerDefinition(ModelLaserShot.LAYER_LOCATION, ModelLaserShot::createBodyLayer);
	}
}
