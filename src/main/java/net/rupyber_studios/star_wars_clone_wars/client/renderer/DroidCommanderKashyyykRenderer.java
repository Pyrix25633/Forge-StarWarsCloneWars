
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.DroidCommanderKashyyykEntity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelDroid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DroidCommanderKashyyykRenderer extends MobRenderer<DroidCommanderKashyyykEntity, ModelDroid<DroidCommanderKashyyykEntity>> {
	public DroidCommanderKashyyykRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDroid(context.bakeLayer(ModelDroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DroidCommanderKashyyykEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/droid_commander_kashyyyk.png");
	}
}
