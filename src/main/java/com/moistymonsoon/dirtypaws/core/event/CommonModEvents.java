package com.moistymonsoon.dirtypaws.core.event;

import com.moistymonsoon.dirtypaws.DirtyPaws;
import com.moistymonsoon.dirtypaws.common.entity.*;
import com.moistymonsoon.dirtypaws.core.init.EntityInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DirtyPaws.MODID, bus = Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.BORDER_COLLIE.get(), BorderCollie.createAttributes().build());
        event.put(EntityInit.LURCHER.get(), Lurcher.createAttributes().build());
        event.put(EntityInit.HYENA.get(), Hyena.createAttributes().build());
    }

}
