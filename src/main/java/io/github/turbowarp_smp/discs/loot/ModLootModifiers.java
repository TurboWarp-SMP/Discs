package io.github.turbowarp_smp.discs.loot;

import com.mojang.serialization.Codec;
import io.github.turbowarp_smp.discs.Discs;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
  public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS = DeferredRegister
      .create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Discs.MODID);

  public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM = LOOT_MODIFIER_SERIALIZERS
      .register("add_item", AddItemModifier.CODEC);

  public static void register(IEventBus eventBus) {
    LOOT_MODIFIER_SERIALIZERS.register(eventBus);
  }
}
