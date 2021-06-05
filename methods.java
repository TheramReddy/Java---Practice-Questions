package com.company;

public class methods {
    public static void main(String[] args) {

        int highscore = caluculatescore(true , 800 , 5 , 100 );
        System.out.println("Yor final score is " +highscore);

        highscore = caluculatescore(true , 1000 , 8 , 200);
        System.out.println("Yor final score is " + highscore);


        ////second method challenge//
        int highscoreposition = calculatehighscoreposition(1000);
        displayHighscoreposition("Nani" , highscoreposition);
        highscoreposition = calculatehighscoreposition(500);
        displayHighscoreposition("bobby" , highscoreposition);
        highscoreposition = calculatehighscoreposition(400);
        displayHighscoreposition("chethan",highscoreposition);
        highscoreposition=calculatehighscoreposition(50);
        displayHighscoreposition("babloo",highscoreposition);




    }

    public static void displayHighscoreposition(String playername , int highscoreposition) {
        System.out.println(playername + " managed to get into position "
        + highscoreposition + " on the high score table");
    }
    public static int calculatehighscoreposition(int playerscore) {
        if (playerscore >= 1000) {
            return 1;

        }else if(playerscore >= 500 && playerscore<1000){
            return 2;
        }else if(playerscore>=100 && playerscore<500){
            return 3;
        }else{
            return 4;
        }
    }

    public static int caluculatescore(boolean gameover , int score , int levelcompleted , int bonus) {


        if(gameover){
            int finalscore = score + (levelcompleted * bonus);
            finalscore +=2000;

            return finalscore;
        }
        return -1;
    }

}
