package com.qa.exercises;

import java.util.ArrayList;

public class Runner {
	
	public static String factorials (int num) {
		
		int divisor = 2;
		int result = 1;
		
		while (num > 1) {
			if (num % divisor == 0) {
				num /= divisor;
				divisor++;
				result++;
			} else {
				return "Not factorial";
			}
		}
		
		return result + "!";
	}
	
	public static String doggoComp (int num) {
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for (int i = 1; i <= 100; i++) {
			
			if (i != num) {
			
				if (i == 11 || i == 12 || i == 13) {
					answer.add(i + "th");
				} else {
				
					switch (String.valueOf(i).charAt(String.valueOf(i).length()-1)) {
					case '1':
						answer.add(i + "st");
						break;
					case '2':
						answer.add(i + "nd");
						break;
					case '3':
						answer.add(i + "rd");
						break;
					default:
						answer.add(i + "th");
						break;
					}
				}
			}
		}
		
		return String.join(", ", answer);
		
	}
	
	public static String goldilocks (ArrayList<Integer> weights, ArrayList<Integer> temps) {
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for (int i = 0; i < weights.size(); i++) {
			if (weights.get(i) <= 100 && temps.get(i) <= 80) {
				answer.add(String.valueOf(i+1));
			}
		}
		
		return String.join(", ", answer);
	}
	
}
