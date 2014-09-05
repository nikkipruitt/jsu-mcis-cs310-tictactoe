package tictactoe;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	@Test
	public void testMarkCenterSquare()	{
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(1,1);
		assertEquals("X", game.getLocation(1,1));
	}

	@Test
	public void testStartNewGame() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(2,1);
		assertEquals("X", game.getLocation(2,1));
	}
	
	@Test
	public void testChangePlayer(){
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(1,1);
		game.changePlayer(game.getLocation(1,1));
		game.markLocation(0,0);
		assertEquals("X", game.getLocation(0,0));
	}
	
	@Test
	public void testDiagonalWin() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(0,0);
		game.markLocation(1,1);
		game.markLocation(2,2);
		game.diagonalWin();
		assertEquals("X", game.getWinner(game.diagonalWin()));
	}
	
	@Test
	public void testHorizontalWin() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(2,0);
		game.markLocation(2,2);
		game.markLocation(2,1);
		game.horizontalWin();
		assertEquals("X", game.getWinner(game.horizontalWin()));
	}
	
}