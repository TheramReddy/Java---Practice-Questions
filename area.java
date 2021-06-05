package Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class area {

    public static void main(String[] args) {

        int radius=0;
        System.out.println("Enter the radius of the circle: ");

        try {
            InputStream in;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //Reads text from char - input stream , and efficient reading of char, arrays, strings and lines.
            radius=Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException ne) {
            System.out.println("Invalid radius value "+ne);
            System.exit(0);
        }
        catch(IOException ioe){
            System.out.println("IO Error "+ioe);
            System.exit(0);
        }

        double area = Math.PI*radius*radius;
        System.out.println("Radius of the circle is "+area);
    }
}
