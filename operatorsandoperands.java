package com.company;

public class operatorsandoperands {
    public static void main(String[] args) {
        int result = 1+2 ; //1+2 =3
        System.out.println("1+2 =" +result);
        int previousresult = result;
        System.out.println("Previous Result =" +previousresult);
        result = result*10;
        System.out.println("3*10 is =" +result);

        //result = result + 1 ;
        result++; //1+1 =2
        System.out.println("1+1 =" +result);

        result += 2;
        System.out.println(("Ans =" +result));

        result *=10;
        System.out.println("Ans =" + result);

        //result = result - 2
        result -=2;
        System.out.println("Ans =" + result);


    }
}
