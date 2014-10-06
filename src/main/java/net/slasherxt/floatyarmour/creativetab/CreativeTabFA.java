package net.slasherxt.floatyarmour.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.slasherxt.floatyarmour.reference.Reference;

public class CreativeTabFA {
	public static final CreativeTabs FA_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return Items.leather_chestplate;
		}
	};
}
