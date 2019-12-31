package com.tutorials.gui;

import com.tutorials.gui.Grids.Grids;
import com.tutorials.gui.Grids.XO;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board extends JPanel implements MouseListener {

    Grids[][] grids = new Grids[3][3];
    //X O X
    //X O X
    //O X O

    boolean quit = false;

    char character = 'O';
    List<Integer> player1Positions = new ArrayList<>();
    List<Integer> player2Positions = new ArrayList<>();

    List<List> possibleOutcomes;

    public Board(){
        gridInitialization();
        addMouseListener(this);
        possibleOutcomes = new ArrayList<>();
        createPossibleOutcomes();
    }

    public void gridInitialization(){
        for(int i = 0;i<grids.length;i++){
            for(int j = 0;j<grids.length;j++){
                grids[i][j] = new XO(' ');
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        g.setFont(new Font("Times Roman", Font.PLAIN, 100));

        int n = 0;
        for(Grids[] _grids : grids){
            for(Grids grids : _grids){
                switch(n++){
                    case 0:
                        g.drawString(String.valueOf(grids.getX_or_o()), 50, 110);
                        continue;
                    case 1:
                        g.drawString(String.valueOf(grids.getX_or_o()), 240, 110);
                        continue;
                    case 2:
                        g.drawString(String.valueOf(grids.getX_or_o()), 420, 110);
                        continue;
                    case 3:
                        g.drawString(String.valueOf(grids.getX_or_o()), 50, 270);
                        continue;
                    case 4:
                        g.drawString(String.valueOf(grids.getX_or_o()), 240, 270);
                        continue;
                    case 5:
                        g.drawString(String.valueOf(grids.getX_or_o()), 420, 270);
                        continue;
                    case 6:
                        g.drawString(String.valueOf(grids.getX_or_o()), 50, 440);
                        continue;
                    case 7:
                        g.drawString(String.valueOf(grids.getX_or_o()), 240, 440);
                        continue;
                    case 8:
                        g.drawString(String.valueOf(grids.getX_or_o()), 420, 440);
                        continue;
                }
            }
        }
        //første linje vandret
        g.drawLine(0, 150, 550, 150);
        //anden linje vandret
        g.drawLine(0, 310, 550, 310);
        //første linje lodret
        g.drawLine(170, 0, 170, 500);
        //sidste linje lodret
        g.drawLine(370, 0, 370, 500);
    }

    public void createPossibleOutcomes(){
        List toprow = Arrays.asList(1,2,3);
        List midrow = Arrays.asList(4,5,6);
        List bottomrow = Arrays.asList(7,8,9);
        List colleft = Arrays.asList(1,4,7);
        List colmid = Arrays.asList(2,5,8);
        List colright = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);
        possibleOutcomes.add(toprow);
        possibleOutcomes.add(midrow);
        possibleOutcomes.add(bottomrow);
        possibleOutcomes.add(colleft);
        possibleOutcomes.add(colmid);
        possibleOutcomes.add(colright);
        possibleOutcomes.add(cross1);
        possibleOutcomes.add(cross2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getX() < 170 && e.getY() < 150){
            //Box [0][0]
            if (grids[0][0].getX_or_o() != ' '){return;}

            grids[0][0] = new XO(character);
            if (character == 'X'){
                player1Positions.add(1);
            }else{player2Positions.add(1);}
        }else if (e.getX() < 370 && e.getY() < 150){
            //Box [0][1]
            if (grids[0][1].getX_or_o() != ' '){return;}
            grids[0][1] = new XO(character);
            if (character == 'X'){
                player1Positions.add(2);
            }else{
                player2Positions.add(2);
            }
        }else if (e.getX() < 550 && e.getY() < 150){
            //Box [0][2]
            if (grids[0][2].getX_or_o() != ' '){return;}
            grids[0][2] = new XO(character);
            if (character == 'X'){
                player1Positions.add(3);
            }else{
                player2Positions.add(3);
            }
        }else if (e.getX() < 170 && e.getY() < 310 && e.getY() > 150){
            //Box [1][0]
            if (grids[1][0].getX_or_o() != ' '){return;}
            grids[1][0] = new XO(character);
            if (character == 'X'){
                player1Positions.add(4);
            }else{
                player2Positions.add(4);
            }
        }else if (e.getX() < 370 && e.getY() < 310 && e.getY() > 150){
            //Box [1][1]
            if (grids[1][1].getX_or_o() != ' '){return;}
            grids[1][1] = new XO(character);
            if (character == 'X'){
                player1Positions.add(5);
            }else{
                player2Positions.add(5);
            }
        }else if (e.getX() < 550 && e.getY() < 310 && e.getY() > 150){
            //Box [1][2]
            if (grids[1][2].getX_or_o() != ' '){return;}
            grids[1][2] = new XO(character);
            if (character == 'X'){
                player1Positions.add(6);
            }else{
                player2Positions.add(6);
            }
        }else if (e.getX() < 170 && e.getY() < 500 && e.getY() > 310){
            //Box [2][0]
            if (grids[2][0].getX_or_o() != ' '){return;}
            grids[2][0] = new XO(character);
            if (character == 'X'){
                player1Positions.add(7);
            }else{
                player2Positions.add(7);
            }
        }else if (e.getX() < 370 && e.getY() < 500 && e.getY() > 310){
            //Box [2][1]
            if (grids[2][1].getX_or_o() != ' '){return;}
            grids[2][1] = new XO(character);
            if (character == 'X'){
                player1Positions.add(8);
            }else{
                player2Positions.add(8);
            }
        }else if (e.getX() < 550 && e.getY() < 500 && e.getY() > 310){
            //Box [2][2]
            if (grids[2][2].getX_or_o() != ' '){return;}
            grids[2][2] = new XO(character);
            if (character == 'X'){
                player1Positions.add(9);
            }else{
                player2Positions.add(9);
            }
        }
        character = character == 'X' ? 'O' : 'X';
        repaint();
        checkIfWon();
    }

    public void checkIfWon(){
        for(List l : possibleOutcomes){
            if (player1Positions.containsAll(l)){
                Object[] options = {"Reset", "Luk"};
                int n = JOptionPane.showOptionDialog(this,
                        "Desværre, O tabte! "
                                + "Du kan lukke programmet eller prøve igen.",
                        "X vandt!",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[1]);

                quit = n == 1 ? true : false;
                if (quit){
                    System.exit(0);
                }else{
                    reset();
                }
            }else if (player2Positions.containsAll(l)){
                Object[] options = {"Reset", "Luk"};
                int n = JOptionPane.showOptionDialog(this,
                        "Desværre, X tabte! "
                                + "Du kan lukke programmet eller prøve igen.",
                        "O vandt!",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[1]);

                quit = n == 1 ? true : false;
                if (quit){
                    System.exit(0);
                }else{
                    reset();
                }
            }
        }
    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void reset(){
        grids = new Grids[3][3];
        player1Positions.clear();
        player2Positions.clear();
        gridInitialization();
        repaint();
    }
}
