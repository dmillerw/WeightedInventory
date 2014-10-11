package dmillerw.mods.realismmod;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IInventory;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingHandler implements ICraftingHandler {

	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory matrix) {
		for(int i=0; i<matrix.getSizeInventory(); i++) {               
			if(matrix.getStackInSlot(i) != null) {
				ItemStack itemnew = matrix.getStackInSlot(i);
				if (itemnew != null && itemnew.getItem() == RealismMod.itemHammer && itemnew.getItemDamage() < itemnew.getMaxDamage()) {
					ItemStack k = new ItemStack(RealismMod.itemHammer, 2);
					k.setItemDamage(itemnew.getItemDamage() + 1);
					matrix.setInventorySlotContents(i, k);
				}
			}      
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) {

	}

}
