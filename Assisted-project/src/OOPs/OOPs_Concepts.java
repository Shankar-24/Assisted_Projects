package OOPs;

abstract class Vehicle{
	 
	int speed; long distance;
	Vehicle()
	{
		this.distance=765433;
	}
	Vehicle(int a)
	{
		speed=a;
	}
	abstract void run();
	abstract void stop();
	public void fuel(int a)
	{
		System.out.println("Fuel level " + a);
	}
	public void fuel(float a, String b)
	{
		System.out.println("Fuel code " + b + a);
	}
	public void fuel(char a, int c)
	{
		System.out.println("Fuel type " + c + a);
	}
}
class TwoWheeler extends Vehicle{
	
	int no_of_tyres=2;
	int speed; 
	long distance;
	TwoWheeler()
	{
		super(8);
		speed=5;
		distance=6354;
	}
	TwoWheeler(int a)
	{
		super();
	}
	void run()
	{
		System.out.println("Two Wheeler is running");
	}
	void stop()
	{
		System.out.println("Two Wheeler was stopped");
	}
	void display1()
	{
		System.out.println("Vehicle distance= " + super.distance);
	}
	void display()
	{
		System.out.println("2W Speed= " + speed + "\n 2W Distance= " + distance);
		System.out.println("Vehicle Speed= " + super.speed);
	}
}

public class OOPs_Concepts {

	public static void main(String[] args) {
		
		TwoWheeler obj1=new TwoWheeler();
		TwoWheeler obj=new TwoWheeler(3);
		obj1.display();
		obj.display1();

	}

}
