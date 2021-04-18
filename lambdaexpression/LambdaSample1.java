package com.divergent.corejava.lambdaexpression;

public class LambdaSample1 {

	public static void main(String[] args) {

		/*
		 * this is normal way Print obj1 = new Print() {
		 * 
		 * @Override public void printMethod() {
		 * System.out.println(" this is annonyomus class  method"); } };
		 * 
		 * obj1.printMethod(); }
		 */

		// using lambda
		Print obj2 = () -> {
			System.out.println("using lamda ");

		};
		obj2.printMethod();
		
		
		  Sayable s1=(name)->{  
	            return "Hello, "+name;  
	        };  
	        System.out.println(s1.say("Sonoo"));  
	          
	}

}

interface Sayable{  
    public String say(String name);  
}  

interface Print {
	void printMethod();
}
