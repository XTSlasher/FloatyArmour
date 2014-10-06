package net.slasherxt.floatyarmour.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.airBladder), "lsl", "l l", "lll", 's', new ItemStack(Items.string), 'l', new ItemStack(Items.leather)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.floatingChest), "a a", "aaa", "aaa", 'a', new ItemStack(ModItems.airBladder)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.floatingHelm), "aaa", "a a", 'a', new ItemStack(ModItems.airBladder)));
	}
}
