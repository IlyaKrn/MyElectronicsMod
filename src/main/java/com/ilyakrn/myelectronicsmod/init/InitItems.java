package com.ilyakrn.myelectronicsmod.init;


import com.ilyakrn.myelectronicsmod.items.SolderingIron;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class InitItems {
    public static final ArrayList<Item> ITEMS = new ArrayList<>();

    public static final Item SOLDERING_IRON = new SolderingIron("soldering_iron");
    public static final Item TRANSISTOR = new SolderingIron("transistor");
}
