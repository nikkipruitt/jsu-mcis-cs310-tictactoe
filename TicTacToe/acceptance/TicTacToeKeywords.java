import tictactoe.*;

public class TicTacToeKeywords {
	private TicTacToe game;
	private TicTacToeGUI guiGame;
	
	public void startApplication() {
		game = new TicTacToe();
		guiGame = new TicTacToeGUI();
	}
	
	public void startNewGame() {
		startApplication();
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