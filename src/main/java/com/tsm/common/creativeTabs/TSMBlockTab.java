package com.tsm.common.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TSMBlockTab extends CreativeTabs
{	
    public TSMBlockTab(String texture)
    {
        super(texture);
        setNoTitle();
    }
    
    public String getBackgroundImageName()
    {
        return "item_search.png";
    }
    
    @Override
    public boolean hasSearchBar()
    {
        return true;
    }

	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Items.APPLE);
	}
}