package dev.thestaticvoid.mi_sound_addon;

import dev.thestaticvoid.mi_sound_addon.sound.ModSounds;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = MISoundAddon.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class MISoundAddonConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue MACHINE_SOUNDS_ENABLED = BUILDER
            .comment("Should the machine sounds be enabled?")
            .define("machineSoundsEnabled", true);

    private static final ModConfigSpec.DoubleValue ASSEMBLER_VOLUME = BUILDER
            .comment("Assembler volume")
            .defineInRange("assemblerVolume", 1.0, 0.0, 5.0);


    private static final ModConfigSpec.DoubleValue BLAST_FURNACE_VOLUME = BUILDER
            .comment("Steam Blast Furnace volume")
            .defineInRange("blastFurnaceVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue CENTRIFUGE_VOLUME = BUILDER
            .comment("Centrifuge volume")
            .defineInRange("centrifugeVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue CHEMICAL_REACTOR_VOLUME = BUILDER
            .comment("Chemical Reactor volume")
            .defineInRange("chemicalReactorVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue COKE_OVEN_VOLUME = BUILDER
            .comment("Coke Oven volume")
            .defineInRange("cokeOvenVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue COMPRESSOR_VOLUME = BUILDER
            .comment("Compressor volume")
            .defineInRange("compressorVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue CUTTING_MACHINE_VOLUME = BUILDER
            .comment("Cutting Machine volume")
            .defineInRange("cuttingMachineVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue DISTILLATION_TOWER_VOLUME = BUILDER
            .comment("Distillation Tower volume")
            .defineInRange("distillationTowerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue DISTILLERY_VOLUME = BUILDER
            .comment("Distillery volume")
            .defineInRange("distilleryVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue ELECTRIC_BLAST_FURNACE_VOLUME = BUILDER
            .comment("Electric Blast Furnace volume")
            .defineInRange("electricBlastFurnaceVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue ELECTROLYZER_VOLUME = BUILDER
            .comment("Electrolyzer volume")
            .defineInRange("electrolyzerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue FISSION_REACTOR_VOLUME = BUILDER
            .comment("Fission Reactor volume")
            .defineInRange("fissionReactorVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue FUSION_REACTOR_VOLUME = BUILDER
            .comment("Fusion Reactor volume")
            .defineInRange("fusionReactorVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue FURNACE_VOLUME = BUILDER
            .comment("Furnace volume")
            .defineInRange("furnaceVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue HEAT_EXCHANGER_VOLUME = BUILDER
            .comment("Heat Exchanger volume")
            .defineInRange("heatExchangerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue IMPLOSION_COMPRESSOR_VOLUME = BUILDER
            .comment("Implosion Compressor value")
            .defineInRange("implosionCompressorVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue MACERATOR_VOLUME = BUILDER
            .comment("Macerator volume")
            .defineInRange("maceratorVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue MIXER_VOLUME = BUILDER
            .comment("Mixer volume")
            .defineInRange("mixerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue OIL_DRILLING_RIG_VOLUME = BUILDER
            .comment("Oil Drilling Rig volume")
            .defineInRange("oilDrillingRigVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue PACKER_VOLUME = BUILDER
            .comment("Packer volume")
            .defineInRange("packerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue POLARIZER_VOLUME = BUILDER
            .comment("Polarizer volume")
            .defineInRange("polarizerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue PRESSURIZER_VOLUME = BUILDER
            .comment("Pressurizer volume")
            .defineInRange("pressurizerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue QUARRY_VOLUME = BUILDER
            .comment("Quarry volume")
            .defineInRange("quarryVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue UNPACKER_VOLUME = BUILDER
            .comment("Unpacker volume")
            .defineInRange("unpackerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue VACUUM_FREEZER_VOLUME = BUILDER
            .comment("Vacuum Freezer volume")
            .defineInRange("vacuumFreezerVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue WIREMILL_VOLUME = BUILDER
            .comment("Wiremill volume")
            .defineInRange("wiremillVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue WRENCH_VOLUME = BUILDER
            .comment("Wrench volume")
            .defineInRange("wrenchVolume", 1.0, 0.0, 5.0);

    private static final ModConfigSpec.DoubleValue REPLICATOR_VOLUME = BUILDER
            .comment("Replicator volume")
            .defineInRange("replicatorVolume", 1.0, 0.0, 5.0);

    static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean machineSoundsEnabled;
    public static double assemblerVolume;
    public static double blastFurnaceVolume;
    public static double centrifugeVolume;
    public static double chemicalReactorVolume;
    public static double cokeOvenVolume;
    public static double compressorVolume;
    public static double cuttingMachineVolume;
    public static double distillationTowerVolume;
    public static double distilleryVolume;
    public static double electricBlastFurnaceVolume;
    public static double electrolyzerVolume;
    public static double fissionReactorVolume;
    public static double fusionReactorVolume;
    public static double furnaceVolume;
    public static double heatExchangerVolume;
    public static double implosionCompressorVolume;
    public static double maceratorVolume;
    public static double mixerVolume;
    public static double oilDrillingRigVolume;
    public static double packerVolume;
    public static double polarizerVolume;
    public static double pressurizerVolume;
    public static double quarryVolume;
    public static double unpackerVolume;
    public static double vacuumFreezerVolume;
    public static double wiremillVolume;
    public static double wrenchVolume;
    public static double replicatorVolume;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        machineSoundsEnabled = MACHINE_SOUNDS_ENABLED.get();
        assemblerVolume = ASSEMBLER_VOLUME.get();
        blastFurnaceVolume = BLAST_FURNACE_VOLUME.get();
        centrifugeVolume = CENTRIFUGE_VOLUME.get();
        chemicalReactorVolume = CHEMICAL_REACTOR_VOLUME.get();
        cokeOvenVolume = COKE_OVEN_VOLUME.get();
        compressorVolume = COMPRESSOR_VOLUME.get();
        cuttingMachineVolume = CUTTING_MACHINE_VOLUME.get();
        distillationTowerVolume = DISTILLATION_TOWER_VOLUME.get();
        distilleryVolume = DISTILLERY_VOLUME.get();
        electricBlastFurnaceVolume = ELECTRIC_BLAST_FURNACE_VOLUME.get();
        electrolyzerVolume = ELECTROLYZER_VOLUME.get();
        fissionReactorVolume = FISSION_REACTOR_VOLUME.get();
        fusionReactorVolume = FUSION_REACTOR_VOLUME.get();
        furnaceVolume = FURNACE_VOLUME.get();
        heatExchangerVolume = HEAT_EXCHANGER_VOLUME.get();
        implosionCompressorVolume = IMPLOSION_COMPRESSOR_VOLUME.get();
        maceratorVolume = MACERATOR_VOLUME.get();
        mixerVolume = MIXER_VOLUME.get();
        oilDrillingRigVolume = OIL_DRILLING_RIG_VOLUME.get();
        packerVolume = PACKER_VOLUME.get();
        polarizerVolume = POLARIZER_VOLUME.get();
        pressurizerVolume = PRESSURIZER_VOLUME.get();
        quarryVolume = QUARRY_VOLUME.get();
        unpackerVolume = UNPACKER_VOLUME.get();
        vacuumFreezerVolume = VACUUM_FREEZER_VOLUME.get();
        wiremillVolume = WIREMILL_VOLUME.get();
        wrenchVolume = WRENCH_VOLUME.get();
        replicatorVolume = REPLICATOR_VOLUME.get();

        // Had issues with the ordering of events on load, best to just call this here
        ModSounds.updateVolumes();
    }
}
