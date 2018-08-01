package com.java.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementsFromArraylist {

	public static void main(String[] args) {
		
		// Create List Of elements
		java.util.List<String> ListOfElements = new ArrayList<String>();
		// Add elements to it
		ListOfElements.add("JEE");
		ListOfElements.add("OEE");
		ListOfElements.add("OMKL");
		ListOfElements.add("OMR");
		ListOfElements.add("JEE");
		ListOfElements.add("XYZS");
		ListOfElements.add("LOQ");
		ListOfElements.add("XYZS");
		ListOfElements.add("OMK");
		
		System.out.println(ListOfElements);
		
		// Pass This list to LinkedHashset to remove Duplicates and preserve Insertion Order
	
		LinkedHashSet<String>Noduplicates= new LinkedHashSet<String>(ListOfElements);
		System.out.println("After Duplicates removal---"+Noduplicates);
		
		

	}

}
