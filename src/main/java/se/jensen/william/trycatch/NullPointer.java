package se.jensen.william.trycatch;

public class NullPointer {
    public static void main(String[] args) {
        String name = null;

        try{
            name.length();
        } catch (NullPointerException e) {
            System.out.println("ERROR: name can't be null");
        }
    }
}
