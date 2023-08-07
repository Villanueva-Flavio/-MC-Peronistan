package com.example.peronistan.registry;

import com.example.peronistan.Peronistan;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems {
    private ModItems() {}
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Peronistan.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
