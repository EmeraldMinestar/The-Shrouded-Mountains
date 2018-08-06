package com.teamarcane.tsm.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class TSMBlocks {

    //Ores
    public static BlockOre oreAmaris = new BlockOre("ore_amaris").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockOre oreShirium = new BlockOre("ore_shirium").setCreativeTab(CreativeTabs.MATERIALS);

    //Terrain
    public static BlockBase dirtMountain = new BlockBase("dirt_mountain").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockBase stoneMountain = new BlockBase("stone_mountain").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockBase grassMountain = new BlockBase("grass_mountain").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockBase logMountainwood = new BlockBase("log_mountainwood").setCreativeTab(CreativeTabs.MATERIALS);

    //Materials
    public static BlockBase planksMountainwood = new BlockBase("planks_mountainwood").setCreativeTab(CreativeTabs.MATERIALS);

    //Building Blocks
    public static BlockBase bricksMountainStone = new BlockBase("bricks_mountain_stone").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Block> registry) {

        //Ores
        registry.registerAll(oreAmaris);
        registry.registerAll(oreShirium);

        //Terrain
        registry.registerAll(dirtMountain);
        registry.registerAll(stoneMountain);
        registry.registerAll(grassMountain);
        registry.registerAll(logMountainwood);

        //Materials
        registry.registerAll(planksMountainwood);

        //Building Blocks
        registry.registerAll(bricksMountainStone);
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {

        //Ores
        registry.registerAll(oreAmaris.createItemBlock());
        registry.registerAll(oreShirium.createItemBlock());

        //Terrain
        registry.registerAll(dirtMountain.createItemBlock());
        registry.registerAll(stoneMountain.createItemBlock());
        registry.registerAll(grassMountain.createItemBlock());
        registry.registerAll(logMountainwood.createItemBlock());

        //Materials
        registry.registerAll(planksMountainwood.createItemBlock());

        //Building Blocks
        registry.registerAll(bricksMountainStone.createItemBlock());

    }

    public static void registerModels() {

        //Ores
        oreAmaris.registerItemModel(Item.getItemFromBlock(oreAmaris));
        oreShirium.registerItemModel(Item.getItemFromBlock(oreAmaris));

        //Terrain
        dirtMountain.registerItemModel(Item.getItemFromBlock(dirtMountain));
        stoneMountain.registerItemModel(Item.getItemFromBlock(stoneMountain));
        grassMountain.registerItemModel(Item.getItemFromBlock(grassMountain));
        logMountainwood.registerItemModel(Item.getItemFromBlock(logMountainwood));

        //Materials
        planksMountainwood.registerItemModel(Item.getItemFromBlock(planksMountainwood));

        //Building Blocks
        bricksMountainStone.registerItemModel(Item.getItemFromBlock(bricksMountainStone));
    }

}
