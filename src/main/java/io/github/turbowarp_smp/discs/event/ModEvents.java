package io.github.turbowarp_smp.discs.event;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.item.ModItems;
import io.github.turbowarp_smp.discs.villager.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Discs.MODID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.DJ.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            Item[] potterySherdItems = {
                    Items.ANGLER_POTTERY_SHERD, Items.ARCHER_POTTERY_SHERD,
                    Items.ARMS_UP_POTTERY_SHERD, Items.BLADE_POTTERY_SHERD,
                    Items.BREWER_POTTERY_SHERD, Items.BURN_POTTERY_SHERD,
                    Items.DANGER_POTTERY_SHERD, Items.EXPLORER_POTTERY_SHERD,
                    Items.FRIEND_POTTERY_SHERD, Items.HEART_POTTERY_SHERD,
                    Items.HEARTBREAK_POTTERY_SHERD, Items.HOWL_POTTERY_SHERD,
                    Items.MINER_POTTERY_SHERD, Items.MOURNER_POTTERY_SHERD,
                    Items.PLENTY_POTTERY_SHERD, Items.PRIZE_POTTERY_SHERD,
                    Items.SHEAF_POTTERY_SHERD, Items.SHELTER_POTTERY_SHERD,
                    Items.SKULL_POTTERY_SHERD, Items.SNORT_POTTERY_SHERD
            };

            // Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.NOTE_BLOCK, 1),
                    16, 8, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.MUSIC_DISC_CAT, 1),
                    16, 8, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.MUSIC_DISC_BLOCKS, 1),
                    16, 8, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.MUSIC_DISC_CHIRP, 1),
                    16, 8, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.MUSIC_DISC_FAR, 1),
                    16, 8, 0.02f));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    new ItemStack(Items.MUSIC_DISC_MALL, 1),
                    16, 8, 0.02f));

            // Level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(Items.MUSIC_DISC_MELLOHI, 1),
                    16, 8, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.MUSIC_DISC_STAL, 1),
                    16, 8, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.MUSIC_DISC_STRAD, 1),
                    16, 8, 0.02f));

            // Level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.MUSIC_DISC_WARD, 1),
                    new ItemStack(Items.EMERALD, 8),
                    16, 8, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.MUSIC_DISC_11, 1),
                    new ItemStack(Items.DISC_FRAGMENT_5, 1),
                    16, 8, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.MUSIC_DISC_WAIT, 1),
                    16, 8, 0.02f));

            // Level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(Items.JUKEBOX, 1),
                    16, 8, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.MUSIC_DISC_RELIC, 1),
                    new ItemStack(potterySherdItems[pRandom.nextInt(potterySherdItems.length)], 4),
                    16, 8, 0.02f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                    new ItemStack(Items.EMERALD, 24),
                    16, 8, 0.02f));

            // Level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    new ItemStack(ModItems.MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP.get(), 1),
                    16, 8, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MUSIC_DISC_WITHER_STORM_THEME.get(), 1),
                    new ItemStack(Items.NETHER_STAR, 1),
                    16, 8, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.MUSIC_DISC_PIGSTEP, 1),
                    new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 1),
                    16, 8, 0.02f));
        }
    }
}
