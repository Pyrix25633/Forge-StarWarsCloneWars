
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.CloneTrooperCommanderWolffeEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class CloneTrooperCommanderWolffeRenderer extends HumanoidMobRenderer<CloneTrooperCommanderWolffeEntity, HumanoidModel<CloneTrooperCommanderWolffeEntity>> {
	public CloneTrooperCommanderWolffeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(CloneTrooperCommanderWolffeEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/clone.png");
	}
}
