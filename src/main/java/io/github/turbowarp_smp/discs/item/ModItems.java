package io.github.turbowarp_smp.discs.item;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.sound.ModJukeboxSongs;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.EitherHolder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxPlayable;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Discs.MODID);

    public static final DeferredItem<Item> MUSIC_DISC_LAVA_CHICKEN = ITEMS.registerItem(
            "music_disc_lava_chicken",
            Item::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .component(DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(new EitherHolder<>(ModJukeboxSongs.LAVA_CHICKEN), true)));

    public static final DeferredItem<Item> MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG = ITEMS.registerItem(
            "music_disc_the_skibidi_penguinmod_song",
            Item::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .component(DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(new EitherHolder<>(ModJukeboxSongs.THE_SKIBIDI_PENGUINMOD_SONG), true)));

    public static final DeferredItem<Item> MUSIC_DISC_WITHER_STORM_THEME = ITEMS.registerItem(
            "music_disc_wither_storm_theme",
            Item::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .component(DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(new EitherHolder<>(ModJukeboxSongs.WITHER_STORM_THEME), true)));

    public static final DeferredItem<Item> MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP = ITEMS.registerItem(
            "music_disc_never_gonna_give_you_up",
            Item::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .component(DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(new EitherHolder<>(ModJukeboxSongs.NEVER_GONNA_GIVE_YOU_UP), true)));

    public static final DeferredItem<Item> MUSIC_DISC_THICK_OF_IT = ITEMS.registerItem(
            "music_disc_thick_of_it",
            Item::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .component(DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(new EitherHolder<>(ModJukeboxSongs.THICK_OF_IT), true)));

    public static final DeferredItem<Item> MUSIC_DISC_STUCK_INSIDE = ITEMS.registerItem(
            "music_disc_stuck_inside",
            Item::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .component(DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(new EitherHolder<>(ModJukeboxSongs.STUCK_INSIDE), true)));

    public static final DeferredItem<Item> MUSIC_DISC_BAD_APPLE = ITEMS.registerItem(
            "music_disc_bad_apple",
            Item::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .component(DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(new EitherHolder<>(ModJukeboxSongs.BAD_APPLE), true)));

    public static final DeferredItem<Item> MUSIC_DISC_ISOLATION = ITEMS.registerItem(
            "music_disc_isolation",
            Item::new,
            new Item.Properties().stacksTo(1).rarity(Rarity.RARE)
                    .component(DataComponents.JUKEBOX_PLAYABLE,
                            new JukeboxPlayable(new EitherHolder<>(ModJukeboxSongs.ISOLATION), true)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}