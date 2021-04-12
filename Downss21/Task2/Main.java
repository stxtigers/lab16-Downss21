package Downss21.Task2;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		TechEmployee e2 = new TechEmployee();
		
		System.out.println(e1);
		e1.setPayRate(20);
		System.out.println(e1);
		
		System.out.println(e2);
		e2.setPayRate(20);
		System.out.println(e2);
	}

}
