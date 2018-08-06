package com.teamarcane.tsm.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class TSMItems {

    //Materials
    public static ItemBase crystalAmaris = new ItemBase("crystal_amaris").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase ingotShirium = new ItemBase("ingot_shirium").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase stickMountainwood = new ItemBase("stick_mountainwood").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemBase oreRedstoneMountain = new ItemBase("ore_redstone_mountain").setCreativeTab(CreativeTabs.MATERIALS);

    //Weapons
    public static ItemBase rifleRedstone = new ItemBase("rifle_redstone").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry) {

        //Materials
        registry.registerAll(crystalAmaris);
        registry.registerAll(ingotShirium);
        registry.registerAll(stickMountainwood);
        registry.registerAll(oreRedstoneMountain);

        //Weapons
        registry.registerAll(rifleRedstone);
    }

    public static void registerModels() {

        //Materials
        crystalAmaris.registerItemModel();
        ingotShirium.registerItemModel();
        stickMountainwood.registerItemModel();
        oreRedstoneMountain.registerItemModel();

        //Weapons
        rifleRedstone.registerItemModel();

    }
}
