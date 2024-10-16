package io.github.steveplays28.templatemod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod {
	public static final String MOD_ID = "templatemod";
	public static final String MOD_NAME = "Template Mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static void initialize() {
		LOGGER.info("Loading {}.", MOD_NAME);
	}
}
