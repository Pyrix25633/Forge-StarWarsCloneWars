
package net.mcreator.starwars.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starwars.entity.DroidPilotEntity;
import net.mcreator.starwars.client.model.ModelDroid;

public class DroidPilotRenderer extends MobRenderer<DroidPilotEntity, ModelDroid<DroidPilotEntity>> {
	public DroidPilotRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDroid(context.bakeLayer(ModelDroid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DroidPilotEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/droid_pilot.png");
	}
}
