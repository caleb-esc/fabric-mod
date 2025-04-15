// MixinEndBiomeSource.java
@Mixin(EndBiomeSource.class)
public class MixinEndBiomeSource {
    @Inject(method = "getBiome", at = @At("HEAD"), cancellable = true)
    private void injectCustomBiomes(int x, int y, int z, Climate.Sampler sampler, CallbackInfoReturnable<RegistryEntry<Biome>> cir) {
        if (/* custom biome selection logic */) {
            cir.setReturnValue(BuiltinRegistries.BIOME.getEntry(BiomesModBiomes.CRYSTAL_FOREST));
        }
    }
}
