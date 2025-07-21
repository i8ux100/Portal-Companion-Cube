package com.i8ux100.companioncube;

import net.minecraft.client.renderer.entity.model.ModelBase;
import net.minecraft.client.renderer.entity.model.Piece;

public class ModelCompanionCube extends ModelBase {
    private final Piece box = new Piece("box", this, 0, 14);

   public ModelCompanionCube() {
      this.box.addBox(-1.0F, -2.0F, -1.0F, 3, 7, 3, 0.0F);
   }

    @Override
    protected void init() {
        //unimp
    }
    
}
