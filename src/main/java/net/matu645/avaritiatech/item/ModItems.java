package net.matu645.avaritiatech.item;

import net.matu645.avaritiatech.AvaritiaTech;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AvaritiaTech.MOD_ID);


    public static final RegistryObject<Item> PURE_NEUTRONIUM_INGOT = ITEMS.register("pure_neutronium_ingot",
            () -> new Item(new Item.Properties() ) );

    public static final RegistryObject<Item> PURE_NEUTRONIUM_DUST = ITEMS.register("pure_neutronium_dust",
            () -> new Item(new Item.Properties() ) );



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
