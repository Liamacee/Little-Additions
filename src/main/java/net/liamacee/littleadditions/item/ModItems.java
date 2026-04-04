package net.liamacee.littleadditions.item;

import net.liamacee.littleadditions.LittleAdditions;
import net.liamacee.littleadditions.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LittleAdditions.MOD_ID);

    public static final DeferredItem<Item> TINY_COAL = ITEMS.register("tiny_coal",
            () -> new FuelItem(new Item.Properties(), 200));
    public static final DeferredItem<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal",
            () -> new FuelItem(new Item.Properties(), 200));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
