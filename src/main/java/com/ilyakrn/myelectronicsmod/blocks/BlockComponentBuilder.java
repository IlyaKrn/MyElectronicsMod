package com.ilyakrn.myelectronicsmod.blocks;

import com.ilyakrn.myelectronicsmod.init.InitBlocks;
import com.ilyakrn.myelectronicsmod.init.InitItems;
import com.ilyakrn.myelectronicsmod.init.InitTabs;
import com.ilyakrn.myelectronicsmod.main.Main;
import com.ilyakrn.myelectronicsmod.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockComponentBuilder extends Block implements IHasModel {
    public BlockComponentBuilder(String name, Material material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(InitTabs.MY_ELECTRONICS_TAB);
        setHardness(3);
        setResistance(3);
        setSoundType(SoundType.STONE);
        InitBlocks.BLOCKS.add(this);
        InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
