package supertoady.fletching.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import supertoady.fletching.FletchingExpanded;

public class ModItemGroups {
    public static ItemGroup FLETCHING_EXPANDED = FabricItemGroupBuilder.build(
            new Identifier(FletchingExpanded.MOD_ID, "fletching_expanded"), () -> new ItemStack(Items.ARROW));
}
