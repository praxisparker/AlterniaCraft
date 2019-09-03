//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class fairybull_lusus extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Neck;
	private final ModelRenderer Head;
	private final ModelRenderer Muzzle;
	private final ModelRenderer NoseRing;
	private final ModelRenderer LeftHorn;
	private final ModelRenderer RightHorn;
	private final ModelRenderer LeftWings;
	private final ModelRenderer LeftFrontWing;
	private final ModelRenderer LeftBackWing;
	private final ModelRenderer RightWings;
	private final ModelRenderer RightFrontWing;
	private final ModelRenderer RightBackWing;
	private final ModelRenderer LeftFrontLeg;
	private final ModelRenderer RightFrontLeg;
	private final ModelRenderer LeftBackLeg;
	private final ModelRenderer LeftBackLegMid;
	private final ModelRenderer LeftBackLegLower;
	private final ModelRenderer RightBackLeg;
	private final ModelRenderer RightBackLegMid;
	private final ModelRenderer RightBackLegLower;
	private final ModelRenderer Tail;
	private final ModelRenderer TailEnd;

	public tinkerbull_lusus() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 15.5F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 12, -1.5F, -2.5F, -4.5F, 3, 4, 9, 0.0F, false));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, -1.5F, -3.0F);
		setRotationAngle(Neck, 0.7854F, 0.0F, 0.0F);
		Body.addChild(Neck);
		Neck.cubeList.add(new ModelBox(Neck, 0, 12, -1.0F, -6.0038F, -1.0872F, 2, 6, 2, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -4.0F, -0.5F);
		setRotationAngle(Head, -0.6981F, 0.0F, 0.0F);
		Neck.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -3.5F, -5.0F, -3.5F, 7, 6, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 21, 0, 1.0F, -3.0F, -4.0F, 3, 2, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 21, 0, -4.0F, -3.0F, -4.0F, 3, 2, 2, 0.0F, true));

		Muzzle = new ModelRenderer(this);
		Muzzle.setRotationPoint(2.0F, 0.0F, -2.0F);
		setRotationAngle(Muzzle, 0.8727F, 0.0F, 0.0F);
		Head.addChild(Muzzle);
		Muzzle.cubeList.add(new ModelBox(Muzzle, 0, 25, -4.0F, -1.5F, -3.0736F, 4, 3, 4, 0.0F, false));

		NoseRing = new ModelRenderer(this);
		NoseRing.setRotationPoint(-2.0F, -0.5F, -3.0F);
		setRotationAngle(NoseRing, 0.7854F, 0.0F, 0.0F);
		Muzzle.addChild(NoseRing);
		NoseRing.cubeList.add(new ModelBox(NoseRing, 29, 0, -2.0F, 0.0F, -3.0F, 4, 0, 3, 0.0F, false));

		LeftHorn = new ModelRenderer(this);
		LeftHorn.setRotationPoint(3.0F, -2.5F, -0.5F);
		Head.addChild(LeftHorn);
		LeftHorn.cubeList.add(new ModelBox(LeftHorn, 27, 5, 0.0F, -1.5F, -0.5F, 6, 3, 3, 0.0F, false));
		LeftHorn.cubeList.add(new ModelBox(LeftHorn, 46, 3, 5.0F, -4.5F, 0.0F, 2, 6, 2, 0.0F, false));

		RightHorn = new ModelRenderer(this);
		RightHorn.setRotationPoint(-3.0F, -2.5F, -0.5F);
		Head.addChild(RightHorn);
		RightHorn.cubeList.add(new ModelBox(RightHorn, 27, 5, -6.0F, -1.5F, -0.5F, 6, 3, 3, 0.0F, true));
		RightHorn.cubeList.add(new ModelBox(RightHorn, 46, 3, -7.0F, -4.5F, 0.0F, 2, 6, 2, 0.0F, true));

		LeftWings = new ModelRenderer(this);
		LeftWings.setRotationPoint(1.0F, -2.2F, 0.0F);
		setRotationAngle(LeftWings, 0.0F, 0.0F, 0.5236F);
		Body.addChild(LeftWings);

		LeftFrontWing = new ModelRenderer(this);
		LeftFrontWing.setRotationPoint(0.0F, -0.3F, 0.0F);
		LeftWings.addChild(LeftFrontWing);
		LeftFrontWing.cubeList.add(new ModelBox(LeftFrontWing, 25, 9, 0.0F, -9.5F, -3.0F, 0, 10, 4, 0.0F, true));

		LeftBackWing = new ModelRenderer(this);
		LeftBackWing.setRotationPoint(0.0F, -0.3F, 2.0F);
		setRotationAngle(LeftBackWing, -0.1745F, 0.0F, 0.0873F);
		LeftWings.addChild(LeftBackWing);
		LeftBackWing.cubeList.add(new ModelBox(LeftBackWing, 33, 10, 0.0F, -7.3264F, -1.9848F, 0, 8, 3, 0.0F, true));

		RightWings = new ModelRenderer(this);
		RightWings.setRotationPoint(-1.0F, -2.2F, 0.0F);
		setRotationAngle(RightWings, 0.0F, 0.0F, -0.5236F);
		Body.addChild(RightWings);

		RightFrontWing = new ModelRenderer(this);
		RightFrontWing.setRotationPoint(0.0F, -0.3F, 0.0F);
		RightWings.addChild(RightFrontWing);
		RightFrontWing.cubeList.add(new ModelBox(RightFrontWing, 25, 9, 0.0F, -9.5F, -3.0F, 0, 10, 4, 0.0F, false));

		RightBackWing = new ModelRenderer(this);
		RightBackWing.setRotationPoint(0.0F, -0.3F, 2.0F);
		setRotationAngle(RightBackWing, -0.1745F, 0.0F, -0.0873F);
		RightWings.addChild(RightBackWing);
		RightBackWing.cubeList.add(new ModelBox(RightBackWing, 33, 10, 0.0F, -7.3264F, -1.9848F, 0, 8, 3, 0.0F, false));

		LeftFrontLeg = new ModelRenderer(this);
		LeftFrontLeg.setRotationPoint(2.0F, 1.0F, -3.0F);
		setRotationAngle(LeftFrontLeg, 0.0873F, 0.0F, 0.0F);
		Body.addChild(LeftFrontLeg);
		LeftFrontLeg.cubeList.add(new ModelBox(LeftFrontLeg, 45, 13, -1.0F, -1.5F, -1.0F, 1, 8, 1, 0.0F, false));

		RightFrontLeg = new ModelRenderer(this);
		RightFrontLeg.setRotationPoint(-2.0F, 1.0F, -3.0F);
		setRotationAngle(RightFrontLeg, 0.0873F, 0.0F, 0.0F);
		Body.addChild(RightFrontLeg);
		RightFrontLeg.cubeList.add(new ModelBox(RightFrontLeg, 45, 13, 0.0F, -1.5F, -1.0F, 1, 8, 1, 0.0F, true));

		LeftBackLeg = new ModelRenderer(this);
		LeftBackLeg.setRotationPoint(2.0F, 0.0F, 2.0F);
		Body.addChild(LeftBackLeg);
		LeftBackLeg.cubeList.add(new ModelBox(LeftBackLeg, 17, 26, -1.5F, -2.0F, -1.0F, 2, 4, 3, 0.0F, false));

		LeftBackLegMid = new ModelRenderer(this);
		LeftBackLegMid.setRotationPoint(0.0F, 2.0F, 0.0F);
		setRotationAngle(LeftBackLegMid, -0.6109F, 0.0F, 0.0F);
		LeftBackLeg.addChild(LeftBackLegMid);
		LeftBackLegMid.cubeList.add(new ModelBox(LeftBackLegMid, 25, 31, -1.0F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

		LeftBackLegLower = new ModelRenderer(this);
		LeftBackLegLower.setRotationPoint(-0.5F, -1.0F, 2.5F);
		setRotationAngle(LeftBackLegLower, 0.1745F, 0.0F, 0.0F);
		LeftBackLegMid.addChild(LeftBackLegLower);
		LeftBackLegLower.cubeList.add(new ModelBox(LeftBackLegLower, 31, 27, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, false));

		RightBackLeg = new ModelRenderer(this);
		RightBackLeg.setRotationPoint(-2.0F, 0.0F, 2.0F);
		Body.addChild(RightBackLeg);
		RightBackLeg.cubeList.add(new ModelBox(RightBackLeg, 17, 26, -0.5F, -2.0F, -1.0F, 2, 4, 3, 0.0F, true));

		RightBackLegMid = new ModelRenderer(this);
		RightBackLegMid.setRotationPoint(0.0F, 2.0F, 0.0F);
		setRotationAngle(RightBackLegMid, -0.6109F, 0.0F, 0.0F);
		RightBackLeg.addChild(RightBackLegMid);
		RightBackLegMid.cubeList.add(new ModelBox(RightBackLegMid, 25, 31, 0.0F, -2.0F, 0.0F, 1, 2, 3, 0.0F, true));

		RightBackLegLower = new ModelRenderer(this);
		RightBackLegLower.setRotationPoint(0.5F, -1.0F, 2.5F);
		setRotationAngle(RightBackLegLower, 0.1745F, 0.0F, 0.0F);
		RightBackLegMid.addChild(RightBackLegLower);
		RightBackLegLower.cubeList.add(new ModelBox(RightBackLegLower, 31, 27, -0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F, true));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -1.5F, 4.0F);
		setRotationAngle(Tail, -0.6109F, 0.0F, 0.0F);
		Body.addChild(Tail);
		Tail.cubeList.add(new ModelBox(Tail, 35, 16, -1.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F, false));

		TailEnd = new ModelRenderer(this);
		TailEnd.setRotationPoint(-0.5F, 0.0F, 6.5F);
		setRotationAngle(TailEnd, 0.8727F, 0.0F, 0.0F);
		Tail.addChild(TailEnd);
		TailEnd.cubeList.add(new ModelBox(TailEnd, 38, 25, -0.5F, -0.5F, -0.5F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
