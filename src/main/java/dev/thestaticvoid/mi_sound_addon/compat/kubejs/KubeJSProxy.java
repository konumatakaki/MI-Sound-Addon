package dev.thestaticvoid.mi_sound_addon.compat.kubejs;

import net.neoforged.fml.ModList;

public class KubeJSProxy {
    public static void checkThatKubeJsIsLoaded() {
        if (ModList.get().isLoaded("kubejs") && instance.getClass() == KubeJSProxy.class) {
            throw new IllegalStateException("KubeJS should have initialized before MI Sound Addon");
        }
    }
    public static KubeJSProxy instance = new KubeJSProxy();

    public void fireSoundModificationsEvent() {

    }
}