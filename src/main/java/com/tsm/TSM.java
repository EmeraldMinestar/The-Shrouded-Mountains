package com.tsm;

import java.io.File;
import java.util.logging.Logger;

//Mod Imports
import com.tsm.common.creativeTabs.*;
import com.tsm.common.utils.*;
import com.tsm.core.ServerProxy;


//Forge & Minecraft Imports
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.server.FMLServerHandler;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * @see 
 * This file was Created by Eragonn1490 on 7/4/2018.
 */

@Mod(modid = constants.MODID, name = constants.NAME, version = constants.VERSION)
public class TSM
{
	//Proxies
	@SidedProxy(serverSide = "com.tsm.core.ServerProxy", clientSide = "com.tsm.core.ClientProxy")
	public static ServerProxy proxy;

	//Instance
	@Mod.Instance(constants.MODID)
	public static com.tsm.TSM instance;

	//Setup Config Files
	public static Configuration config;

	//Creative Tab
	public static CreativeTabs TSM = new TSMBlockTab(constants.MODID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Logger.info("[The Shrouded Mountians] Pre-initialization started");

		config = new Configuration(new File(event.getModConfigurationDirectory(), "TSM/config.txt"));

		//Setup Config File Based Upon Side just incase you add specific use conditional config files or things like that
		clientorserver(event);

		try {
			config.load();
			constants.config();
		}
		finally {
			if (config.hasChanged()) { config.save(); }
		}
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new ServerProxy());
		proxy.registerRenderInformation();
		MinecraftForge.EVENT_BUS.register(this);

		//Logger.info("[The Shrouded Mountians] ended phase 1");
	}

	private void clientorserver(FMLPreInitializationEvent event) 
	{
		if(event.getSide() == Side.CLIENT)
		{
			//just incase you add specific use conditional config files or things like that
		}
		if(event.getSide() == Side.SERVER)
		{
			//just incase you add specific use conditional config files or things like that
		}
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

		//logger.info("[The Shrouded Mountians] ended phase 2");
	}

	@EventHandler
	public void init(FMLPostInitializationEvent event)
	{

		//logger.info("[The Shrouded Mountians] has fully loaded!");
	}
}