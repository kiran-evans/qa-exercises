package rpsgame;
import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println(play());
	}
	
	public static String play() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose ROCK, PAPER or SCISSORS\n");
		Option playerChoice = Option.valueOf(scanner.nextLine());
		
		double rand = Math.random();
		Option computerChoice = null;
		
		if (rand < 0.33) {
			computerChoice = Option.ROCK;
		} else if (rand < 0.66) {
			computerChoice = Option.PAPER;
		} else {
			computerChoice = Option.SCISSORS;
		}
		
		System.out.println("Computer chose " + computerChoice);
		
		if (playerChoice == computerChoice) {
			return String.valueOf(Result.DRAW);
		} else if (playerChoice == Option.ROCK) {
			if (computerChoice == Option.SCISSORS) {
				return "You " + Result.WIN;
			} else {
				return "You " + Result.LOSE;
			}
		} else if (playerChoice == Option.PAPER) {
			if (computerChoice == Option.ROCK) {
				return ("You " + Result.WIN);
			} else {
				return ("You " + Result.LOSE);
			}
		}
		
		if (computerChoice == Option.PAPER) {
			return ("You " + Result.WIN);
		}
			
		return ("You " + Result.LOSE);
	}
}
