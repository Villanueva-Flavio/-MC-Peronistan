package com.example.peronistan.registry;

import java.util.function.Supplier;

import com.example.peronistan.Peronistan;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
    private ModBlocks() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Peronistan.MODID);

    public static final RegistryObject<Block> LADRILLO_NARANJA = registerBlock("ladrillo_naranja", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> LADRILLO_NARANJA_SLAB = registerBlock("ladrillo_naranja_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHAPA_OXIDADA = registerBlock("chapa_oxidada", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).requiresCorrectToolForDrops()));
    public static final RegistryObject<SlabBlock> CHAPA_OXIDADA_SLAB = registerBlock("chapa_oxidada_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
