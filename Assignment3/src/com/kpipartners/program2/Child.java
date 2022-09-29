package com.kpipartners.program2;

public class Child extends Parent{
	void display() {
		System.out.println("Child Class"); //Overriding Display Method
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj = new Parent();
		obj.display();
		Parent obj2 = new Child();
		obj2.display();
		

	}

}
