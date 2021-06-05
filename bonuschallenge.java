package com.company.overload;

public class bonuschallenge {
    private static final String Invalid_Value_Message = "Invalid Value";

    public static void main(String[] args) {
        System.out.println(getDuratioonStribg(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-10));


    }
    private static String getDuratioonStribg(long minutes , long seconds ) {
        if((minutes<0) ||(seconds<0) || (seconds>59)) {
            return Invalid_Value_Message ;
        }

        long hours = minutes / 60 ;
        long remainingminutes = minutes % 60;

        String hoursstring = hours + "h ";
        if(hours<10) {
            hoursstring = "0" + hoursstring;
        }

        String minutesstring = remainingminutes + "m ";
        if(remainingminutes<10) {
            minutesstring = "0" + minutesstring;
        }

        String secondsstring = seconds + "s ";
        if(seconds<10) {
            secondsstring = "0" + secondsstring;
        }

        return hoursstring + " " + minutesstring + " " + secondsstring + " ";
    }
    private static String getDurationString(long seconds) {
        if(seconds < 10) {
            return Invalid_Value_Message ;

        }
        long minutes = seconds/60;
        long remainingseconds = seconds%60;

        return getDuratioonStribg(minutes,remainingseconds);
    }

}
