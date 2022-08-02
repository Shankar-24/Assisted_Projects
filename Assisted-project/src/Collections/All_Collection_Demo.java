package Collections;

import java.util.*;

public class All_Collection_Demo {

	public static void main(String[] args) {
		
		//Array List
		int n,e;
		List <Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements to be added to the Arraylist");
        n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
        	e=sc.nextInt();
        	arr.add(e);
        }
        System.out.println(arr);
       
        //Linked list
        String s;
        List <String> ll=new LinkedList<String>();
		System.out.println("Enter no. of stringss to be added to the Linkedlist");
        n=sc.nextInt();
		sc.nextLine();
        System.out.println("Enter the strings");
        for(int i=0;i<n;i++)
        {
        	s=sc.nextLine();
        	ll.add(s);
        }
        System.out.println(ll);
        
        //Hash Set
        char c;
        Set <Character> hs=new HashSet<Character>();
		System.out.println("Enter no. of characters to be added to the Hashset");
        n=sc.nextInt();
        System.out.println("Enter the characters");
        for(int i=0;i<n;i++)
        {
        	c=sc.next().charAt(0);
        	hs.add(c);
        }
        System.out.println(hs);

        //Vector
        List <Integer> vec=new Vector<Integer>();
        System.out.println("Enter no. of elements to be added to the List");
        n=sc.nextInt();
        System.out.println("Enter the elementss");
        for(int i=0;i<n;i++)
        {
        	e=sc.nextInt();
        	vec.add(e);
        }
        System.out.println(vec);
		sc.close();
	}

}
