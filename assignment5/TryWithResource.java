package com.divergent.corejava.assignment5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {

		try (FileInputStream fin = new FileInputStream("E://file")) {

			
			
		} catch (FileNotFoundException exception) {
			System.out.println(exception);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
