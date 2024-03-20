package com.ilyakrn.myelectronicsmod.gui;

import com.ilyakrn.myelectronicsmod.container.ContainerComponentBuilder;
import com.ilyakrn.myelectronicsmod.main.Main;
import com.ilyakrn.myelectronicsmod.reference.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.util.ResourceLocation;

import java.util.logging.Logger;

public class GuiBlockComponentBuilder extends GuiContainer {

    private static final ResourceLocation COMPACTOR_GUI_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/gui/container/component_builder.png");
    private final IInventory tileComponentBuilder;

    public GuiBlockComponentBuilder(InventoryPlayer parInventoryPlayer, IInventory parInventoryComponentBuilder) {
        super(new ContainerComponentBuilder(parInventoryPlayer, parInventoryComponentBuilder));
        tileComponentBuilder = parInventoryComponentBuilder;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String s = tileComponentBuilder.getDisplayName().getUnformattedText();
        fontRenderer.drawString(s, 28, 6, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        drawDefaultBackground();
        mc.getTextureManager().bindTexture(COMPACTOR_GUI_TEXTURES);
        int marginHorizontal = (width - xSize) / 2;
        int marginVertical = (height - ySize) / 2;
        drawTexturedModalRect(marginHorizontal, marginVertical, 0, 0, xSize, ySize);
    }



}
