package com.asbuildingdesign.siftdimensionmod;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;

public
class SiftPortalBlock extends Block {
    public static final BooleanProperty ACTIVE = BooleanProperty.create("active");

    public SiftPortalBlock() {
        super(Properties.of(Material.PORTAL)
        .noCollission()
        .lightLevel(state -> state.getValue(ACTIVE) ? 11 : 0));
        this.registerDefaultState(this.stateDefinition.any().setValue(ACTIVE, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE);
    }

    public static void register() {
        Registry.register(Registries.BLOCK, new ResourceLocation(SiftDimensionMod.MOD_ID, "sift_portal"), new SiftPortalBlock());
    }
}
