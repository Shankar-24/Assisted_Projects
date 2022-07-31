package CustomException;

import java.util.Scanner;

class SalaryException extends Exception{
	
	private static final long serialVersionUID = 1L;

	SalaryException(String s)
	{
		super(s);
	}
}

public class CustomExcepDemo {
	
	void performance(int a) throws SalaryException
	{
		if(a<2100)
		{
			throw new SalaryException("you need to work hard");
		}
		else if(a>2100 && a<5000)
		{
			throw new SalaryException("your salary is somehow good");
		}
		else if(a>5100 && a<9000)
		{
			throw new SalaryException("salary is vry good");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		int a=sc.nextInt();
		CustomExcepDemo s=new CustomExcepDemo();
		try
		{
			s.performance(a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("This is Finally Block");
		}
		sc.close();

	}

}

