// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrepublic_tank extends EntityModel<Entity> {
	private final ModelRenderer tank;

	public Modelrepublic_tank() {
		textureWidth = 512;
		textureHeight = 256;

		tank = new ModelRenderer(this);
		tank.setRotationPoint(0.0F, 21.0F, 0.0F);
		tank.setTextureOffset(210, 73).addBox(16.0F, -5.0F, -15.0F, 16.0F, 5.0F, 30.0F, 0.0F, true);
		tank.setTextureOffset(210, 73).addBox(-32.0F, -5.0F, -15.0F, 16.0F, 5.0F, 30.0F, 0.0F, false);
		tank.setTextureOffset(283, 0).addBox(16.0F, -10.0F, -9.0F, 14.0F, 5.0F, 22.0F, 0.0F, true);
		tank.setTextureOffset(283, 0).addBox(-30.0F, -10.0F, -9.0F, 14.0F, 5.0F, 22.0F, 0.0F, false);
		tank.setTextureOffset(354, 31).addBox(16.0F, -5.0F, -41.0F, 13.0F, 5.0F, 26.0F, 0.0F, true);
		tank.setTextureOffset(354, 31).addBox(-29.0F, -5.0F, -41.0F, 13.0F, 5.0F, 26.0F, 0.0F, false);
		tank.setTextureOffset(355, 0).addBox(16.0F, -5.0F, -67.0F, 16.0F, 5.0F, 26.0F, 0.0F, true);
		tank.setTextureOffset(355, 0).addBox(-32.0F, -5.0F, -67.0F, 16.0F, 5.0F, 26.0F, 0.0F, false);
		tank.setTextureOffset(439, 0).addBox(16.0F, -4.0F, -93.0F, 11.0F, 4.0F, 26.0F, 0.0F, true);
		tank.setTextureOffset(439, 0).addBox(-27.0F, -4.0F, -93.0F, 11.0F, 4.0F, 26.0F, 0.0F, false);
		tank.setTextureOffset(471, 30).addBox(16.0F, -6.0F, -77.0F, 11.0F, 2.0F, 10.0F, 0.0F, true);
		tank.setTextureOffset(263, 0).addBox(5.0F, -8.0F, -61.0F, 11.0F, 2.0F, 10.0F, 0.0F, true);
		tank.setTextureOffset(263, 0).addBox(-16.0F, -8.0F, -61.0F, 11.0F, 2.0F, 10.0F, 0.0F, false);
		tank.setTextureOffset(471, 30).addBox(-27.0F, -6.0F, -77.0F, 11.0F, 2.0F, 10.0F, 0.0F, false);
		tank.setTextureOffset(374, 31).addBox(16.0F, -8.0F, -67.0F, 11.0F, 3.0F, 58.0F, 0.0F, true);
		tank.setTextureOffset(0, 0).addBox(-16.0F, -10.0F, -51.0F, 32.0F, 4.0F, 63.0F, 0.0F, false);
		tank.setTextureOffset(0, 99).addBox(-16.0F, -24.0F, -22.0F, 32.0F, 14.0F, 32.0F, 0.0F, false);
		tank.setTextureOffset(171, 121).addBox(16.0F, -22.0F, -4.0F, 3.0F, 12.0F, 12.0F, 0.0F, true);
		tank.setTextureOffset(0, 193).addBox(19.0F, -21.0F, -5.0F, 5.0F, 10.0F, 16.0F, 0.0F, false);
		tank.setTextureOffset(0, 193).addBox(-24.0F, -21.0F, -5.0F, 5.0F, 10.0F, 16.0F, 0.0F, true);
		tank.setTextureOffset(0, 221).addBox(-22.0F, -19.0F, -19.0F, 3.0F, 6.0F, 14.0F, 0.0F, false);
		tank.setTextureOffset(0, 221).addBox(19.0F, -19.0F, -19.0F, 3.0F, 6.0F, 14.0F, 0.0F, true);
		tank.setTextureOffset(0, 241).addBox(19.0F, -18.0F, -63.0F, 3.0F, 4.0F, 9.0F, 0.0F, true);
		tank.setTextureOffset(0, 241).addBox(-22.0F, -18.0F, -63.0F, 3.0F, 4.0F, 9.0F, 0.0F, false);
		tank.setTextureOffset(0, 219).addBox(20.0F, -17.0F, -54.0F, 1.0F, 2.0F, 35.0F, 0.0F, true);
		tank.setTextureOffset(0, 219).addBox(-21.0F, -17.0F, -54.0F, 1.0F, 2.0F, 35.0F, 0.0F, false);
		tank.setTextureOffset(171, 121).addBox(-19.0F, -22.0F, -4.0F, 3.0F, 12.0F, 12.0F, 0.0F, false);
		tank.setTextureOffset(429, 151).addBox(-15.0F, -19.0F, -34.0F, 30.0F, 9.0F, 12.0F, 0.0F, false);
		tank.setTextureOffset(429, 173).addBox(-15.0F, -15.0F, -46.0F, 30.0F, 5.0F, 12.0F, 0.0F, false);
		tank.setTextureOffset(385, 173).addBox(-5.0F, -19.0F, -46.0F, 10.0F, 4.0F, 12.0F, 0.0F, false);
		tank.setTextureOffset(383, 157).addBox(-5.0F, -21.0F, -34.0F, 10.0F, 2.0F, 12.0F, 0.0F, false);
		tank.setTextureOffset(132, 131).addBox(-5.0F, -27.0F, -22.0F, 10.0F, 3.0F, 11.0F, 0.0F, false);
		tank.setTextureOffset(485, 244).addBox(-5.0F, -15.0F, -50.0F, 10.0F, 5.0F, 4.0F, 0.0F, false);
		tank.setTextureOffset(63, 158).addBox(-15.0F, -29.0F, -11.0F, 30.0F, 5.0F, 20.0F, 0.0F, false);
		tank.setTextureOffset(63, 201).addBox(-8.0F, -32.0F, -8.0F, 16.0F, 3.0F, 2.0F, 0.0F, false);
		tank.setTextureOffset(109, 198).addBox(-8.0F, -32.0F, 6.0F, 16.0F, 3.0F, 2.0F, 0.0F, false);
		tank.setTextureOffset(178, 157).addBox(-8.0F, -48.0F, 8.0F, 16.0F, 16.0F, 2.0F, 0.0F, false);
		tank.setTextureOffset(66, 214).addBox(6.0F, -32.0F, -6.0F, 2.0F, 3.0F, 12.0F, 0.0F, false);
		tank.setTextureOffset(108, 216).addBox(-8.0F, -32.0F, -6.0F, 2.0F, 3.0F, 12.0F, 0.0F, false);
		tank.setTextureOffset(374, 31).addBox(-27.0F, -8.0F, -67.0F, 11.0F, 3.0F, 58.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		tank.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}