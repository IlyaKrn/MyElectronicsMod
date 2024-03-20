package com.ilyakrn.myelectronicsmod.tileentity;

import com.ilyakrn.myelectronicsmod.container.ContainerComponentBuilder;
import com.ilyakrn.myelectronicsmod.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.IItemHandler;

import java.util.logging.Logger;

public class TileEntityComponentBuilder extends TileEntityLockable implements ISidedInventory
{

    public static final int[][] inputSlots = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    public static final int outputSlot = 9;

    protected NonNullList<ItemStack> componentBuilderItemStacks = NonNullList.withSize(10, ItemStack.EMPTY);

    protected IItemHandler handlerTop = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.UP);
    protected IItemHandler handlerBottom = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.DOWN);
    protected IItemHandler handlerSide = new net.minecraftforge.items.wrapper.SidedInvWrapper(this, net.minecraft.util.EnumFacing.WEST);

    @Override
    public int getSizeInventory() {
        return componentBuilderItemStacks.size();
    }
    @Override
    public boolean isEmpty() {
        for (ItemStack itemstack : componentBuilderItemStacks) {
            if (!itemstack.isEmpty())
                return false;
        }
        return true;
    }
    @Override
    public ItemStack getStackInSlot(int index) {
        return componentBuilderItemStacks.get(index);
    }
    @Override
    public ItemStack decrStackSize(int index, int count) {
        return ItemStackHelper.getAndSplit(this.componentBuilderItemStacks, index, count);
    }
    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStackHelper.getAndRemove(this.componentBuilderItemStacks, index);
    }
    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        componentBuilderItemStacks.set(index, stack);
        if (!stack.isEmpty() && stack.getCount() > getInventoryStackLimit())
            stack.setCount(getInventoryStackLimit());
        markDirty();
    }

    @Override
    public String getName() {
        return "container.component_builder";
    }
    @Override
    public boolean hasCustomName() {
        return false;
    }
    @Override
    public int getInventoryStackLimit() {
        return 64;
    }
    @Override
    public void openInventory(EntityPlayer playerIn) {}
    @Override
    public void closeInventory(EntityPlayer playerIn) {}
    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return index < inputSlots.length * inputSlots[0].length;
    }
    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        int[] arr = new int[inputSlots.length * inputSlots[0].length];
        int index = 0;
        for (int i = 0; i < inputSlots.length; i++) {
            for (int j = 0; j < inputSlots[0].length; j++) {
                arr[index] = inputSlots[i][j];
                index++;
            }
        }
        return arr;
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return isItemValidForSlot(index, itemStackIn);
    }
    @Override
    public boolean canExtractItem(int parSlotIndex, ItemStack parStack, EnumFacing parFacing) {
        return true;
    }
    @Override
    public String getGuiID() {
        return Reference.MODID + ":component_builder";
    }
    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
        return new ContainerComponentBuilder(playerInventory, this);
    }
    @Override
    public int getField(int id) {
        return 0;
    }
    @Override
    public void setField(int id, int value) {}
    @Override
    public int getFieldCount() {
        return 0;
    }
    @Override
    public void clear() {
        componentBuilderItemStacks.clear();
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        if (facing != null && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
            if (facing == EnumFacing.DOWN)
                return (T) handlerBottom;
            else if (facing == EnumFacing.UP)
                return (T) handlerTop;
            else
                return (T) handlerSide;
        return super.getCapability(capability, facing);
    }
    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return !player.isSneaking();
    }

}