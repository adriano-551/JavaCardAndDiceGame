import java.io.*;

public class StartGame{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Card (c) or Die (d) game? ");
    	String ans=br.readLine();

    	GameFactory newFactory = new GameFactory();
    	GameInterface chosenGame = newFactory.createGame(ans);
    	chosenGame.playGame();
	}
}