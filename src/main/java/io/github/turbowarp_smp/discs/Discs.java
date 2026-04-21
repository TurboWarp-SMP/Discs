package io.github.turbowarp_smp.discs;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
import io.github.turbowarp_smp.discs.item.ModItems;
import io.github.turbowarp_smp.discs.loot.ModLootModifiers;
import io.github.turbowarp_smp.discs.sound.ModSounds;
import io.github.turbowarp_smp.discs.villager.ModVillagers;

@Mod(Discs.MODID)
public class Discs {
    public static final String MODID = "discs";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Discs(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModVillagers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.MUSIC_DISC_LAVA_CHICKEN.get());
            event.accept(ModItems.MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG.get());
            event.accept(ModItems.MUSIC_DISC_WITHER_STORM_THEME.get());
            event.accept(ModItems.MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP.get());
            event.accept(ModItems.MUSIC_DISC_THICK_OF_IT.get());
            event.accept(ModItems.MUSIC_DISC_STUCK_INSIDE.get());
            event.accept(ModItems.MUSIC_DISC_BAD_APPLE.get());
            event.accept(ModItems.MUSIC_DISC_ISOLATION.get());
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}