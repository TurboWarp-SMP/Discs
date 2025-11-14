package io.github.turbowarp_smp.discs.datagen;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import org.jetbrains.annotations.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {

  public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
      CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
    super(pOutput, pLookupProvider, pBlockTags, Discs.MODID, existingFileHelper);
  }

  @Override
  protected void addTags(HolderLookup.Provider pProvider) {
    this.tag(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_LAVA_CHICKEN.get());
    this.tag(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG.get());
    this.tag(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_WITHER_STORM_THEME.get());
    this.tag(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP.get());
    this.tag(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_THICK_OF_IT.get());
    this.tag(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_STUCK_INSIDE.get());

    this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG.get());
    this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_STUCK_INSIDE.get());
  }
}
