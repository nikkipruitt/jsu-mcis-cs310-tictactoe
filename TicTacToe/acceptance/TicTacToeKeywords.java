import tictactoe.*;

public class TicTacToeKeywords {
	TicTacToe game = new TicTacToe();
	
	public void startNewGame() {
		game.startNewGame();
	}
	
	public void markLocation(int row, int col) {
		game.markLocation(row, col);
	}
	
	public String getLocation(int row, int col) {
		return game.getLocation(row, col);
	}
	
	public String getWinner() {
		return game.getWinner();
	}
	
	
}