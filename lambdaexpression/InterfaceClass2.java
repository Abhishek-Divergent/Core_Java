package com.divergent.corejava.lambdaexpression;

interface client{

	  public void Draw();
	
}

class A implements  client{
	/**
	 * this draw method can draw circle only
	 */
	  public void Draw() {
		  System.out.println(" I can draw circle ");
	  }
}
class B implements  client{
	  /**
	   * Draw method draw the circle and rectangle
	   */
	public void Draw() {
		  System.out.println(" i can draw  circle and rectanngle");
		  
	  }
}

public class InterfaceClass2 {
	
	
	public static void main(String[] args) {
	 client Client1= new A();
	 client Client2=new B();
		 Client1.Draw();
		 Client2.Draw();
		
	}

}
