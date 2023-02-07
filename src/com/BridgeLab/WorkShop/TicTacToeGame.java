package com.BridgeLab.WorkShop;

import java.util.Scanner;

public class TicTacToeGame {
   char [] board=new char[10];
   char chooseLetter;
   char computerLetter;
   //UC1- creating empty board
    public void createBoard()
    {
        for(int i=1;i< board.length;i++)
        {
            board[i]=' ';
        }
    }
    //UC2-Ability to allow the
    //player to choose a
    //letter X or O
    public void chooseLetter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose a letter: X or O :");
        chooseLetter=sc.next().toUpperCase().charAt(0);
        if(chooseLetter=='X')
        {
            computerLetter='X';
        }
        else
        {
            computerLetter='O';
        }
    }
}
