package dev.thestaticvoid.mi_sound_addon;

import aztech.modern_industrialization.MITags;
import aztech.modern_industrialization.blocks.WrenchableBlockEntity;
import com.mojang.logging.LogUtils;
import dev.thestaticvoid.mi_sound_addon.item.ModItems;
import dev.thestaticvoid.mi_sound_addon.sound.ModSoundEventInfo;
import dev.thestaticvoid.mi_sound_addon.sound.ModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import org.slf4j.Logger;

@Mod(MISoundAddon.MOD_ID)
public class MISoundAddon {
    public static final String MOD_ID = "mi_sound_addon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public MISoundAddon(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(FMLCommonSetupEvent.class, event -> {
        });

        ModItems.init(modEventBus);
        ModSounds.init(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, MISoundAddonConfig.SPEC);

//        NeoForge.EVENT_BUS.addListener(PlayerInteractEvent.RightClickBlock.class, (event) -> {
//            if (!event.getUseBlock().isFalse()) {
//                InteractionHand hand = event.getHand();
//                BlockHitResult hitResult = event.getHitVec();
//                Player player = event.getEntity();
//                Level level = event.getLevel();
//                if (!player.isSpectator() && event.getLevel().mayInteract(player, hitResult.getBlockPos())) {
//                    if (player.getItemInHand(hand).is(MITags.WRENCHES)) {
//                        BlockEntity be = level.getBlockEntity(hitResult.getBlockPos());
//                        if (be instanceof WrenchableBlockEntity wrenchable) {
//                            if (wrenchable.useWrench(player, hand, hitResult)) {
//                                ModSoundEventInfo wrenchEvent = ModSounds.SOUND_EVENTS.get("wrench");
//                                level.playSound(null, hitResult.getBlockPos(), wrenchEvent.getSoundEvent().get(), SoundSource.BLOCKS, wrenchEvent.getVolume(), 1.0f);
//                            }
//                        }
//                    }
//                }
//            }
//        });

        LOGGER.info("Modern Industrialization Sound Addon initialized.");
    }
}
