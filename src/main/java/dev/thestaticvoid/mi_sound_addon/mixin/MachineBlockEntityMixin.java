package dev.thestaticvoid.mi_sound_addon.mixin;

import aztech.modern_industrialization.blocks.FastBlockEntity;
import aztech.modern_industrialization.blocks.WrenchableBlockEntity;
import aztech.modern_industrialization.machines.BEP;
import aztech.modern_industrialization.machines.IComponent;
import aztech.modern_industrialization.machines.MachineBlockEntity;
import aztech.modern_industrialization.machines.components.OrientationComponent;
import aztech.modern_industrialization.machines.gui.MachineGuiParameters;
import dev.thestaticvoid.mi_sound_addon.util.SilencedComponent;
import dev.thestaticvoid.mi_sound_addon.util.SilencedComponentInterface;
import net.minecraft.core.BlockPos;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MachineBlockEntity.class)
public abstract class MachineBlockEntityMixin extends FastBlockEntity
        implements WrenchableBlockEntity, SilencedComponentInterface, MenuProvider {
    public MachineBlockEntityMixin(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Shadow(remap = false)
    protected abstract void registerComponents(IComponent... components);

    @Unique
    public SilencedComponent silencedComp;

    @Inject(at = @At("TAIL"), method = "<init>", remap = false)
    private void constructorMixin(BEP bep, MachineGuiParameters guiParams, OrientationComponent.Params orientationParams, CallbackInfo ci) {
        silencedComp = new SilencedComponent();
        registerComponents(silencedComp);
    }

//    @Inject(method = "useItemOn", at = @At("RETURN"), remap = false, cancellable = true)
//    private void onUseMixin(Player player, InteractionHand hand, Direction face, CallbackInfoReturnable<InteractionResult> cir) {
//        InteractionResult result = MalletItem.onUse((MachineBlockEntity)(Object)this, player, hand);
//        if (result.consumesAction()) {
//            mISoundAddon$toggleSilencedState();
//            if (silencedComp.silenced) {
//                player.displayClientMessage(Component.translatable(MalletItem.MACHINE_SILENCED), true);
//            } else {
//                player.displayClientMessage(Component.translatable(MalletItem.MACHINE_UNSILENCED), true);
//            }
//        }
//        cir.setReturnValue(result);
//    }

    @Override
    public void mISoundAddon$toggleSilencedState() {
        silencedComp.onMalletUse();
    }

    @Override
    public SilencedComponent mISoundAddon$getSilencedState() {
        return silencedComp;
    }
}
