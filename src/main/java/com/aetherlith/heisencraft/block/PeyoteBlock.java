package com.aetherlith.heisencraft.block;

import com.aetherlith.heisencraft.HeisenCraftBlocks;
import com.aetherlith.heisencraft.HeisenCraftItems;
import com.petrolpark.destroy.DestroyVoxelShapes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import org.jetbrains.annotations.NotNull;
import net.minecraft.world.damagesource.DamageSources;

import java.util.List;
import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.Random;



public class PeyoteBlock extends Block implements BonemealableBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 3);
    private static final VoxelShape EMPTY = Block.box(0, 0, 0, 0, 0, 0);
    private static final VoxelShape[] SHAPES = new VoxelShape[]{
            Block.box(5, 0, 5, 11, 5, 11),
            Block.box(3, 0, 3, 13, 9, 13),
            Block.box(2, 0, 2, 14, 12, 14),
            Block.box(1, 0, 1, 15, 14, 15)
    };

    public PeyoteBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return false;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return world.getBlockState(pos.below()).is(Blocks.SAND) || world.getBlockState(pos.below()).is(Blocks.RED_SAND);
    }

    @Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (random.nextInt(8) == 0 && state.getValue(AGE) < 3) {
            world.setBlock(pos, state.setValue(AGE, state.getValue(AGE) + 1), 2);
        }
    }

    @Override
    public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity) {
        if (state.getValue(AGE) > 1) {
            entity.hurt(world.damageSources().cactus(), 1.0F);
        }

        if (!world.isClientSide && entity instanceof ItemEntity) {
            entity.remove(Entity.RemovalReason.DISCARDED);
        }
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPES[state.getValue(AGE)];
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return state.getValue(AGE) < 2 ? EMPTY : SHAPES[state.getValue(AGE)];
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader world, BlockPos pos, BlockState state, boolean isClient) {
        return state.getValue(AGE) < 3;
    }

    @Override
    public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState state) {
        int age = state.getValue(AGE);
        if (age < 3) {
            world.setBlock(pos, state.setValue(AGE, age + 1), 2);
        }
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> drops = new ArrayList<>();
        int age = state.getValue(AGE);
        int peyoteCount = (age == 3) ? 2 : 1;

        Item peyoteItem = HeisenCraftItems.PEYOTE.get();
        drops.add(new ItemStack(peyoteItem, peyoteCount));

        return drops;
    }


}
