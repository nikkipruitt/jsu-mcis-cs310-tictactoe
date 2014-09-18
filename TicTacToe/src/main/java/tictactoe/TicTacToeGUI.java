package tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGUI extends JFrame implements ActionListener{
	public TicTacToe game;
	public JPanel panel;
	public JButton[][] buttons;
	
	public TicTacToeGUI() {
		game = new TicTacToe();
		displayBoard();
	}
	
	public void displayBoard() {
		panel = new JPanel();
		GridLayout layout = new GridLayout(3,3);
		layout.setHgap(3);
		layout.setVgap(3);
		panel.setLayout(layout);
		buttons = new JButton[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				buttons[i][j].setText("-");
				buttons[i][j].addActionListener(this);
				panel.add(buttons[i][j]);
			}
		}
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(game.getWinner() == "KEEP PLAYING") {
			for(int y = 0; y < 0; y++) {
				for(int z = 0; z < 0; z++) {
					if(ae.getSource() == buttons[y][z]) {
						String placeMove = guiMarkLocation(y,z);
						buttons[y][z].setText(placeMove);
					}
				}
			}
		}
		else {
			showEndGameMessage();
		}
		
	}
	
	public String guiMarkLocation(int row, int col) {
		game.markLocation(row, col);
		return game.getLocation(row, col);
	}
	
	public void showEndGameMessage() {
		if(game.getWinner() == "TIE") {
			JOptionPane.showMessageDialog(this, "It was a tie!");
		}
		else {
			JOptionPane.showMessageDialog(this, "The winner is " + game.getWinner() + "!");
		}
	}
	
	public static void main(String[] args) {
		TicTacToeGUI newGame = new TicTacToeGUI();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}