package com.company;

public class operatorprecedence {
    public static void main(String[] args) {
        double firstvalue =20.00d;
        double secondvalue = 80.00d;
        double myvaluestotal = (firstvalue + secondvalue )*100.00d;
        System.out.println("MytotalValues = " +myvaluestotal);
        double theremainder = myvaluestotal % 40.00d;
        System.out.println("The Reaminder =" +theremainder);
        boolean isNoRemainder = (theremainder == 0 ) ? true:false;
        System.out.println("is no remainder = "+isNoRemainder);
        if(!isNoRemainder){
            System.out.println("got some remainder");
        }

    }

}
