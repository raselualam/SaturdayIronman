package com.upskill.java_6;

public class Singleton {
	
	// Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating
	private Singleton(){
		
	}
	
	//Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){
		return SingletonObj;
	}
	
	protected static void demo1(){
		System.out.println("Demo I method for singletone class");
	}
	
	protected static void demo2(){
		System.out.println("Demo II method for singletone class");
	}
	
	protected static void demo3(){
		System.out.println("Demo III method for singletone class");
	}
	
	//Changes for Git Pull request practice 
	
	//git changes using eclipse
	
	protected static void demo4(){
		System.out.println("Demo IIII method for singletone class");
	}
	
}