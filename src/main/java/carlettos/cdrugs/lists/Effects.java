package carlettos.cdrugs.lists;

import java.util.List;

import com.mojang.datafixers.util.Pair;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class Effects {
    public static final List<Pair<StatusEffectInstance, Float>> COCA_LEAF_EFFECTS;

    static {
        COCA_LEAF_EFFECTS = List.of(Pair.of(new StatusEffectInstance(StatusEffects.HASTE, 200, 0), 0.2f));
    }
}
