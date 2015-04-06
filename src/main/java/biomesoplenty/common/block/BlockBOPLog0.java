/*******************************************************************************
 * Copyright 2014, the Biomes O' Plenty Team
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/


package biomesoplenty.common.block;

import net.minecraft.block.properties.PropertyEnum;

public class BlockBOPLog0 extends BlockBOPLog {

    public static final int PAGENUM = 0;
    
    // create a static reference to this block's variant property
    // this is for convenience, and for consistency with other Block classes
    public static final PropertyEnum VARIANT = BlockBOPLog.getVariantProperty(PAGENUM);
    
    @Override
    public int getPageNum() {return PAGENUM;}

}