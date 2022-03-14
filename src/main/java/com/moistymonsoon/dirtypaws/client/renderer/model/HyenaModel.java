package com.moistymonsoon.dirtypaws.client.renderer.model;


import com.moistymonsoon.dirtypaws.*;
import com.moistymonsoon.dirtypaws.common.entity.*;
import net.minecraft.resources.*;
import software.bernie.geckolib3.model.*;

public class HyenaModel extends AnimatedGeoModel<Hyena> {

    @Override
    public ResourceLocation getModelLocation(Hyena object) {
        return new ResourceLocation(DirtyPaws.MODID, "geo/hyena.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Hyena object) {
        return new ResourceLocation(DirtyPaws.MODID, "textures/entities/hyena.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Hyena animatable) {
        return new ResourceLocation(DirtyPaws.MODID, "animations/hyena.animation.json");
    }
}
