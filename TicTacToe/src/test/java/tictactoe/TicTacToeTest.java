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
		game.markLocation(0,0);
		assertEquals("O", game.getLocation(0,0));
		game.markLocation(2,2);
		assertEquals("X", game.getLocation(2,2));
	}
	
	@Test
	public void testDiagonalWinLeft() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(0,0);
		game.markLocation(0,1);
		game.markLocation(1,1);
		game.markLocation(0,2);
		game.markLocation(2,2);
		game.checkForWin();
		assertEquals("X", game.getWinner());
	}
	
	@Test
	public void testDiagonalRight() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(0,2);
		game.markLocation(0,1);
		game.markLocation(1,1);
		game.markLocation(2,2);
		game.markLocation(2,0);
		game.checkForWin();
		assertEquals("X", game.getWinner());
	}
	
	@Test
	public void testHorizontalWinBottom() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(1,1);
		game.markLocation(2,0);
		game.markLocation(0,0);
		game.markLocation(2,2);
		game.markLocation(0,2);
		game.markLocation(2,1);
		game.checkForWin();
		assertEquals("O", game.getWinner());
	}
	
	@Test
	public void testHorizontalWinMiddle() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(0,0);
		game.markLocation(1,1);
		game.markLocation(2,2);
		game.markLocation(1,2);
		game.markLocation(0,1);
		game.markLocation(1,0);
		game.checkForWin();
		assertEquals("O", game.getWinner());
	}
	
	@Test 
	public void testHorizontalWinTop() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(2,2);
		game.markLocation(0,2);
		game.markLocation(1,0);
		game.markLocation(0,1);
		game.markLocation(2,1);
		game.markLocation(0,0);
		game.checkForWin();
		assertEquals("O", game.getWinner());
	}
	
	@Test
	public void testVerticalWinLeft() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(0,0);
		game.markLocation(1,1);
		game.markLocation(1,0);
		game.markLocation(2,2);
		game.markLocation(2,0);
		game.checkForWin();
		assertEquals("X", game.getWinner());
	}
	
	@Test
	public void testVerticalWinMiddle() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(2,2);
		game.markLocation(0,1);
		game.markLocation(0,0);
		game.markLocation(1,1);
		game.markLocation(1,0);
		game.markLocation(2,1);
		game.checkForWin();
		assertEquals("O", game.getWinner());
	}

	@Test
	public void testVerticalWinRight() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(0,2);
		game.markLocation(0,0);
		game.markLocation(2,2);
		game.markLocation(2,0);
		game.markLocation(1,2);
		game.markLocation(1,1);
		game.checkForWin();
		assertEquals("X", game.getWinner());
	}
	
	@Test
	public void testForTie() {
		TicTacToe game = new TicTacToe();
		game.startNewGame();
		game.markLocation(1,1);
		game.markLocation(0,0);
		game.markLocation(2,0);
		game.markLocation(0,2);
		game.markLocation(0,1);
		game.markLocation(2,1);
		game.markLocation(1,2);
		game.markLocation(1,0);
		game.markLocation(2,2);
		game.checkForWin();
		assertEquals("TIE", game.getWinner());
	}
	
}