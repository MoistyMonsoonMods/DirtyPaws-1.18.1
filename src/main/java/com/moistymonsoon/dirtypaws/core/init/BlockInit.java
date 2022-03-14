package com.moistymonsoon.dirtypaws.core.init;

import com.moistymonsoon.dirtypaws.DirtyPaws;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public final class BlockInit  {

    private BlockInit() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            DirtyPaws.MODID);

    public static final RegistryObject<Block> CLAY_SOIL = BLOCKS.register("clay_soil", () ->
            new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.DIRT).strength(0.5F).sound(SoundType.GRAVEL).speedFactor(0.4F).requiresCorrectToolForDrops()));
}
