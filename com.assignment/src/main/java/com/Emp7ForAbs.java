package com;

public class Emp7ForAbs extends Employees implements Runnable{
	@Override
	int empid() {
		// TODO Auto-generated method stub
		return 107;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Saynam";
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
		return "saynam.sharmakpipartners@gmail.com";
	}

	@Override
	String dob() {
		// TODO Auto-generated method stub
		return "2-November-1998";
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
		System.out.println("Emp7 is Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread("Thread Start");
		t.start();
	}

	

}
