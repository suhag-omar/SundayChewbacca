package com.upskill.java_5;

public class Encapsulation {
	
	
	private String name = "upskill";           // write & read
	private int ssn =   555412;                // write only               (you can not read)
	private String username = "omar sarkar";    // read only                (you can not write)
	
	
	                             //Setter Method - name               set the data (void type)
	public void setName(String value){                          
		name = value;
		
	}
	
	                            //Getter Method -name                 get the data     (return type)
	public String getName(){
		return name;
	}
	                                         //practice 1
		public void setSSN(int value){                                        
		ssn = value;
		}
		                        //practice 2
        
public String getUsername(){                                        
return username;
}
		
		
		
	
public static void main(String[] args) {
Encapsulation obj = new Encapsulation();
obj.setName("Omar");
System.out.println(obj.getName());
obj.setSSN(123456);
System.out.println(obj.getUsername());




		}

	
}















