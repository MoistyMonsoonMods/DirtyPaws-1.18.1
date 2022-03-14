package com.moistymonsoon.dirtypaws.client.event;

import com.moistymonsoon.dirtypaws.*;
import com.moistymonsoon.dirtypaws.client.renderer.*;
import com.moistymonsoon.dirtypaws.core.init.*;
import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DirtyPaws.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    private ClientModEvents() {}

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.BORDER_COLLIE.get(), BorderCollieRenderer::new);
        event.registerEntityRenderer(EntityInit.LURCHER.get(), LurcherRenderer::new);
        event.registerEntityRenderer(EntityInit.HYENA.get(), HyenaRenderer::new);
    }


}
