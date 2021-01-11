package testConcepts;

public class TestStaticMembers {
	
	//static variable. The 'myName' can be used directly even without
	//creating an object of class TestStaticMembers.
	//Same rule applies to static methods
	public static String myName = "Bob";
	//private static variables/methods are only visible on the same class
	private static String myName2 = "Bob";
	
	//non-static method. The 'printHello' method can only be used 
	//if you create an object of class TestStaticMembers
	public void printHello(){
		System.out.println("Hello!");
	}
	

	public static void main(String[] args) {
		System.out.println(myName);
		System.out.println(myName2);
		
		TestStaticMembers myTSM = new TestStaticMembers();
		myTSM.printHello();


	}
	
	


}
