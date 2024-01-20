package supertoady.fletching;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import supertoady.fletching.item.ModItemGroups;
import supertoady.fletching.item.ModItems;

public class FletchingExpanded implements ModInitializer {

	public static final String MOD_ID = "fletching-expanded";
    public static final Logger LOGGER = LoggerFactory.getLogger("fletching-expanded");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("Loaded fletching-expanded!");
	}
}