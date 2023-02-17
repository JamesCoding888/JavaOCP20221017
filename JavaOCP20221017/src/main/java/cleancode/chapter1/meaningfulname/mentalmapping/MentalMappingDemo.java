package cleancode.chapter1.meaningfulname.mentalmapping;
/*
	Avoid Mental Mapping:
	-	Readers shouldn’t have to mentally translate your names into other names they already know. 
	    This problem generally arises from a choice to use neither problem domain terms nor solution domain terms.
*/

public class MentalMappingDemo {

	// poor variable names
	private int getT() {
		int t = 0; // calculated result
		// Shall NOT use single-letter variable names; especially 'l' (like as '1'), 'i' (like as 'I') and 'o' (like as '0')
		for(int l = 1 ; l <= 10 ; l++) { 
			t += l;			
		}
		return t;
	}

	// Even better with precisely variable names
	private int getCalculatedResult() {
		int totlecalculatedresult = 0;
		for(int num = 1 ; num <= 10 ; num++) {
			totlecalculatedresult += num;			
		}
		return totlecalculatedresult;
	}
	
	public static void main(String[] args) {
		int t = new MentalMappingDemo().getT();
		int totlecalculatedresult = new MentalMappingDemo().getCalculatedResult();
		System.out.println(t); // 55
		System.out.println(totlecalculatedresult); // 55
	}
}
