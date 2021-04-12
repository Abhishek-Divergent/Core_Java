package com.divergent.corejava.assignment5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExample {
	/**
	 * this method will throws FileNotFoundException to the caller
	 * 
	 * @throws FileNotFoundException
	 */
	public void cheakFileNotFound() throws FileNotFoundException {
		FileInputStream outputStream = new FileInputStream("E://file.txt");
	}
	public static void main(String[] args) {
		FileNotFoundExceptionExample example = new FileNotFoundExceptionExample();
		// caller will receive FileNotFoundExcetion so use try catch block to handle it
		// example.cheakFileNotFound();

		try {
			example.cheakFileNotFound();
		} catch (FileNotFoundException exception) {
			System.out.println("This is File Not Found Excetion :" + exception);
		}

	}
}
