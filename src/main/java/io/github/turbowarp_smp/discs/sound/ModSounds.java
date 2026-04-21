package io.github.turbowarp_smp.discs.sound;

import io.github.turbowarp_smp.discs.Discs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder; // Import this
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, Discs.MODID);

    public static final DeferredHolder<SoundEvent, SoundEvent> LAVA_CHICKEN = registerSoundEvents("lava_chicken");
    public static final DeferredHolder<SoundEvent, SoundEvent> THE_SKIBIDI_PENGUINMOD_SONG = registerSoundEvents("the_skibidi_penguinmod_song");
    public static final DeferredHolder<SoundEvent, SoundEvent> WITHER_STORM_THEME = registerSoundEvents("wither_storm_theme");
    public static final DeferredHolder<SoundEvent, SoundEvent> NEVER_GONNA_GIVE_YOU_UP = registerSoundEvents("never_gonna_give_you_up");
    public static final DeferredHolder<SoundEvent, SoundEvent> THICK_OF_IT = registerSoundEvents("thick_of_it");
    public static final DeferredHolder<SoundEvent, SoundEvent> STUCK_INSIDE = registerSoundEvents("stuck_inside");
    public static final DeferredHolder<SoundEvent, SoundEvent> BAD_APPLE = registerSoundEvents("bad_apple");
    public static final DeferredHolder<SoundEvent, SoundEvent> ISOLATION = registerSoundEvents("isolation");
    public static final DeferredHolder<SoundEvent, SoundEvent> WORK_DJ = registerSoundEvents("work_dj");

    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name,
                () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(Discs.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}