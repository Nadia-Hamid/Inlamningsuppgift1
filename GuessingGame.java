
public class GuessingGame {

	public static void main(String[] args) {
	

	
	Guesser guess = new Guesser(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	guess.start();
	}
  }

