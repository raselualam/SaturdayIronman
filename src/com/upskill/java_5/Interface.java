package com.upskill.java_5;

public interface Interface {
	
	//Interface can have only abstract methods, java 8 and forward they have static method too
	
	//Abstract method doesn't have any implementation
	
	//Abstraction is oops concept of hiding implementation
		

	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract void iColor();
	
	public abstract String iEngine();
	
	
}

/*
    (Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)
    						
	Class						extends					 Class		 
	Abstract Class (+2)  		extends					 Class (-2=0)
	Interface (+2)			  implements				 Class (-2=0)
	Interface (+2)				 extends				Interface (+2+2=+4)    implements				Class(-4=0)
	Interface (+2)			  implements				Abstract Class
	Abstract Class (+2)			 extends				Interface (+2+2=+4)    implements				Class(-4=0)							 Interface	
*/