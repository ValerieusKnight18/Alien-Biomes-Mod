package net.valerieusknight.alien_biomes.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.valerieusknight.alien_biomes.AlienBiomes;
import net.valerieusknight.alien_biomes.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AlienBiomes.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_GLASS);
        blockWithItem(ModBlocks.SMOOTH_STONY_CHONDRITE);
        blockWithItem(ModBlocks.ROUGH_STONY_CHONDRITE);
        blockWithItem(ModBlocks.CARBONACEOUS_CHONDRITE);
    }
    //helper method for normal blocks
    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}

