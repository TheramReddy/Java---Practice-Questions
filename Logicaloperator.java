package com.company;

public class Logicaloperator {
    public static void main(String[] args) {
        int topscore = 80;
        if(topscore < 100) {
            System.out.println("You got highest score");
        }
        int secondtopscore = 81;
        if((topscore>secondtopscore) && ( topscore<100)){
            System.out.println("Greater than top score and less than 100");
        }

        if((topscore>90) || (secondtopscore<=90)) {
            System.out.println("Either or both of them conditions are true ");
        }
    }
}
