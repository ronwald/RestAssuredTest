package testConcepts;

public class MethodChaining {
	
	
	public MethodChaining myMethodOne(){
		System.out.println("hello im method 1");
		return this;
		
	}
	
	public MethodChaining myMethodTwo(String name){
		System.out.println("hello: " + name);
		return this;
		
	}
	
	public MethodChaining myMethodThree(){
		System.out.println("hello im method 3");
		return this;
		
	}
	

	public static void main(String[] args) {
		
		MethodChaining myMTC = new MethodChaining();
		myMTC.myMethodOne().myMethodTwo("Ronwald").myMethodThree();

	}

}
