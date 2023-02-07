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

    //UC3-Show board
    public void showBoard()
    {
        System.out.println(board[1] +"|| " +board[2] +"|| "+board[3]);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(board[4] +"|| " +board[5] +"|| "+board[6]);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(board[7] +"|| " +board[8] +"|| "+board[9]);


    }
}
