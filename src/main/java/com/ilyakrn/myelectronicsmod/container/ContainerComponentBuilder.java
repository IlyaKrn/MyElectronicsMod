package com.ilyakrn.myelectronicsmod.container;

import com.ilyakrn.myelectronicsmod.tileentity.TileEntityComponentBuilder;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import java.util.logging.Logger;

public class ContainerComponentBuilder  extends Container
{
    private final TileEntityComponentBuilder tileComponentBuilder;
    private final int sizeInventory;

    public ContainerComponentBuilder(InventoryPlayer parInventoryPlayer, IInventory parIInventory) {
        tileComponentBuilder = (TileEntityComponentBuilder) parIInventory;
        sizeInventory = tileComponentBuilder.getSizeInventory();
        for (int i = 0; i < TileEntityComponentBuilder.inputSlots.length; i++){
            for (int j = 0; j < TileEntityComponentBuilder.inputSlots[0].length; j++) {
                addSlotToContainer(new Slot(tileComponentBuilder, TileEntityComponentBuilder.inputSlots[i][j], 30 + i * 18, 17 + j * 18));
            }
        }
        addSlotToContainer(new Slot(tileComponentBuilder, TileEntityComponentBuilder.outputSlot, 124, 35));

        int i;
        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                addSlotToContainer(new Slot(parInventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (i = 0; i < 9; ++i)
        {
            addSlotToContainer(new Slot(parInventoryPlayer, i, 8 + i * 18, 142));
        }
    }

    @Override
    public void addListener(IContainerListener listener) {
        super.addListener(listener);
        listener.sendAllWindowProperties(this, tileComponentBuilder);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return tileComponentBuilder.isUsableByPlayer(playerIn);
    }
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int slotIndex) {
        ItemStack itemStack1 = ItemStack.EMPTY;
        Slot slot = inventorySlots.get(slotIndex);
        Logger.getGlobal().info(String.valueOf(slotIndex));
        Logger.getGlobal().info(tileComponentBuilder.getStackInSlot(slotIndex).getItem().getUnlocalizedName());
        if (slot != null && slot.getHasStack()) {
            ItemStack itemStack2 = slot.getStack();
            ItemStack[][] in = new ItemStack[TileEntityComponentBuilder.inputSlots.length][TileEntityComponentBuilder.inputSlots[0].length];
            int index = 0;
            for (int i = 0; i < TileEntityComponentBuilder.inputSlots.length; i++) {
                for (int j = 0; j < TileEntityComponentBuilder.inputSlots[0].length; j++) {
                    in[i][j] = tileComponentBuilder.getStackInSlot(index);
                    i++;
                }
            }
        }
           // itemStack1 = itemStack2.copy();

//
//
//
//
//
      //    //  if (slotIndex == TileEntityComponentBuilder.slotEnum.OUTPUT_SLOT.ordinal()) {
      //    //      if (!mergeItemStack(itemStack2, sizeInventory, sizeInventory + 36, true)) {
      //    //          return ItemStack.EMPTY;
      //    //      }
      //    //      slot.onSlotChange(itemStack2, itemStack1);
      //    //  } else if (slotIndex != TileEntityComponentBuilder.slotEnum.INPUT_SLOT_11.ordinal()) {
      //    //      // check if there is a compacting recipe for the stack
      //    //      if (new ItemStack(InitItems.ITEM_CHIP_BOTTOM) != ItemStack.EMPTY) {
      //    //          if (!mergeItemStack(itemStack2, 0, 1, false)) {
      //    //              return ItemStack.EMPTY;
      //    //          }
      //    //      } else if (slotIndex >= sizeInventory && slotIndex < sizeInventory + 27) // player inventory slots
      //    //      {
      //    //          if (!mergeItemStack(itemStack2, sizeInventory + 27, sizeInventory + 36, false)) {
      //    //              return ItemStack.EMPTY;
      //    //          }
      //    //      } else if (slotIndex >= sizeInventory + 27 && slotIndex < sizeInventory + 36
      //    //              && !mergeItemStack(itemStack2, sizeInventory + 1, sizeInventory + 28, false)) // hotbar slots
      //    //      {
      //    //          return ItemStack.EMPTY;
      //    //      }
      //    //  } else if (!mergeItemStack(itemStack2, sizeInventory, sizeInventory + 36, false))
      //    //      return ItemStack.EMPTY;
      //    //  if (itemStack2.getCount() == 0)
      //    //      slot.putStack(ItemStack.EMPTY);
      //    //  else
      //    //      slot.onSlotChanged();
      //    //  if (itemStack2.getCount() == itemStack1.getCount())
      //    //      return ItemStack.EMPTY;
      //    //  slot.onTake(playerIn, itemStack2);
      //  }
        return itemStack1;
    }
}
