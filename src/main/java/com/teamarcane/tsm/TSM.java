package com.teamarcane.tsm;

import com.teamarcane.tsm.block.TSMBlocks;
import com.teamarcane.tsm.item.TSMItems;
import com.teamarcane.tsm.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.http.config.Registry;

@Mod(modid = TSM.modId, name = TSM.name, version = TSM.version)
public class TSM {

    public static final String modId = "TSM";
    public static final String name = "The Shrouded Mountains";
    public static final String version = "1.0";

    @Mod.Instance(modId)
    public static TSM instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + "is loading!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}

    @SidedProxy(serverSide = "com.teamarcane.tsm.proxy.CommonProxy", clientSide = "com.teamarcane.tsm.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            TSMItems.register(event.getRegistry());
            TSMBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event) {
            TSMItems.registerModels();
            TSMBlocks.registerModels();
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            TSMBlocks.register(event.getRegistry());
        }
    }
}
