package com.ilyakrn.redstoneelectronicsmod.items;

import com.ilyakrn.redstoneelectronicsmod.init.InitItems;
import com.ilyakrn.redstoneelectronicsmod.init.InitTabs;
import com.ilyakrn.redstoneelectronicsmod.main.Main;
import com.ilyakrn.redstoneelectronicsmod.utils.interfaces.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
