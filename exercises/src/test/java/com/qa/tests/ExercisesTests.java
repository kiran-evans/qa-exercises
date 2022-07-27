package com.qa.tests;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.qa.exercises.Runner;

public class ExercisesTests {
	
	@Test
	public void testFactorials() {
		assertEquals("5!", Runner.factorials(120));
		assertEquals("Not factorial", Runner.factorials(150));
	}
	
	@Test
	public void testDoggoComp() {
		assertEquals("2nd, 3rd, 4th, 5th, 6th, 7th, 8th, 9th, 10th, 11th, 12th, 13th, 14th, 15th, 16th, 17th, 18th, 19th, 20th, 21st, 22nd, 23rd, 24th, 25th, 26th, 27th, 28th, 29th, 30th, 31st, 32nd, 33rd, 34th, 35th, 36th, 37th, 38th, 39th, 40th, 41st, 42nd, 43rd, 44th, 45th, 46th, 47th, 48th, 49th, 50th, 51st, 52nd, 53rd, 54th, 55th, 56th, 57th, 58th, 59th, 60th, 61st, 62nd, 63rd, 64th, 65th, 66th, 67th, 68th, 69th, 70th, 71st, 72nd, 73rd, 74th, 75th, 76th, 77th, 78th, 79th, 80th, 81st, 82nd, 83rd, 84th, 85th, 86th, 87th, 88th, 89th, 90th, 91st, 92nd, 93rd, 94th, 95th, 96th, 97th, 98th, 99th, 100th", Runner.doggoComp(1));
		assertEquals("1st, 2nd, 3rd, 4th, 5th, 6th, 7th, 8th, 9th, 10th, 11th, 12th, 13th, 14th, 15th, 16th, 17th, 18th, 19th, 20th, 21st, 22nd, 23rd, 24th, 25th, 26th, 27th, 28th, 29th, 30th, 31st, 32nd, 33rd, 34th, 35th, 36th, 37th, 38th, 39th, 40th, 41st, 42nd, 43rd, 44th, 45th, 46th, 47th, 48th, 49th, 50th, 51st, 52nd, 53rd, 54th, 55th, 56th, 57th, 58th, 59th, 60th, 61st, 62nd, 63rd, 64th, 65th, 66th, 67th, 68th, 69th, 70th, 71st, 72nd, 73rd, 74th, 75th, 76th, 77th, 78th, 79th, 80th, 81st, 82nd, 83rd, 84th, 85th, 86th, 87th, 88th, 89th, 90th, 91st, 92nd, 93rd, 94th, 95th, 96th, 97th, 98th, 100th", Runner.doggoComp(99));
	}
	
	@Test
	public void goldilocksTest() {
		
		ArrayList<Integer> weights  = new ArrayList<Integer>();
		weights.add(100);
		weights.add(30);
		weights.add(130);
		weights.add(90);
		weights.add(150);
		weights.add(120);
		weights.add(200);
		weights.add(110);
		
		ArrayList<Integer> temps = new ArrayList<Integer>();
		temps.add(80);
		temps.add(50);
		temps.add(60);
		temps.add(100);
		temps.add(110);
		temps.add(40);
		temps.add(90);
		temps.add(100);
		
		assertEquals("1, 2", Runner.goldilocks(weights, temps));
	}
}
