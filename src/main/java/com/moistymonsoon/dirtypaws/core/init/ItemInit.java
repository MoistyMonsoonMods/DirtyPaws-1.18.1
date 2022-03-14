package com.moistymonsoon.dirtypaws.core.init;

import com.moistymonsoon.dirtypaws.DirtyPaws;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {
    private ItemInit() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DirtyPaws.MODID);

    public static final RegistryObject<Item> DOG_COLLAR = ITEMS.register("dog_collar", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> BORDERCOLLIE_SPAWN_EGG = ITEMS.register("bordercollie_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.BORDER_COLLIE,0x916b55, 0x31303e,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> LURCHER_SPAWN_EGG = ITEMS.register("lurcher_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.LURCHER,0x26242f, 0xada19f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> HYENA_SPAWN_EGG = ITEMS.register("hyena_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityInit.HYENA,0x26242f, 0xada19f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //BLOCK ITEMS
    public static final RegistryObject<BlockItem> CLAY_SOIL_ITEM = ITEMS.register("clay_soil",
            () -> new BlockItem(BlockInit.CLAY_SOIL.get(),new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
