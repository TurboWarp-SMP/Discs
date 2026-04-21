package io.github.turbowarp_smp.discs.datagen;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    private static final TagKey<Item> MUSIC_DISCS = TagKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("music_discs"));
    private static final TagKey<Item> CREEPER_DROP_MUSIC_DISCS = TagKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("creeper_drop_music_discs"));
  public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
      CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
    super(pOutput, pLookupProvider, pBlockTags, Discs.MODID, existingFileHelper);
  }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(MUSIC_DISCS).add(ModItems.MUSIC_DISC_LAVA_CHICKEN.getKey());
        this.tag(MUSIC_DISCS).add(ModItems.MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG.getKey());
        this.tag(MUSIC_DISCS).add(ModItems.MUSIC_DISC_WITHER_STORM_THEME.getKey());
        this.tag(MUSIC_DISCS).add(ModItems.MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP.getKey());
        this.tag(MUSIC_DISCS).add(ModItems.MUSIC_DISC_THICK_OF_IT.getKey());
        this.tag(MUSIC_DISCS).add(ModItems.MUSIC_DISC_STUCK_INSIDE.getKey());
        this.tag(MUSIC_DISCS).add(ModItems.MUSIC_DISC_BAD_APPLE.getKey());
        this.tag(MUSIC_DISCS).add(ModItems.MUSIC_DISC_ISOLATION.getKey());

        this.tag(CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG.getKey());
        this.tag(CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_STUCK_INSIDE.getKey());
        this.tag(CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_ISOLATION.getKey());
    }
}
