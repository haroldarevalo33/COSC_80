package lowest;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;

        System.out.println("Enter the first number (x): ");
        x = sc.nextDouble();

        System.out.println("Enter the second number (y): ");
        y = sc.nextDouble();

        System.out.println("Enter the third number (z): ");
        z = sc.nextDouble();
        
        double lowest = 0;
        
        if (x == y && y == z) {
            System.out.println("The value of all the numbers are the same.");
        } 
        else if (x < y && x < z) {
            lowest = x;
        } 
        else if (y < x && y < z) {
            lowest = y;
        } else {
            lowest = z;
        }   
        System.out.println("The lowest number from " + x + ", " + y + " and " + z + " is " + lowest);
    }
}

