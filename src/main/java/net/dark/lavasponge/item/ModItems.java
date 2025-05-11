package net.dark.lavasponge.item;

import net.dark.lavasponge.LavaSponge;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LAVA_SPONGE_SHARD = registerItem("lava_sponge_shard", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(LavaSponge.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LavaSponge.LOGGER.info("Registering Mod Items for " + LavaSponge.MOD_ID);


    }


}
