package com.ilyakrn.myelectronicsmod.utils.handlers;

import com.ilyakrn.myelectronicsmod.container.ContainerComponentBuilder;
import com.ilyakrn.myelectronicsmod.gui.GuiBlockComponentBuilder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;

import java.util.logging.Logger;

public class GuiHandler implements IGuiHandler
{
    public enum GUI_ENUM {
         COMPONENT_BUILDER
    }
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
        if (tileEntity != null) {
            if (ID == GUI_ENUM.COMPONENT_BUILDER.ordinal()) {
                return new ContainerComponentBuilder(player.inventory, (IInventory) tileEntity);
            }
        }
        return null;
    }
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
        if (tileEntity != null) {
            if (ID == GUI_ENUM.COMPONENT_BUILDER.ordinal()) {
                return new GuiBlockComponentBuilder(player.inventory, (IInventory) tileEntity);
            }
        }

        return null;
    }
}