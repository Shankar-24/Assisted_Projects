package TypeCasting;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int value");
		int a=sc.nextInt();
		long b=a;      //Implicit TypeCasting
		System.out.println("Corresponding long value: " + b);
		System.out.println("Enter double value");
		double c=sc.nextDouble();
		a=(int) c;     //Explicit TypeCasting
		System.out.println("Corresponding int value: " + a);
        sc.close();
	}

}
