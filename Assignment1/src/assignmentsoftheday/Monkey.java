package assignmentsoftheday;

public class Monkey implements Animal,Canfly{

	@Override
	public void legs() {
		// TODO Auto-generated method stub
		System.out.println("I'm Monkey");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Black");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, I can't Fly");
	}

}
