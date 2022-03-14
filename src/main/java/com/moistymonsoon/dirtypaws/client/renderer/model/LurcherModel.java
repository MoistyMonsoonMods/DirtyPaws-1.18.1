package com.moistymonsoon.dirtypaws.client.renderer.model;


import com.moistymonsoon.dirtypaws.*;
import com.moistymonsoon.dirtypaws.client.renderer.*;
import com.moistymonsoon.dirtypaws.common.entity.*;
import net.minecraft.resources.*;
import software.bernie.geckolib3.model.*;

public class LurcherModel extends AnimatedGeoModel<Lurcher> {

    @Override
    public ResourceLocation getModelLocation(Lurcher object) {
        return new ResourceLocation(DirtyPaws.MODID, "geo/lurcher.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Lurcher object) {
        return BorderCollieRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Lurcher animatable) {
        return new ResourceLocation(DirtyPaws.MODID, "animations/lurcher.animation.json");
    }
}
