package io.github.turbowarp_smp.discs;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import io.github.turbowarp_smp.discs.item.ModItems;
import io.github.turbowarp_smp.discs.loot.ModLootModifiers;
import io.github.turbowarp_smp.discs.sound.ModSounds;
import io.github.turbowarp_smp.discs.villager.ModVillagers;

@Mod(Discs.MODID)
public class Discs {
    public static final String MODID = "discs";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Discs(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModVillagers.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.MUSIC_DISC_LAVA_CHICKEN);
            event.accept(ModItems.MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG);
            event.accept(ModItems.MUSIC_DISC_WITHER_STORM_THEME);
            event.accept(ModItems.MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP);
            event.accept(ModItems.MUSIC_DISC_THICK_OF_IT);
            event.accept(ModItems.MUSIC_DISC_STUCK_INSIDE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
