
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.RepublicSpeederEntity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelRepublicSpeeder;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RepublicSpeederRenderer extends MobRenderer<RepublicSpeederEntity, ModelRepublicSpeeder<RepublicSpeederEntity>> {
	public RepublicSpeederRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRepublicSpeeder(context.bakeLayer(ModelRepublicSpeeder.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(RepublicSpeederEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/speeder.png");
	}
}
