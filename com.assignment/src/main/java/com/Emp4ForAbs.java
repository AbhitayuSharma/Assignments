package com;

public class Emp4ForAbs extends Employees implements Runnable{
	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 104;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Akanksha";
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
		return "akanksha.sinhakpipartners@gmail.com";
	}

	@Override
	String dob() {
		// TODO Auto-generated method stub
		return "19-August-2000";
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
		System.out.println("Emp4 is running in Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread("Thread Start");
		t.start();
	}

}
