
package net.mcreator.starwars.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starwars.entity.RepublicSpeederEntity;
import net.mcreator.starwars.client.model.ModelRepublicSpeeder;

public class RepublicSpeederRenderer extends MobRenderer<RepublicSpeederEntity, ModelRepublicSpeeder<RepublicSpeederEntity>> {
	public RepublicSpeederRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRepublicSpeeder(context.bakeLayer(ModelRepublicSpeeder.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(RepublicSpeederEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/speeder.png");
	}
}
