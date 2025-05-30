package net.valerieusknight.valsgemstones.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.valerieusknight.valsgemstones.util.ModTags;

public class ModToolTiers {
    public static final Tier SAPPHIRE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SAPPHIRE_TOOL, 1000, 8f, 3f, 20, ()-> Ingredient.of(ModItems.SAPPHIRE));
}
