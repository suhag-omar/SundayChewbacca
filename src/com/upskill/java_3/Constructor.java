package com.upskill.java_3;

public class Constructor {                                   //constructor is constructing the class, 
	
	String studentName;
	int StudentAge;
	
          
public Constructor(String name, int age){
		studentName= name;
		StudentAge= age;
	}
	
	

	
public static void main(String[] args) {

	Constructor obj = new Constructor("Omar",30);	
	System.out.println(obj.studentName);
	System.out.println(obj.StudentAge);
	
		
		
		
		
	}

}
