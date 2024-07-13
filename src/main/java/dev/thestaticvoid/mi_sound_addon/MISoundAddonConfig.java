package dev.thestaticvoid.mi_sound_addon;

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
    public static boolean machineSoundsEnabled;

    private static final ModConfigSpec.DoubleValue ASSEMBLER_VOLUME = BUILDER
            .comment("Assembler volume")
            .defineInRange("assemblerVolume", 1.0f, 0.0f, 5.0f);
    public static double assemblerVolume;


    private static final ModConfigSpec.DoubleValue BLAST_FURNACE_VOLUME = BUILDER
            .comment("Steam Blast Furnace volume")
            .defineInRange("blastFurnaceVolume", 1.0f, 0.0f, 5.0f);
    public static double blastFurnaceVolume;

    private static final ModConfigSpec.DoubleValue CENTRIFUGE_VOLUME = BUILDER
            .comment("Centrifuge volume")
            .defineInRange("centrifugeVolume", 1.0f, 0.0f, 5.0f);
    public static double centrifugeVolume;

    private static final ModConfigSpec.DoubleValue CHEMICAL_REACTOR_VOLUME = BUILDER
            .comment("Chemical Reactor volume")
            .defineInRange("chemicalReactorVolume", 1.0f, 0.0f, 5.0f);
    public static double chemicalReactorVolume;

    private static final ModConfigSpec.DoubleValue COKE_OVEN_VOLUME = BUILDER
            .comment("Coke Oven volume")
            .defineInRange("cokeOvenVolume", 1.0f, 0.0f, 5.0f);
    public static double cokeOvenVolume;

    private static final ModConfigSpec.DoubleValue COMPRESSOR_VOLUME = BUILDER
            .comment("Compressor volume")
            .defineInRange("compressorVolume", 1.0f, 0.0f, 5.0f);
    public static double compressorVolume;

    private static final ModConfigSpec.DoubleValue CUTTING_MACHINE_VOLUME = BUILDER
            .comment("Cutting Machine volume")
            .defineInRange("cuttingMachineVolume", 1.0f, 0.0f, 5.0f);
    public static double cuttingMachineVolume;

    private static final ModConfigSpec.DoubleValue DISTILLATION_TOWER_VOLUME = BUILDER
            .comment("Distillation Tower volume")
            .defineInRange("distillationTowerVolume", 1.0f, 0.0f, 5.0f);
    public static double distillationTowerVolume;

    private static final ModConfigSpec.DoubleValue DISTILLERY_VOLUME = BUILDER
            .comment("Distillery volume")
            .defineInRange("distilleryVolume", 1.0f, 0.0f, 5.0f);
    public static double distilleryVolume;

    private static final ModConfigSpec.DoubleValue ELECTRIC_BLAST_FURNACE_VOLUME = BUILDER
            .comment("Electric Blast Furnace volume")
            .defineInRange("electricBlastFurnaceVolume", 1.0f, 0.0f, 5.0f);
    public static double electricBlastFurnaceVolume;

    private static final ModConfigSpec.DoubleValue ELECTROLYZER_VOLUME = BUILDER
            .comment("Electrolyzer volume")
            .defineInRange("electrolyzerVolume", 1.0f, 0.0f, 5.0f);
    public static double electrolyzerVolume;

    private static final ModConfigSpec.DoubleValue FISSION_REACTOR_VOLUME = BUILDER
            .comment("Fission Reactor volume")
            .defineInRange("fissionReactorVolume", 1.0f, 0.0f, 5.0f);
    public static double fissionReactorVolume;

    private static final ModConfigSpec.DoubleValue FUSION_REACTOR_VOLUME = BUILDER
            .comment("Fusion Reactor volume")
            .defineInRange("fusionReactorVolume", 1.0f, 0.0f, 5.0f);
    public static double fusionReactorVolume;

    private static final ModConfigSpec.DoubleValue FURNACE_VOLUME = BUILDER
            .comment("Furnace volume")
            .defineInRange("furnaceVolume", 1.0f, 0.0f, 5.0f);
    public static double furnaceVolume;

    private static final ModConfigSpec.DoubleValue HEAT_EXCHANGER_VOLUME = BUILDER
            .comment("Heat Exchanger volume")
            .defineInRange("heatExchangerVolume", 1.0f, 0.0f, 5.0f);
    public static double heatExchangerVolume;

    private static final ModConfigSpec.DoubleValue IMPLOSION_COMPRESSOR_VOLUME = BUILDER
            .comment("Implosion Compressor value")
            .defineInRange("implosionCompressorVolume", 1.0f, 0.0f, 5.0f);
    public static double implosionCompressorVolume;

    private static final ModConfigSpec.DoubleValue MACERATOR_VOLUME = BUILDER
            .comment("Macerator volume")
            .defineInRange("maceratorVolume", 1.0f, 0.0f, 5.0f);
    public static double maceratorVolume;

    private static final ModConfigSpec.DoubleValue MIXER_VOLUME = BUILDER
            .comment("Mixer volume")
            .defineInRange("mixerVolume", 1.0f, 0.0f, 5.0f);
    public static double mixerVolume;

    private static final ModConfigSpec.DoubleValue OIL_DRILLING_RIG_VOLUME = BUILDER
            .comment("Oil Drilling Rig volume")
            .defineInRange("oilDrillingRigVolume", 1.0f, 0.0f, 5.0f);
    public static double oilDrillingRigVolume;

    private static final ModConfigSpec.DoubleValue PACKER_VOLUME = BUILDER
            .comment("Packer volume")
            .defineInRange("packerVolume", 1.0f, 0.0f, 5.0f);
    public static double packerVolume;

    private static final ModConfigSpec.DoubleValue POLARIZER_VOLUME = BUILDER
            .comment("Polarizer volume")
            .defineInRange("polarizerVolume", 1.0f, 0.0f, 5.0f);
    public static double polarizerVolume;

    private static final ModConfigSpec.DoubleValue PRESSURIZER_VOLUME = BUILDER
            .comment("Pressurizer volume")
            .defineInRange("pressurizerVolume", 1.0f, 0.0f, 5.0f);
    public static double pressurizerVolume;

    private static final ModConfigSpec.DoubleValue QUARRY_VOLUME = BUILDER
            .comment("Quarry volume")
            .defineInRange("quarryVolume", 1.0f, 0.0f, 5.0f);
    public static double quarryVolume;

    private static final ModConfigSpec.DoubleValue UNPACKER_VOLUME = BUILDER
            .comment("Unpacker volume")
            .defineInRange("unpackerVolume", 1.0f, 0.0f, 5.0f);
    public static double unpackerVolume;

    private static final ModConfigSpec.DoubleValue VACUUM_FREEZER_VOLUME = BUILDER
            .comment("Vacuum Freezer volume")
            .defineInRange("vacuumFreezerVolume", 1.0f, 0.0f, 5.0f);
    public static double vacuumFreezerVolume;

    private static final ModConfigSpec.DoubleValue WIREMILL_VOLUME = BUILDER
            .comment("Wiremill volume")
            .defineInRange("wiremillVolume", 1.0f, 0.0f, 5.0f);
    public static double wiremillVolume;

    private static final ModConfigSpec.DoubleValue WRENCH_VOLUME = BUILDER
            .comment("Wrench volume")
            .defineInRange("wrenchVolume", 1.0f, 0.0f, 5.0f);
    public static double wrenchVolume;

    private static final ModConfigSpec.DoubleValue REPLICATOR_VOLUME = BUILDER
            .comment("Replicator volume")
            .defineInRange("replicatorVolume", 1.0f, 0.0f, 5.0f);
    public static double replicatorVolume;

    static final ModConfigSpec SPEC = BUILDER.build();

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {

    }
}
