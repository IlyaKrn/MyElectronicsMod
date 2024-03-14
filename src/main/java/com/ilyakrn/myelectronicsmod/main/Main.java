package com.ilyakrn.myelectronicsmod.main;

import com.ilyakrn.myelectronicsmod.proxy.CommonProxy;
import com.ilyakrn.myelectronicsmod.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSION)
public class Main {


    @Mod.Instance
    public static Main instance;
    private static Logger logger;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
    @EventHandler
    public void postInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

}
