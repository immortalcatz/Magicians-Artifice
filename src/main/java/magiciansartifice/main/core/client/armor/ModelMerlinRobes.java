package magiciansartifice.main.core.client.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMerlinRobes extends ModelBiped {
 /*   //fields
    public ModelRenderer hatBrim;
    public ModelRenderer hat3;
    public ModelRenderer hat2;
    public ModelRenderer hat1;
    public ModelRenderer robeBack;
    public ModelRenderer robe1;
    public ModelRenderer robe2;
    public ModelRenderer legging1;
    public ModelRenderer legging2;
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
  
    public ModelMerlinRobes(float scale) {
        super(scale, 0.0F, 128, 64);

        textureWidth = 128;
        textureHeight = 64;

        hatBrim = new ModelRenderer(this, 83, 51);
        hatBrim.addBox(-5.5F, 0F, -5.5F, 11, 2, 11);
        hatBrim.setRotationPoint(0F, -9F, 0F);
        hatBrim.setTextureSize(128, 64);
        hatBrim.mirror = true;
        setRotation(hatBrim, 0F, 0F, 0F);
        hatBrim.mirror = false;
        hat3 = new ModelRenderer(this, 107, 43);
        hat3.addBox(-1.5F, -4F, -1.5F, 3, 4, 3);
        hat3.setRotationPoint(0F, -18F, 2F);
        hat3.setTextureSize(128, 64);
        hat3.mirror = true;
        setRotation(hat3, -0.7807508F, 0F, 0F);
        hat3.mirror = false;
        hat2 = new ModelRenderer(this, 104, 40);
        hat2.addBox(-2.5F, -5F, -2.5F, 5, 6, 5);
        hat2.setRotationPoint(0F, -14F, 1F);
        hat2.setTextureSize(128, 64);
        hat2.mirror = true;
        setRotation(hat2, -0.2974289F, 0F, 0F);
        hat2.mirror = false;
        hat1 = new ModelRenderer(this, 99, 38);
        hat1.addBox(-3.5F, -6F, -3.533333F, 7, 6, 7);
        hat1.setRotationPoint(0F, -8F, 0F);
        hat1.setTextureSize(128, 64);
        hat1.mirror = true;
        setRotation(hat1, -0.1115358F, 0F, 0F);
        hat1.mirror = false;
        robeBack = new ModelRenderer(this, 107, 0);
        robeBack.addBox(-4.5F, 0F, 0F, 9, 23, 1);
        robeBack.setRotationPoint(0F, 0F, 2F);
        robeBack.setTextureSize(128, 64);
        robeBack.mirror = true;
        setRotation(robeBack, 0.0371786F, 0F, 0F);
        robeBack.mirror = false;
        robe1 = new ModelRenderer(this, 121, 24);
        robe1.addBox(-1F, 0F, 0F, 2, 13, 1);
        robe1.setRotationPoint(3F, 0F, -3F);
        robe1.setTextureSize(128, 64);
        robe1.mirror = true;
        setRotation(robe1, 0F, 0F, 0F);
        robe1.mirror = false;
        robe2 = new ModelRenderer(this, 121, 24);
        robe2.addBox(-1F, 0F, 0F, 2, 13, 1);
        robe2.setRotationPoint(-3F, 0F, -3F);
        robe2.setTextureSize(128, 64);
        robe2.mirror = true;
        setRotation(robe2, 0F, 0F, 0F);
        robe2.mirror = false;
        legging1 = new ModelRenderer(this, 112, 25);
        legging1.addBox(-1F, 0F, 0F, 2, 11, 1);
        legging1.setRotationPoint(-3F, 12F, -3F);
        legging1.setTextureSize(128, 64);
        legging1.mirror = true;
        setRotation(legging1, 0F, 0F, 0F);
        legging1.mirror = true;
        legging2 = new ModelRenderer(this, 112, 25);
        legging2.addBox(-1F, 0F, 0F, 2, 11, 1);
        legging2.setRotationPoint(3F, 12F, -3F);
        legging2.setTextureSize(128, 64);
        legging2.mirror = true;
        setRotation(legging2, 0F, 0F, 0F);
        legging2.mirror = false;
        Shape1 = new ModelRenderer(this, 82, 1);
        Shape1.addBox(-2.5F, 0F, -2.5F, 5, 2, 5);
        Shape1.setRotationPoint(-2F, 19F, 0F);
        Shape1.setTextureSize(128, 64);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape1.mirror = false;
        Shape2 = new ModelRenderer(this, 82, 1);
        Shape2.addBox(-2.5F, 0F, -2.5F, 5, 2, 5);
        Shape2.setRotationPoint(2F, 19F, 0F);
        Shape2.setTextureSize(128, 64);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape2.mirror = false;
        Shape3 = new ModelRenderer(this, 86, 10);
        Shape3.addBox(-2.5F, 0F, -2.5F, 5, 3, 5);
        Shape3.setRotationPoint(-2F, 21F, 0F);
        Shape3.setTextureSize(128, 64);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape3.mirror = false;
        Shape4 = new ModelRenderer(this, 86, 10);
        Shape4.addBox(-2.5F, 0F, -2.5F, 5, 3, 5);
        Shape4.setRotationPoint(2F, 21F, 0F);
        Shape4.setTextureSize(128, 64);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape4.mirror = false;

        this.bipedHead.addChild(hatBrim);
        this.bipedHead.addChild(hat3);
        this.bipedHead.addChild(hat2);
        this.bipedHead.addChild(hat1);
        this.bipedBody.addChild(robeBack);
        this.bipedBody.addChild(robe1);
        this.bipedBody.addChild(robe2);
        this.bipedRightLeg.addChild(legging1);
        this.bipedLeftLeg.addChild(legging2);
        this.bipedRightLeg.addChild(Shape1);
        this.bipedLeftLeg.addChild(Shape2);
        this.bipedRightLeg.addChild(Shape3);
        this.bipedLeftLeg.addChild(Shape4);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }*/
	
	//fields
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer rightarm;
    public ModelRenderer leftarm;
    public ModelRenderer rightleg;
    public ModelRenderer leftleg;
    public ModelRenderer hatBrim;
    public ModelRenderer hat3;
    public ModelRenderer hat2;
    public ModelRenderer hat1;
    public ModelRenderer robeBack;
    public ModelRenderer robe1;
    public ModelRenderer robe2;
    public ModelRenderer legging1;
    public ModelRenderer legging2;
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
  
  public ModelMerlinRobes()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(128, 64);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(128, 64);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(128, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(128, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      hatBrim = new ModelRenderer(this, 83, 51);
      hatBrim.addBox(-5.5F, 0F, -5.5F, 11, 2, 11);
      hatBrim.setRotationPoint(0F, -9F, 0F);
      hatBrim.setTextureSize(128, 64);
      hatBrim.mirror = true;
      setRotation(hatBrim, 0F, 0F, 0F);
      hat3 = new ModelRenderer(this, 107, 43);
      hat3.addBox(-1.5F, -4F, -1.5F, 3, 4, 3);
      hat3.setRotationPoint(0F, -18F, 2F);
      hat3.setTextureSize(128, 64);
      hat3.mirror = true;
      setRotation(hat3, -0.7807508F, 0F, 0F);
      hat2 = new ModelRenderer(this, 104, 40);
      hat2.addBox(-2.5F, -5F, -2.5F, 5, 6, 5);
      hat2.setRotationPoint(0F, -14F, 1F);
      hat2.setTextureSize(128, 64);
      hat2.mirror = true;
      setRotation(hat2, -0.2974289F, 0F, 0F);
      hat1 = new ModelRenderer(this, 99, 38);
      hat1.addBox(-3.5F, -6F, -3.533333F, 7, 6, 7);
      hat1.setRotationPoint(0F, -8F, 0F);
      hat1.setTextureSize(128, 64);
      hat1.mirror = true;
      setRotation(hat1, -0.1115358F, 0F, 0F);
      robeBack = new ModelRenderer(this, 107, 0);
      robeBack.addBox(-4.5F, 0F, 0F, 9, 23, 1);
      robeBack.setRotationPoint(0F, 0F, 2F);
      robeBack.setTextureSize(128, 64);
      robeBack.mirror = true;
      setRotation(robeBack, 0.0371786F, 0F, 0F);
      robe1 = new ModelRenderer(this, 121, 24);
      robe1.addBox(-1F, 0F, 0F, 2, 13, 1);
      robe1.setRotationPoint(3F, 0F, -3F);
      robe1.setTextureSize(128, 64);
      robe1.mirror = true;
      setRotation(robe1, 0F, 0F, 0F);
      robe2 = new ModelRenderer(this, 121, 24);
      robe2.addBox(-1F, 0F, 0F, 2, 13, 1);
      robe2.setRotationPoint(-3F, 0F, -3F);
      robe2.setTextureSize(128, 64);
      robe2.mirror = true;
      setRotation(robe2, 0F, 0F, 0F);
      legging1 = new ModelRenderer(this, 112, 25);
      legging1.addBox(-1F, 0F, 0F, 2, 11, 1);
      legging1.setRotationPoint(-3F, 12F, -3F);
      legging1.setTextureSize(128, 64);
      legging1.mirror = true;
      setRotation(legging1, 0F, 0F, 0F);
      legging2 = new ModelRenderer(this, 112, 25);
      legging2.addBox(-1F, 0F, 0F, 2, 11, 1);
      legging2.setRotationPoint(3F, 12F, -3F);
      legging2.setTextureSize(128, 64);
      legging2.mirror = true;
      setRotation(legging2, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 82, 1);
      Shape1.addBox(-2.5F, 0F, -2.5F, 5, 2, 5);
      Shape1.setRotationPoint(-2F, 19F, 0F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 82, 1);
      Shape2.addBox(-2.5F, 0F, -2.5F, 5, 2, 5);
      Shape2.setRotationPoint(2F, 19F, 0F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 86, 10);
      Shape3.addBox(-2.5F, 0F, -2.5F, 5, 3, 5);
      Shape3.setRotationPoint(-2F, 21F, 0F);
      Shape3.setTextureSize(128, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 86, 10);
      Shape4.addBox(-2.5F, 0F, -2.5F, 5, 3, 5);
      Shape4.setRotationPoint(2F, 21F, 0F);
      Shape4.setTextureSize(128, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
  }
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	  super.render(entity, f, f1, f2, f3, f4, f5);
      setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    hatBrim.render(f5);
    hat3.render(f5);
    hat2.render(f5);
    hat1.render(f5);
    robeBack.render(f5);
    robe1.render(f5);
    robe2.render(f5);
    legging1.render(f5);
    legging2.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}
