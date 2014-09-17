package tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame{
	public String player;
	public String winner;
	private boolean isWon = false;
	private boolean freeSpace = true;
	private JButton[][] board;
	private JPanel panel;
	
	public TicTacToe() {
		panel = new JPanel();
		this.add(panel);
		this.pack();
	}
	
	public void startNewGame() {
		board = new JButton[3][3];
		player = "X";
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = new JButton("-");
				panel.add(board[i][j]);
			}
		}
	}
	
	public void markLocation(int row, int col) {
		if(board[row][col].getText() == "-") {
			board[row][col].setText(player);
			changePlayer();
		}
		checkForWin();
	}
	
	
	public String getLocation(int row, int col) {
		return board[row][col].getText();
	}
	
	public void changePlayer() {
		if(player == "X") {
			player = "O";
		}
		else{
			player = "X";
		}
	}

	public void checkForWin() {
		if(board[0][0].getText() == board[1][1].getText() && board[1][1].getText() == board[2][2].getText()) {
			winner = getLocation(1,1);
		}
		
		else if(board[0][2].getText() == board[1][1].getText() && board[1][1].getText() == board[2][0].getText()) {
			winner = getLocation(1,1);
		}
		
		else if(board[2][0].getText() == board[2][1].getText() && board[2][1].getText() == board[2][2].getText()) {
			winner = getLocation(2,2);
		}
		
		else if(board[1][0].getText() == board[1][1].getText() && board[1][1].getText() == board[1][2].getText()) {
			winner = getLocation(1,1);
		}
		
		else if(board[0][0].getText() == board[0][1].getText() && board[0][1].getText() == board[0][2].getText()) {
			winner = getLocation(0,0);
		}
		
		else if(board[0][0].getText() == board[1][0].getText() && board[1][0].getText() == board[2][0].getText()) {
			winner = getLocation(0,0);
		}
		
		else if(board[0][1].getText() == board[1][1].getText() && board[1][1].getText() == board[2][1].getText()) {
			winner = getLocation(1,1);
		}
		
		else if(board[0][2].getText() == board[1][2].getText() && board[1][2].getText() == board[2][2].getText()) {
			winner = getLocation(2,2);
		}
		
		else {
			winner = "TIE";
		}
		
	}

	public String getWinner() {
		return winner;
	}
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.setVisible(true);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}