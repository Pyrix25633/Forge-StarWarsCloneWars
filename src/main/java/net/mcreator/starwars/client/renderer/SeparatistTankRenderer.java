
package net.mcreator.starwars.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.starwars.entity.SeparatistTankEntity;
import net.mcreator.starwars.client.model.ModelSeparatistTank;

public class SeparatistTankRenderer extends MobRenderer<SeparatistTankEntity, ModelSeparatistTank<SeparatistTankEntity>> {
	public SeparatistTankRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSeparatistTank(context.bakeLayer(ModelSeparatistTank.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeparatistTankEntity entity) {
		return new ResourceLocation("star_wars:textures/entities/separatist_tank.png");
	}
}
