package se.jensen.william.trycatch;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;

        do {
            try {
                System.out.println("\nEnter an integer: ");
                String stringNumber = input.nextLine();
                int number = Integer.parseInt(stringNumber);
                System.out.println("Your chosen integer was: " + number);

                if(number == Integer.parseInt(stringNumber))
                    valid = true;

                System.out.println("Press 'Enter' to exit...");
                input.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Need to enter an integer");
            }
        } while (!valid);
    }
}
