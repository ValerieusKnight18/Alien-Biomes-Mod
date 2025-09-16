package net.valerieusknight.valsgemstones.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.valerieusknight.valsgemstones.ValsGemstones;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = createTag("needs_sapphire_tool");
        public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = createTag("incorrect_for_sapphire_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(ValsGemstones.MOD_ID, name));
        }
    }
}
