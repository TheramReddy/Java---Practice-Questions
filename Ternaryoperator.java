package com.company;

public class Ternaryoperator {
    public static void main(String[] args) {

        boolean a=false;
        if(a){
            System.out.println("This is not supposed to happen");
        }
        a=true;
        boolean b = a ? true:false;
        if(b){
            System.out.println("Yes");
        }
    }
}
