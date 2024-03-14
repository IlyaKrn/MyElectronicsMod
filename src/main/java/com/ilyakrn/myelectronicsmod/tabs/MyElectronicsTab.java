package com.ilyakrn.myelectronicsmod.tabs;

import com.ilyakrn.myelectronicsmod.init.InitItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MyElectronicsTab extends CreativeTabs {

    public MyElectronicsTab(String label) {
        super(label);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(InitItems.SOLDERING_IRON);
    }

}
