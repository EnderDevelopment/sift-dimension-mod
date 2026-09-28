package com.asbuildingdesign.siftdimensionmod;

import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.DimensionType.MonsterSettings;

public
class SiftDimensionType {
    public static DimensionType createSiftDimensionType() {
        return new DimensionType(
        1.0f, // coordinateScale
        true, // hasSkyLight
        false, // hasCeiling
        false, // ultraWarm
        true, // natural
        1.0, // coordinateScale
        true, // bedWorks
        false, // respawnAnchorWorks
        0, // minY
        256, // height
        256, // logicalHeight
        BlockTags.INFINIBURN_OVERWORLD, // infiniburn
        SiftDimensionMod.SIFT_DIMENSION_KEY.location(), // effectsLocation
        0.0f, // ambientLight
        new MonsterSettings(false, false, UniformInt.of(0, 7), 0)
        );
    }
}
