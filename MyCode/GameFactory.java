public class GameFactory {
	public static GameInterface createGame(String input) throws Exception {
		if (input.equals("c")) {
			return new CardGame();
		} else if (input.equals("d")) {
			return new DieGame();
		} else {
			throw new Exception("Incorrect game type");
		}
	}
}