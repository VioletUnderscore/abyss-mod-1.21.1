package net.violetunderscore.abyss;

import net.fabricmc.api.ModInitializer;

import net.violetunderscore.abyss.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbyssMod implements ModInitializer {
	public static final String MOD_ID = "abyssmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}