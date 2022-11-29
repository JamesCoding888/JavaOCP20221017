package com.ocp.day10_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Army {
    public static void main(String[] args) {
        
    	System.out.println("beep beep beep ... beep beep beep, Sergeant Major, to be noticed~~~, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Copy that~~~, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Have your Corporal and Trucks ready to the frontline, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Roger that~~~, Over!");
    	System.out.println("Trucks are initialized !!!");
    	Car truck1 = new Truck("Blasting Soldiers holding TNT, ");
        Car truck2 = new Truck("Chemical Soldiers holding the package of VX, ");       
        Car truck3 = new Truck("Armed Forces holding FIM-92 Stinger, ");
        System.out.println("beep beep beep ... beep beep beep, Sergeant Major, to be noticed~~~, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Copy that~~~, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Have your Tanks ready to the frontline, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Roger that~~~, Over!");
        System.out.println("Tanks are initialized !!!");
        Car tank1 = new Tank("M1 Abrams, ");
        Car tank2 = new Tank("M1A1, ");
        
        // Collect all objects into 1-D array for arrangement by General
        Car[] cars = {truck1, truck2, truck3, tank1, tank2};
        
        System.out.println("beep beep beep ... beep beep beep, UAV, to be noticed~~~, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Copy that~~~, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Have your drones ready to the air base of enemy, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Roger that~~~, Over!");
        System.out.println("Drones are initialized !!!");
        Airplane drone1 = new Drone("Atomics MQ-1C Gray Eagle, ");
        Airplane drone2 = new Drone("Boeing MQ-25 Stingray, ");
        drone1.speed();
        System.out.println("beep beep beep ... beep beep beep, Lockheed Martin, to be noticed~~~, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Copy that~~~, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Have your F-35 ready to cover the tanks, Over!");
    	System.out.println("beep beep beep ... beep beep beep, Roger that~~~, Over!");
    	System.out.println("JetAircraft are initialized !!!");
        Airplane f35 = new JetAircraft("F-35, ");
        f35.speed();
        
        // Collect all objects into 1-D array for arrangement by General
        Airplane[] airplanes = {drone1, drone2, f35};


        System.out.println("************ 1st pattern of allocate weapons ************");
        Weapon weapon1 = new Tank("Armour-piercing ammunition, ");
        Weapon weapon2 = new JetAircraft("Sidewinder missile, ");
        Weapon[] weaponsReadyToFire_1 = {weapon1, weapon2};

        // Permission to Fire !!! 
        for(Weapon weapon : weaponsReadyToFire_1) {
            weapon.fire();
        }        
                
        System.out.println("************ 2nd pattern of allocate weapons ************");
        Weapon[] weaponsReadyToFire_2 = {(Weapon)tank1, (Weapon)tank2, (Weapon)f35};
        // Permission to Fire in Java 1.8 - Stream API!!!
        Arrays.stream(weaponsReadyToFire_2).forEach(ready -> ready.fire());
                
        System.out.println("************ 3rd pattern of allocate weapons ************");
        List<Weapon> list = new ArrayList<>();
        list.add(weapon1);
        list.add(weapon2);
        
        for(Weapon o : weaponsReadyToFire_1) {
        	if(o instanceof Weapon)
        		list.add(o);
        }
        for(Weapon o : weaponsReadyToFire_2) {
        	if(o instanceof Weapon)
        		list.add(o);
        }       
        // Permission to Fire !!! 
        list.forEach(ready -> ready.fire());  
    }
}

/*
	Console:
			beep beep beep ... beep beep beep, Sergeant Major, to be noticed~~~, Over!
			beep beep beep ... beep beep beep, Copy that~~~, Over!
			beep beep beep ... beep beep beep, Have your Corporal and Trucks ready to the frontline, Over!
			beep beep beep ... beep beep beep, Roger that~~~, Over!
			Trucks are initialized !!!
			Blasting Soldiers holding TNT, Ready
			Chemical Soldiers holding the package of VX, Ready
			Armed Forces holding FIM-92 Stinger, Ready
			beep beep beep ... beep beep beep, Sergeant Major, to be noticed~~~, Over!
			beep beep beep ... beep beep beep, Copy that~~~, Over!
			beep beep beep ... beep beep beep, Have your Tanks ready to the frontline, Over!
			beep beep beep ... beep beep beep, Roger that~~~, Over!
			Tanks are initialized !!!
			M1 Abrams, Ready
			M1A1, Ready
			beep beep beep ... beep beep beep, UAV, to be noticed~~~, Over!
			beep beep beep ... beep beep beep, Copy that~~~, Over!
			beep beep beep ... beep beep beep, Have your drones ready to the air base of enemy, Over!
			beep beep beep ... beep beep beep, Roger that~~~, Over!
			Drones are initialized !!!
			Atomics MQ-1C Gray Eagle, Ready
			Boeing MQ-25 Stingray, Ready
			UAV speed in 800km/h
			beep beep beep ... beep beep beep, Lockheed Martin, to be noticed~~~, Over!
			beep beep beep ... beep beep beep, Copy that~~~, Over!
			beep beep beep ... beep beep beep, Have your F-35 ready to cover the tanks, Over!
			beep beep beep ... beep beep beep, Roger that~~~, Over!
			JetAircraft are initialized !!!
			F-35, Ready
			F-35 speed in 1.61 Mach
			************ 1st pattern of allocate weapons ************
			Armour-piercing ammunition, Ready
			Sidewinder missile, Ready
			Shooting armour-piercing ammunition to penetrate tank armour
			Launching Sidewinder missile
			************ 2nd pattern of allocate weapons ************
			Shooting armour-piercing ammunition to penetrate tank armour
			Shooting armour-piercing ammunition to penetrate tank armour
			Launching Sidewinder missile
			************ 3rd pattern of allocate weapons ************
			Shooting armour-piercing ammunition to penetrate tank armour
			Launching Sidewinder missile
			Shooting armour-piercing ammunition to penetrate tank armour
			Launching Sidewinder missile
			Shooting armour-piercing ammunition to penetrate tank armour
			Shooting armour-piercing ammunition to penetrate tank armour
			Launching Sidewinder missile

*/