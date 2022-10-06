package com;

public class Emp2ForAbs extends Employees implements Runnable{
	@Override
	public int empid() {
		// TODO Auto-generated method stub
		return 102;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Abhishek";
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
		return "abhishek.yadavkpipartners@gmail.com";
	}

	@Override
	public String dob() {
		// TODO Auto-generated method stub
		return "27-June-1999";
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
		System.out.println("Emp2 is running in Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		t.start();
	}

}
