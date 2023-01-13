
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.DroidCommanderEntity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelDroid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DroidCommanderRenderer extends MobRenderer<DroidCommanderEntity, ModelDroid<DroidCommanderEntity>> {
	public DroidCommanderRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDroid(context.bakeLayer(ModelDroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DroidCommanderEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/droid_commander.png");
	}
}
