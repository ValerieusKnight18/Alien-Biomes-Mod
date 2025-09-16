package net.valerieusknight.alienbiomes.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.valerieusknight.alienbiomes.AlienBiomes;
import net.valerieusknight.alienbiomes.AlienBiomes;
import net.valerieusknight.alienbiomes.item.ModItems;
import net.valerieusknight.alienbiomes.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, AlienBiomes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //tag(ModTags.Items.TRANSFORMABLE_ITEMS);
        tag(ItemTags.PICKAXES)
                .add(ModItems.SAPPHIRE_PICKAXE.get());
        tag(ItemTags.SWORDS)
                .add(ModItems.SAPPHIRE_SWORD.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.SAPPHIRE_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.SAPPHIRE_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.SAPPHIRE_HOE.get());
    }
}
