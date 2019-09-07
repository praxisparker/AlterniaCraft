//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class skyhorse_lusus extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Neck;
	private final ModelRenderer Neck2;
	private final ModelRenderer Head;
	private final ModelRenderer LeftEye;
	private final ModelRenderer RightEye;
	private final ModelRenderer Forehead;
	private final ModelRenderer Horns;
	private final ModelRenderer Abdomen;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail2;
	private final ModelRenderer Tail3;
	private final ModelRenderer Tail4;
	private final ModelRenderer Tail5;

	public skyhorse_lusus() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -10.25F, 1.0F);
		setRotationAngle(Body, 0.5236F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 52, 44, -5.0F, -5.75F, -7.0F, 10, 13, 14, 0.0F, false));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, 1.4374F, 0.8452F);
		setRotationAngle(Neck, -0.3491F, 0.0F, 0.0F);
		Body.addChild(Neck);
		Neck.cubeList.add(new ModelBox(Neck, 59, 22, -3.5F, -12.7588F, -6.0681F, 7, 12, 9, 0.0F, false));

		Neck2 = new ModelRenderer(this);
		Neck2.setRotationPoint(0.0F, -6.0F, 1.0F);
		setRotationAngle(Neck2, -0.2618F, 0.0F, 0.0F);
		Neck.addChild(Neck2);
		Neck2.cubeList.add(new ModelBox(Neck2, 62, 0, -2.5F, -16.2766F, -6.8943F, 5, 14, 7, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -16.1874F, 0.1548F);
		setRotationAngle(Head, 0.3491F, 0.0F, 0.0F);
		Neck2.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 33, 1, -3.5F, -5.8126F, -6.1548F, 7, 7, 7, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 15, 27, -4.0F, -4.8126F, -14.1548F, 8, 7, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 16, 43, -2.0F, -2.5126F, -23.1548F, 4, 4, 9, 0.0F, false));

		LeftEye = new ModelRenderer(this);
		LeftEye.setRotationPoint(4.0F, -0.8126F, -14.1548F);
		setRotationAngle(LeftEye, 0.0F, 0.3142F, 0.0F);
		Head.addChild(LeftEye);
		LeftEye.cubeList.add(new ModelBox(LeftEye, 28, 21, -6.0F, -4.0F, 0.0F, 6, 4, 9, 0.0F, false));

		RightEye = new ModelRenderer(this);
		RightEye.setRotationPoint(-4.0F, -0.8126F, -14.1548F);
		setRotationAngle(RightEye, 0.0F, -0.3142F, 0.0F);
		Head.addChild(RightEye);
		RightEye.cubeList.add(new ModelBox(RightEye, 1, 21, 0.0F, -4.0F, 0.0F, 6, 4, 9, 0.0F, true));

		Forehead = new ModelRenderer(this);
		Forehead.setRotationPoint(0.0F, -4.8126F, -14.1548F);
		setRotationAngle(Forehead, 0.192F, 0.0F, 0.0F);
		Head.addChild(Forehead);
		Forehead.cubeList.add(new ModelBox(Forehead, 0, 0, -4.0F, 0.0F, 0.0F, 8, 4, 16, 0.0F, false));

		Horns = new ModelRenderer(this);
		Horns.setRotationPoint(-3.5F, 2.5819F, 9.0831F);
		setRotationAngle(Horns, 0.5236F, 0.0F, 0.0F);
		Forehead.addChild(Horns);
		Horns.cubeList.add(new ModelBox(Horns, 2, 1, 4.8F, 0.2214F, 4.3774F, 2, 2, 4, 0.0F, false));
		Horns.cubeList.add(new ModelBox(Horns, 2, 1, 0.2F, 0.2214F, 4.3774F, 2, 2, 4, 0.0F, true));

		Abdomen = new ModelRenderer(this);
		Abdomen.setRotationPoint(5.0F, 9.4374F, 0.3452F);
		setRotationAngle(Abdomen, 0.1745F, 0.0F, 0.0F);
		Body.addChild(Abdomen);
		Abdomen.cubeList.add(new ModelBox(Abdomen, 54, 72, -9.0F, -6.1874F, -6.3452F, 8, 15, 13, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(-5.0F, 11.0F, 1.0F);
		setRotationAngle(Tail, -0.8727F, 0.0F, 0.0F);
		Abdomen.addChild(Tail);
		Tail.cubeList.add(new ModelBox(Tail, 96, 0, -3.0F, -5.1874F, -8.3452F, 6, 16, 10, 0.0F, false));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 12.0F, -1.0F);
		setRotationAngle(Tail2, -0.8727F, 0.0F, 0.0F);
		Tail.addChild(Tail2);
		Tail2.cubeList.add(new ModelBox(Tail2, 101, 27, -2.5F, -2.1874F, -6.3452F, 5, 15, 6, 0.0F, false));

		Tail3 = new ModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 10.0F, 0.0F);
		setRotationAngle(Tail3, -1.309F, 0.0F, 0.0F);
		Tail2.addChild(Tail3);
		Tail3.cubeList.add(new ModelBox(Tail3, 102, 49, -2.0F, 3.8126F, -2.8452F, 4, 11, 5, 0.0F, false));

		Tail4 = new ModelRenderer(this);
		Tail4.setRotationPoint(0.0F, 9.5849F, 0.0F);
		setRotationAngle(Tail4, -1.4835F, 0.0F, 0.0F);
		Tail3.addChild(Tail4);
		Tail4.cubeList.add(new ModelBox(Tail4, 104, 66, -1.5F, 1.2278F, 2.1548F, 3, 7, 3, 0.0F, false));

		Tail5 = new ModelRenderer(this);
		Tail5.setRotationPoint(0.0F, 5.9151F, 0.0F);
		setRotationAngle(Tail5, -1.3963F, 0.0F, -0.0873F);
		Tail4.addChild(Tail5);
		Tail5.cubeList.add(new ModelBox(Tail5, 106, 77, -1.0F, -3.6874F, 1.1548F, 2, 5, 2, 0.0F, false));
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