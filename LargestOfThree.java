public class LargestOfThree{

public class Main { //File in Main

import java.util.Scanner;

    public class largestOfThree{
        private static Scanner sc;
        public static void main(String[] args)
        {
            int number1, number2; number3;// Integers
            sc = new Scanner(System.in);

            System.out.print(" Enter First Number "); // Output first number
            number1 = sc.nextInt();

            System.out.print(" Enter Second Number "); // Output second
            number2 = sc.nextInt();

            System.out.print(" Enter Third Number "); // Output third
            number1 = sc.nextInt();

            if(number1 > number2) //if statement
            {
                System.out.println("\n The Largest Number = " + number1);
            }
            else if (number2 > number1) // if else statement
            {
                System.out.println("\n The Largest Number = " + number2);

            else if (number3 > number2 > number1) // if else statement
            {
                System.out.println("\n The Largest Number = " + number3);
            }
    }}  //Had a really hard time with this exercise as well, but gave it a shot