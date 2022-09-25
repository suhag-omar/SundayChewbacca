package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
 // Array  store multiple value 
		
		int age = 30;
		
		int[] ageCheewbacca = new int [] {24 , 45 , 35 , 33, 28, 49};
		//Array Index                      0   1     2   3   4    5
		
		System.out.println("Student Age : " + ageCheewbacca [5]);
		
	


	String[] nameChewbecca = new String [] { "suhag", "omar" , "sarkar", "jahid" , "rushdi", "alex"};
	  //Array index                               0     1        2         3         4          5
	
	System.out.println ("Student Name : " + nameChewbecca[1]);
	System.out.println ("Total Student : " + nameChewbecca . length);
	
	
	
	                                 //		M	U L TI DIMENTION 
	
	int [][] ageChewbacca2D = {{24,    45,     29, 35, 33, 28},   // [0][0]    [0][1]    [0][2]     [0][3]    [0][4]      [0][5]
			                   {30 ,   33 ,    58}};                //[1][0]    [1][1]    [1][2]
			                		   
			           System.out.println ("Student Age 2D : " + ageChewbacca2D [1] [2] )   ;  		   
			                		   
			                		   
			                    // Hashmap 
			           
			           HashMap <String, Integer> Student = new HashMap <String, Integer>();
			           Student.put("suhag", 30);
			           Student.put("omar", 30);
			           Student.put("sarkar", 30);
			           Student.put("jahid", 30);
			           
			           System.out.println ("Student Age:" + Student.get("Alex"));
			           
			           
			           HashMap <String, String> Capital  = new HashMap <String, String>(); 
			           Capital.put("BD", "Dhaka");
			           Capital.put("USA", "Washington DC");
			           
			           
                   System.out.println("Capital City : " + Capital.get("USA"));

			            // Hashset
                   
                   HashSet<String> car = new     HashSet<String>();
                  
                   car.add("BMW");
                   car.add("AUDI");
                   car.add("TOYOTA");
                   car.add("MCR");
                   System.out.println("car : " + car);
                   
                          //Hash table 
                   
                   
                   
		           Hashtable <String, String> Region  = new Hashtable <String, String>(); 
		           Region.put("BD", "Asia");
		           Region.put("USA", "North America ");
		           System.out.println("Region :" + Region.get("USA"));
		           

                   
                   
			           
			           
			           
			           
			           
			           
			           
			           
			           
			         
			           
			                		   
	} 
	
	
	
	
	
	
	

}



