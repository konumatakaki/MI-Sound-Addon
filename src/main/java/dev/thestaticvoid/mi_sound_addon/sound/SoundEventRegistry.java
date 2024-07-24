package dev.thestaticvoid.mi_sound_addon.sound;

import dev.thestaticvoid.mi_sound_addon.MISoundAddon;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SoundEventRegistry {

    public static final DeferredRegister<SoundEvent> SOUND_EVENT_REGISTRY = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, MISoundAddon.MOD_ID);


}
