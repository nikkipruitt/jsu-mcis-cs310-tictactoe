package tictactoe;

public class TicTacToe {
    
    private char[][] board;
    private char player;
    
    public void startNewGame() {
        board = new char[3][3];
        player = 'X';
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
               board[i][j] = ' ';
               System.out.println("| " + board[i][j] + "| ");
            }
            System.out.println("---------------");
        }
    }
    
    public void markLocation(int row, int col) {
        
        board[row][col] = player;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                System.out.println("| " + board[i][j] + "| ");
            }
            System.out.println("---------------");
        }
        
        if(player == 'X') {
            player = 'O';
        }
        else if(player == 'O') {
            player = 'X';
        }
    }
    
    public String getLocation(int row, int col) {
        return "location";
    }
    
    public String getWinner() {
        return "winner";
    }
     
    public static void main(String[] args) {
         
        
    }
    
}
