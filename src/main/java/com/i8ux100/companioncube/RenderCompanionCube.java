package com.i8ux100.companioncube;

import net.minecraft.client.renderer.entity.RenderLiving;

public class RenderCompanionCube extends RenderLiving<EntityCompanionCube> {
    protected ModelCompanionCube model;

    public RenderCompanionCube(ModelCompanionCube model) {
        super(model, 0.0f);
        this.model = model;
    }
}
