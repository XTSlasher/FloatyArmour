package net.slasherxt.floatyarmour;

import net.slasherxt.floatyarmour.handler.ConfigurationHandler;
import net.slasherxt.floatyarmour.init.ModItems;
import net.slasherxt.floatyarmour.init.Recipes;
import net.slasherxt.floatyarmour.proxy.IProxy;
import net.slasherxt.floatyarmour.reference.Reference;
import net.slasherxt.floatyarmour.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class FloatyArmour {

	@Instance("FloatyArmour")
	public static FloatyArmour instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		ModItems.init();
		
		LogHelper.info("PreInit Complete");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Recipes.init();

		LogHelper.info("Init Complete");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("PostInit Complete");

	}
}
