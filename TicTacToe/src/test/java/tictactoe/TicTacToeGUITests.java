package tictactoe;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeGUITests {
	@Test
	public void testGUIMarkCenterSquare() {
		TicTacToeGUI game = new TicTacToeGUI();
		String testMark = game.guiMarkLocation(1,1);
		assertEquals("X", testMark);
	}
}