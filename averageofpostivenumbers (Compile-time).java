package main;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int inputCount = 0, countPositive = 0;
        double num, sum = 0;
        
        System.out.println("Enter a number: ");
        
        while (inputCount < 10){
            num = sc.nextInt();
            inputCount++;
        
            if (num > 0){
                countPositive++;
                sum += num;
            }
        }
        
        if (countPositive > 0){
            if (countPositive != 1){
                double average = sum/countPositive;
                System.out.println("The sum of all the numbers is " + sum);
                System.out.println("The number of positive numbers is " + countPositive);
                System.out.println("The average of all the numbers is " + average);
            }
            else {
                System.out.println("Please enter 2 or more positive numbers");
            }
        }
        else {
            System.out.println("No positive value found");
        }
    }
}
