package se.jensen.william.trycatch;

import java.io.*;

public class BufferedReaderMain {
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("does not exist.txt"));
            String line = reader.readLine();
            System.out.print("Read: " + line);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        } catch (IOException e) {
            System.out.println("ERROR: I/O Error");
        }
    }
}
