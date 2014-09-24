/* Write a Java Program to implement a Inner Class and show its access protection */

class Outer{
	int out_x=100;
	void test()
	{
		Inner inobj=new Inner();
		inobj.display();
	}
	
	class Inner{
		int in_y=10;
		void display()
		{
			System.out.println("Displaying the contents of the outer x:"+out_x);
		}
	} 
	void show()
	{
		System.out.println("Displaying the contents of the inner y:"+in_y ); //will return an error
		
		/* inorder to access this inner class variable from the outer class, create an object
		of the inner class in the outerclass, and invoke the variable with the object
		
		example: Inner inobj2=new Inner();
			 System.out.println("Displaying the contents of the inner y:"+inobj2.in_y); */
		
	}
}

class InnerClassDemo{
	public static void main(String[] args)
	{
		Outer outobj=new Outer();
		outobj.test();
	}
}
