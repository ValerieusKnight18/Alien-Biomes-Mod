package net.valerieusknight.valsgemstones.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.valerieusknight.valsgemstones.ValsGemstones;
import net.valerieusknight.valsgemstones.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ValsGemstones.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SAPPHIRE.get());
        handheldItem(ModItems.SAPPHIRE_PICKAXE.get());
        handheldItem(ModItems.SAPPHIRE_SWORD.get());
        handheldItem(ModItems.SAPPHIRE_SHOVEL.get());
        handheldItem(ModItems.SAPPHIRE_AXE.get());
        handheldItem(ModItems.SAPPHIRE_HOE.get());
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(ValsGemstones.MOD_ID, "item/" + item.getId().getPath()));
    }
}
