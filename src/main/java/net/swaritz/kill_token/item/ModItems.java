package net.swaritz.kill_token.item;

        import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
        import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
        import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
        import net.swaritz.kill_token.Kill_Token;
        import net.minecraft.item.Item;
        import net.minecraft.item.ItemGroups;
        import net.minecraft.registry.Registries;
        import net.minecraft.registry.Registry;
        import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TOKEN = registerItem("token", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TOKEN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Kill_Token.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Kill_Token.LOGGER.info("Registering Mod Items for " + Kill_Token.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}