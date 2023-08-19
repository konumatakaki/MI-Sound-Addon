package dev.thestaticvoid.mi_sound_addon.sound;

import aztech.modern_industrialization.machines.MachineBlockEntity;
import aztech.modern_industrialization.machines.init.MIMachineRecipeTypes;
import aztech.modern_industrialization.machines.recipe.MachineRecipe;
import aztech.modern_industrialization.machines.recipe.MachineRecipeType;
import dev.thestaticvoid.mi_sound_addon.MISoundAddon;
import dev.thestaticvoid.mi_sound_addon.MISoundAddonConfig;
import dev.thestaticvoid.mi_sound_addon.compat.kubejs.KubeJSProxy;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;

public class ModSounds {

    public static HashMap<String, ModSoundEventInfo> machineRecipeTypeSoundEvents;
    private static final int DEFAULT_SOUND_DURATION = 60;


    public static void initializeSounds() {
        MISoundAddon.LOGGER.debug("Registering sounds for " + MISoundAddon.MOD_ID);
        machineRecipeTypeSoundEvents = new HashMap<>();
        if (MISoundAddonConfig.getConfig().enableSounds) {
            populateDefaultRecipeTypes(MIMachineRecipeTypes.getRecipeTypes());
        }
    }

    public static void playSound(@NotNull MachineBlockEntity blockEntity, MachineRecipe activeRecipe) {
        Level world = blockEntity.getLevel();
        if (world == null) { return; }

        ModSoundEventInfo soundEventInfo;

        if (!blockEntity.guiParams.blockId.equals("electric_blast_furnace")) {
            soundEventInfo = machineRecipeTypeSoundEvents.get(getRecipeType(activeRecipe));
        } else {
            soundEventInfo = machineRecipeTypeSoundEvents.get("electric_blast_furnace");
        }

        if (soundEventInfo.getSoundEvent() != null) {
            world.playSound(null, blockEntity.getBlockPos().getX(), blockEntity.getBlockPos().getY(),
                    blockEntity.getBlockPos().getZ(), soundEventInfo.getSoundEvent(), SoundSource.BLOCKS,
                    soundEventInfo.getVolume(), 1.0F);
        }
    }

    public static int getSoundDuration(MachineRecipe activeRecipe) {
        return machineRecipeTypeSoundEvents.get(getRecipeType(activeRecipe)).getSoundDuration();
    }

    private static String getRecipeType(@NotNull MachineRecipe activeRecipe) {
        return ((MachineRecipeType) activeRecipe.getType()).getPath();
    }

    private static void populateDefaultRecipeTypes(@NotNull List<MachineRecipeType> machineRecipeTypes) {
        for (MachineRecipeType mrt : machineRecipeTypes) {
            String type = mrt.getPath();

            // forge hammer isn't a machine :P
            if (type.equals("forge_hammer")) continue;

            addSoundEvent(type);
        }
        addSoundEvent("electric_blast_furnace");
        // TODO fission reactor
        updateDurations();
        updateVolumes();
        KubeJSProxy.instance.fireRegisterSoundsEvent();
    }

    public static void addSoundEvent(String type) {
        addSoundEvent(type, 1.0f);
    }

    public static void addSoundEvent(String type, float volume) {
        addSoundEvent(type, DEFAULT_SOUND_DURATION, volume);
    }

    public static void addSoundEvent(String type, int duration, float volume) {
        SoundEvent newSoundEvent = Registry.register(Registry.SOUND_EVENT,
                new ResourceLocation(MISoundAddon.MOD_ID, type),
                new SoundEvent(new ResourceLocation(MISoundAddon.MOD_ID, type)));

        machineRecipeTypeSoundEvents.put(type, new ModSoundEventInfo(newSoundEvent, duration, volume));
        MISoundAddon.LOGGER.debug("Registered SoundEvent for RecipeType: " + type);
    }

    public static void setDuration(String type, int duration) {
        if (machineRecipeTypeSoundEvents.containsKey(type)) {
            machineRecipeTypeSoundEvents.get(type).setSoundDuration(duration);
        } else {
            throw new IllegalStateException("Tried to set duration of non-existent recipe type");
        }
    }

    public static void setVolume(String type, float volume) {
        if (machineRecipeTypeSoundEvents.containsKey(type)) {
            machineRecipeTypeSoundEvents.get(type).setVolume(volume);
        } else {
            throw new IllegalStateException("Tried to set volume of non-existent recipe type");
        }
    }

    private static void updateDurations() {
        // Values are calculated by hand here
        // I would prefer if they weren't, but I just haven't gotten there yet
        setDuration("furnace", 64);
        setDuration("fusion_reactor", 68);
        setDuration("mixer", 38);
        setDuration("chemical_reactor", 154);
        setDuration("cutting_machine", 72);
        // setDuration("fission_reactor", 219);
        setDuration("vacuum_freezer", 61);
        setDuration("electric_blast_furnace", 128);
        setDuration("assembler", 110);
        setDuration("compressor", 44);
        setDuration("macerator", 59);
        setDuration("packer", 28);
        setDuration("unpacker", 28);
        setDuration("polarizer", 37);
        setDuration("centrifuge", 129);
        setDuration("electrolyzer", 111);
        setDuration("pressurizer", 89);
        setDuration("quarry", 111);
        setDuration("wiremill", 120);
        setDuration("blast_furnace", 212);
        setDuration("distillery", 51);
        setDuration("oil_drilling_rig", 129);
        setDuration("distillation_tower", 110);
        setDuration("implosion_compressor", 14);
    }

    private static void updateVolumes() {
        MISoundAddonConfig config = MISoundAddonConfig.getConfig();
        setVolume("assembler", config.assemblerVolume);
        setVolume("blast_furnace", config.blastFurnaceVolume);
        setVolume("centrifuge", config.centrifugeVolume);
        setVolume("chemical_reactor", config.chemicalReactorVolume);
        setVolume("coke_oven", config.cokeOvenVolume);
        setVolume("compressor", config.compressorVolume);
        setVolume("cutting_machine", config.cuttingMachineVolume);
        setVolume("distillation_tower", config.distillationTowerVolume);
        setVolume("electric_blast_furnace", config.electricBlastFurnaceVolume);
        setVolume("electrolyzer", config.electrolyzerVolume);
        setVolume("fusion_reactor", config.fusionReactorVolume);
        setVolume("furnace", config.furnaceVolume);
        setVolume("implosion_compressor", config.implosionCompressorVolume);
        setVolume("macerator", config.maceratorVolume);
        setVolume("mixer", config.mixerVolume);
        setVolume("packer", config.packerVolume);
        setVolume("polarizer", config.polarizerVolume);
        setVolume("pressurizer", config.pressurizerVolume);
        setVolume("quarry", config.oilDrillingRigVolume);
        setVolume("unpacker", config.unpackerVolume);
        setVolume("vacuum_freezer", config.vacuumFreezerVolume);
        setVolume("wiremill", config.wiremillVolume);
    }
}