package Strings;

public class Strings {

	public static void main(String[] args) {
		
		String t="Delhi";
		String o="Mumbai";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		if(o.equals(l))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(y.equals(p))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(t.equals(o))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(o==l)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(y==p)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(t==o)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	String s1="Started Vava";
	StringBuffer s=new StringBuffer(s1);
	System.out.println(s);
    s.append("Phase1");
    System.out.println(s);
    s.delete(2, 5);
    System.out.println(s);
    s.replace(9,13,"Python");
    System.out.println(s);
    s.insert(9,"Language");
    System.out.println(s);
    s.reverse();
    System.out.println(s);
    System.out.println(s.charAt(9));
	}

}
