package net.valerieusknight.alien_biomes.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.valerieusknight.alien_biomes.AlienBiomes;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AlienBiomes.MOD_ID);

    //create the sapphire item
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire",() -> new Item(new Item.Properties()));
    //sapphire tools
    public static final DeferredItem<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",() -> new PickaxeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
            .attributes(PickaxeItem.createAttributes(ModToolTiers.SAPPHIRE, 1, -2.8f))));
    public static final DeferredItem<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",() -> new SwordItem(ModToolTiers.SAPPHIRE, new Item.Properties()
            .attributes(SwordItem.createAttributes(ModToolTiers.SAPPHIRE, 3, -2.4f))));
    public static final DeferredItem<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",() -> new ShovelItem(ModToolTiers.SAPPHIRE, new Item.Properties()
            .attributes(ShovelItem.createAttributes(ModToolTiers.SAPPHIRE, 1, -2.8f))));
    public static final DeferredItem<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",() -> new AxeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
            .attributes(AxeItem.createAttributes(ModToolTiers.SAPPHIRE, 5, -3f))));
    public static final DeferredItem<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",() -> new HoeItem(ModToolTiers.SAPPHIRE, new Item.Properties()
            .attributes(HoeItem.createAttributes(ModToolTiers.SAPPHIRE, 0, -2.8f))));
    //peridot gem item
    public static  final DeferredItem<Item> PERIDOT = ITEMS.register("peridot", () -> new Item(new Item.Properties()));
    //olivine gem item
    public static final DeferredItem<Item> OLIVINE = ITEMS.register("olivine", () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
