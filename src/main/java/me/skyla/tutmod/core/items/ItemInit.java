package me.skyla.tutmod.core.items;

import me.skyla.tutmod.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for" + ExampleMod.MOD_ID);
    }
}
