package Constructors;

public class Shape {
	
	int a,b,c,d1,d2,h;
	double d;
	Shape()
	{
		d1=5;
		d2=6;
		h=2;
	}
	Shape(int a)
	{
		this.a=a;
	}
	Shape(int b, int c)
	{
		this.b=b;
		this.c=c;
	}
	Shape(double d)
	{
		this.d=d;
	}
	void display_Sq()
	{
		System.out.println("Area of Square= " + a*a);
	}
	void display_Rect()
	{
		System.out.println("Area of Rectangle= " + b*c);
	}
	void display_Circle()
	{
		System.out.println("Area of Circle= " + 3.14*d*d);
	}
	public void area()
	{
		System.out.println("Area of Rhombus= " + (d1*d2)/2);
	}
	public void area(int b)
	{
		System.out.println("Area of Triangle= " + 0.5*b*h);
	}
	
	public static void main(String[] args)
	{
		Shape sq=new Shape(5);
		sq.display_Sq();
		Shape rect=new Shape(3,2);
		rect.display_Rect();
		Shape circle=new Shape(2.1);
		circle.display_Circle();
		Shape rh=new Shape();
		rh.area();
		Shape tri=new Shape();
		tri.area(3);
	}
}
