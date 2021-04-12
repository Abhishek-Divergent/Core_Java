package com.divergent.corejava.assignment5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyException {

	public static void main(String[] args) throws IOException {
		FileInputStream	v=null;
		try {
				v = new FileInputStream("E://file.txt");
		} catch (NullPointerException   | IOException e) {
			e.printStackTrace();
		} 
		
		finally {
		System.out.println("always exicute");
		v.close();
		}
		
	}

}
