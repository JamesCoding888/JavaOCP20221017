package com.ocp.day10_2;

public class JetAircraft extends Airplane implements Weapon{

	@Override
	public void speed() {
	
		System.out.println("F35 speed in 1,200 mph");     // F35 速度 1,200 mph
		
	}

	@Override
	public void shoot() {
		
		System.out.println("Launche Sidewinder missile"); // 發射響尾蛇飛彈
		
	}
	
}
