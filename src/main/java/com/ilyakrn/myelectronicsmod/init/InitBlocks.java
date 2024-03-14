package com.ilyakrn.myelectronicsmod.init;


import com.ilyakrn.myelectronicsmod.blocks.ElectronicsBuildTable;
import com.ilyakrn.myelectronicsmod.items.SolderingIron;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class InitBlocks {
    public static final ArrayList<Block> BLOCKS = new ArrayList<>();

    public static final Block ELECTRONICS_BUILD_TABLE = new ElectronicsBuildTable("electronics_build_table", Material.ROCK);
}
