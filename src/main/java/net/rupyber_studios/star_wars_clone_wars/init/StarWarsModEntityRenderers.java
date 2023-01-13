
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rupyber_studios.star_wars_clone_wars.init;

import net.rupyber_studios.star_wars_clone_wars.client.renderer.SeparatistTankShotRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.SeparatistTankRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.RepublicTankRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.RepublicTankAutoRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.RepublicSpeederRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.RepubblicTankShotRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.DroidSecurityRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.DroidSecurityKashyyykRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.DroidRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.DroidPilotRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.DroidPilotKashyyykRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.DroidKashyyykRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.DroidCommanderRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.DroidCommanderKashyyykRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperSergeantRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperLiutenantRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperGuardRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCommanderWolffeRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCommanderRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCommanderPondsRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCommanderGreeRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCommanderFoxRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCommanderCodyRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCommanderBlyRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCommanderAppoRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCaptainRexRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperCaptainRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooperBombRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooper91stRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooper501stRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooper41stRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooper327thRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooper25633rdRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooper212thRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.CloneTrooper104thRenderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.BlasterE5Renderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.BlasterDc17Renderer;
import net.rupyber_studios.star_wars_clone_wars.client.renderer.BlasterDc15sRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarWarsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StarWarsModEntities.BLASTER_DC_15S.get(), BlasterDc15sRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.BLASTER_DC_17.get(), BlasterDc17Renderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER.get(), CloneTrooperRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_BOMB.get(), CloneTrooperBombRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_SERGEANT.get(), CloneTrooperSergeantRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_LIUTENANT.get(), CloneTrooperLiutenantRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_CAPTAIN.get(), CloneTrooperCaptainRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_COMMANDER.get(), CloneTrooperCommanderRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_41ST.get(), CloneTrooper41stRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_COMMANDER_GREE.get(), CloneTrooperCommanderGreeRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_91ST.get(), CloneTrooper91stRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_COMMANDER_PONDS.get(), CloneTrooperCommanderPondsRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_104TH.get(), CloneTrooper104thRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_COMMANDER_WOLFFE.get(), CloneTrooperCommanderWolffeRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_212TH.get(), CloneTrooper212thRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_COMMANDER_CODY.get(), CloneTrooperCommanderCodyRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_327TH.get(), CloneTrooper327thRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_COMMANDER_BLY.get(), CloneTrooperCommanderBlyRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_501ST.get(), CloneTrooper501stRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_CAPTAIN_REX.get(), CloneTrooperCaptainRexRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_COMMANDER_APPO.get(), CloneTrooperCommanderAppoRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_GUARD.get(), CloneTrooperGuardRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_COMMANDER_FOX.get(), CloneTrooperCommanderFoxRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.CLONE_TROOPER_25633RD.get(), CloneTrooper25633rdRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.REPUBLIC_TANK.get(), RepublicTankRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.REPUBLIC_TANK_AUTO.get(), RepublicTankAutoRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.REPUBLIC_SPEEDER.get(), RepublicSpeederRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.THERMAL_DETONATOR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.DROID.get(), DroidRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.DROID_COMMANDER.get(), DroidCommanderRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.DROID_PILOT.get(), DroidPilotRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.DROID_SECURITY.get(), DroidSecurityRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.DROID_KASHYYYK.get(), DroidKashyyykRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.DROID_COMMANDER_KASHYYYK.get(), DroidCommanderKashyyykRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.DROID_PILOT_KASHYYYK.get(), DroidPilotKashyyykRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.DROID_SECURITY_KASHYYYK.get(), DroidSecurityKashyyykRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.SEPARATIST_TANK.get(), SeparatistTankRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.BLASTER_E_5.get(), BlasterE5Renderer::new);
		event.registerEntityRenderer(StarWarsModEntities.REPUBBLIC_TANK_SHOT.get(), RepubblicTankShotRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.SEPARATIST_TANK_SHOT.get(), SeparatistTankShotRenderer::new);
	}
}
