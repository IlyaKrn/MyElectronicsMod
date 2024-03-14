package com.ilyakrn.myelectronicsmod.items;

import com.ilyakrn.myelectronicsmod.init.InitItems;
import com.ilyakrn.myelectronicsmod.init.InitTabs;
import com.ilyakrn.myelectronicsmod.main.Main;
import com.ilyakrn.myelectronicsmod.utils.interfaces.IHasModel;
import net.minecraft.item.Item;

public class Transistor extends Item implements IHasModel {
    public Transistor(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(InitTabs.REDSTONE_ELECTRONICS_TAB);
        setMaxStackSize(64);
        InitItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
