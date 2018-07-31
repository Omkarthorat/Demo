package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {

		// 1st Method to Count words

		/*
		 * String Str = "This is omkar Thorat";
		 * 
		 * int wordCount = 1;
		 * 
		 * for (int i = 0; i <= Str.length(); i++) {
		 * 
		 * if (Str.charAt(i) == ' ') { wordCount++;
		 * 
		 * }
		 * 
		 * } System.out.println("Word Count is " + wordCount);
		 * 
		 */

		// 2nd Method to Count Words
		/*
		 * StringTokenizer str= new StringTokenizer("My name is omkar");
		 * 
		 * int i= str.countTokens(); System.out.println(i);
		 */

		
		
		// 3 rd Method for Word Count
		Scanner sc = new Scanner(new FileInputStream("C:\\Users\\HP\\Desktop\\Adobe\\input.txt"));

		int wordCount = 0;
		while (sc.hasNextLine()) {

			String str = sc.nextLine();

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == ' ') {

					wordCount++;
				}
			}

		}

		System.out.println("Word Count is " + wordCount);

	}

}
