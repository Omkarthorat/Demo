package com.java.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		// Method 1 to readFile
		/*
		 * BufferedReader sb= new BufferedReader(new
		 * FileReader("C:\\Users\\HP\\Desktop\\Adobe\\input.txt"));
		 * 
		 * String str; while((str= sb.readLine()) != null){
		 * 
		 * System.out.println(str);
		 */

		// Method 2 To Read File

		Scanner sc = new Scanner(new FileReader("C:\\Users\\HP\\Desktop\\Adobe\\input.txt"));

		while (sc.hasNextLine()) {
			String s1 = sc.nextLine();
			System.out.println(s1);
		}

	}

}
