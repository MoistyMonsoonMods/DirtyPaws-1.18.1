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

public class BorderCollieRenderer extends GeoEntityRenderer<BorderCollie> {
    public static final Map<BorderCollieVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(BorderCollieVariant.class), (p_114874_) -> {
                p_114874_.put(BorderCollieVariant.POPPY,
                        new ResourceLocation(DirtyPaws.MODID, "textures/entities/bordercolliebrown.png"));
                p_114874_.put(BorderCollieVariant.BROWN,
                        new ResourceLocation(DirtyPaws.MODID, "textures/entities/bordercolliebrownfull.png"));
                p_114874_.put(BorderCollieVariant.BLACK,
                        new ResourceLocation(DirtyPaws.MODID, "textures/entities/bordercollieblack.png"));
                p_114874_.put(BorderCollieVariant.DAPPLE,
                        new ResourceLocation(DirtyPaws.MODID, "textures/entities/bordercolliegray.png"));
            });



    public BorderCollieRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BorderCollieModel());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(BorderCollie instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderType getRenderType(BorderCollie animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
