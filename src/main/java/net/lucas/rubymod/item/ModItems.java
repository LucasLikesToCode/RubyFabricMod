package net.lucas.rubymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lucas.rubymod.RubyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;


public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings()), ItemGroups.INGREDIENTS);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(RubyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubyMod.LOGGER.debug("Registering Mod Items for " + RubyMod.MOD_ID);
    }
}
