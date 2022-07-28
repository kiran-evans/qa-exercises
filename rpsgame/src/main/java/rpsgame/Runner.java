package rpsgame;
import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		play();
	}
	
	public static void play() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose ROCK, PAPER or SCISSORS\n");
		Option playerChoice = Option.valueOf(scanner.nextLine());
		
		double rand = Math.random();
		Option computerChoice = null;
		
		if (rand < 0.33) {
			computerChoice = Option.ROCK;
		} else if (rand > 0.66) {
			computerChoice = Option.SCISSORS;
		} else {
			computerChoice = Option.PAPER;
		}
		
		System.out.println("Computer chose " + computerChoice);
		
		if (playerChoice == computerChoice) {
			System.out.println(Result.DRAW);
		} else if (playerChoice == Option.ROCK) {
			if (computerChoice == Option.SCISSORS) {
				System.out.println("You " + Result.WIN);
			} else {
				System.out.println("You " + Result.LOSE);
			}
		} else if (playerChoice == Option.PAPER) {
			if (computerChoice == Option.ROCK) {
				System.out.println("You " + Result.WIN);
			} else {
				System.out.println("You " + Result.LOSE);
			}
		} else if (playerChoice == Option.SCISSORS) {
			if (computerChoice == Option.PAPER) {
				System.out.println("You " + Result.WIN);
			} else {
				System.out.println("You " + Result.LOSE);
			}
		}
		
	}
}
