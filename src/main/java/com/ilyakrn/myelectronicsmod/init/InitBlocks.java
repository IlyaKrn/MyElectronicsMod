package com.ilyakrn.myelectronicsmod.init;


import com.ilyakrn.myelectronicsmod.blocks.BlockComponentBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;

public class InitBlocks {
    public static final ArrayList<Block> BLOCKS = new ArrayList<>();

    public static final Block COMPONENT_BUILDER = new BlockComponentBuilder("component_builder", Material.ROCK);
}
