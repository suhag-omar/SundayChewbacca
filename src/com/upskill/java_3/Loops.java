package com.upskill.java_3;

public class Loops {



	/*	
	 Types of Loops
	 1) For Loop
	 2) While Loop
	 3) DO while Loop
	 4) Infinite Loop 
	 	*/	
	public static void main(String[] args) {		
		
		//practiceForLoop();          // calling the main mathod 
		practiceWhileLoop();
	//	practicedDoWhileLoop();
	//practiceInfiniteLoop();
		//practiceNestedLoop();
		
		
		
	}

	                                    // FOR LOOPS            Do in until the limit 
	public static void practiceForLoop(){
		int i;                                      
		for (i = 1; i <10; i++){
			System.out.println("For Loops Number=" + i);
		}
	}
	
	 
	                      // While LOOPS                                until the  condition matches 
	public static void practiceWhileLoop(){
		int i =1;
		while (i<=10){
			System.out.println("While Loops Number = " + i);
			i++;
			
			
	}
		
	} 
	                     //DO WHILE LOOPS                             // it will finish the task first and then check the condition 
	public static void practicedDoWhileLoop(){                        
		int i = 1 ;
		do{
			System.out.println("Do While Loops Number = " + i);
			i++;
				}while (i<=10);
		
		}
	
	



               // Infinite Loops                       // any mistakes become infinite loops


public static void practiceInfiniteLoop(){
  int i;
  for (i = 1; ; i++){                     
	  System.out.println("ForInfinite Loops Number = " + i);
  }
}
   
          // Nested Loop                                      // loop inside another loops
public static void practiceNestedLoop(){        
	int i;
	int j;
	for(i = 1; i <= 10; i++){
		for(j =1; j<=10; j++) {
		int multipicationTable = i * j;
		System.out.print(multipicationTable + " ");
		
	}
	System.out.println(" ");
}





                  
  
  
  
  

}
}






