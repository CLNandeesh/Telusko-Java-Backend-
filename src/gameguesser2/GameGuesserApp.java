package gameguesser2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

	int numberToBeGuessedByPlayer(int i) {
		sc = new Scanner(System.in);
		System.out.println("Hi Player " + (i + 1) + ", Kindly provide your number! ");
		playerNumber = sc.nextInt();
		return playerNumber;
	}

}

class Umpire {

	int numberToBeCollectedFromGuesser;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	List<Player> list = new ArrayList<Player>();
	int numberOfPlayers;

	Scanner sc = null;

	void collectNumberOfPlayers() {
		sc = new Scanner(System.in);
		System.out.println("How many Players will Play the Game");
		numberOfPlayers = sc.nextInt();
	}

	void collectOrderFromGuesser() {

		Guesser guesser = new Guesser();
		numberToBeCollectedFromGuesser = guesser.numberToBeGuessedByGuesser();

	}

	void collectOrderFromPlayers() {

		for (int i = 0; i < numberOfPlayers; i++) {
			Player player = new Player();
			list.add(player);

			int temp = list.get(i).numberToBeGuessedByPlayer(i);
			map.put(i, temp);
		}

	}

	void compareAndDeclareResult() {

		int count = 0;
		for (int i = 0; i < map.size(); i++) {

			if (Integer.valueOf(map.get(i)) == numberToBeCollectedFromGuesser) {
				System.out.println("Congratulations! Player " + (i + 1) + " Won the Game");
				count++;
			}

		}

		if (count == 0) {

			System.out.println("Match End, Please try again!");

		}

	}

}

public class GameGuesserApp {

	public static void main(String[] args) {

		Umpire umpire = new Umpire();
		umpire.collectNumberOfPlayers();
		umpire.collectOrderFromGuesser();
		umpire.collectOrderFromPlayers();
		umpire.compareAndDeclareResult();

	}

}
