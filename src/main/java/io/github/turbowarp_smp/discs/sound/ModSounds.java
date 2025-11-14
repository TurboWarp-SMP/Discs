package io.github.turbowarp_smp.discs.sound;

import io.github.turbowarp_smp.discs.Discs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
  public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
      Discs.MODID);

  public static final RegistryObject<SoundEvent> WORK_DJ = registerSoundEvents("work_dj");

  public static final RegistryObject<SoundEvent> LAVA_CHICKEN = registerSoundEvents("lava_chicken");
  public static final RegistryObject<SoundEvent> THE_SKIBIDI_PENGUINMOD_SONG = registerSoundEvents(
      "the_skibidi_penguinmod_song");
  public static final RegistryObject<SoundEvent> WITHER_STORM_THEME = registerSoundEvents("wither_storm_theme");
  public static final RegistryObject<SoundEvent> NEVER_GONNA_GIVE_YOU_UP = registerSoundEvents(
      "never_gonna_give_you_up");
  public static final RegistryObject<SoundEvent> THICK_OF_IT = registerSoundEvents("thick_of_it");
  public static final RegistryObject<SoundEvent> STUCK_INSIDE = registerSoundEvents("stuck_inside");

  private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
    return SOUND_EVENTS.register(name,
        () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Discs.MODID, name)));
  }

  public static void register(IEventBus eventBus) {
    SOUND_EVENTS.register(eventBus);
  }
}
