package com.BridgeLab.WorkShop;

public class TicTacToeGame {
   char [] board=new char[10];
    public void createBoard()
    {
        for(int i=1;i< board.length;i++)
        {
            board[i]=' ';
        }
    }
}
