package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "UpSkill";
	private int ssn = 456845;
	private String username = "raselalam";
	
	//Setter Method - name							//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name
	public String getName(){						//get the data, Read
		return name;
	}
	
	//ssn - Setter Method							//set the data, Write only
	public void setSSN(int value){
		ssn = value;
	}
	
	//username - Getter Method						//get the data, Read only
	public String getUserName(){
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		obj.setSSN(452367);
		System.out.println(obj.getUserName());
	}
}