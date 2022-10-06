package com;

public class Emp1ForAbs extends Employees implements Runnable{
	@Override
	public int empid() {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Abhi";
	}

	@Override
	public String department() {
		// TODO Auto-generated method stub
		return "IT";
	}

	@Override
	public int phoneno() {
		// TODO Auto-generated method stub
		
		return 121212;
	}

	@Override
	public String emailid() {
		// TODO Auto-generated method stub
		return "abhitayu.sharma@kpipartners.com";
	}

	@Override
	public String dob() {
		// TODO Auto-generated method stub
		return "11-July-1998";
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 700000;
		
	}

	@Override
	public int accountno() {
		// TODO Auto-generated method stub
		return 898989898;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Emp1 is running in Thread");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread("Thread Start");
		t.start();
	}
}
