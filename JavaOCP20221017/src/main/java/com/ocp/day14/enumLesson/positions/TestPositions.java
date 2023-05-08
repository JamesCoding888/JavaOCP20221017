package com.ocp.day14.enumLesson.positions;
/*
	The given code is written in Java and defines a class called TestPositions and an enum called EnumPositions.
	
	Overall, this code demonstrates the use of enums and switch statements in Java to handle different job positions and perform actions based on the selected position.
 
*/
public class TestPositions {
	public static void main(String[] args) {
		
		EnumPositions position = EnumPositions.PG;
		
		Announcement(position);
	}
	
	public static void Announcement(EnumPositions position) {
		
		switch(position) {
			
			case SALES:
				System.out.println("SALES");
				break;
				
			case PM:
				System.out.println("PM");
				break;
			
			case SE:
				System.out.println("SE");
				break;
			
			case SA:
				System.out.println("SA");
				break;
			
			case PG:
				System.out.println("PG");
				break;
			
			case AE:
				System.out.println("AE");
				break;
			
			case QC:
				System.out.println("QC");
				break;
			
			case QA:
				System.out.println("QA");
				break;		
			
			case SERVICETEAM:
				System.out.println("SERVICETEAM");
				break;	
			
			default:
				System.out.println("Positions are NOT specified!!!");
		}
	}
}


/*
	
	Console:
			PG
			
*/