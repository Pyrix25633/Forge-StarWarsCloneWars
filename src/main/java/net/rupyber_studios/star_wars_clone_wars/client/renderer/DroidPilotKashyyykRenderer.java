
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.DroidPilotKashyyykEntity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelDroid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DroidPilotKashyyykRenderer extends MobRenderer<DroidPilotKashyyykEntity, ModelDroid<DroidPilotKashyyykEntity>> {
	public DroidPilotKashyyykRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDroid(context.bakeLayer(ModelDroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DroidPilotKashyyykEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/droid_pilot_kashyyyk.png");
	}
}
