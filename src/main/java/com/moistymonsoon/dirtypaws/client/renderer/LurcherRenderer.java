package com.moistymonsoon.dirtypaws.client.renderer;

import com.google.common.collect.*;
import com.moistymonsoon.dirtypaws.*;
import com.moistymonsoon.dirtypaws.client.renderer.model.*;
import com.moistymonsoon.dirtypaws.common.entity.*;
import com.moistymonsoon.dirtypaws.common.entity.variant.*;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.resources.*;
import software.bernie.geckolib3.renderers.geo.*;

import java.util.*;

public class LurcherRenderer extends GeoEntityRenderer<Lurcher> {
    public static final Map<LurcherVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(LurcherVariant.class), (p_114874_) -> {
                p_114874_.put(LurcherVariant.BROWN,
                        new ResourceLocation(DirtyPaws.MODID, "textures/entities/lurcherbrown.png"));
                p_114874_.put(LurcherVariant.BLACK,
                        new ResourceLocation(DirtyPaws.MODID, "textures/entities/lurcherblack.png"));
                p_114874_.put(LurcherVariant.DAPPLE,
                        new ResourceLocation(DirtyPaws.MODID, "textures/entities/lurchergrey.png"));
            });



    public LurcherRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LurcherModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(Lurcher instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(Lurcher animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
