package com.java.Demo.Practice;

import java.io.InputStreamReader;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int i = sc.nextInt();
		int j = sc.nextInt();

		if (i % 2 != 0) {
			System.out.println("i  is odd");

		} else {
			System.out.println("i is even");

		}
		if (j % 2 != 0) {
			System.out.println("j is odd");
		} else {
			System.out.println("j is even");
		}

	}

}
