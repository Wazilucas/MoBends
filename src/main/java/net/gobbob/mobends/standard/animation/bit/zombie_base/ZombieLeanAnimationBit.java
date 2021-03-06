package net.gobbob.mobends.standard.animation.bit.zombie_base;

import net.gobbob.mobends.core.animation.bit.AnimationBit;
import net.gobbob.mobends.standard.data.ZombieDataBase;

public class ZombieLeanAnimationBit extends AnimationBit<ZombieDataBase<?>>
{
	@Override
	public String[] getActions(ZombieDataBase<?> entityData)
	{
		return new String[] { "lean" };
	}
	
	@Override
	public void perform(ZombieDataBase<?> data)
	{
		data.renderOffset.slideY(-3F);
		
		data.body.rotation.localRotateX(30F);
		data.head.rotation.rotateX(-30F);
		
		data.rightArm.rotation.rotateX(-30F);
		data.leftArm.rotation.rotateX(-30F);
		
		data.rightLeg.rotation.rotateZ(10F);
		data.leftLeg.rotation.rotateZ(-10F);
		
		data.rightLeg.rotation.rotateX(-20);
		data.leftLeg.rotation.rotateX(-20);
		
		data.rightForeLeg.rotation.rotateX(25);
		data.leftForeLeg.rotation.rotateX(25);
		
		if(!data.isStillHorizontally() && data.getCurrentWalkingState() == 1)
		{
			data.rightArm.rotation.orientX(-90 - 30.0f);
			data.leftArm.rotation.orientX(-90 - 30.0f);
		}
	}
}
