package com.tsm.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import javax.annotation.Nullable;

/**
 * @see 
 * This file was Created by Eragonn1490 on 7/4/2018.
 */
public class ServerProxy implements IGuiHandler
{
	public void registerItemRenderer(Item item, int meta, String id) 
	{
	}

	public void setItemBlockWithMetadataInventoryModel(ItemBlock itemBlock, String... variants)
	{
	}

	public void registerRenderInformation() 
	{
	}
	
	public void registerItemBlockRenderer(ItemBlock itemBlock, int meta) 
	{
	}

	/**
	 *
	 * @param item block item
	 * @param metadataRange 1-16
	 */
	public void registerBlockItemRenderer(ItemBlock item, int metadataRange){}

    public enum GuiIDs
    {
    }

    @Override
	@Nullable
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
		return z;
    }

	@Override
	@Nullable
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		return z;
	}
}