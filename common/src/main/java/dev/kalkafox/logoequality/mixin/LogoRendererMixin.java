package dev.kalkafox.logoequality.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.LogoRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LogoRenderer.class)
public class LogoRendererMixin {

    @Inject(method = "renderLogo(Lnet/minecraft/client/gui/GuiGraphics;IFI)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphics;blit(Lnet/minecraft/resources/ResourceLocation;IIFFIIII)V", shift = At.Shift.AFTER), cancellable = true)
    private void removeEditionLogo(GuiGraphics guiGraphics, int i, float f, int j, CallbackInfo ci) {
        ci.cancel();
        guiGraphics.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

}
