// BetterEndMod.java
public class BetterEndMod implements ModInitializer {
    @Override
    public void onInitialize() {
        BiomesModBiomes.registerBiomes();
        LootTableEvents.MODIFY.register((manager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && id.equals(LootTables.END_CITY_TREASURE_CHEST)) {
                LootPool.Builder pool = LootPool.builder()
                    .with(ItemEntry.builder(Items.NETHERITE_INGOT).weight(5));
                tableBuilder.pool(pool);
            }
        });
    }
}
