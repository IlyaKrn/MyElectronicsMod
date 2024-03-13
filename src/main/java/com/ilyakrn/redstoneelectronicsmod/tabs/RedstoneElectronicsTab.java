package com.ilyakrn.redstoneelectronicsmod.tabs;

import com.ilyakrn.redstoneelectronicsmod.init.InitItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RedstoneElectronicsTab extends CreativeTabs {

    public RedstoneElectronicsTab(String label) {
        super(label);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(InitItems.SOLDERING_IRON);
    }

}
