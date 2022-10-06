package com;

import java.util.ArrayList;

public class CommanElementinArray {
	public int same() {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("p");
		list2.add("q");
		list2.add("r");
		list2.add("a");
		list2.add("m");
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("m");
		list3.add("k");
		list3.add("a");
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("k");
		list4.add("p");
		list4.add("a");
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("a");
		list5.add("b");
		list5.add("l");
		list1.retainAll(list2);
		list1.retainAll(list3);
		list1.retainAll(list4);
		list1.retainAll(list5);
		System.out.println("Comman Element is "+list1);
		String a = list1.get(0);
		int index = list3.indexOf(a);
		System.out.println("Index of Element in List3 is "+index);
		return index;
	}
	
	public static void main(String args[]) {
		CommanElementinArray cm = new CommanElementinArray();
		cm.same();
	}
}
