package com.divergent.corejava.assignment1;

import java.util.Arrays;

public class StringsAnagrams {

	public static void main(String[] args) {
		StringsAnagrams obj=new StringsAnagrams();
		String str1="care";
		String str2="race";

		   
		obj.Method(str1,str2);

	}

	private void Method(String str1, String str2) {
		if(str1.length()==str2.length()) {
			 char []char1=str1.toCharArray();
			 char []char2=str2.toCharArray();
			 Arrays.sort(char1);
			 Arrays.sort(char2);
			 if(true==Arrays.equals(char1, char2)) {
				 System.out.println(str1 + " and " + str2 + " are  anagram.");
			 }else
				 System.out.println(str1 + " and " + str2 + " are not anagram.");
		    }else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
	     	}

		
	}

}
