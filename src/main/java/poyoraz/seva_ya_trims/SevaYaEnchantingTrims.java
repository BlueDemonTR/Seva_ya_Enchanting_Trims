package poyoraz.seva_ya_trims;

import de.tomalbrc.filament.Filament;
import de.tomalbrc.filament.api.FilamentLoader;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SevaYaEnchantingTrims implements ModInitializer {
	public static final String MOD_ID = "seva_ya_trims";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		FilamentLoader.loadItems("seva_ya_trims");
		PolymerResourcePackUtils.addModAssets("seva_ya_trims");
		PolymerResourcePackUtils.markAsRequired();
		LOGGER.info("Seva ya Trims initialized!");

	}
}