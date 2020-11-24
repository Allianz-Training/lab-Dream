package com.azt.helloWorld;

public class HelloWorld {
	public static void main(String [] args) {
		System.out.println("Hello World");
	}
}
//comment

/*

	comment

*/

//<data type>[variable name] = value(option)
//quiz
class Variable {
	 public static void main(String[] args) {
	    /* Data type: integer
	       Variable name: myInt
	    */
	    int myInt;
	    // Assign value to myInt = 20;
	    myInt = 20;
	    System.out.println("This is my integer: " + myInt);
	    // Assign string 
	    String myStr;
	    myStr = "String";
	    System.out.println("This is my Sting: " +
	           myStr);
	    // Assign boolean   
	    boolean myBool = true;
	    System.out.println("This is my Boolean: " + myBool);
	    
	    // Assign float
	    float myFloat = 5.99f;
	    System.out.println("This is my Float:" + myFloat);
	    
	    // Assign character 
	    char myChar = 'D';
	    System.out.println("This is my char:" + myChar);	   
	    
	  }
	}

//variable public local
class VariableExample {
	  public static int instanceInt = 50; //instance variable
	  public static void main(String[] args) {
	     System.out.println("Instance variable " +instanceInt);
	     myMethod();
	 }
	 public static void myMethod(){
	     int localInt = 20; // local variable
	     System.out.println("Instance variable " +instanceInt);
	     System.out.println("Local variable " + localInt);
	 }
	}

//primitive data type 
/*class DataType {
	 public static void main(String[] args) {
	     boolean myBoolean = false;
	     byte myByte = 0;
	     short myShort = 0;
	     int myInt = 0;
	     long myLong = 0l;
	     char myChar = '\u0000';
	     float myFloat = 0.0f;
	     double myDouble = 0.0d;  
	 }
	}
*/
//primitive conversion
/*class PrimativeConversion {
	 public static void main(String[] args) {
	   int myInt = 5;
	   float myFloat = myInt; //Widening
	   System.out.println("myInt value: " + myInt);
	   System.out.println("myFloat value: " + myFloat);

	   float newFloat = 5.5f;
	   int newInt = (int) newFloat; //Narrowing
	   System.out.println("newFloat value: " + newFloat);
	   System.out.println("newInt value: " + newInt);

	   int otherInt = 130; 
	   byte myByte = (byte) otherInt; //Overflow
	   System.out.println("otherInt value: " + otherInt); 
	   System.out.println("myByte value: " + myByte); 
	 }
	}
*/
//final variable

/*
  class FinalVar {
 public static void main(String[] args) {
   final int finalInt = 20;
   //finalInt = 20;
   System.out.println("finalInt value: " + finalInt);
 }
}

*/
//task variable scope quiz
class variablescope {
	public static void main(String[] arg) {
		bark();
	}
	
	public static void bark() {
		String dogName = "Shiba";
		System.out.print("The Dog name = " + dogName);
	}
}
// unary option
class Unary {
 public static void main(String[] args) {
     int unaryVar = +1;
     System.out.println("Result " + unaryVar);
     unaryVar--;
     System.out.println("Result " + unaryVar);
     unaryVar++;
     System.out.println("Result " + unaryVar);
     unaryVar = -unaryVar;
     System.out.println("Result " + unaryVar);
     boolean success = true;
     System.out.println("Result " + success);
     System.out.println("Result " + !success);
 }
}

 
class PrePost {
	public static void main(String[] args) {

		   int i = 3;
		   i++;
		   System.out.println(i);//4
		   ++i;    
		   System.out.println(i);//5
		   System.out.println(++i);//6
		   System.out.println(i++);//6
		   System.out.println(i);//7

	}
}

//comparison
class Comparison {
	 public static void main(String[] args) {
	   int value_1 = 1;
	   int value_2 = 2;
	   if (value_1 == value_2)
	     System.out.println("value_1 == value_2");
	   if (value_1 != value_2)
	     System.out.println("value_1 != value_2");
	   if (value_1 > value_2)
	     System.out.println("value_1 > value_2");
	   if (value_1 < value_2)
	     System.out.println("value_1 < value_2");
	   if (value_1 <= value_2)
	     System.out.println("value_1 <= value_2");
	 }
	}

//condition
class Conditional {
	 public static void main(String[] args) {
	   int value_1 = 1;
	   int value_2 = 2;
	   if ((value_1 == 1) && (value_2 == 2))
	     System.out.println("value1 is 1 AND value2 is 2");
	   if ((value_1 == 1) || (value_2 == 1))
	     System.out.println("value1 is 1 OR value2 is 1");
	 }
	}

//task quiz
class ElseIf {
	public static void main(String[] args) {
		int Score = 50;
		boolean isHandsome = true;
		
		if (isHandsome == false) {
			if (Score >= 80) {
				System.out.print("Good");
			}else if (Score >= 50) {
				System.out.print("Normal");
			}else if (Score < 50)
				System.out.print("Fail");
			}
		else 
			System.out.print("Good");
		}
		
}

//switch case quiz
class Switch{
	public static void main(String[] args) {
		int Score = 50;
		switch (Score) {
			case 80: {
				System.out.print("A");
			}
			case 70: {
				System.out.print("B");
			}
			case 60: {
				System.out.print("C");
			}
			
		}
	}
}

//For-each loop
//lap 6 quiz
class WhileLoop{
	public static void main(String[] args) {
		Icounter();
		Isum();
		Idivide();
		
	}
	public static void Icounter() {
		int i = 1;
		while (i <= 10) {
			System.out.print(i);
			i++;
		}
		
	}
	public static void Isum() {
		int i = 1;
		while (i<=10) {
			i = i + 1;
			if (i == 10) {
				System.out.print(i);
			}
			i++;
		}
	}
	public static void Idivide() {
		int i = 1;
		while (i <= 100) {
			int divide = i % 12;
			if (divide == 0) {
				System.out.print(i);
			}
			i++;
		}
	}
}


