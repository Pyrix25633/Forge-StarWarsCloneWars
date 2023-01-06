// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelb_c extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm2;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;

	public Modelb_c() {
		textureWidth = 128;
		textureHeight = 32;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.2F, false);
		Body.setTextureOffset(110, 29).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(110, 26).addBox(-4.0F, 0.0F, 2.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, false);
		RightArm.setTextureOffset(56, 22).addBox(-3.0F, -3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, true);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setRotationPoint(0.0F, -2.0F, 2.0F);
		LeftArm.addChild(LeftArm2);
		setRotationAngle(LeftArm2, 0.0F, 0.0F, 0.1745F);
		LeftArm2.setTextureOffset(74, 27).addBox(-1.0F, -1.0F, -4.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftArm2.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, -0.7854F, 0.0F, 0.0F);
		LeftArm_r1.setTextureOffset(92, 27).addBox(-1.0F, -1.0F, -1.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(0.0F, 0.0F, -4.0F);
		LeftArm2.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.7854F, 0.0F, 0.0F);
		LeftArm_r2.setTextureOffset(56, 27).addBox(-1.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.LeftArm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.LeftArm_r1.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.LeftArm_r2.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}