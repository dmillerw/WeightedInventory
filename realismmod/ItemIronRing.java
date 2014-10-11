package dmillerw.mods.realismmod;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class ItemIronRing extends Item {
	
	protected ItemIronRing(int par1) {
		super(par1);
		this.setMaxStackSize(64);
		this.setTabToDisplayOn(CreativeTabs.tabMaterials);
		this.setIconIndex(0);
	}
	
	public String getTextureFile() {
		return "/dmillerw/mods/realismmod/client/resources/realismitems.png";
	}
}
