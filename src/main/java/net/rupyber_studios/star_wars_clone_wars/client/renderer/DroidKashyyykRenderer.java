
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.DroidKashyyykEntity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelDroid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DroidKashyyykRenderer extends MobRenderer<DroidKashyyykEntity, ModelDroid<DroidKashyyykEntity>> {
	public DroidKashyyykRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDroid(context.bakeLayer(ModelDroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DroidKashyyykEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/droid_kashyyyk.png");
	}
}
