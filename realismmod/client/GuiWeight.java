package dmillerw.mods.realismmod.client;

import java.text.DecimalFormat;

import dmillerw.mods.realismmod.RealismMod;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayerSP;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.Gui;
import net.minecraft.src.ModLoader;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.World;

public class GuiWeight extends Gui {

	protected FontRenderer fontRenderer = ModLoader.getMinecraftInstance().fontRenderer;
    private Minecraft mc = ModLoader.getMinecraftInstance();
	
    public void render()
    {
         Minecraft minecraft = ModLoader.getMinecraftInstance();
         World world = minecraft.theWorld;
         EntityPlayerSP player = minecraft.thePlayer;
         ScaledResolution scaledresolution = new ScaledResolution(minecraft.gameSettings, minecraft.displayWidth, minecraft.displayHeight);
         int width = scaledresolution.getScaledWidth();
         int height = scaledresolution.getScaledHeight();
         
         if (RealismMod.weight > dmillerw.mods.realismmod.client.ClientTickHandler.maxweight && RealismMod.weight <= ClientTickHandler.maxweight + 100) {
				if(!player.capabilities.isCreativeMode) {
			         this.fontRenderer.drawString("You're over-encumbered, and will have trouble walking", 5, 8, 16777215);   
				}
         }      
         
         if (RealismMod.weight >= dmillerw.mods.realismmod.client.ClientTickHandler.maxweight + 100) {
				if(!player.capabilities.isCreativeMode) {
					this.fontRenderer.drawString("You're seriously over-encumbered, and will have trouble moving at all", 5, 8, 16777215);   
				}
			}
         
         DecimalFormat df = new DecimalFormat("#.#");
         String weight = df.format(RealismMod.weight);
         String maxweight = df.format(dmillerw.mods.realismmod.client.ClientTickHandler.maxweight);
         
         this.fontRenderer.drawString(weight + " / " + maxweight, 5, height - 8, 16777215);
    }
    
}