package com.ocp.day12.anonymous.speedLimits;

@FunctionalInterface
public interface SpeedLimits {

	boolean verify(double value);   // same as "public abstract boolean verify(double value);" 
	
}
