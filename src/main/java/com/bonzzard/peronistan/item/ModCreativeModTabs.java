package com.bonzzard.peronistan.item;

import com.bonzzard.peronistan.Peronistan;
import net.minecraft.core.registries.Registries;
/* import net.minecraft.network.chat.Component; */
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
/* import net.minecraftforge.registries.RegistryObject; */

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Peronistan.MODID);
    
    /*public static final RegistryObject<CreativeModeTab> PERONISTAN_TAB =  CREATIVE_MODE_TABS.register("peronistan_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CD_LA_MOSCA_MUCHACHOS.get()))
            .title(Component.translatable("creativetab.peronistan_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(new ItemStack(ModItems.CD_CAMIONCITO_VOL_1.get()));
                pOutput.accept(new ItemStack(ModItems.CD_CAMIONCITO_VOL_2.get()));
                pOutput.accept(new ItemStack(ModItems.CD_CAMIONCITO_VOL_3.get()));
                pOutput.accept(new ItemStack(ModItems.CD_CAMIONCITO_VOL_4.get()));
                pOutput.accept(new ItemStack(ModItems.CD_CAMIONCITO_VOL_5.get()));
                pOutput.accept(new ItemStack(ModItems.CD_CAMIONCITO_VOL_6.get()));
                pOutput.accept(new ItemStack(ModItems.CD_CAMIONCITO_VOL_7.get()));
                pOutput.accept(new ItemStack(ModItems.CD_HIMNO_DE_LA_NACION_ARGENTINA.get()));
                pOutput.accept(new ItemStack(ModItems.CD_LA_MOSCA_MUCHACHOS.get()));
                pOutput.accept(new ItemStack(ModItems.CD_LA_RENGA_VOL_1.get()));
                pOutput.accept(new ItemStack(ModItems.CD_LA_RENGA_VOL_2.get()));
                pOutput.accept(new ItemStack(ModItems.CD_LOS_PALMERAS_BOMBON_ASESINO.get()));
                pOutput.accept(new ItemStack(ModItems.CD_LOS_PIBES_CHORROS_DURAZNITO.get()));
                pOutput.accept(new ItemStack(ModItems.CD_ROSA_ROSA_SANDRO.get()));
                pOutput.accept(new ItemStack(ModItems.CD_SUPERMERK2_LA_RESAKA.get()));
            })
            .build()); */

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
