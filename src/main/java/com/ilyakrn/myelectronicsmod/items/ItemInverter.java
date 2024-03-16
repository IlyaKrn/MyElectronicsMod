package com.ilyakrn.myelectronicsmod.items;

import com.ilyakrn.myelectronicsmod.init.InitItems;
import com.ilyakrn.myelectronicsmod.init.InitTabs;
import com.ilyakrn.myelectronicsmod.main.Main;
import com.ilyakrn.myelectronicsmod.utils.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemInverter extends Item implements IHasModel {


    public ItemInverter(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(InitTabs.MY_ELECTRONICS_TAB);
        setMaxStackSize(64);
        InitItems.ITEMS.add(this);
    }



    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
