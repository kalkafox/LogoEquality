package dev.kalkafox.logoequality.forge;

import dev.kalkafox.logoequality.LogoEquality;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LogoEquality.MOD_ID)
public class LogoEqualityForge {
    public LogoEqualityForge() {
        LogoEquality.init();
    }
}