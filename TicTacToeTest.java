package tictactoe;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    
    @Test
    public void testStartNewGame(){
        TicTacToe t = new TicTacToe();
    }
    
    @Test
    public void testMarkLocation(int row, int col){
        TicTacToe t = new TicTacToe();
    }
    
    @Test
    public String testGetLocation(int row, int col){
		TicTacToe t = new TicTacToe();
		
        return "location";
    }
    
    @Test
    public String testGetWinnerDiagonal(){
		TicTacToe t = new TicTacToe();
		t.startNewGame();
		
        return "You Win";
    }

	@Test
	public String testGetWinnerHorizontally(){
		TicTacToe t = new TicTacToe();
		t.startNewGame();
		
		return "You Win";
	}
	
	@Test
	public String forceATie(){
		TicTacToe t = new TicTacToe();
		t.startNewGame();
	}
    
}
