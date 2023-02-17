package cleancode.chapter2.meaningfulname.methodnames;

/* 

	Consider that developer will read your code. Therefore, a better naming is to use:
		-	Computer Science Terms 
		-	Algorithm names
		-	Pattern names 
		-	Math terms 
		-	and so on...
	
	It is NOT wise to draw every name from the problem domain because developer does NOT want their colleague to run back and forth 
	while customer requesting what every name means when colleague already know the concept by a different name. Tedious Process !!!
	
	Don’t Add Gratuitous Context as follows:
		-	AccountSystem4EngineeringDepartmentsAndClient.class
		    Note: Developer shall think about if characters are redundant or irrelevant
	
 	
 	Final words: 	
	The hardest thing about choosing good names is that it requires good descriptive skills and a shared cultural background. 
	This is a teaching issue rather than a technical, business, or management issue. 
	As a result many people in this field don’t learn to do it very well.
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
	// Consider enforcing caller to use static factory method to initialize object of AccountSystem class, then give those constructor(s) to be private
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

	// Methods should have verb or verb phrase names
	// Functions should do one thing - If developer can extract another function 
	// that is not only a restatement of original implementation, 
	// then original function is doing more than "one thing"
	public String getPersonalName() {
		return name;
	}		
	
	public static void main(String[] args) {
		// Creating an object of AccountSystem and
		// calling an static factory method valueOf()
		AccountSystem accountSystem4Manager = AccountSystem.valueOf("MA-12890", "James Bob");
		AccountSystem accountSystem4IT = AccountSystem.valueOf("IT-14440", "Bobby Go", "Senior Software Engineer", "300000");
		AccountSystem accountSystem4Sales = AccountSystem.valueOf("Sales-180", "David S.", "Senior Market Developing Executor", "1000000");
		/*
		 	Generally better than follows:
		 		
		 		AccountSystem accountSystem4Manager = new AccountSystem("MA-12890", "James Bob");
		 		AccountSystem accountSystem4IT = new AccountSystem("IT-14440", "Bobby Go", "Senior Software Engineer", "300000");
		 		AccountSystem accountSystem4Sales = new AccountSystem("Sales-180", "David S.", "Senior Market Developing Executor", "1000000");
		*/
		
		// get Personal name
		System.out.println(accountSystem4Manager.getPersonalName());
		System.out.println(accountSystem4IT.getPersonalName());
		System.out.println(accountSystem4Sales.getPersonalName());
		
		// Print out
		System.out.println("{" + accountSystem4Manager.id + ", " + accountSystem4Manager.name +"}");
		System.out.println("{" + accountSystem4IT.id + ", " + accountSystem4IT.name + ", " + accountSystem4IT.position + ", " + accountSystem4IT.salary + "}");
		System.out.println("{" + accountSystem4Sales.id + ", " + accountSystem4Sales.name + ", " + accountSystem4Sales.position + ", " + accountSystem4Sales.salary + "}");
					
	}
}

/*
	Console:
				James Bob
				Bobby Go
				David S.
				{MA-12890, James Bob}
				{IT-14440, Bobby Go, Senior Software Engineer, 300000}
				{Sales-180, David S., Senior Market Developing Executor, 1000000}

*/