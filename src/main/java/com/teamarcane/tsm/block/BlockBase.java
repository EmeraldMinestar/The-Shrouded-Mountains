package com.teamarcane.tsm.block;

import com.teamarcane.tsm.TSM;
import com.teamarcane.tsm.item.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

    protected String name;

<<<<<<< HEAD
    public BlockBase(Material material, String name) {
=======
    public BlockBase(String name) {
>>>>>>> 380566e386d2f4112d443855de98c39bb37241cb
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

<<<<<<< HEAD
    public BlockBase(String name) {
        super(null);
=======
    public BlockBase(String dirt_mountain, Material material) {
        super(material);
>>>>>>> 380566e386d2f4112d443855de98c39bb37241cb
    }

    public void registerItemModel(Item itemBlock) {
        TSM.proxy.registerItemRenderer((ItemBase) itemBlock, 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
