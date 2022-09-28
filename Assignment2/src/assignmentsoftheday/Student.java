package assignmentsoftheday;

public class Student extends Person {
	String type = "I'm Student";
	void display() {
		System.out.println(type);
		System.out.println(super.type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();
	}

}
