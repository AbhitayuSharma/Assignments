package com;

public class Emp3ForAbs extends Employees implements Runnable{
	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 103;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Akshit";
	}

	@Override
	String department() {
		// TODO Auto-generated method stub
		return "IT";
	}

	@Override
	int phoneno() {
		// TODO Auto-generated method stub
		
		return 121212;
	}

	@Override
	String emailid() {
		// TODO Auto-generated method stub
		return "akshit.anandkpipartners@gmail.com";
	}

	@Override
	String dob() {
		// TODO Auto-generated method stub
		return "13-March-1999";
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 700000;
		
	}

	@Override
	int accountno() {
		// TODO Auto-generated method stub
		return 898989898;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Emp3 is running in Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread("Thread Start");
		t.start();
	}

}
