
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.SeparatistTankEntity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelSeparatistTank;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SeparatistTankRenderer extends MobRenderer<SeparatistTankEntity, ModelSeparatistTank<SeparatistTankEntity>> {
	public SeparatistTankRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSeparatistTank(context.bakeLayer(ModelSeparatistTank.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeparatistTankEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/separatist_tank.png");
	}
}
