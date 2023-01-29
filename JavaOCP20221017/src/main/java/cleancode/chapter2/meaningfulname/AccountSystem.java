package cleancode.chapter2.meaningfulname;

/*
	Class names and Method Names:
		
		When constructors are overloaded, use static factory methods with names that describe the arguments.
		refer to the handbook - "Clean Code_ A Handbook of Agile Software Craftsmanship", at page 25
*/

// Classes and objects should have noun or noun phrase names, also shall NOT be a verb
public final class AccountSystem {

	private String id;
	private String name;
	private String position;
	private String salary;

	// Overloaded methods
	// Static factory method returns an object of this class
	public static AccountSystem valueOf(String id, String name) {
		return new AccountSystem(id, name);
	}
	public static AccountSystem valueOf(String id, String name, String position, String salary) {
		return new AccountSystem(id, name, position, salary);
	}
	
	
	// When constructors are overloaded, use static factory methods with names that describe the arguments.
	// Caller cannot see this private constructor(s).
	private AccountSystem(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	private AccountSystem(String id, String name, String position, String salary) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// Creating an object of AccountSystem and
		// calling an static factory method valueOf()
		AccountSystem accountSystem4Manager = AccountSystem.valueOf("MA-12890", "James Bob");
		AccountSystem accountSystem4IT = AccountSystem.valueOf("IT-14440", "Bobby Go", "Senior Software Engineer", "300000");
		/*
		 	Generally better than:
		 		
		 		AccountSystem accountSystem4Manager = new AccountSystem("MA-12890", "James Bob");
		 		AccountSystem accountSystem4IT = new AccountSystem("IT-14440", "Bobby Go", "Senior Software Engineer", "300000");
		*/
		
		// Print out
		System.out.println("{" + accountSystem4Manager.id + ", " + accountSystem4Manager.name +"}");
		System.out.println("{" + accountSystem4IT.id + ", " + accountSystem4IT.name + ", " + accountSystem4IT.position + ", " + accountSystem4IT.salary + "}");
	}
}

/*
	Console:
				{MA-12890, James Bob}
				{IT-14440, Bobby Go, Senior Software Engineer, 300000}


*/