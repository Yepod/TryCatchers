package se.jensen.william.trycatch;

public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] numberArray = {3, 6, 10, 4, 17};

        try {
            for (int i = 0; i < numberArray.length; i++) {
                System.out.println(numberArray[i]);
            }
            System.out.println("\nNow we test the catch");
            System.out.println(numberArray[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: Index is out of bounds");
        }
    }
}