// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelspeeder extends EntityModel<Entity> {
	private final ModelRenderer Speeder;

	public Modelspeeder() {
		textureWidth = 128;
		textureHeight = 256;

		Speeder = new ModelRenderer(this);
		Speeder.setRotationPoint(0.0F, 24.0F, 0.0F);
		Speeder.setTextureOffset(68, 128).addBox(-7.0F, -22.0F, 24.0F, 14.0F, 17.0F, 16.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 155).addBox(-8.0F, -28.0F, 8.0F, 16.0F, 26.0F, 16.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 128).addBox(8.0F, -20.0F, 8.0F, 6.0F, 11.0F, 16.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 128).addBox(-14.0F, -20.0F, 8.0F, 6.0F, 11.0F, 16.0F, 0.0F, true);
		Speeder.setTextureOffset(0, 99).addBox(-7.0F, -5.0F, -71.0F, 14.0F, 2.0F, 4.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 105).addBox(-7.0F, -15.0F, -67.0F, 14.0F, 12.0F, 11.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 77).addBox(-10.0F, -13.0F, -56.0F, 3.0F, 6.0F, 16.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 77).addBox(7.0F, -13.0F, -56.0F, 3.0F, 6.0F, 16.0F, 0.0F, true);
		Speeder.setTextureOffset(22, 75).addBox(8.0F, -7.0F, -56.0F, 1.0F, 2.0F, 16.0F, 0.0F, true);
		Speeder.setTextureOffset(22, 75).addBox(-9.0F, -7.0F, -56.0F, 1.0F, 2.0F, 16.0F, 0.0F, false);
		Speeder.setTextureOffset(50, 102).addBox(-7.0F, -16.0F, -56.0F, 14.0F, 10.0F, 16.0F, 0.0F, false);
		Speeder.setTextureOffset(68, 75).addBox(-7.0F, -16.0F, -40.0F, 14.0F, 11.0F, 16.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 35).addBox(-4.0F, -21.0F, -46.0F, 8.0F, 5.0F, 35.0F, 0.0F, false);
		Speeder.setTextureOffset(64, 44).addBox(-8.0F, -16.0F, -24.0F, 16.0F, 10.0F, 16.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 38).addBox(5.0F, -27.0F, -11.0F, 2.0F, 11.0F, 2.0F, 0.0F, true);
		Speeder.setTextureOffset(0, 38).addBox(-7.0F, -27.0F, -11.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 22).addBox(-7.0F, -28.0F, -11.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		Speeder.setTextureOffset(0, 22).addBox(3.0F, -28.0F, -11.0F, 4.0F, 1.0F, 2.0F, 0.0F, true);
		Speeder.setTextureOffset(60, 16).addBox(-9.0F, -16.0F, -8.0F, 18.0F, 12.0F, 16.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Speeder.render(matrixStack, buffer, packedLight, packedOverlay);
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