package dmillerw.mods.realismmod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import net.minecraft.src.*;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import dmillerw.mods.realismmod.client.ClientTickHandler;

@Mod( modid = "RealismMod", name="Realism Mod", version="1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class RealismMod {

	@SidedProxy(clientSide = "dmillerw.mods.realismmod.client.ClientProxy", serverSide = "dmillerw.mods.realismmod.CommonProxy")
	public static CommonProxy proxy;
	public static RealismMod instance;
	static int itemHammerID;
	static int itemIronRingID;
	static int itemBackpackID;
	public static boolean debug = false;
	
	@PreInit
    public void preload(FMLPreInitializationEvent evt) {	
		IDConfig.createConfig();
		proxy.registerRenderInformation();
	}
	
	//ACHIEVEMENTS
	
	//VARIABLES
	public static double weight;
	public static double modifiedWeight;
	public static double staticMaxWeight = 350;
	
	//BLOCKS
	
	//ITEMS
	public static Item itemHammer;
	public static Item itemIronRing;
	public static Item itemBackpack;
	
	@Init
	public void load(FMLInitializationEvent evt) {
		GetIDs();
		Items();
		//Blocks();
		Recipes();
		Names();
		WeightValues.createConfig();
		WeightValues.load();
		GameRegistry.registerCraftingHandler(new CraftingHandler());
	}
	
	void GetIDs() {
		File mcDir = Loader.instance().getConfigDir();
		File propertiesFile = new File(mcDir + "/weight.properties");
		
		if(propertiesFile.exists()) {
			Properties propRead = new Properties();
			
			try {
				propRead.load(new FileInputStream(mcDir + "/id.properties"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			itemHammerID = Integer.parseInt(propRead.getProperty("itemHammer"));
			itemIronRingID = Integer.parseInt(propRead.getProperty("itemIronRing"));
			itemBackpackID = Integer.parseInt(propRead.getProperty("itemBackpack"));
		}
	}
	
	void Items() {
		itemHammer = new ItemHammer(itemHammerID).setItemName("itemHammer");
		itemIronRing = new ItemIronRing(itemIronRingID).setItemName("itemIronRing");
		itemBackpack = new ItemBackpack(itemBackpackID, EnumArmorMaterial.CLOTH, 1, 1).setItemName("itemBackpack");
	}
	
	void Recipes() {
		GameRegistry.addRecipe(new ItemStack(itemHammer, 1), new Object[] {" I", "S ", 'I', Item.ingotIron, 'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(itemBackpack, 1), new Object[] {"S S", "L L", "LLL", 'S', Item.stick, 'L', Item.leather});
		GameRegistry.addRecipe(new ItemStack(Item.helmetChain, 1), new Object[] {"RRR", "R R", 'R', itemIronRing});
		GameRegistry.addRecipe(new ItemStack(Item.plateChain, 1), new Object[] {"R R", "RRR", "RRR", 'R', itemIronRing});
		GameRegistry.addRecipe(new ItemStack(Item.legsChain, 1), new Object[] {"RRR", "R R", "R R", 'R', itemIronRing});
		GameRegistry.addRecipe(new ItemStack(Item.bootsChain, 1), new Object[] {"R R", "R R", 'R', itemIronRing});
		GameRegistry.addShapelessRecipe(new ItemStack(Block.thinGlass, 4), new Object[] {Block.glass});
		GameRegistry.addShapelessRecipe(new ItemStack(itemIronRing, 6), new Object[] {new ItemStack(itemHammer, 1, -1), Item.ingotIron});
	}
	
	void Names() {
		LanguageRegistry.addName(itemHammer, "Hammer");
		LanguageRegistry.addName(itemIronRing, "Iron Ring");
		LanguageRegistry.addName(itemBackpack, "Backpack");
	}
}
