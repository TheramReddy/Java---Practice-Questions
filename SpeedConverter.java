package com.company.Exercise;

public class SpeedConverter {
    public static long toMilesperHour(double kilometreperhour) {

        if(kilometreperhour < 0) {
            return 0;
        }

        return Math.round(kilometreperhour / 1.609);
    }
    public static void printconversion(double kilometreperhour) {
        if (kilometreperhour < 0) {
            System.out.println("Invalid Value");
        }else {
            long milesperhour = toMilesperHour(kilometreperhour);
            System.out.println(kilometreperhour +
                    "km/h= " + milesperhour +
                    "mi/h ");

        }
    }
}
