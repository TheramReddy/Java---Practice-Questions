package com.company.overload;

public class secondsandminutes {
    public static void main(String[] args) {
        System.out.println(getDuratioonStribg(65,45));
        System.out.println(getDurationString(3945L));

    }
    private static String getDuratioonStribg(long minutes , long seconds ) {
        if((minutes<0) ||(seconds<0) || (seconds>59)) {
            return "Invalid Value" ;
        }
        long hours = minutes / 60 ;
        long remainingminutes = minutes % 60;
        return hours + "h " + remainingminutes + "m " + seconds + "s ";
    }
    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid Value " ;

        }
        long minutes = seconds/60;
        long remainingseconds = seconds%60;

        return getDuratioonStribg(minutes,remainingseconds);
    }

}
