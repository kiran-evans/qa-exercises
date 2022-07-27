package com.qa.exercises;

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
	
}
