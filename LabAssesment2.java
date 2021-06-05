package Assesments;

import java.util.Scanner;

public class LabAssesment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int numberofpass=0;
        int numberoffail=0;

        while (count<10){
            int order = count+1;
            System.out.println("Enter Results (if pass :1 , fail:2 ) : #" + order );
            boolean isanint =scanner.hasNextInt();

            if (isanint) {
                int number = scanner.nextInt();
                count++;
                if (number==1) {
                    System.out.println("pass");
                    numberofpass=numberofpass+1;

                }
                if (number==2) {
                    System.out.println("fail");
                    numberoffail=numberoffail+1;
                }if(number>2){
                    System.out.println("Invalid Number");
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }
        System.out.println("No of students passed = "+numberofpass + " no of students failed = " +numberoffail );

        scanner.close();
    }
}
