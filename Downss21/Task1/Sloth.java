package Downss21.Task1;

public class Sloth implements Animal {

	protected int numberOfLimbs = 4;
	private static int id;
	private double distance;
	private double speed = 1;
	protected double length;
	protected double weight;
	private String name = "Sloth";
	
	public Sloth(double distance, double length, double weight) {
		this.id++;
		this.distance = distance;
		this.length = length;
		this.weight = weight;
	}
	
	@Override
	public void move(int numberOfSeconds) {
		distance += numberOfSeconds * speed;
	}

	@Override
	public String sound() {
		return "AAAAAAa";
	}
	
	@Override
	public String toString() {
		return name + id + ", Location: "+distance;
	}

}
