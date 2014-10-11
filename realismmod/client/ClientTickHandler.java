package dmillerw.mods.realismmod.client;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumOptions;
import net.minecraft.src.GuiInventory;
import net.minecraft.src.GuiScreen;
import net.minecraft.src.Item;
import net.minecraft.src.ModLoader;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import dmillerw.mods.realismmod.RealismMod;
import dmillerw.mods.realismmod.WeightValues;

public class ClientTickHandler implements ITickHandler {

	GuiWeight guiweight = new GuiWeight();
	boolean isInventory;
	public static double maxweight;
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		if (type.equals((EnumSet.of(TickType.RENDER)))) {
			onRenderTick();
		}
		else if (type.equals((EnumSet.of(TickType.CLIENT)))) {
			GuiScreen guiscreen = Minecraft.getMinecraft().currentScreen;
			if (guiscreen != null) {
				onTickInGui(guiscreen);
			} else {
				onTickInGame();
			}
		}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.RENDER, TickType.CLIENT);
	}

	@Override
	public String getLabel() { return null; }
	
	public void onRenderTick() {
		Minecraft minecraft = FMLClientHandler.instance().getClient();
		if (minecraft.inGameHasFocus && minecraft.isGuiEnabled())
        {
			if (!minecraft.thePlayer.capabilities.isCreativeMode) {
				guiweight.render();
			}
        }
	}
	
	public void onTickInGui(GuiScreen guiscreen) {}
	
	public void onTickInGame() {
		
		dmillerw.mods.realismmod.RealismMod.modifiedWeight = RealismMod.staticMaxWeight;
		
		EntityPlayer player = FMLClientHandler.instance().getClient().thePlayer;
		
		if (!player.capabilities.isCreativeMode) {
			
			if (player.inventory.armorInventory[2] != null && player.inventory.armorInventory[2].itemID == RealismMod.itemBackpack.shiftedIndex) {
				RealismMod.modifiedWeight = RealismMod.modifiedWeight + 250;
			}
			
			if (player.isSwinging) {
				ModLoader.getMinecraftInstance().thePlayer.inventory.inventoryChanged = true;
			}
			
			if (player.getFoodStats().getFoodLevel() <= 15 && player.getFoodStats().getFoodLevel() >= 10) {
				RealismMod.modifiedWeight = RealismMod.modifiedWeight - 50;
			}
			
			if (player.getFoodStats().getFoodLevel() <= 10 && player.getFoodStats().getFoodLevel() >= 0) {
				RealismMod.modifiedWeight = RealismMod.modifiedWeight - 100;
			}
			
			maxweight = RealismMod.modifiedWeight;
			
			if (RealismMod.weight > maxweight && RealismMod.weight <= maxweight + 100) {
				player.motionX *= 0.4D;
		        player.motionZ *= 0.4D;
			}
			
			if (RealismMod.weight >= maxweight + 100) {
				player.motionX *= 0.1D;
				player.motionZ *= 0.1D;
			}
			
			if (FMLClientHandler.instance().getClient().thePlayer.inventory.inventoryChanged) {
				RealismMod.weight = 0;
				double weightStackedFinal = 0;
				int s = 0;
				for (int a = 0; a < 4; a++) {
					if (FMLClientHandler.instance().getClient().thePlayer.inventory.armorInventory[a] != null) {
						double weightArmor = 0;
						int armorID = FMLClientHandler.instance().getClient().thePlayer.inventory.armorInventory[a].itemID;
						if (armorID != 0) {
		            		if(WeightValues.IDs.contains(Integer.valueOf(armorID))) {
	            				weightArmor = WeightValues.weights.get(WeightValues.IDs.indexOf(Integer.valueOf(armorID)));
		            		}
		            		else {
		            			weightArmor = 0;
		            		}
		            		RealismMod.weight = RealismMod.weight + weightArmor;    		
		            	}
					}
				}
				for (int i = 0; i < 36; i++) {
					double weightItem = 0;
					double weightStacked = 0;
		            if (FMLClientHandler.instance().getClient().thePlayer.inventory.getStackInSlot(i) != null) {
		            	int stackSize = FMLClientHandler.instance().getClient().thePlayer.inventory.getStackInSlot(i).stackSize;
		            	int id = FMLClientHandler.instance().getClient().thePlayer.inventory.getStackInSlot(i).itemID;
		            	
		            	if (id != 0 && FMLClientHandler.instance().getClient().thePlayer.inventory.getStackInSlot(i) != null) {
     		
		            		if(WeightValues.IDs.contains(Integer.valueOf(id))) {
	            				weightItem = WeightValues.weights.get(WeightValues.IDs.indexOf(Integer.valueOf(id)));
		            		}
		            		else {
		            			weightItem = 0;
		            		}

			            	for (s = 0; s < stackSize; s++) {
			            		weightStacked = weightStacked + weightItem;
			            	}			       
			            	
			            	if (s % 2 == 0) {
			            		weightStacked = weightStacked / 2;
			            	}
			            	
			            	/*if (s != 1) {
			            		weightStackedFinal = Math.floor(weightStacked / 4);
			            	} else {
			            		weightStackedFinal = weightStacked;
			            	}*/
			            	
			            	RealismMod.weight = RealismMod.weight + weightStacked;
			            	
		            	}
		            }
		        }
				
				if (player.inventory.armorInventory[2] != null && player.inventory.armorInventory[2].itemID == RealismMod.itemBackpack.shiftedIndex) {
					double weightToRemove = RealismMod.weight / 4;
					RealismMod.weight = RealismMod.weight - weightToRemove;
				}
				
				FMLClientHandler.instance().getClient().thePlayer.inventory.inventoryChanged = false;
	        }
		}
	}
}
