package tictactoe;

public class TicTacToeKeywords {
	
	private TicTacToe ticTacToe = new TicTacToe();
    
    public void startNewGame() {
        return ticTacToe.startNewGame();
    }
    
    public void markLocation(int row, int col) {
        return ticTacToe.markLocation(row, col);
    }
    
    public String getLocation(int row, int col) {
        return ticTacToe.getLocation(row, col);
    }
    
    public String getWinner() {
        return ticTacToe.getWinner();
    }
    
}
