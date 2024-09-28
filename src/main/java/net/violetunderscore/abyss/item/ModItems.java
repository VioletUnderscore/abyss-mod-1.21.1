package net.violetunderscore.abyss.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.violetunderscore.abyss.AbyssMod;

public class ModItems {

    public static final Item DARK_QUARTZ = registerItem("dark_quartz", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AbyssMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AbyssMod.LOGGER.info("Registering Mod Items For " + AbyssMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(DARK_QUARTZ);
        });
    }
}
