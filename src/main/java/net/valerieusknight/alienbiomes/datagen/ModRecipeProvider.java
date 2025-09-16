package net.valerieusknight.valsgemstones.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.valerieusknight.valsgemstones.block.ModBlocks;
import net.valerieusknight.valsgemstones.item.ModItems;
import net.valerieusknight.valsgemstones.util.ModTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK.asItem())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SWORD.get())
                .pattern(" S ")
                .pattern(" S ")
                .pattern(" T ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK.asItem())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SHOVEL.get())
                .pattern(" S ")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK.asItem())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_AXE.get())
                .pattern("SS ")
                .pattern("ST ")
                .pattern(" T ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK.asItem())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_HOE.get())
                .pattern("SS ")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.SAPPHIRE.get())
                .define('T', Items.STICK.asItem())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_GLASS.get(), 8)
                .pattern("GGG")
                .pattern("GSG")
                .pattern("GGG")
                .define('S', ModItems.SAPPHIRE.get())
                .define('G', Blocks.GLASS.asItem())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK)
                .unlockedBy("has_sapphire_block", has(ModBlocks.SAPPHIRE_BLOCK)).save(recipeOutput);
                //recipe names default to the output of the recipe, i.e. "sapphire.json"
                //if multiple recipes output the same item, this can cause errors
                //to fix this, use the following instead of .save(recipeOutput)
                //.save(recipeOutput, "modname:custom_recipe_name)";
        oreSmelting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(recipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.125f, 100, "sapphire");
    }
}
