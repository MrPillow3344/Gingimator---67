/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package gat.git.gingimator.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import gat.git.gingimator.potion.RadiationEffectMobEffect;
import gat.git.gingimator.GingimatorSixsevenMod;

public class GingimatorSixsevenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, GingimatorSixsevenMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> RADIATION_EFFECT = REGISTRY.register("radiation_effect", () -> new RadiationEffectMobEffect());
}