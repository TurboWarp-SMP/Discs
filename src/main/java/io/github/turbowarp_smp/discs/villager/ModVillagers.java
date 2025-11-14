package io.github.turbowarp_smp.discs.villager;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.sound.ModSounds;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.google.common.collect.ImmutableSet;

public class ModVillagers {
  public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES,
      Discs.MODID);
  public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister
      .create(ForgeRegistries.VILLAGER_PROFESSIONS, Discs.MODID);

  public static final RegistryObject<PoiType> DJ_POI = POI_TYPES.register("dj",
      () -> new PoiType(ImmutableSet.copyOf(Blocks.JUKEBOX.getStateDefinition().getPossibleStates()), 1, 1));
  public static final RegistryObject<VillagerProfession> DJ = VILLAGER_PROFESSIONS.register("dj",
      () -> new VillagerProfession("dj", holder -> holder.get() == DJ_POI.get(),
          holder -> holder.get() == DJ_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
          ModSounds.WORK_DJ.get()));

  public static void register(IEventBus eventBus) {
    POI_TYPES.register(eventBus);
    VILLAGER_PROFESSIONS.register(eventBus);
  }
}
