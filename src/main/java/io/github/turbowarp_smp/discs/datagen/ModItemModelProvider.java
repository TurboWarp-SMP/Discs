package io.github.turbowarp_smp.discs.datagen;

import io.github.turbowarp_smp.discs.Discs;
import io.github.turbowarp_smp.discs.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
  public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
    super(output, Discs.MODID, existingFileHelper);
  }

  @Override
  protected void registerModels() {
    simpleItem(ModItems.MUSIC_DISC_LAVA_CHICKEN);
    simpleItem(ModItems.MUSIC_DISC_THE_SKIBIDI_PENGUINMOD_SONG);
    simpleItem(ModItems.MUSIC_DISC_WITHER_STORM_THEME);
    simpleItem(ModItems.MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP);
    simpleItem(ModItems.MUSIC_DISC_THICK_OF_IT);
    simpleItem(ModItems.MUSIC_DISC_STUCK_INSIDE);
  }

  private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
    return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated")).texture("layer0",
        new ResourceLocation(Discs.MODID, "item/" + item.getId().getPath()));
  }
}
