// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRepublicTank<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "republictank"), "main");
	private final ModelPart tank;

	public ModelRepublicTank(ModelPart root) {
		this.tank = root.getChild("tank");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tank = partdefinition.addOrReplaceChild("tank", CubeListBuilder.create().texOffs(210, 73)
				.addBox(-32.0F, -5.0F, -15.0F, 16.0F, 5.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(210, 73).mirror()
				.addBox(16.0F, -5.0F, -15.0F, 16.0F, 5.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(283, 0).addBox(-30.0F, -10.0F, -9.0F, 14.0F, 5.0F, 22.0F, new CubeDeformation(0.0F))
				.texOffs(283, 0).mirror().addBox(16.0F, -10.0F, -9.0F, 14.0F, 5.0F, 22.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(354, 31)
				.addBox(-29.0F, -5.0F, -41.0F, 13.0F, 5.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(354, 31).mirror()
				.addBox(16.0F, -5.0F, -41.0F, 13.0F, 5.0F, 26.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(355, 0).addBox(-32.0F, -5.0F, -67.0F, 16.0F, 5.0F, 26.0F, new CubeDeformation(0.0F))
				.texOffs(355, 0).mirror().addBox(16.0F, -5.0F, -67.0F, 16.0F, 5.0F, 26.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(439, 0)
				.addBox(-27.0F, -4.0F, -93.0F, 11.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(439, 0).mirror()
				.addBox(16.0F, -4.0F, -93.0F, 11.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(470, 30).addBox(-27.0F, -6.0F, -77.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(470, 30).mirror().addBox(16.0F, -6.0F, -77.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(263, 0)
				.addBox(-16.0F, -8.0F, -61.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(263, 0).mirror()
				.addBox(5.0F, -8.0F, -61.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(374, 31).addBox(-27.0F, -8.0F, -67.0F, 11.0F, 3.0F, 58.0F, new CubeDeformation(0.0F))
				.texOffs(374, 31).mirror().addBox(16.0F, -8.0F, -67.0F, 11.0F, 3.0F, 58.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 0)
				.addBox(-16.0F, -10.0F, -51.0F, 32.0F, 4.0F, 63.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
				.addBox(-16.0F, -24.0F, -22.0F, 32.0F, 14.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(171, 121)
				.addBox(-19.0F, -22.0F, -4.0F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(171, 121).mirror()
				.addBox(16.0F, -22.0F, -4.0F, 3.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 193).mirror().addBox(-24.0F, -21.0F, -5.0F, 5.0F, 10.0F, 16.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 193)
				.addBox(19.0F, -21.0F, -5.0F, 5.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 221)
				.addBox(-22.0F, -19.0F, -19.0F, 3.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 221).mirror()
				.addBox(19.0F, -19.0F, -19.0F, 3.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 241).addBox(-22.0F, -18.0F, -63.0F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(0, 241).mirror().addBox(19.0F, -18.0F, -63.0F, 3.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 219)
				.addBox(-21.0F, -17.0F, -54.0F, 1.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)).texOffs(0, 219).mirror()
				.addBox(20.0F, -17.0F, -54.0F, 1.0F, 2.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(429, 151).addBox(-15.0F, -19.0F, -34.0F, 30.0F, 9.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(429, 173).addBox(-15.0F, -15.0F, -46.0F, 30.0F, 5.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(385, 173).addBox(-5.0F, -19.0F, -46.0F, 10.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(383, 157).addBox(-5.0F, -21.0F, -34.0F, 10.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(132, 131).addBox(-5.0F, -27.0F, -22.0F, 10.0F, 3.0F, 11.0F, new CubeDeformation(0.0F))
				.texOffs(485, 244).addBox(-5.0F, -15.0F, -50.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(63, 158).addBox(-15.0F, -26.0F, -11.0F, 30.0F, 2.0F, 20.0F, new CubeDeformation(0.0F))
				.texOffs(63, 201).addBox(-8.0F, -29.0F, -8.0F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(109, 198).addBox(-8.0F, -29.0F, 6.0F, 16.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(178, 157).addBox(-8.0F, -45.0F, 8.0F, 16.0F, 16.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 214).addBox(-8.0F, -29.0F, -6.0F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(108, 216).addBox(6.0F, -29.0F, -6.0F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 20.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 256);
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