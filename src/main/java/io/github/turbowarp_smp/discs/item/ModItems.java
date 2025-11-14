package io.github.turbowarp_smp.discs.item;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Discs.MODID);

    public static final RegistryObject<Item> MUSIC_DISC_LAVA_CHICKEN = ITEMS.register("music_disc_lava_chicken",
            () -> new RecordItem(9, ModSounds.LAVA_CHICKEN, new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    2700));
    public static final RegistryObject<Item> MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG = ITEMS.register(
            "music_disc_the_skibidi_penguinmod_song",
            () -> new RecordItem(13, ModSounds.THE_SKIBIDI_PENGUINMOD_SONG,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3240));
    public static final RegistryObject<Item> MUSIC_DISC_WITHER_STORM_THEME = ITEMS.register(
            "music_disc_wither_storm_theme",
            () -> new RecordItem(14, ModSounds.WITHER_STORM_THEME,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3600));
    public static final RegistryObject<Item> MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP = ITEMS.register(
            "music_disc_never_gonna_give_you_up",
            () -> new RecordItem(15, ModSounds.NEVER_GONNA_GIVE_YOU_UP,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 4240));
    public static final RegistryObject<Item> MUSIC_DISC_THICK_OF_IT = ITEMS.register("music_disc_thick_of_it",
            () -> new RecordItem(1, ModSounds.THICK_OF_IT, new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    3240));
    public static final RegistryObject<Item> MUSIC_DISC_STUCK_INSIDE = ITEMS.register("music_disc_stuck_inside",
            () -> new RecordItem(12, ModSounds.STUCK_INSIDE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    3320));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
