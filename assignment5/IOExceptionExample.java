package com.divergent.corejava.assignment5;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOExceptionExample {
	public void cheakIOException() throws IOException {
		FileInputStream fin = new FileInputStream("E://file.txt");
		System.out.println((char) fin.read());
		FileOutputStream fout = new FileOutputStream("E://file.txt");
		byte[] b = { 1, 2, 3, 1, 5 };
		fout.write(b);
		System.out.println("done");
	}

	public static void main(String[] args) {
		IOExceptionExample example = new IOExceptionExample();
		try {
			example.cheakIOException();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
