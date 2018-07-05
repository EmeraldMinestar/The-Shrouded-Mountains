package com.tsm.common.utils;

import com.tsm.TSM;


/**
 * @see 
 * This file was Created by Eragonn1490 on 7/4/2018.
 */
public class constants 
{
	public static final String MODID = "tsm";
    public static final String NAME = "The Shrouded Mountians";
    public static final String VERSION = "0.0.1-Alpha";
    
   
    //For Config
    public static boolean test;
    
    //For Debugging

	public static void config() 
	{
		test = TSM.config.getBoolean("Test", "Test", true, "this is just a test");
	}
}