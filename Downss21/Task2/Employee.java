package Downss21.Task2;

public class Employee {
	protected String lastName;
	protected double payRate;
	protected static int employeeCount = 0;
	
	public Employee() {
		employeeCount++;
		lastName = "Smith";
		payRate = 10D;
	}
	
	public void setLastName(String name) {
		lastName = name;
	}

	public String getlastName() {
		return lastName;
	}

	public void setPayRate(double pr) {
		payRate = pr;
	}

	public double getPayRate() {
		return payRate;
	}

	public String toString() {
		return lastName +", "+payRate+"/hour";
	}
	
	public static int getCount() {
		return employeeCount;
	}

}
