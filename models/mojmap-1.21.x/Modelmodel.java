// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "model"), "main");
	private final ModelPart roof;
	private final ModelPart base;
	private final ModelPart wheel3;
	private final ModelPart wheel4;
	private final ModelPart wheel1;
	private final ModelPart wheel2;
	private final ModelPart interior;
	private final ModelPart windows;

	public Modelmodel(ModelPart root) {
		this.roof = root.getChild("roof");
		this.base = root.getChild("base");
		this.wheel3 = root.getChild("wheel3");
		this.wheel4 = this.wheel3.getChild("wheel4");
		this.wheel1 = root.getChild("wheel1");
		this.wheel2 = this.wheel1.getChild("wheel2");
		this.interior = root.getChild("interior");
		this.windows = root.getChild("windows");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition roof = partdefinition.addOrReplaceChild("roof",
				CubeListBuilder.create().texOffs(52, 67)
						.addBox(-1.0F, -9.5F, -4.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 64)
						.addBox(-11.0F, -9.5F, -4.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 64)
						.addBox(-11.0F, -9.5F, -20.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 30)
						.addBox(-1.0F, -9.5F, -20.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-11.0F, -10.5F, -20.0F, 12.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(97, 9)
						.addBox(2.0F, -6.0F, -19.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, 0)
						.addBox(-15.0F, -6.0F, -19.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 16)
						.addBox(0.0F, -6.0F, -20.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 6)
						.addBox(-15.0F, -6.0F, -20.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 18.0F, 9.0F));

		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-13.0F, -3.5F, -28.5F, 12.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(52, 20)
						.addBox(-13.0F, -7.5F, -4.5F, 12.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(-13.0F, -8.5F, -28.5F, 12.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-2.0F, -9.5F, -21.5F, 1.0F, 6.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(43, 33)
						.addBox(-13.0F, -9.5F, -21.5F, 1.0F, 6.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, 24.0F, 11.0F));

		PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 12).addBox(-11.0F, -3.5F, -5.0F, 12.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -5.0F, -2.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, -6.0F, -1.5F, 12.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -7.0F, -26.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition wheel3 = partdefinition.addOrReplaceChild("wheel3", CubeListBuilder.create().texOffs(42, 30)
				.addBox(-7.0F, -2.0F, -2.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, -10.0F));

		PartDefinition wheel4 = wheel3.addOrReplaceChild("wheel4", CubeListBuilder.create().texOffs(0, 30).addBox(-9.0F,
				-5.0F, -12.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(14.0F, 3.0F, 10.0F));

		PartDefinition wheel1 = partdefinition.addOrReplaceChild("wheel1", CubeListBuilder.create().texOffs(58, 59)
				.addBox(-7.0F, -2.0F, -2.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, 4.0F));

		PartDefinition wheel2 = wheel1.addOrReplaceChild("wheel2", CubeListBuilder.create().texOffs(0, 50).addBox(5.0F,
				-5.0F, 2.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, -4.0F));

		PartDefinition interior = partdefinition.addOrReplaceChild("interior",
				CubeListBuilder.create().texOffs(22, 13)
						.addBox(5.0F, -14.5F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 7)
						.addBox(-6.0F, -14.5F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-5.0F, -11.5F, -2.0F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-5.0F, -11.5F, 4.0F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = interior.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(19, 58).addBox(6.0F, -1.5F, -1.0F, 5.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -7.0F, -8.0F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r4 = interior.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(19, 50).addBox(-1.0F, -6.5F, -1.0F, 10.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -5.0F, 4.0F, 1.6581F, 0.0F, 0.0F));

		PartDefinition cube_r5 = interior.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(41, 56).addBox(-1.0F, -6.5F, -1.0F, 10.0F, 7.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -5.0F, -1.0F, 1.6581F, 0.0F, 0.0F));

		PartDefinition windows = partdefinition.addOrReplaceChild("windows",
				CubeListBuilder.create().texOffs(-2, 1)
						.addBox(-4.0F, -14.5F, -11.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, -5)
						.addBox(5.0F, -14.5F, -9.0F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(-1, -5)
						.addBox(-6.0F, -14.5F, -9.0F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, -4)
						.addBox(-6.0F, -14.5F, -1.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, -4)
						.addBox(5.0F, -14.5F, -1.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(-2, 1)
						.addBox(-4.0F, -14.5F, 6.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		roof.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wheel3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wheel1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		interior.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		windows.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}