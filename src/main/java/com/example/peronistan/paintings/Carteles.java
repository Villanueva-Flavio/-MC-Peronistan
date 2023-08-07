package com.example.peronistan.paintings;

import com.example.peronistan.Peronistan;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class Carteles {
	private Carteles() {}

	public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Peronistan.MODID);
	
	public static final RegistryObject<PaintingVariant> CARTEL_ATLNC = PAINTING_VARIANTS.register("painting_cartel", () -> new PaintingVariant(64, 48));

	public static void register(IEventBus eventBus) {
		PAINTING_VARIANTS.register(eventBus);
	}
}