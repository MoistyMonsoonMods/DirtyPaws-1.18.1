package com.moistymonsoon.dirtypaws.core.init;

import com.moistymonsoon.dirtypaws.DirtyPaws;
import com.moistymonsoon.dirtypaws.common.entity.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {

    private EntityInit() {}

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            DirtyPaws.MODID);

    public static final RegistryObject<EntityType<BorderCollie>> BORDER_COLLIE = ENTITIES.register("border_collie",
            () -> EntityType.Builder.of(BorderCollie::new, MobCategory.CREATURE).sized(0.6f, 0.9f)
            .build(new ResourceLocation(DirtyPaws.MODID, "border_collie").toString()));

    public static final RegistryObject<EntityType<Lurcher>> LURCHER = ENTITIES.register("lurcher",
            () -> EntityType.Builder.of(Lurcher::new, MobCategory.CREATURE).sized(0.5f, 1.2f)
                    .build(new ResourceLocation(DirtyPaws.MODID, "lurcher").toString()));

    public static final RegistryObject<EntityType<Hyena>> HYENA = ENTITIES.register("hyena",
            () -> EntityType.Builder.of(Hyena::new, MobCategory.CREATURE).sized(0.5f, 1.2f)
                    .build(new ResourceLocation(DirtyPaws.MODID, "hyena").toString()));
}
