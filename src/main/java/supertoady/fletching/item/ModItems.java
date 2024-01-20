package supertoady.fletching.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import supertoady.fletching.FletchingExpanded;
import supertoady.fletching.item.custom.SpearItem;

public class ModItems {

    private static final Item FLINT_SPEARHEAD = registerItem("flint_spearhead",
            new Item(new FabricItemSettings().group(ModItemGroups.FLETCHING_EXPANDED)));

    private static final Item FLINT_SPEAR = registerItem("flint_spear",
            new SpearItem(ToolMaterials.STONE, -2.7, 5,
                    new FabricItemSettings().group(ModItemGroups.FLETCHING_EXPANDED)));

    private static final Item IRON_SPEAR = registerItem("iron_spear",
            new SpearItem(ToolMaterials.IRON, -2.7, 6,
                    new FabricItemSettings().group(ModItemGroups.FLETCHING_EXPANDED)));

    private static final Item GOLDEN_SPEAR = registerItem("golden_spear",
            new SpearItem(ToolMaterials.GOLD, -2.7, 4,
                    new FabricItemSettings().group(ModItemGroups.FLETCHING_EXPANDED)));

    private static final Item DIAMOND_SPEAR = registerItem("diamond_spear",
            new SpearItem(ToolMaterials.DIAMOND, -2.7, 7,
                    new FabricItemSettings().group(ModItemGroups.FLETCHING_EXPANDED)));

    private static final Item NETHERITE_SPEAR = registerItem("netherite_spear",
            new SpearItem(ToolMaterials.NETHERITE, -2.7, 8,
                    new FabricItemSettings().group(ModItemGroups.FLETCHING_EXPANDED)));

    private static final Item ARROW_SHAFT = registerItem("arrow_shaft",
            new Item(new FabricItemSettings().group(ModItemGroups.FLETCHING_EXPANDED)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FletchingExpanded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FletchingExpanded.LOGGER.info("Registering mod items for " + FletchingExpanded.MOD_ID);
    }
}
