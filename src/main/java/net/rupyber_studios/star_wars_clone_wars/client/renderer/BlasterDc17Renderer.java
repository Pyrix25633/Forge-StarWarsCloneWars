package net.rupyber_studios.star_wars_clone_wars.client.renderer;

import net.rupyber_studios.star_wars_clone_wars.entity.BlasterDc17Entity;
import net.rupyber_studios.star_wars_clone_wars.client.model.ModelLaserShot;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BlasterDc17Renderer extends EntityRenderer<BlasterDc17Entity> {
	private static final ResourceLocation texture = new ResourceLocation("star_wars:textures/entities/laser_shot_1.png");
	private final ModelLaserShot model;

	public BlasterDc17Renderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelLaserShot(context.bakeLayer(ModelLaserShot.LAYER_LOCATION));
	}

	@Override
	public void render(BlasterDc17Entity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(BlasterDc17Entity entity) {
		return texture;
	}
}
