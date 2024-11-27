package minmag.tutorialmod;

import minmag.tutorialmod.block.ModBlocks;
import minmag.tutorialmod.item.ModItemGroups;
import minmag.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}