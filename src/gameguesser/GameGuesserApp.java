package gameguesser;

import java.util.Scanner;

class Guesser {

	int guesserNumber;
	Scanner sc = null;

	int numberToBeGuessedByGuesser() {
		sc = new Scanner(System.in);
		System.out.println("Hi Guesser, Kindly provide your number! ");
		guesserNumber = sc.nextInt();
		return guesserNumber;
	}

}

class Player {

	int playerNumber;
	Scanner sc = null;

	int numberToBeGuessedByPlayer() {
		sc = new Scanner(System.in);
		System.out.println("Hi Player, Kindly provide your number! ");
		playerNumber = sc.nextInt();
		return playerNumber;
	}

}

class Umpire {

	int numberToBeCollectedFromGuesser;
	int numberToBeCollectedFromPlayerP1;
	int numberToBeCollectedFromPlayerP2;
	int numberToBeCollectedFromPlayerP3;
	Scanner sc = null;

	void collectOrderFromGuesser() {

		Guesser guesser = new Guesser();
		numberToBeCollectedFromGuesser = guesser.numberToBeGuessedByGuesser();

	}

	void collectOrderFromPlayers() {

		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numberToBeCollectedFromPlayerP1 = p1.numberToBeGuessedByPlayer();
		numberToBeCollectedFromPlayerP2 = p2.numberToBeGuessedByPlayer();
		numberToBeCollectedFromPlayerP3 = p3.numberToBeGuessedByPlayer();

	}

	void compareAndDeclareResult() {
		if (numberToBeCollectedFromPlayerP1 == numberToBeCollectedFromGuesser) {

			if (numberToBeCollectedFromPlayerP2 == numberToBeCollectedFromGuesser
					&& numberToBeCollectedFromPlayerP3 == numberToBeCollectedFromGuesser) {
				System.out.println("All Players WON!");
			} else if (numberToBeCollectedFromPlayerP2 == numberToBeCollectedFromGuesser) {
				System.out.println("Player 1 and Player 2 WON!");
			} else if (numberToBeCollectedFromPlayerP3 == numberToBeCollectedFromGuesser) {
				System.out.println("Player 1 and Player 3 WON!");
			} else {
				System.out.println("Player 1 WON!");
			}

		} else if (numberToBeCollectedFromPlayerP2 == numberToBeCollectedFromGuesser) {
			if (numberToBeCollectedFromPlayerP3 == numberToBeCollectedFromGuesser) {
				System.out.println("Player 2 and Player 3 WON!");
			} else {
				System.out.println("Player 2 WON!");
			}
		} else if (numberToBeCollectedFromPlayerP3 == numberToBeCollectedFromGuesser) {
			System.out.println("Player 3 WON!");
		} else {
			System.out.println("Game END, Please try again!");
		}
	}

}

public class GameGuesserApp {

	public static void main(String[] args) {

		Umpire umpire = new Umpire();
		umpire.collectOrderFromGuesser();
		umpire.collectOrderFromPlayers();
		umpire.compareAndDeclareResult();
	}

}
