package Downss21.Task1;
public class Main {

	public static void main(String[] args) {
		Squirrel s1 = new Squirrel(0, 10, 1);
		GreySquirrel s2 = new GreySquirrel(0, 10, 1);
		System.out.println(s1);
		s1.move(10);
		System.out.println(s1);
		System.out.println(s1.sound());
		
		System.out.println(s2);
		s2.move(10);
		System.out.println(s2);
		System.out.println(s2.sound());
	}

}
