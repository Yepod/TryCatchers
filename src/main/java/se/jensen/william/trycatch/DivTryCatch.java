package se.jensen.william.trycatch;

import java.util.Scanner;

public class DivTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            int number1 = input.nextInt();

            System.out.println("Enter second number: ");
            int number2 = input.nextInt();

            int divResult = number1/number2;
            System.out.println("The result is: " + divResult);

            } catch (ArithmeticException e) {
            System.out.println("ERROR: Can't divide by zero");
        }
    }
}
