package me.skyla.tutmod;
import me.skyla.tutmod.core.blocks.BlockInit;
import me.skyla.tutmod.core.items.ItemInit;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "tut";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ItemInit.registerModItems();
        BlockInit.registerModBlocks();
    }
}
