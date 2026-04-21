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
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.EntityFlagsPredicate;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output, CompletableFuture lookupProvider) {
        super(output, lookupProvider, Discs.MODID);
    }

    @Override
    protected void start() {
        add("lava_chicken_disc_from_chicken_jockey", new AddItemModifier(new LootItemCondition[]{
                LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS,
                        EntityPredicate.Builder.entity().of(EntityType.ZOMBIE)
                                .flags(EntityFlagsPredicate.Builder.flags().setIsBaby(true))
                                .vehicle(EntityPredicate.Builder.entity().of(EntityType.CHICKEN))
                                .build())
                        .build()},
                ModItems.MUSIC_DISC_LAVA_CHICKEN.get()));

        add("thick_of_it_disc_from_igloo", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/igloo_chest")).build()
        }, ModItems.MUSIC_DISC_THICK_OF_IT.get()));
    }
}