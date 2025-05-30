package net.valerieusknight.valsgemstones.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.valerieusknight.valsgemstones.ValsGemstones;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ValsGemstones.MOD_ID);

    //create the sapphire item
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire",() -> new Item(new Item.Properties()));
    public static final DeferredItem<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",() -> new PickaxeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
            .attributes(PickaxeItem.createAttributes(ModToolTiers.SAPPHIRE, 1, -2.8f))
    ));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
