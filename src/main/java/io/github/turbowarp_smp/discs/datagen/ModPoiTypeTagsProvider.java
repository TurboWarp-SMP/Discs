package io.github.turbowarp_smp.discs.datagen;

import io.github.turbowarp_smp.discs.Discs;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PoiTypeTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModPoiTypeTagsProvider extends PoiTypeTagsProvider {
  public ModPoiTypeTagsProvider(PackOutput pOutput, CompletableFuture<Provider> pProvider,
      @Nullable ExistingFileHelper existingFileHelper) {
    super(pOutput, pProvider, Discs.MODID, existingFileHelper);
  }

  @Override
  protected void addTags(HolderLookup.Provider pProvider) {
    tag(PoiTypeTags.ACQUIRABLE_JOB_SITE).addOptional(new ResourceLocation(Discs.MODID, "dj"));
  }
}
