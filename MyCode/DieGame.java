import java.io.*;
import java.util.*;

public class DieGame implements GameInterface {
	public static HashSet<Integer> numbersRolled = new HashSet<Integer>();

	//Majority of code is reused from the previous iteration of the die game

	public void playGame() throws Exception {
      initialiseGame();

      mainGame();

      declareGameWinner();
 	}

	public static void initialiseGame() throws Exception {
		System.out.println("The aim of this game is to roll a 6 on a 6 sided die. You get two chances to roll a 6.");
	}

	public static void mainGame() throws Exception {
		for (int i=0; i<2; i++) {
			System.out.println("Hit <RETURN> to roll the die");
			br.readLine();
			int dieRoll=(int)(r.next() * 6) + 1;

			System.out.println("You rolled " + dieRoll);
			numbersRolled.add(new Integer(dieRoll));
		}

		System.out.println("Numbers rolled: " + numbersRolled);
	}

	public static void declareGameWinner() throws Exception {

		if (numbersRolled.contains(new Integer(1))) {
			System.out.println("\nYou won!");
		}

		else {
			System.out.println("\nYou lost!");
		}
	}

}