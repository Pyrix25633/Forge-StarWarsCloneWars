
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.RepublicTankAutoEntity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelRepublicTank;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RepublicTankAutoRenderer extends MobRenderer<RepublicTankAutoEntity, ModelRepublicTank<RepublicTankAutoEntity>> {
	public RepublicTankAutoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRepublicTank(context.bakeLayer(ModelRepublicTank.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(RepublicTankAutoEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/republic_tank.png");
	}
}
