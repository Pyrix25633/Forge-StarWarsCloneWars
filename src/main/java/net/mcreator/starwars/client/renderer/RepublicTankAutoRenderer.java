
package net.mcreator.starwars.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starwars.entity.RepublicTankAutoEntity;
import net.mcreator.starwars.client.model.ModelRepublicTank;

public class RepublicTankAutoRenderer extends MobRenderer<RepublicTankAutoEntity, ModelRepublicTank<RepublicTankAutoEntity>> {
	public RepublicTankAutoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRepublicTank(context.bakeLayer(ModelRepublicTank.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(RepublicTankAutoEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/republic_tank.png");
	}
}
