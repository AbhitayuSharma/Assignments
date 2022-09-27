package assignmentsoftheday;
//Encapsulation and Constructors
public class ConstructorProg {
	public ConstructorProg() {
		// TODO Auto-generated constructor stub
	}
	public ConstructorProg(int aa,int bb) {
		int a = aa;
		int b = bb;
	}
	public ConstructorProg(double aa,double bb) {
		double a = aa;
		double b = bb;
	}
	public static void main(String a[]) {
		ConstructorProg c1 = new ConstructorProg(); //Calling Default Constructor
		ConstructorProg c2 = new ConstructorProg(2,4); //Parameterized Int type Constructor
		ConstructorProg c3 = new ConstructorProg(1.2,3.4); //Double type Constructor
		ConstructorProg c4 = new ConstructorProg(); //Default Constructor
		ConstructorProg c5 = new ConstructorProg(5,6); //Int Constructor
	}
}
