package com.ocp.day10_2;

public class JetAircraft extends Airplane implements Weapon{

	public JetAircraft() {

	}

	public JetAircraft(String teamName) {
		System.out.println(teamName + "Ready");
	}
		
	@Override
	public void speed() {
	
		System.out.println("F-35 speed in 1.61 Mach");     // F35 速度 1,200 mph = 1.61 (Mach, 馬赫)
		
	}

	@Override
	public void fire() {
		
		System.out.println("Launching Sidewinder missile");  // 發射響尾蛇飛彈
		
	}
	
}
