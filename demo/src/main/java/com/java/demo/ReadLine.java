package com.java.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadLine {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		
		System.out.println("Hello"+" "+line);
		
		
		
		
	}

}
