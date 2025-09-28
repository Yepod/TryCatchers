package se.jensen.william.trycatch;

import java.io.IOException;

public class IOExceptionMain {
    public static void main(String[] args) {
        try {
            notNegative(-1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Code continues");

        // Could use throws in main method or Try Catch.
    }

    public static void notNegative(int a) throws IOException {
        if(a < 0) {
            throw new IOException("The number can't be negative.");
        }
        System.out.println("All good.");
    }
}
