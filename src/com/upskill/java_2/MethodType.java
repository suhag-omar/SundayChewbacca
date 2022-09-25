package com.upskill.java_2;

public class MethodType {
	
	
	
	
	/* Types of Methods       ( CLASS 2 )
	1. Void Methods           \\ when you put VOID word
	2. Static Method           \\ when you put STATIC VOID  AND RETURN (key word)
	3. Return Type Method */     
	
	public static int hourlyIncome = 65;
	
	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		weeklyIncomeStatic();
		System.out.println ("My Monthly Income =" + obj.monthlyIncomeReturn());
		

	}

	                              //void method
	
	
	public void annualIncomeVoid(){
		int annualIncome = hourlyIncome *2000;
		System.out.println ("My Annaul Income=" + annualIncome);
		
	}

	                            //static method 
	
		public static void weeklyIncomeStatic(){
			int  weeklyIncomeIncome = hourlyIncome *40;
			System.out.println ("My Weekly Income=" + weeklyIncomeIncome);
		}
			
			                 //Return Type Method
			
			public int monthlyIncomeReturn(){
				int monthlyIncome = hourlyIncome *180;
				return monthlyIncome;
				
			
			
	
}
}
