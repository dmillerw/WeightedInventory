package dmillerw.mods.realismmod;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemBackpack extends ItemArmor implements IArmorTextureProvider {

	protected ItemBackpack(int par1, EnumArmorMaterial material, int par3, int par4) {
		super(par1, material, par3, par4);
		this.setTabToDisplayOn(CreativeTabs.tabTools);
		this.setMaxDamage(0);
		this.setMaxStackSize(0);
	}

	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		return "/armor/cloth_1.png";
	}

}
