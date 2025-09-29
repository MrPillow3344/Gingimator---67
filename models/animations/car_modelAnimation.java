// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 4.10.3 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class car_modelAnimation {
	public static final AnimationDefinition car.drive=AnimationDefinition.Builder.withLength(1.0F).looping().addAnimation("wheel3",new AnimationChannel(AnimationChannel.Targets.ROTATION,new Keyframe(0.0F,KeyframeAnimations.degreeVec(0.0F,0.0F,0.0F),AnimationChannel.Interpolations.LINEAR),new Keyframe(0.5F,KeyframeAnimations.degreeVec(180.0F,0.0F,0.0F),AnimationChannel.Interpolations.LINEAR),new Keyframe(1.0F,KeyframeAnimations.degreeVec(360.0F,0.0F,0.0F),AnimationChannel.Interpolations.LINEAR))).addAnimation("wheel3",new AnimationChannel(AnimationChannel.Targets.POSITION,new Keyframe(0.0F,KeyframeAnimations.posVec(0.0F,0.0F,0.0F),AnimationChannel.Interpolations.LINEAR),new Keyframe(0.75F,KeyframeAnimations.posVec(0.0F,-1.0F,0.0F),AnimationChannel.Interpolations.LINEAR),new Keyframe(1.0F,KeyframeAnimations.posVec(0.0F,0.0F,0.0F),AnimationChannel.Interpolations.LINEAR))).addAnimation("wheel4",new AnimationChannel(AnimationChannel.Targets.POSITION,new Keyframe(0.0F,KeyframeAnimations.posVec(0.0F,0.0F,0.0F),AnimationChannel.Interpolations.LINEAR),new Keyframe(0.5F,KeyframeAnimations.posVec(0.0F,1.0F,-1.0F),AnimationChannel.Interpolations.LINEAR),new Keyframe(1.0F,KeyframeAnimations.posVec(0.0F,0.0F,0.0F),AnimationChannel.Interpolations.LINEAR))).build();
}