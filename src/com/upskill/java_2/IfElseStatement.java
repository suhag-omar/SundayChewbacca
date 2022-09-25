package com.upskill.java_2;

public class IfElseStatement {
	
	public static int age =105;
	
	

	public static void main(String[] args) {
		conditionalStatement();
		
		
	}		
		
public static void conditionalStatement(){
	
		if (age<13){
		
System.out.println("You are senior");

}else if (age>13 && age <18){
	System.out.println("You are a Teenagers");
}else if (age>65){
	//NESTER IF ELSE STATEMENT 
			if (age >100){
		System.out.println("You are hero");
	}
	
}else{
	System.out.println("You are adult");

}	

	}

}
