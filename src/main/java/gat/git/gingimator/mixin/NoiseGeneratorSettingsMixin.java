package gat.git.gingimator.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import gat.git.gingimator.init.GingimatorSixsevenModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements GingimatorSixsevenModBiomes.GingimatorSixsevenModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> gingimator_sixseven_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.gingimator_sixseven_dimensionTypeReference != null) {
			retval = GingimatorSixsevenModBiomes.adaptSurfaceRule(retval, this.gingimator_sixseven_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setgingimator_sixsevenDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.gingimator_sixseven_dimensionTypeReference = dimensionType;
	}
}