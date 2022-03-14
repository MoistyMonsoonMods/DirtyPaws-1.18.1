package com.moistymonsoon.dirtypaws.client.renderer.model;


import com.moistymonsoon.dirtypaws.*;
import com.moistymonsoon.dirtypaws.client.renderer.*;
import com.moistymonsoon.dirtypaws.common.entity.*;
import net.minecraft.resources.*;
import software.bernie.geckolib3.model.*;

public class BorderCollieModel extends AnimatedGeoModel<BorderCollie> {

	@Override
	public ResourceLocation getModelLocation(BorderCollie object) {
		return new ResourceLocation(DirtyPaws.MODID, "geo/bordercollie.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(BorderCollie object) {
		return BorderCollieRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
	}

	@Override
	public ResourceLocation getAnimationFileLocation(BorderCollie animatable) {
		return new ResourceLocation(DirtyPaws.MODID, "animations/bordercollie.animation.json");
	}
}
