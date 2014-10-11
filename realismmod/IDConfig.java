package dmillerw.mods.realismmod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Loader;

import net.minecraft.src.ModLoader;

public class IDConfig {
	
	static File mcDir = Loader.instance().getConfigDir();
	static File propertiesFile = new File(mcDir + "/id.properties");
	
	public static void createConfig() {
		Properties prop = new Properties();	
		prop.setProperty("itemIronRing", "3000");
		prop.setProperty("itemHammer", "3001");
		prop.setProperty("itemBackpack", "3002");
		
		if (!propertiesFile.exists()) {
			try {
				System.out.println("Realism Mod: WRITING ITEM ID CONFIG FILE");
				prop.store(new FileOutputStream(mcDir + "/id.properties"), null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
