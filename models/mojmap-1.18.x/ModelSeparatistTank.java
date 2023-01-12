// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSeparatistTank<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "separatisttank"), "main");
	private final ModelPart tank;

	public ModelSeparatistTank(ModelPart root) {
		this.tank = root.getChild("tank");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tank = partdefinition.addOrReplaceChild("tank", CubeListBuilder.create().texOffs(0, 202)
				.addBox(-16.0F, -6.0F, -48.0F, 32.0F, 6.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(112, 204)
				.addBox(-24.0F, -6.0F, -40.0F, 8.0F, 6.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(112, 204).mirror()
				.addBox(16.0F, -6.0F, -40.0F, 8.0F, 6.0F, 40.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(168, 205).addBox(-32.0F, -6.0F, -32.0F, 8.0F, 6.0F, 32.0F, new CubeDeformation(0.0F))
				.texOffs(168, 205).mirror().addBox(24.0F, -6.0F, -32.0F, 8.0F, 6.0F, 32.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 168)
				.addBox(-16.0F, -14.0F, -33.0F, 32.0F, 8.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(165, 158)
				.addBox(-14.0F, -22.0F, -25.0F, 28.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(117, 188)
				.addBox(-12.0F, -26.0F, -19.0F, 24.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 121)
				.addBox(-16.0F, -31.0F, -7.0F, 32.0F, 25.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(161, 114)
				.addBox(-14.0F, -33.0F, -5.0F, 28.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(40, 73)
				.addBox(-16.0F, -31.0F, 15.0F, 32.0F, 8.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(128, 84)
				.addBox(-22.0F, -41.0F, 17.0F, 44.0F, 10.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(86, 120)
				.addBox(-8.0F, -41.0F, 1.0F, 16.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(108, 136)
				.addBox(-2.0F, -40.0F, -47.0F, 4.0F, 4.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(177, 40)
				.addBox(-10.0F, -44.0F, 22.0F, 20.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(172, 64)
				.addBox(-16.0F, -41.0F, 37.0F, 32.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 230)
				.addBox(-22.0F, -30.0F, 5.0F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 230)
				.addBox(-22.0F, -14.0F, -7.0F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 230)
				.addBox(-22.0F, -22.0F, -1.0F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 230).mirror()
				.addBox(16.0F, -14.0F, -7.0F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 230).mirror().addBox(16.0F, -22.0F, -1.0F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 230).mirror()
				.addBox(16.0F, -30.0F, 5.0F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 105)
				.addBox(-28.0F, -30.0F, -5.0F, 12.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 105).mirror()
				.addBox(16.0F, -30.0F, -5.0F, 12.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 87)
				.addBox(-32.0F, -30.0F, -6.0F, 4.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 87).mirror()
				.addBox(28.0F, -30.0F, -6.0F, 4.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 73)
				.addBox(-31.0F, -27.0F, -18.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 73).mirror()
				.addBox(29.0F, -27.0F, -18.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		tank.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}