package io.github.turbowarp_smp.discs.datagen;

import io.github.turbowarp_smp.discs.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
  public ModRecipeProvider(PackOutput pOutput) {
    super(pOutput);
  }

  @Override
  protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MUSIC_DISC_WITHER_STORM_THEME.get())
        .pattern("SSS")
        .pattern("SNS")
        .pattern("SSS")
        .define('S', Items.DISC_FRAGMENT_5)
        .define('N', Items.NETHER_STAR)
        .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
        .save(pWriter);
  }
}
