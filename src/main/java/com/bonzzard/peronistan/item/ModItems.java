package com.bonzzard.peronistan.item;

import com.bonzzard.peronistan.Peronistan;
import com.bonzzard.peronistan.sound.ModSounds;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Peronistan.MODID);
    public static final RegistryObject<Item> ITEM_CAMIONCITO_VOL_1             = ITEMS.register("cd_camioncito_vol_1",                         () -> new RecordItem(8, ModSounds.CD_CAMIONCITO_VOL_1,             new Item.Properties().stacksTo(1), 460));
    public static final RegistryObject<Item> ITEM_CAMIONCITO_VOL_2             = ITEMS.register("cd_camioncito_vol_2",                         () -> new RecordItem(8, ModSounds.CD_CAMIONCITO_VOL_2,             new Item.Properties().stacksTo(1), 880));
    public static final RegistryObject<Item> ITEM_CAMIONCITO_VOL_3             = ITEMS.register("cd_camioncito_vol_3",                         () -> new RecordItem(8, ModSounds.CD_CAMIONCITO_VOL_3,             new Item.Properties().stacksTo(1), 320));
    public static final RegistryObject<Item> ITEM_CAMIONCITO_VOL_4             = ITEMS.register("cd_camioncito_vol_4",                         () -> new RecordItem(8, ModSounds.CD_CAMIONCITO_VOL_4,             new Item.Properties().stacksTo(1), 160));
    public static final RegistryObject<Item> ITEM_CAMIONCITO_VOL_5             = ITEMS.register("cd_camioncito_vol_5",                         () -> new RecordItem(8, ModSounds.CD_CAMIONCITO_VOL_5,             new Item.Properties().stacksTo(1), 240));
    public static final RegistryObject<Item> ITEM_CAMIONCITO_VOL_6             = ITEMS.register("cd_camioncito_vol_6",                         () -> new RecordItem(8, ModSounds.CD_CAMIONCITO_VOL_6,             new Item.Properties().stacksTo(1), 80));
    public static final RegistryObject<Item> ITEM_CAMIONCITO_VOL_7             = ITEMS.register("cd_camioncito_vol_7",                         () -> new RecordItem(8, ModSounds.CD_CAMIONCITO_VOL_7,             new Item.Properties().stacksTo(1), 480));
    public static final RegistryObject<Item> ITEM_HIMNO_DE_LA_NACION_ARGENTINA = ITEMS.register("cd_himno_nacional_de_la_republica_argentina", () -> new RecordItem(8, ModSounds.CD_HIMNO_DE_LA_NACION_ARGENTINA, new Item.Properties().stacksTo(1), 4600));
    public static final RegistryObject<Item> ITEM_LA_MOSCA_MUCHACHOS           = ITEMS.register("cd_la_mosca_muchachos",                       () -> new RecordItem(8, ModSounds.CD_LA_MOSCA_MUCHACHOS,           new Item.Properties().stacksTo(1), 3040));
    public static final RegistryObject<Item> ITEM_LA_RENGA_VOL_1               = ITEMS.register("cd_la_renga_vol_1",                           () -> new RecordItem(8, ModSounds.CD_LA_RENGA_VOL_1,               new Item.Properties().stacksTo(1), 6740));
    public static final RegistryObject<Item> ITEM_LA_RENGA_VOL_2               = ITEMS.register("cd_la_renga_vol_2",                           () -> new RecordItem(8, ModSounds.CD_LA_RENGA_VOL_2,               new Item.Properties().stacksTo(1), 4080));
    public static final RegistryObject<Item> ITEM_LOS_PALMERAS_BOMBON_ASESINO  = ITEMS.register("cd_los_palmeras_bombon_asesino",              () -> new RecordItem(8, ModSounds.CD_LOS_PALMERAS_BOMBON_ASESINO,  new Item.Properties().stacksTo(1), 4080));
    public static final RegistryObject<Item> ITEM_LOS_PIBES_CHORROS_DURAZNITO  = ITEMS.register("cd_los_pibes_chorros_duraznito",              () -> new RecordItem(8, ModSounds.CD_LOS_PIBES_CHORROS_DURAZNITO,  new Item.Properties().stacksTo(1), 6180));
    public static final RegistryObject<Item> ITEM_SANDRO_ROSA_ROSA             = ITEMS.register("cd_sandro_rosa_rosa",                         () -> new RecordItem(8, ModSounds.CD_SANDRO_ROSA_ROSA,             new Item.Properties().stacksTo(1), 3080));
    public static final RegistryObject<Item> ITEM_SUPERMERK2_LA_RESAKA         = ITEMS.register("cd_supermerk2_la_resaka",                     () -> new RecordItem(8, ModSounds.CD_SUPERMERK2_LA_RESAKA,         new Item.Properties().stacksTo(1), 4280));

    public static void register(IEventBus eventBus) {
      ITEMS.register(eventBus);
    }
}
