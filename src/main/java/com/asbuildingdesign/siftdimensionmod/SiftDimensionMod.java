package com.asbuildingdesign.siftdimensionmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class SiftDimensionMod implements ModInitializer {
    public static final String MOD_ID = "siftdimensionmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ResourceKey<Level> SIFT_DIMENSION_KEY = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(MOD_ID, "sift_dimension"));
    public static final ResourceKey<DimensionType> SIFT_DIMENSION_TYPE_KEY = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(MOD_ID, "sift_dimension_type"));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Sift Dimension Mod");

        // Register the dimension
        Registry.register(Registries.DIMENSION_TYPE, SIFT_DIMENSION_TYPE_KEY, SiftDimensionType.createSiftDimensionType());
        Registry.register(Registries.DIMENSION, SIFT_DIMENSION_KEY, new LevelStem(SIFT_DIMENSION_TYPE_KEY, SiftBiome.createSiftBiome()));

        // Register the portal block
        SiftPortalBlock.register();
    }
}
