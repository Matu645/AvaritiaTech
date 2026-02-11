package net.matu645.avaritiatech.item;

import net.matu645.avaritiatech.AvaritiaTech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AvaritiaTech.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AVARITIA_TECH_TAB = CREATIVE_MODE_TABS.register("avaritia_tech_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModItems.PURE_NEUTRONIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.avaritia_tech_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PURE_NEUTRONIUM_INGOT.get());
                        output.accept(ModItems.PURE_NEUTRONIUM_DUST.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
