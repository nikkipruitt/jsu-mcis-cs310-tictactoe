package tictactoe;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeGUITests {
	@Test
	public void testGUIMarkCenterSquare() {
		TicTacToeGUI game = new TicTacToeGUI();
		game.buttons[1][1].setText("X");
		assertEquals("X", game.buttons[1][1].getText());
	}
	
	@Test
	public void testGameOver() {
		TicTacToeGUI game = new TicTacToeGUI();
		game.buttons[2][2].setText("O");
		assertFalse(game.gameOver());
	}
	
	@Test
	public void testLabel() {
		TicTacToeGUI game = new TicTacToeGUI();
		TicTacToe test = new TicTacToe();
		test.startNewGame();
		test.markLocation(1,1);
		test.markLocation(0,0);
		test.markLocation(2,0);
		test.markLocation(0,2);
		test.markLocation(0,1);
		test.markLocation(2,1);
		test.markLocation(1,2);
		test.markLocation(1,0);
		test.markLocation(2,2);
		game.winLabel.setText(test.getWinner());
		assertEquals(test.getWinner(), game.winLabel.getText());
	}
	
}