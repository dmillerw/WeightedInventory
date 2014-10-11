package dmillerw.mods.realismmod;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemHammer extends Item {
	
	protected ItemHammer(int par1) {
		super(par1);
		this.setMaxDamage(256);
		this.setMaxStackSize(1);
		this.setTabToDisplayOn(CreativeTabs.tabTools);
		this.setIconIndex(1);
	}
	
	public boolean isFull3D() {
		return true;
	}
	
	public String getTextureFile() {
		return "/dmillerw/mods/realismmod/client/resources/realismitems.png";
	}
}
