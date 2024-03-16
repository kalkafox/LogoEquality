package dev.kalkafox.logoequality.fabric;

import dev.kalkafox.logoequality.LogoEquality;
import net.fabricmc.api.ModInitializer;

public class LogoEqualityFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        LogoEquality.init();
    }
}