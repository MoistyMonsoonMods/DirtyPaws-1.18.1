package com.moistymonsoon.dirtypaws.client.renderer;

import com.moistymonsoon.dirtypaws.*;
import com.moistymonsoon.dirtypaws.client.renderer.model.*;
import com.moistymonsoon.dirtypaws.common.entity.*;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.*;

public class HyenaRenderer extends GeoEntityRenderer<Hyena> {
    public HyenaRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HyenaModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(Hyena instance) {
        return new ResourceLocation(DirtyPaws.MODID, "textures/entities/hyena.png");
    }

    @Override
    public RenderType getRenderType(Hyena animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.1F, 1.1F, 1.1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}