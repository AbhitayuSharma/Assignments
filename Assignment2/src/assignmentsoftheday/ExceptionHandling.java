package assignmentsoftheday;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 3;
		int num3;
		try {
			num3 = num2/num1;
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
