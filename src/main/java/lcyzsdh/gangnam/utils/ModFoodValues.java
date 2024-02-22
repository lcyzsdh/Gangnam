package lcyzsdh.gangnam.utils;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodValues {
    public static final FoodProperties BAYBERRY_WINE=(new FoodProperties.Builder()).nutrition(4)
            .effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,0),1.0f).build();
}
