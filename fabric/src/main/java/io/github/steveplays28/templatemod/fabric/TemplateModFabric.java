package io.github.steveplays28.templatemod.fabric;

import io.github.steveplays28.templatemod.TemplateMod;
import net.fabricmc.api.ModInitializer;

public class TemplateModFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		TemplateMod.initialize();
	}
}
