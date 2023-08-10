package com.bonzzard.peronistan.sound;

import com.bonzzard.peronistan.Peronistan;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = 
        DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Peronistan.MODID);

    public static final RegistryObject<SoundEvent> CD_CAMIONCITO_VOL_1 = registerSoundEvent("cd_camioncito_vol_1");
    public static final RegistryObject<SoundEvent> CD_CAMIONCITO_VOL_2 = registerSoundEvent("cd_camioncito_vol_2");
    public static final RegistryObject<SoundEvent> CD_CAMIONCITO_VOL_3 = registerSoundEvent("cd_camioncito_vol_3");
    public static final RegistryObject<SoundEvent> CD_CAMIONCITO_VOL_4 = registerSoundEvent("cd_camioncito_vol_4");
    public static final RegistryObject<SoundEvent> CD_CAMIONCITO_VOL_5 = registerSoundEvent("cd_camioncito_vol_5");
    public static final RegistryObject<SoundEvent> CD_CAMIONCITO_VOL_6 = registerSoundEvent("cd_camioncito_vol_6");
    public static final RegistryObject<SoundEvent> CD_CAMIONCITO_VOL_7 = registerSoundEvent("cd_camioncito_vol_7");
    public static final RegistryObject<SoundEvent> CD_HIMNO_DE_LA_NACION_ARGENTINA = registerSoundEvent("cd_himno_de_la_nacion_argentina");
    public static final RegistryObject<SoundEvent> CD_LA_MOSCA_MUCHACOS = registerSoundEvent("cd_la_mosca_muchachos");
    public static final RegistryObject<SoundEvent> CD_LA_RENGA_VOL_1 = registerSoundEvent("cd_la_renga_vol_1");
    public static final RegistryObject<SoundEvent> CD_LA_RENGA_VOL_2 = registerSoundEvent("cd_la_renga_vol_2");
    public static final RegistryObject<SoundEvent> CD_LOS_PALMERAS_BOMBON_ASESINO = registerSoundEvent("cd_los_palmeras_bombon_asesino");
    public static final RegistryObject<SoundEvent> CD_LOS_PIBES_CHORROS_DURAZNITO = registerSoundEvent("cd_los_pibes_chorros_duraznito");
    public static final RegistryObject<SoundEvent> CD_ROSA_ROSA_SANDRO = registerSoundEvent("cd_rosa_rosa_sandro");
    public static final RegistryObject<SoundEvent> CD_SUPERMERK2_LA_RESAKA = registerSoundEvent("cd_supermerk2_la_resaka");


    // Aparentemente la forma correcta de registrar un soundevent - Gracias @Kaupenjoe
    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(Peronistan.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    /*  Esto esta deprecado ya que no existe Sound Event constructor, y register asi no funciona
        private static RegistryObject<SoundEvent> registerSoundEvent(String name){
            return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(Peronistan.MODID, name)));
        }
    */


    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
