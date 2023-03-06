package com.ocp.day14.enumLesson.positions;

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