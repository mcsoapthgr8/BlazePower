package com.mcsoapthgr8.plausiblyvanilla.machines;

import com.mcsoapthgr8.plausiblyvanilla.base.Constants;
import com.mcsoapthgr8.plausiblyvanilla.containers.PVBlocks;
import com.mcsoapthgr8.plausiblyvanilla.machines.grinder.GrinderBlock;
import com.mcsoapthgr8.plausiblyvanilla.utils.PVRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;

public class MachinesInitializer {
    public static void initialize() {
        PVRegistry.registerBlock(
                Constants.NAME_BLOCK_GRINDER,
                PVBlocks.GRINDER = new GrinderBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.5F)));
    }
}
