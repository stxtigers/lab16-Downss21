package Downss21.Task1;

public class Squirrel implements Animal {

	protected int numberOfLimbs = 4;
	protected static int total = 0;
	protected int id;
	protected double distance;
	protected double speed = 4;
	protected double length;
	protected double weight;
	private String name = "Squirrel";
	protected String sound;
	
	public Squirrel(double distance, double length, double weight) {
		Squirrel.total++;
		this.id = total;
		this.distance = distance;
		this.length = length;
		this.weight = weight;
		sound = "screee";
	}
	
	@Override
	public void move(int numberOfSeconds) {
		distance += numberOfSeconds * speed;
	}

	@Override
	public String sound() {
		return sound;
	}
	
	@Override
	public String toString() {
		return name+" " + id + ", Location: "+distance;
	}

}
