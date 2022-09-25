package com.upskill.java_6;

public class Singleton {

//Singleton is class that can have only one object 
	//private constructor it prevents any other  class from inisiating 
	
private Singleton(){
	
}
	
	
//private static object ogthe class 	
private static Singleton SingletonObj = new Singleton();

//Static instace method 
public static Singleton getInstance(){
return SingletonObj;
}



protected static void upskill(){
	System.out.println("Upskill method from Singletone Class");
	
}
}