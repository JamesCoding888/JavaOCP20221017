package com.ocp.day14;

public class TestPositions {
	public static void main(String[] args) {
		
		Positions position = Positions.PG;
		
		Announcement(position);
	}
	
	public static void Announcement(Positions position) {
		
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
