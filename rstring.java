import java.util.Scanner;
import java.lang.*;
class rstring{
	public static void main(String[] args){
	String old,rev=" ";
	Scanner in=new Scanner(System.in);
	StringBuffer buff=new StringBuffer();
	System.out.println("Enter the string:");
	old=in.nextLine();
	
	int len=old.length();
	System.out.println("Length of string is "+len);
	System.out.println("Capacity of string is"+buff.capacity());
	System.out.println("Enter the String to Reverse");
	old=in.nextLine();
	int length=old.length();
	for(int i=length-1;i>=0;i--)
	rev=rev+old.charAt(i);
	System.out.println("Reverse of an entered string is:"+rev);
	String str=new String(rev);
	str=str.toUpperCase();
	System.out.println("Upper Case is:"+str);
	String s;
	System.out.println("Enter the new string");
	s=in.nextLine();
	s=s.concat(str);
	System.out.println("Result String is:"+s);
	}
}
