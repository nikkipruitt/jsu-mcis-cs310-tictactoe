package tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGUI extends JFrame implements ActionListener{
	public TicTacToe game;
	public JPanel panel;
	public JButton[][] buttons;
	private boolean gameOver = false;
	public JLabel winLabel;
	
	public TicTacToeGUI() {
		game = new TicTacToe();
		panel = new JPanel();
		GridLayout layout = new GridLayout(3,3);
		layout.setHgap(3);
		layout.setVgap(3);
		panel.setLayout(layout);
		winLabel = new JLabel("");
		this.add(panel);
		this.add(winLabel);
		buttons = new JButton[3][3];
		createButtons();
		this.pack();
	}
	
	public void createButtons() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				buttons[i][j] = new JButton();
				buttons[i][j].setPreferredSize(new Dimension(100,100));
				buttons[i][j].setText("-");
				buttons[i][j].addActionListener(this);
				panel.add(buttons[i][j]);
			}
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
		JButton button = (JButton) ae.getSource();
			for(int y = 0; y < 3; y++) {
				for(int z = 0; z < 3; z++) {
					if(ae.getSource() == buttons[y][z]) {
						game.markLocation(y,z);
						String placeMove = guiGetLocation(y,z);
						buttons[y][z].setText(placeMove);
						buttons[y][z].setEnabled(false);
					}
				}
			}
			
		game.checkForWin();
		
		if(game.getWinner() != "KEEP PLAYING") {
			showEndGameMessage();
		}
		
	}
	
	public String guiGetLocation(int row, int col) {
		return game.getLocation(row, col);
	}
	
	public boolean gameOver() {
		if(game.getNumTurns() < 9) {
			gameOver = false;
		}
		else {
			gameOver = true;
		}
		
		return gameOver;
	}
	
	public void showEndGameMessage() {
		if(game.getWinner() == "TIE" && gameOver()) {
			JOptionPane.showMessageDialog(this, "It was a tie!");
				winLabel.setText(game.getWinner());
		}
		else {
			JOptionPane.showMessageDialog(this, "The winner is " + game.getWinner() + "!");
				winLabel.setText(game.getWinner());
		}
	}
	
	public static void main(String[] args) {
		TicTacToeGUI newGame = new TicTacToeGUI();
		JFrame frame = new JFrame();
		frame.setTitle("Tic Tac Toe");
		frame.add(newGame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}