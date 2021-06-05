package Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class perimeter {
    public static void main(String[] args) {
        int radius=0;
        System.out.println("Enter the radius of the circle: ");

        try{
            InputStream in;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            radius = Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException ne){
            System.out.println("Invalid radius value "+ne);
            System.exit(0);
        }
        catch (IOException ioe){
            System.out.println("IOE Error "+ioe);
            System.exit(0);
        }

        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter of the circle is "+perimeter);
    }
}
