package Arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int arr1[][]=new int[3][3];
		int ans[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Matrix Multiplication \n");
		System.out.println("Enter elemens of first matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elemens of second matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ans[i][j]=0;
				for(int k=0;k<3;k++)
				{
					ans[i][j]=ans[i][j]+(arr[i][k]*arr1[k][j]);
				}
			}
		}
		System.out.println("Resultant matrix is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
