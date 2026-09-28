package com.asbuildingdesign.siftdimensionmod;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;

public
class SiftBiome {
    public static Biome createSiftBiome() {
        return new Biome.BiomeBuilder()
        .biomeCategory(Biome.BiomeCategory.NONE)
        .temperature(0.5f)
        .downfall(0.5f)
        .specialEffects(new BiomeSpecialEffects.Builder()
        .waterColor(0x3f76e4)
        .waterFogColor(0x050533)
        .fogColor(0xc0d8ff)
        .skyColor(0x77adff)
        .build())
        .generationSettings(new BiomeGenerationSettings.Builder()
        .build())
        .mobSpawnSettings(new MobSpawnSettings.Builder()
        .build())
        .build();
    }
}
