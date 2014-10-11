package dmillerw.mods.realismmod.client;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.registry.TickRegistry;
import dmillerw.mods.realismmod.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
	public void registerRenderInformation() {
		MinecraftForgeClient.preloadTexture("/dmillerw/mods/realismmod/client/resources/realismitems.png");
		MinecraftForgeClient.preloadTexture("/armor/cloth_1.png");
		
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
	}
	
}
