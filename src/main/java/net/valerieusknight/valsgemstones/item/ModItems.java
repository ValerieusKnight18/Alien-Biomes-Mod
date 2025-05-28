package net.valerieusknight.valsgemstones.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.valerieusknight.valsgemstones.ValsGemstones;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ValsGemstones.MOD_ID);

    //create the sapphire item
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire",() -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
