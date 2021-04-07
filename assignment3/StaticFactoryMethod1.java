package com.divergent.corejava.assignment3;

public class StaticFactoryMethod1 {

	public static void main(String[] args) {
		Factory f = Factory.getInstace();
		Factory f1 = Factory.getInstace(1245);
		System.out.println(f.i);
		System.out.println(f1.i);
	}

}

class Factory {
	int i; 
	private Factory() {
	 }

	public static Factory getInstace() {
		Factory f = new Factory();
		f.i=10;
		return f;
	}

	public static Factory getInstace(int b) {
		Factory f = new Factory();
		f.i=b;
		return f;
	}
}