package dev.kalkafox.logoequality;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.InjectionPoint;

public class LogoEquality
{
	public static final String MOD_ID = "logoequality";

	private static final Logger LOGGER = LogUtils.getLogger();

	public static void init() {

		LOGGER.info("We in the game, yo.");
	}
}
