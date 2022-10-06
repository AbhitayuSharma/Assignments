package com;

import java.util.HashSet;
import java.util.Set;

public class SetTry {
	public int lastelement() {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(1);
		hs.add(2);
		hs.add(2);
		hs.add(3);
		hs.add(3);
		hs.add(4);
		hs.add(4);
		hs.add(5);
		hs.add(5);
		hs.add(6);
		hs.add(6);
		hs.add(7);
		hs.add(7);
		hs.add(8);
		hs.add(8);
		hs.add(9);
		hs.add(9);
		hs.add(10);
		hs.add(10);
		int last = 0;
		for(int i:hs) {
			last=i;
		}
		return last;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTry st = new SetTry();
		int ans = st.lastelement();
		System.out.println(ans);
	}
}
