package dev.thestaticvoid.mi_sound_addon.compat.kubejs;

import dev.latvian.mods.kubejs.event.EventGroupRegistry;
import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.thestaticvoid.mi_sound_addon.compat.kubejs.sound.MISoundKubeJSEvents;

public class MISoundAddonKubeJSPlugin implements KubeJSPlugin {
    @Override
    public void init() {}

    @Override
    public void registerEvents(EventGroupRegistry registry) {
        registry.register(MISoundKubeJSEvents.EVENT_GROUP);
    }

    @Override
    public void initStartup() {
        KubeJSProxy.instance = new LoadedKubeJSProxy();
    }
}