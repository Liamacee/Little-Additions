package net.liamacee.littleadditions.item;

import net.liamacee.littleadditions.LittleAdditions;
import net.liamacee.littleadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LittleAdditions.MOD_ID);

    public static final Supplier<CreativeModeTab> LITTLE_ADDITIONS_ITEMS_TAB = CREATIVE_MODE_TAB.register("little_additions_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TINY_COAL.get()))
                    .title(Component.translatable("creativetab.littleadditions.little_additions_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TINY_COAL);
                        output.accept(ModItems.TINY_CHARCOAL);
                        output.accept(ModBlocks.CHARCOAL_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
