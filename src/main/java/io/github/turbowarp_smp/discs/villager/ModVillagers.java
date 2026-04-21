package io.github.turbowarp_smp.discs.villager;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.sound.ModSounds;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import com.google.common.collect.ImmutableSet;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(Registries.POINT_OF_INTEREST_TYPE, Discs.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(Registries.VILLAGER_PROFESSION, Discs.MODID);

    public static final DeferredHolder<PoiType, PoiType> DJ_POI = POI_TYPES.register("dj",
            () -> new PoiType(ImmutableSet.copyOf(Blocks.JUKEBOX.getStateDefinition().getPossibleStates()), 1, 1));

    public static final DeferredHolder<VillagerProfession, VillagerProfession> DJ = VILLAGER_PROFESSIONS.register("dj",
            () -> new VillagerProfession("dj", holder -> holder.is(DJ_POI.getKey()),
                    holder -> holder.is(DJ_POI.getKey()), ImmutableSet.of(), ImmutableSet.of(),
                    ModSounds.WORK_DJ.get()));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}