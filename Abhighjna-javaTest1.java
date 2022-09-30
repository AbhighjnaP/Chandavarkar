1.What is platform independence.
 When the program is written and compile the java code is converted to byte code which is platform independent.The code is not dependent on any platform.This bytecode makes the java
 platform independent.Bytecode will only understands by jvm. but jvm is not platform independent.When we compile the code the bytecode will be saves in .class extension and this is platform indepenent.

2.DIfference btw primitive and  non-primitive.
non-primitive- primitive doesnot have return data type.
-



primitive- It is having return data type.
-There are 8 types of primitives they are Byte,int,short,long,double,float,boolean and char.
-Each non primitive stores a certain values.
-

3.Explain class and its members.
Class is a collection of objects. Objects will be having State and behaviour.
Class will be having 2 types method and variable
method and variable is of 2 types static and instance
  
  ex. class Bike{
  
  static String brand;
  static String color;
  static double milage;
  
  public static void main (String[] args){
	
	System.out.println("The bike is good");
	
  }
  
  }
  
  class BikeRunner{
  System.out.println("mian entered");
  Bike.brand="Bullet";
  Bike.color="black";
  Bike.milage=55.2D;
  System.out.println("main ended");
  }
  
  
 4.Program to accept two input total marks and received marks,calculate percentage and return.

class Result{
   
   static void marks(int totalMarks,int recievedMarks){
	   
	   System.out.println("Main started");
	   if(totalMarks==600 && receivedMarks==450){
		   percentage=totalMarks%recievedMarks;
		   System.out.println("Obtained percentage is:")
	   }
	   
		 return percentage;
   }

}

class ResultRunner{
	public static void main(String[] args){
		System.out.println("main method entered");
		Result.totalMarks=;
		Result.receivedMarks=;
		System.out.println("main ended")
		
		
		
	}
	
}

6.Main method with memory 

When the program gets executed the memory will be created in heap.
There are 4 blocks in memory allocation heap,meta-space,constant pool and instance.
In heap memory the stack will be created to execute the program.
While the frames will be created and for each println statement
After the completion of certain statements the frame will be poped out and the main memory will disappear.
The heap is large part of the memory.
When the information is passed the frame will be created the main will be in the frame.
The default value will be present in the constant pool.
The main will be pointing to the value in metaspace and then point towards constant pool.
Then return the value.


7.





 

