package InnerClass;

class Employee{
	
	int salary=50000;
	class PermEmployee{
		
		String code="PE01";
		float hike=0.45f;
		void new_salary()
		{
			System.out.println("New salary after hike= " + (salary+(salary*hike)));
		}
		void display()
		{
			System.out.println(salary + code + hike);
		}
		void method()
		{
			class ConstructEmployee{
				
				String code="CE01";
				float hike=0.30f;
				void new_salary()
				{
					System.out.println("New salary after hike= " + (salary+(salary*hike)));
				}
				void display()
				{
					System.out.println(salary + code + hike);
				}
			}
			ConstructEmployee obj=new ConstructEmployee();
			obj.new_salary();
			obj.display();
		}
	}
	void display()
	{
		PermEmployee obj=new PermEmployee();
		obj.new_salary();
		obj.display();
		obj.method();
	}
}

public class AccessInnerClass {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.display();

	}

}
