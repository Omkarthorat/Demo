package com.java.demo;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		String []str= {"abc","omk","xyz","ketaki","kar","abc","omkar","xyz","omkar"};
		
		int x= str.length;
		System.out.println(x);
		
		 for (int i =0;i<=str.length-1;i++){
			 
			 for (int j=i+1;j<str.length;j++){
				 
				 if((str[i].equals(str[j]))&& (i!=j)){
					 System.out.println(" Duplicate Element is"+"---"+str[j]);
				 }
			 }
		 }
		
		
	
		
		
		
	
	}

}
