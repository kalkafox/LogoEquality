package dev.kalkafox.logoequality.neoforge;

import dev.kalkafox.logoequality.LogoEquality;
import net.neoforged.fml.common.Mod;

@Mod(LogoEquality.MOD_ID)
public class LogoEqualityNeoForge {
    public LogoEqualityNeoForge() {
        LogoEquality.init();
    }
}