package Downss21.Task2;

public class TechEmployee extends Employee {
	String qual;

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public TechEmployee() {
		super();
		qual = "Qualified";
	}
	
	public String toString() {
		return super.toString() + ", Qualification: "+qual;
	}
	
	@Override
	public void setPayRate(double pr) {
		this.payRate = pr * 2;
	}

}
