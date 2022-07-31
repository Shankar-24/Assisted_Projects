package Try_Catch;

import java.io.IOException;
import java.util.Scanner;

public class TryCatchDemo {
	
    void display(int l,int b) throws IOException
    {
    	if(l>b)
    	{
    		throw new IOException();
    	}
    	else
    	{
    		System.out.println("Area of Rectangle= " + (l*b));
    	}
    }
    void  n(int a,int b)
    {
    	try
    	{
    	    display(a,b);
    	}
    	catch(Exception e)
    	{
    		System.out.println("IOException");
    	}
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of Rectangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		TryCatchDemo obj=new TryCatchDemo();
		obj.n(a, b);
		sc.close();
	}

}

