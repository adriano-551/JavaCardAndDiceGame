import java.io.*;
import java.util.*;

public interface GameInterface {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static RandomInterface r = new LinearCongruentialGenerator();

    //Leaving these methods to be filled by the implementing class
	public void playGame() throws Exception;

	public static void initialiseGame() {
	}

	public static void mainGame() {
	}

	public static void declareGameWinner() {
	}
}