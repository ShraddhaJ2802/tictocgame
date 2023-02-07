import com.BridgeLab.WorkShop.TicTacToeGame;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Tic toc toe game!");
        TicTacToeGame tc=new TicTacToeGame();
        tc.createBoard();
        tc.chooseLetter();
        tc.showBoard();
    }
}