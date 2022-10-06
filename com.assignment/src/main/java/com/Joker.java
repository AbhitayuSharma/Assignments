package com;

public class Joker implements JokerInter{
	String name;
	public Joker() {
		
	}
	public Joker(String something) {
		name = something;
	}

	@Override
	public String dancing(String n,String d) {
		// TODO Auto-generated method stub
		return (n+" is Dancing "+d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joker j1 = new Joker();
		Joker j2 = new Joker("Joker2");
		Joker j3 = new Joker();
		Joker j4 = new Joker("Joker4");
		Joker j5 = new Joker();
		Joker j6 = new Joker("Joker6");
		Joker j7 = new Joker();
		Joker j8 = new Joker("Joker8");
		Joker j9 = new Joker();
		Joker j10 = new Joker("Joker10");
		Joker j11 = new Joker();
		Joker j12 = new Joker("Joker12");
		Joker j13 = new Joker();
		Joker j14 = new Joker("Joker14");
		Joker j15 = new Joker();
		Joker j16 = new Joker("Joker16");
		j1.dancing("Joker1", "Kuchipudi");
		j2.dancing("Joker2", "Katthak");
		j3.dancing("Joker3", "Folk Dance");
		j4.dancing("Joker4", "Contemporary");
		j5.dancing("Joker5", "Jazz");
		j6.dancing("Joker6", "Bharatanatyam");
		j7.dancing("Joker7", "Kathakali");
		j8.dancing("Joker8", "Manipuri Dance");
		j9.dancing("Joker9", "Odissi Dance");
		j10.dancing("Joker10", "Hip Hop");
		j11.dancing("Joker11", "Irish Dance");
		j12.dancing("Joker12", "Ballet");
		j13.dancing("Joker13", "Ballroom");
		j14.dancing("Joker14", "Kathak");
		j15.dancing("Joker15", "Kathakali");
		j16.dancing("Joker16", "Kuchipudi");
		
	}
	

}
