
package net.offllneplayer.opminecraft.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.offllneplayer.opminecraft.OPMinecraft;


public class DeclareTagKeys {
    public static class Blocks {
        public static final TagKey<Block> CRYING_PAXEL = createTag("mineable/crying_paxel");
        public static final TagKey<Block> CRASH_CRATES = createTag("crash_crates");

        public static final TagKey<Block> CRYING_OBSIDIAN_TRIGGERS = createTag("crying_obsidian_triggers");
        public static final TagKey<Block> WATERS = createTag("waters");
        public static final TagKey<Block> ICES = createTag("ices");
        public static final TagKey<Block> LIQUIDS = createTag("liquids");
        public static final TagKey<Block> SOUL_FIRE = createTag("soul_fire");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(OPMinecraft.Mod_ID, name));
        }

    }


    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(OPMinecraft.Mod_ID, name));
        }
    }
}

