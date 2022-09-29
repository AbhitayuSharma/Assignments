package com.kpipartners.program2;

public class Overloading {
	
	static void Add(int a,int b) {
		System.out.println(a+b);
	}
	static void Add(int a, int b,int c) { //Overloading Add Method
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add(2,4);
		Add(5,7,9);   
	}

}
