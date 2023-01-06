(1)Explain
                                                             
  1:public static void main(String args[])




  2:class : Class is template or blueprint which is comtain states and behaviours is known as class.

			STATES considered as a variables.
			BEHAVOIUR considered as a method.

  object: Object is a instance of a class .
                     or 
          Object is a real world entity.					 

  (3)Explain the JVM,JRE,JDK?
  
	JVM : JVM is stands for Java Virtual Machine.It is an abstract machine. It is called a virtual machine because it doesn't physically exist. 
	JRE : JRE is stand for Java Runtime Environment.It is a set of software tools which is used for developing a software.
	JDK : JDK is stands for Java Development Kit which is used to developing a java application.
  
  
  (4)Explain the constructor and its type?
  
   Construtor :  "It is a special type of a method because the constructor name will created with the class name without any return type".
       There are two types of constructor.
	   (1)Default constructor.
	   (2)Parameterised constructor.
	   
	(1)Default constructor:It is constructor which doesnot contain any parameterlists.[zero parameter].
    (2)Parameterised constructor:It is constructor which contain parameterlists.	

  
   (5)Difference between this keyword and this()?
		This keyword is used to contain to refer to the object.
		This() is used to create a constructor. or refers to the current object or constructor.
		
	(7) Why main method is static and explain the method types?
	
       Because of in any Java program, the main() method is the starting point from where compiler starts program execution. So, the compiler needs to call the main() method.	
        
		There are two types of method.
		(1)Userdefined method.
		(2)Predefined method.
		
    (12)can we used instance variable inside the static method?
		(NO).
		
	(11)Write a program to find length of an array is present in an given array?
	
	     class ArrayLength{
			public static void main(String args[]){
	
			int num[] = {12,3,2,45,6,7,6};
			System.out.println("length of a array: "+num.length);
	
	}
    
    }
	
	(2)write a program to reverse method (program)?
	
		class Reverse{
		
		public static void main(String args[]){
		String name = "program";
		char ch[]=name.toCharArray();
	
		for(int i=ch.length-1;i>=0;i--){
	
		System.out.print(ch[i]);
		
		
		  }
		}
	}
	
		
			
			class Reverse1{
			
			public static void main(String args[]){
				int num[] = {1,2,3,4};
				for(int i = num.length-1;i>=0;i--){
					System.out.print(num[i]);
				}
				
				
			}
			
			
		}