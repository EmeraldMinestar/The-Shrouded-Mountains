package com.tsm.core;


import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * @see 
 * This file was Created by Eragonn1490 on 7/4/2018.
 */
public class ClientProxy extends ServerProxy
{   
    @Deprecated
    @Override
    public void registerItemRenderer(Item item, int meta, String id) 
    {
    }

    
	@Override
	public void setItemBlockWithMetadataInventoryModel(ItemBlock itemBlock, String... variants) 
	{
	}

	
	@Override
	public void registerBlockItemRenderer(ItemBlock item, int metadataRange)
    {
    }

	
	@Override
	public void registerItemBlockRenderer(ItemBlock itemBlock,int meta) 
	{
	}

	
	//FIXME clean up blockstates
	@Deprecated
	public void registerItemBlockRenderer(Item item, int range)
    {
    }


	@Override
    public void registerRenderInformation()
    {
    }
}