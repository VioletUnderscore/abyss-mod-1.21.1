package net.violetunderscore.abyss.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.violetunderscore.abyss.AbyssMod;

public class ModBlocks {

    public static final Block DARK_QUARTZ_ORE = registerBlock("dark_quartz_ore",
            new Block(AbstractBlock.Settings.create().strength(3.0F, 9.0F).
                    sounds(BlockSoundGroup.STONE).mapColor(MapColor.PALE_YELLOW)
                    .requiresTool()
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AbyssMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AbyssMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }
    public static void registerModBlocks() {
        AbyssMod.LOGGER.info("Registering Mod Blocks For " + AbyssMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(DARK_QUARTZ_ORE);
        });
    }
}
