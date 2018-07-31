package com.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCount {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new FileInputStream("C:\\Users\\HP\\Desktop\\Adobe\\input.txt"));

		int lineCount = 0;

		while (sc.hasNext()) {
			String str = sc.nextLine();
			lineCount++;
		}

		System.out.println("Line Count is" + "---" +lineCount);
	}

}
