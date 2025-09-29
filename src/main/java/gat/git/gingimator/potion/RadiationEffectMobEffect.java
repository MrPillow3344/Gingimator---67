package gat.git.gingimator.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

import gat.git.gingimator.procedures.RadiationEffectProcedureProcedure;

public class RadiationEffectMobEffect extends MobEffect {
	public RadiationEffectMobEffect() {
		super(MobEffectCategory.HARMFUL, -3342541);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		RadiationEffectProcedureProcedure.execute();
		return super.applyEffectTick(level, entity, amplifier);
	}
}