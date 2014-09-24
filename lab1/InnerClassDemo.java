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
		System.out.println("Displaying the contents of the inner y:"+y );
	}
}

class InnerClassDemo{
	public static void main(String[] args)
	{
		Outer outobj=new Outer();
		outobj.test();
	}
}
