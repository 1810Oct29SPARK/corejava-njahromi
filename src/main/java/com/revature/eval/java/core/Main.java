package com.revature.eval.java.core;

import java.util.*;

class Main {
	static void printFreq(int arr[]) {
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			Integer c = tmap.get(arr[i]);

			if (tmap.get(arr[i]) == null)
				tmap.put(arr[i], 1);

			else
				tmap.put(arr[i], ++c);
		}
		for (Map.Entry m : tmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

	public static void main(String[] args) {
		int arr[] = { 234, 1, 3, 82, 5, 2, 82, 234, 5, 234, 234, 234 };
		printFreq(arr);
	}
}
