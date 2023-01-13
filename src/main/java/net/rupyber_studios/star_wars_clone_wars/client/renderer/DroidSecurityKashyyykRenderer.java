
package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.DroidSecurityKashyyykEntity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelDroid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DroidSecurityKashyyykRenderer extends MobRenderer<DroidSecurityKashyyykEntity, ModelDroid<DroidSecurityKashyyykEntity>> {
	public DroidSecurityKashyyykRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDroid(context.bakeLayer(ModelDroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DroidSecurityKashyyykEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/droid_security_kashyyyk.png");
	}
}
