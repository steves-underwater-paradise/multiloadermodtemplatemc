package io.github.steveplays28.templatemod.forge;

import io.github.steveplays28.templatemod.TemplateMod;
import net.minecraftforge.fml.common.Mod;

@Mod(TemplateMod.MOD_ID)
public class TemplateModForge {
	public TemplateModForge() {
		TemplateMod.initialize();
	}
}
