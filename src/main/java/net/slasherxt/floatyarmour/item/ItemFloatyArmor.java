package net.slasherxt.floatyarmour.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.slasherxt.floatyarmour.init.ModItems;

public class ItemFloatyArmor extends ItemArmor {
	
	public ItemFloatyArmor(ArmorMaterial armor, int type, int index) {
		super(armor, type, index);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {		
		if(player.isInWater()) {
			if(this.armorType == 0) {
				player.addPotionEffect(new PotionEffect(13, 30));
			}
			
			if(this.armorType == 1) {
				player.motionY += 0.03F;
			}
		}	
    }
}
