package tictactoe;

public class TicTacToe {
	private String[][] board;
	private String player;
	private boolean isWon = false;
	private boolean isTie = false;
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
	}
	
	public void startNewGame() {
		board = new String[3][3];
		player = "X";
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = "-";
			}
		}
		displayBoard();
	}
	
	public void markLocation(int row, int col) {
		board[row][col] = player;
	}
	
	public String getLocation(int row, int col) {
		return board[row][col];
	}
	
	private void displayBoard() {
		System.out.println("---------------");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <3; j++) {
				System.out.print("| " + board[i][j] + " |");
			}
			System.out.println();
			System.out.println("---------------");
		}
	}
	
	public void changePlayer(String player) {
		if(player == "X") {
			player = "O";
		}
		else{
			player = "X";
		}
	}
	
	public boolean diagonalWin() {
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			isWon = true;
			player = getLocation(1,1);
		}
		return isWon;
	}
	
	public boolean horizontalWin() {
		if(board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
			isWon = true;
			player = getLocation(2,2);
		}
		return isWon;
	}
	
	public String getWinner(boolean isWon) {
		if(isWon == true) {
			return player;
		}
		else{
			return "TIE";
		}
	}
	
}