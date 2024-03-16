package dev.kalkafox.logoequality.quilt;


import dev.kalkafox.logoequality.LogoEquality;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class LogoEqualityQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        LogoEquality.init();
    }
}
