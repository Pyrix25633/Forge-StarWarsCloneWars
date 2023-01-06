// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelseparatist_tank extends EntityModel<Entity> {
	private final ModelRenderer Tank;

	public Modelseparatist_tank() {
		textureWidth = 256;
		textureHeight = 256;

		Tank = new ModelRenderer(this);
		Tank.setRotationPoint(0.0F, 24.0F, 0.0F);
		Tank.setTextureOffset(0, 202).addBox(-16.0F, -6.0F, -48.0F, 32.0F, 6.0F, 48.0F, 0.0F, false);
		Tank.setTextureOffset(112, 204).addBox(16.0F, -6.0F, -40.0F, 8.0F, 6.0F, 40.0F, 0.0F, true);
		Tank.setTextureOffset(168, 205).addBox(24.0F, -6.0F, -32.0F, 8.0F, 6.0F, 32.0F, 0.0F, true);
		Tank.setTextureOffset(112, 204).addBox(-24.0F, -6.0F, -40.0F, 8.0F, 6.0F, 40.0F, 0.0F, false);
		Tank.setTextureOffset(168, 205).addBox(-32.0F, -6.0F, -32.0F, 8.0F, 6.0F, 32.0F, 0.0F, false);
		Tank.setTextureOffset(0, 168).addBox(-16.0F, -14.0F, -33.0F, 32.0F, 8.0F, 26.0F, 0.0F, false);
		Tank.setTextureOffset(165, 158).addBox(-14.0F, -22.0F, -25.0F, 28.0F, 8.0F, 18.0F, 0.0F, false);
		Tank.setTextureOffset(117, 188).addBox(-12.0F, -26.0F, -19.0F, 24.0F, 4.0F, 12.0F, 0.0F, false);
		Tank.setTextureOffset(0, 121).addBox(-16.0F, -31.0F, -7.0F, 32.0F, 25.0F, 22.0F, 0.0F, false);
		Tank.setTextureOffset(161, 114).addBox(-14.0F, -33.0F, -5.0F, 28.0F, 2.0F, 20.0F, 0.0F, false);
		Tank.setTextureOffset(40, 73).addBox(-16.0F, -31.0F, 15.0F, 32.0F, 8.0F, 22.0F, 0.0F, false);
		Tank.setTextureOffset(128, 84).addBox(-22.0F, -41.0F, 17.0F, 44.0F, 10.0F, 20.0F, 0.0F, false);
		Tank.setTextureOffset(86, 120).addBox(-8.0F, -41.0F, 1.0F, 16.0F, 7.0F, 16.0F, 0.0F, false);
		Tank.setTextureOffset(108, 136).addBox(-2.0F, -40.0F, -47.0F, 4.0F, 4.0F, 48.0F, 0.0F, false);
		Tank.setTextureOffset(177, 40).addBox(-10.0F, -44.0F, 22.0F, 20.0F, 3.0F, 20.0F, 0.0F, false);
		Tank.setTextureOffset(172, 64).addBox(-16.0F, -41.0F, 37.0F, 32.0F, 10.0F, 10.0F, 0.0F, false);
		Tank.setTextureOffset(0, 230).addBox(16.0F, -14.0F, -7.0F, 6.0F, 8.0F, 12.0F, 0.0F, true);
		Tank.setTextureOffset(0, 230).addBox(16.0F, -22.0F, -1.0F, 6.0F, 8.0F, 12.0F, 0.0F, true);
		Tank.setTextureOffset(0, 230).addBox(16.0F, -30.0F, 5.0F, 6.0F, 8.0F, 12.0F, 0.0F, true);
		Tank.setTextureOffset(0, 105).addBox(16.0F, -30.0F, -5.0F, 12.0F, 8.0F, 8.0F, 0.0F, true);
		Tank.setTextureOffset(0, 87).addBox(28.0F, -30.0F, -6.0F, 4.0F, 8.0F, 10.0F, 0.0F, true);
		Tank.setTextureOffset(0, 73).addBox(29.0F, -27.0F, -18.0F, 2.0F, 2.0F, 12.0F, 0.0F, true);
		Tank.setTextureOffset(0, 73).addBox(-31.0F, -27.0F, -18.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		Tank.setTextureOffset(0, 87).addBox(-32.0F, -30.0F, -6.0F, 4.0F, 8.0F, 10.0F, 0.0F, false);
		Tank.setTextureOffset(0, 105).addBox(-28.0F, -30.0F, -5.0F, 12.0F, 8.0F, 8.0F, 0.0F, false);
		Tank.setTextureOffset(0, 230).addBox(-22.0F, -22.0F, -1.0F, 6.0F, 8.0F, 12.0F, 0.0F, false);
		Tank.setTextureOffset(0, 230).addBox(-22.0F, -14.0F, -7.0F, 6.0F, 8.0F, 12.0F, 0.0F, false);
		Tank.setTextureOffset(0, 230).addBox(-22.0F, -30.0F, 5.0F, 6.0F, 8.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Tank.render(matrixStack, buffer, packedLight, packedOverlay);
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