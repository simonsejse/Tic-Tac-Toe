package com.tutorials;

import com.tutorials.gui.GUI;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

/*
    static List<Integer> XPos = new ArrayList<>();
    static List<Integer> OPos = new ArrayList<>();
    static List<List> possibleWins;
*/

   /* static char[][] boards = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };

    static char turn = 'O';
    */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new GUI();
            }
        });

        /*
        Scanner scanner = new Scanner(System.in);


        possibleWins = new ArrayList<>();
        List toprow = Arrays.asList(1, 2, 3);
        List midrow = Arrays.asList(4, 5, 6);
        List downrow = Arrays.asList(7, 8, 9);
        List leftcol = Arrays.asList(1, 4, 7);
        List midcol = Arrays.asList(2, 5, 8);
        List rightcol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        possibleWins.add(toprow);
        possibleWins.add(midrow);
        possibleWins.add(downrow);
        possibleWins.add(leftcol);
        possibleWins.add(midcol);
        possibleWins.add(rightcol);
        possibleWins.add(cross1);
        possibleWins.add(cross2);


        System.out.println("Du skal vælge et tal fra 1-9, hvor du vil sætte kryds.");
        int num;
        do{
            try {
                num = Integer.parseInt(scanner.nextLine());
                switchTurn(num);
                if (!choose(num, turn)){
                    System.out.println("1-9 ikke 1010" +num);
                }
                refresh();
                checkIfWin();
            } catch (NumberFormatException e) {
                System.out.println("Dette er ikke et nummer, forsøg igen.");
            }
        }while(true);
        
    }

    public static void checkIfWin(){
        for(List l : possibleWins){
            if (XPos.containsAll(l)){
                System.out.println("X VANDT!!!!");
                System.out.println("X VANDT!!!!");
                System.out.println("X VANDT!!!!");
            }
            if (OPos.containsAll(l)){
                System.out.println("O VANDT!!!!");
                System.out.println("O VANDT!!!!");
                System.out.println("O VANDT!!!!");
            }
        }

    }
    */ 
    /*
    public static void switchTurn(int num){
        turn = turn == 'X' ? 'O' : 'X';
        if (turn == 'X'){
            XPos.add(num);
        }else if (turn == 'O'){
            OPos.add(num);
        }
    }

    public static boolean choose(int num, char c){
        if (num > 9){return false;}
        switch(num) {
            case 1:
                boards[0][0] = c;
                break;
            case 2:
                boards[0][2] = c;
                break;
            case 3:
                boards[0][4] = c;
                break;
            case 4:
                boards[2][0] = c;
                break;
            case 5:
                boards[2][2] = c;
                break;
            case 6:
                boards[2][4] = c;
                break;
            case 7:
                boards[4][0] = c;
                break;
            case 8:
                boards[4][2] = c;
                break;
            case 9:
                boards[4][4] = c;
                break;
        }
        return true;
    }

    public static void refresh(){
        for(char[] b : boards){
            System.out.println(b);
        }
    }
    
     */
}
