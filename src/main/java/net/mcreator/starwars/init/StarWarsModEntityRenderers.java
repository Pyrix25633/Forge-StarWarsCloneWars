
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwars.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.starwars.client.renderer.SeparatistTankRenderer;
import net.mcreator.starwars.client.renderer.RepublicTankRenderer;
import net.mcreator.starwars.client.renderer.RepublicTankAutoRenderer;
import net.mcreator.starwars.client.renderer.RepublicSpeederRenderer;
import net.mcreator.starwars.client.renderer.DroidSecurityRenderer;
import net.mcreator.starwars.client.renderer.DroidSecurityKashyyykRenderer;
import net.mcreator.starwars.client.renderer.DroidRenderer;
import net.mcreator.starwars.client.renderer.DroidPilotRenderer;
import net.mcreator.starwars.client.renderer.DroidPilotKashyyykRenderer;
import net.mcreator.starwars.client.renderer.DroidKashyyykRenderer;
import net.mcreator.starwars.client.renderer.DroidCommanderRenderer;
import net.mcreator.starwars.client.renderer.DroidCommanderKashyyykRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperSergeantRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperLiutenantRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperGuardRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCommanderWolffeRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCommanderRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCommanderPondsRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCommanderGreeRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCommanderFoxRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCommanderCodyRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCommanderBlyRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCommanderAppoRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCaptainRexRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperCaptainRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooperBombRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooper91stRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooper501stRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooper41stRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooper327thRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooper25633rdRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooper212thRenderer;
import net.mcreator.starwars.client.renderer.CloneTrooper104thRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarWarsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StarWarsModEntities.BLASTER_DC_15S.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.BLASTER_DC_17.get(), ThrownItemRenderer::new);
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
		event.registerEntityRenderer(StarWarsModEntities.BLASTER_E_5.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.REPUBBLIC_TANK_SHOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StarWarsModEntities.SEPARATIST_TANK_SHOT.get(), ThrownItemRenderer::new);
	}
}
