package io.github.turbowarp_smp.discs.sound;

import io.github.turbowarp_smp.discs.Discs;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.JukeboxSong;

public class ModJukeboxSongs {
    public static final ResourceKey<JukeboxSong> LAVA_CHICKEN = key("lava_chicken");
    public static final ResourceKey<JukeboxSong> THE_SKIBIDI_PENGUINMOD_SONG = key("the_skibidi_penguinmod_song");
    public static final ResourceKey<JukeboxSong> WITHER_STORM_THEME = key("wither_storm_theme");
    public static final ResourceKey<JukeboxSong> NEVER_GONNA_GIVE_YOU_UP = key("never_gonna_give_you_up");
    public static final ResourceKey<JukeboxSong> THICK_OF_IT = key("thick_of_it");
    public static final ResourceKey<JukeboxSong> STUCK_INSIDE = key("stuck_inside");
    public static final ResourceKey<JukeboxSong> BAD_APPLE = key("bad_apple");
    public static final ResourceKey<JukeboxSong> ISOLATION = key("isolation");

    private static ResourceKey<JukeboxSong> key(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(Discs.MODID, name));
    }
}