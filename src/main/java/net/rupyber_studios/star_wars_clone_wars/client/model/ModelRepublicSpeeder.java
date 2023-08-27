package net.rupyber_studios.star_wars_clone_wars.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelRepublicSpeeder<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("star_wars", "model_republic_speeder"), "main");
	public final ModelPart speeder;

	public ModelRepublicSpeeder(ModelPart root) {
		this.speeder = root.getChild("speeder");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition speeder = partdefinition.addOrReplaceChild("speeder",
				CubeListBuilder.create().texOffs(68, 128).addBox(-7.0F, -22.0F, 24.0F, 14.0F, 17.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 155).addBox(-8.0F, -28.0F, 8.0F, 16.0F, 26.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 128)
						.mirror().addBox(-14.0F, -20.0F, 8.0F, 6.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 128).addBox(8.0F, -20.0F, 8.0F, 6.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
						.addBox(-7.0F, -6.0F, -71.0F, 14.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 105).addBox(-7.0F, -16.0F, -67.0F, 14.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 77)
						.addBox(-10.0F, -13.0F, -56.0F, 3.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 77).mirror().addBox(7.0F, -13.0F, -56.0F, 3.0F, 6.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(22, 75)
						.addBox(-9.0F, -7.0F, -56.0F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(22, 75).mirror().addBox(8.0F, -7.0F, -56.0F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(50, 102)
						.addBox(-7.0F, -16.0F, -56.0F, 14.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(68, 75).addBox(-7.0F, -16.0F, -40.0F, 14.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-4.0F, -21.0F, -46.0F, 8.0F, 5.0F, 35.0F, new CubeDeformation(0.0F)).texOffs(64, 44).addBox(-8.0F, -16.0F, -24.0F, 16.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(60, 16)
						.addBox(-9.0F, -16.0F, -8.0F, 18.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 38).addBox(-7.0F, -26.0F, -11.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 38).mirror()
						.addBox(5.0F, -26.0F, -11.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 22).addBox(-7.0F, -27.0F, -11.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 22).mirror()
						.addBox(3.0F, -27.0F, -11.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		speeder.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
