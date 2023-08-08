package com.bonzzard.peronistan;

import com.bonzzard.peronistan.item.ModCreativeModTabs;
import com.bonzzard.peronistan.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(Peronistan.MODID) public class Peronistan {
    public static final String MODID = "peronistan";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public Peronistan(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModCreativeModTabs.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event){
        LOGGER.info("[PERONISTAN] Setting up the enviroment");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.accept(ModItems.CD_CAMIONCITO_VOL_1);
            event.accept(ModItems.CD_CAMIONCITO_VOL_2);
            event.accept(ModItems.CD_CAMIONCITO_VOL_3);
            event.accept(ModItems.CD_CAMIONCITO_VOL_4);
            event.accept(ModItems.CD_CAMIONCITO_VOL_5);
            event.accept(ModItems.CD_CAMIONCITO_VOL_6);
            event.accept(ModItems.CD_CAMIONCITO_VOL_7);
            event.accept(ModItems.CD_HIMNO_DE_LA_NACION_ARGENTINA);
            event.accept(ModItems.CD_LA_MOSCA_MUCHACHOS);
            event.accept(ModItems.CD_LA_RENGA_VOL_1);
            event.accept(ModItems.CD_LA_RENGA_VOL_2);
            event.accept(ModItems.CD_LOS_PALMERAS_BOMBON_ASESINO);
            event.accept(ModItems.CD_LOS_PIBES_CHORROS_DURAZNITO);
            event.accept(ModItems.CD_ROSA_ROSA_SANDRO);
            event.accept(ModItems.CD_SUPERMERK2_LA_RESAKA);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){
        LOGGER.info("Peronistan is loading on the server!");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            LOGGER.info("Client event checker");
        }
    }
}
