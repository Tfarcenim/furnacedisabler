package tfar.furnacedisabler.mixin;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.FurnaceBlockEntity;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FurnaceBlockEntity.class)
abstract class FurnaceBlockEntityMixin extends AbstractFurnaceBlockEntity {

	protected FurnaceBlockEntityMixin(BlockEntityType<?> blockEntityType, RecipeType<? extends AbstractCookingRecipe> recipeType) {
		super(blockEntityType, recipeType);
	}

	@Override
	public boolean canOpen(Player player) {
		return false;
	}

	@Override
	public ItemStack getItem(int i) {
		return ItemStack.EMPTY;
	}

	@Override
	public ItemStack removeItem(int i, int j) {
		return ItemStack.EMPTY;
	}

	@Override
	public void setItem(int i, ItemStack itemStack) {
	}

	@Override
	public boolean canPlaceItem(int i, ItemStack itemStack) {
		return false;
	}

	@Override
	public boolean canPlaceItemThroughFace(int i, ItemStack itemStack, @Nullable Direction direction) {
		return false;
	}

	@Override
	public boolean canTakeItemThroughFace(int i, ItemStack itemStack, Direction direction) {
		return false;
	}

}
