package com.ilyakrn.myelectronicsmod.items;

import com.ilyakrn.myelectronicsmod.init.InitItems;
import com.ilyakrn.myelectronicsmod.init.InitTabs;
import com.ilyakrn.myelectronicsmod.main.Main;
import com.ilyakrn.myelectronicsmod.utils.interfaces.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSolderingIron extends Item implements IHasModel {

    private static final int DURABILITY = 384;
    private static final int DAMAGE_FROM_USE = 24;
    private static final int DAMAGE_FROM_ATTACK = 128;
    private static final int REPAIR_INTERVAL = 3;

    private int repairTimer = 0;

    public ItemSolderingIron(String name) {
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(InitTabs.MY_ELECTRONICS_TAB);
        setMaxStackSize(1);
        setMaxDamage(DURABILITY);
        InitItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        repairTimer++;
        if(repairTimer == REPAIR_INTERVAL) {
            stack.setItemDamage(stack.getItemDamage() - 1);
            repairTimer = 0;
        }
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
    }
    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return slotChanged;
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        if(DURABILITY - stack.getItemDamage() > DAMAGE_FROM_ATTACK)
            entity.setFire(3);
        if(stack.getItemDamage() + DAMAGE_FROM_ATTACK > DURABILITY)
            stack.setItemDamage(DURABILITY);
        else
            stack.setItemDamage(stack.getItemDamage() + DAMAGE_FROM_ATTACK);
        return super.onLeftClickEntity(stack, player, entity);
    }
}
