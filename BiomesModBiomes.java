// BiomesModBiomes.java
public class BiomesModBiomes {
    public static final RegistryKey<Biome> CRYSTAL_FOREST = registerKey("crystal_forest");
    public static final RegistryKey<Biome> FLOATING_ISLANDS = registerKey("floating_islands");
    
    private static RegistryKey<Biome> registerKey(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier("betterend", name));
    }

    public static void registerBiomes() {
        Registry.register(BuiltinRegistries.BIOME, CRYSTAL_FOREST.getValue(), createCrystalForest());
        Registry.register(BuiltinRegistries.BIOME, FLOATING_ISLANDS.getValue(), createFloatingIslands());
    }

    private static Biome createCrystalForest() {
        return new Biome.Builder()
            .precipitation(Biome.Precipitation.NONE)
            .temperature(0.5F)
            .downfall(0.5F)
            .effects(new BiomeEffects.Builder()
                .waterColor(4159204)
                .waterFogColor(329011)
                .fogColor(12638463)
                .skyColor(getSkyColor(0.5F))
                .build())
            .spawnSettings(new SpawnSettings.Builder().build())
            .generationSettings(createCrystalForestGeneration())
            .build();
    }
    
    // Add similar methods for other biomes
}
