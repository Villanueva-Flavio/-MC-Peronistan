package com.bonzzard.peronistan;

import com.bonzzard.peronistan.item.ModItems;
import com.bonzzard.peronistan.sound.ModSounds;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Peronistan.MODID) public class Peronistan {
    public static final String MODID = "peronistan";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Peronistan(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ModSounds.register(modEventBus);
        ModItems.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event){
        LOGGER.info("[Peronistan] Setting up asadito!");
    }


    // EVENTOS DE PROCESOS

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){
        LOGGER.info("[Peronistan] loading on the server!");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            LOGGER.info("[Peronistan] Client event checker");
        }
    }
}
