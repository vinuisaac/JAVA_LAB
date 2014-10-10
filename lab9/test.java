import java.util.*;
import java.lang.*;

interface intstack{
	public void push(int item);
	public int pop();
}

class FixedStack implements intstack{
	private int stck[],tos;
	
	FixedStack(int size)
	{
		stck=new int[size];
		tos=-1;
	}
	
	public void push(int item)
	{
		if(tos==stck.length-1)
			System.out.println("The stack is full");
		else
			stck[++tos]=item;
	}
	
	public int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return stck[tos--];
	}
}

class DynStack implements intstack{
	private int stck[],tos;
	
	DynStack(int size)
	{
		stck=new int[size];
		tos=-1;
	}
	
	public void push(int item)
	{
		if(tos==stck.length-1)
		{
			int temp[]=new int[stck.length*2];
			for(int i=0;i<stck.length;i++){
				temp[i]=stck[i];
				stck=temp;
			}
				stck[++tos]=item;
		}
		else
			stck[++tos]=item;
	}
	
	public int pop()
	{
		if(tos<0)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return stck[tos--];
	}
}

class interface2{
	public static void main(String[] args)
	{
		intstack MyStack;
		Scanner scan=new Scanner(System.in);
		int turn=10; //for dynstack
		for(;;){
		System.out.println("Choice na enter madi");
		System.out.println("1. Fixed");
		System.out.println("2. Add 10 elements to dynamic stack" );
		int choice=scan.nextInt();
		
			
		switch(choice){
		
		case 1: 
			//Fixed stack
		System.out.println("Enter the size of the stack");
		int a=scan.nextInt();
		
		FixedStack fs=new FixedStack(10);
		MyStack=fs;
		for(int i=0;i<a;i++)
			MyStack.push(i);
			
			System.out.println("The Contents of the stack are:");
			for(int i=0;i<a;i++)
				System.out.println(MyStack.pop());
				
				break;
				
		
		case 2:
			//it will run for the first time, then it wont take anymore values
			//int turn=10;
			DynStack ds=new DynStack(20);
			MyStack=ds;
			for(int i=0;i<turn;i++)
			MyStack.push(i);
			
			System.out.println("The Contents of the stack are:");
			for(int i=0;i<10;i++)
			System.out.println(MyStack.pop());
			turn=turn+10;
			break;
			
		//case 3: 
			//exit;
			//break;
		}
		}
	}
}
