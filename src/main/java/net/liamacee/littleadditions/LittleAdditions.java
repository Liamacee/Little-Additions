package net.liamacee.littleadditions;

import net.liamacee.littleadditions.block.ModBlocks;
import net.liamacee.littleadditions.item.ModCreativeModeTabs;
import net.liamacee.littleadditions.item.ModItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;

@Mod(LittleAdditions.MOD_ID)
public class LittleAdditions {
    public static final String MOD_ID = "littleadditions";

    public LittleAdditions(IEventBus modEventBus, ModContainer modContainer) {
        // Register the creative mode tab
        ModCreativeModeTabs.register(modEventBus);

        // Register the items/blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the config file
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
