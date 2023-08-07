package com.bonzzard.peronistan.item;

import com.bonzzard.peronistan.Peronistan;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, Peronistan.MODID);

        public static final RegistryObject<Item> CD_CAMIONCITO_VOL_1 = ITEMS.register("cd_camioncito_vol_1", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_CAMIONCITO_VOL_2 = ITEMS.register("cd_camioncito_vol_2", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_CAMIONCITO_VOL_3 = ITEMS.register("cd_camioncito_vol_3", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_CAMIONCITO_VOL_4 = ITEMS.register("cd_camioncito_vol_4", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_CAMIONCITO_VOL_5 = ITEMS.register("cd_camioncito_vol_5", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_CAMIONCITO_VOL_6 = ITEMS.register("cd_camioncito_vol_6", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_CAMIONCITO_VOL_7 = ITEMS.register("cd_camioncito_vol_7", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_HIMNO_DE_LA_NACION_ARGENTINA = ITEMS.register("cd_himno_de_la_nacion_argentina", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_LA_MOSCA_MUCHACHOS = ITEMS.register("cd_la_mosca_muchachos", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_LA_RENGA_VOL_1 = ITEMS.register("cd_la_renga_vol_1", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_LA_RENGA_VOL_2 = ITEMS.register("cd_la_renga_vol_2", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_LOS_PALMERAS_BOMBON_ASESINO = ITEMS.register("cd_los_palmeras_bombon_asesino", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_LOS_PIBES_CHORROS_DURAZNITO = ITEMS.register("cd_los_pibes_chorros_duraznito", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_ROSA_ROSA_SANDRO = ITEMS.register("cd_rosa_rosa_sandro", () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CD_SUPERMERK2_LA_RESAKA = ITEMS.register("cd_supermerk2_la_resaka", () -> new Item(new Item.Properties()));

    
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
