package com.company;

public class ifelse {
    public static void main(String[] args) {
        boolean gameover =true;
        int score = 500;
        int levelcompleted =5;
        int bonus =100;

        if(gameover ==true){
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("Yor final score is " +finalscore);

        }
        score = 1000;
        levelcompleted = 8;
        bonus =200;
        if(gameover ==true) {
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("Yor second final score is " + finalscore);
        }





    }
}
