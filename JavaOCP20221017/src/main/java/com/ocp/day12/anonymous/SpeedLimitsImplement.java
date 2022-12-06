package com.ocp.day12.anonymous;

public class SpeedLimitsImplement implements SpeedLimits {
 
	@Override
	public boolean verify(double value) {
	
		return value > 60;
		
	}
}
