package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountInLine {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileInputStream("C:\\Users\\HP\\Desktop\\Adobe\\input.txt"));

		int wordcountinline = 0;

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		String s4 = sc.nextLine();
		for (int i = 0; i <s4.length(); i++) {
			if (s4.charAt(i) == ' ') {
				wordcountinline++;

			}
			
		}
		wordcountinline= wordcountinline  + 1;
		System.out.println("Word Count in Line is " + "---" + wordcountinline);

	}

}
