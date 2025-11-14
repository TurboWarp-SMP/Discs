package io.github.turbowarp_smp.discs.datagen;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.item.ModItems;
import io.github.turbowarp_smp.discs.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.EntityFlagsPredicate;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
  public ModGlobalLootModifiersProvider(PackOutput output) {
    super(output, Discs.MODID);
  }

  @Override
  protected void start() {
    add("lava_chicken_disc_from_chicken_jockey", new AddItemModifier(new LootItemCondition[] {
        LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS,
            EntityPredicate.Builder.entity().of(EntityType.ZOMBIE)
                .flags(EntityFlagsPredicate.Builder.flags().setIsBaby(true).build())
                .vehicle(EntityPredicate.Builder.entity().of(EntityType.CHICKEN).build()).build())
            .build() },
        ModItems.MUSIC_DISC_LAVA_CHICKEN.get()));

    add("thick_of_it_disc_from_igloo", new AddItemModifier(new LootItemCondition[] {
        new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build()
    }, ModItems.MUSIC_DISC_THICK_OF_IT.get()));
  }
}
