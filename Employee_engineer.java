package Module1;
import java.util.Scanner;

class Emmploy{
	
	float salary,esalary;
	float Da,HAR;
	void display() {
		System.out.println("Name of class is employee");
	}
	
	void calcSalary() {
	
		esalary=salary+(Da/100*salary)+(HAR/100*salary);
		System.out.println("the gross salary of employee is: "+esalary);
	
	}
	
	
}
class Engineer extends Emmploy{
	
	
	void display() {
		super.display();
		super.calcSalary();
		
		System.out.println("Name of class is Engineer");
	}
	
	void calcSalary() {
		
	
		System.out.println("the gross salary of employee is: "+2*esalary);
	}
	
	
	
	
}

public class Employee_engineer {
	public static void main(String[] args) {
		
		Engineer ob=new Engineer();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary of the employee: ");
		ob.salary=sc.nextFloat();
		System.out.println("Enter the DA of the employee: ");
		ob.Da=sc.nextFloat();
		System.out.println("Enter the HRA of the employee: ");
		ob.HAR=sc.nextFloat();
		ob.display();
		ob.calcSalary();
		
		sc.close();

	}
	
	
}


