package net.slasherxt.floatyarmour.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.slasherxt.floatyarmour.creativetab.CreativeTabFA;
import net.slasherxt.floatyarmour.item.ItemFloatyArmor;
import net.slasherxt.floatyarmour.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final Item floatingHelm = new ItemFloatyArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 0).setCreativeTab(CreativeTabFA.FA_TAB).setTextureName("leather_helmet").setUnlocalizedName("floatyHelm");
	public static final Item floatingChest = new ItemFloatyArmor(ItemArmor.ArmorMaterial.CLOTH, 0, 1).setCreativeTab(CreativeTabFA.FA_TAB).setTextureName("leather_chestplate").setUnlocalizedName("floatyChest");
	public static final Item airBladder = new Item().setCreativeTab(CreativeTabFA.FA_TAB).setUnlocalizedName("airBladder").setTextureName(Reference.MOD_ID + ":airBladder");
	
	public static void init() {
		GameRegistry.registerItem(floatingHelm, "floatingHelm");
		GameRegistry.registerItem(floatingChest, "floatingChest");
		GameRegistry.registerItem(airBladder, "airBladder");
	}
}
