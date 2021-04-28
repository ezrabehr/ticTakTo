package com.company;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int[][] Board = new int[4][4];

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print(Board[j][i]);
            }
            System.out.println();
        }// this prints out the board

        int num = 0;
        while (num < 9) {
            for (int f = 1; f < 3; f++) {
                System.out.println("Player no" + f);
                System.out.println("Enter the x position of where you want to put your piece");
                int xPosition = in.nextInt();
                System.out.println("Enter the y position of where you want to put your piece");
                int yPosition = in.nextInt();
                    if(Board[xPosition][yPosition] == 0) { //makes sure no one placed a piece there
                if (f == 1)
                    Board[xPosition][yPosition] = 1;
                else
                    Board[xPosition][yPosition] = 2;
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 4; j++) {
                        System.out.print(Board[j][i]);
                    }
                    System.out.println();
                }
                System.out.println("_________________________________");

            }
                    else {  //in a case that someone already placed a piece there it will redo his turn
                        System.out.println("Someone already put a piece here, try again \n______________________");
                        num--;
                        f--;
                    }
                    } //for f closer
            num++;
            } //while closer

        } //void main closer
    }// Main closer

