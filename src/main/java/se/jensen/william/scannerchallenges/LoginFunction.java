package se.jensen.william.scannerchallenges;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class LoginFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        User account1 = new User("Yepod", "SuperHacker2000");

        System.out.println("Username: ");
        String checkUsername = input.nextLine();
        System.out.println("Password: ");
        String checkPassword = input.nextLine();

        if (checkUsername.equals(account1.getUserName()) && checkPassword.equals(account1.getPassword())){
            System.out.println("\nYou are logged in!");
        } else {
            System.out.println("\nWrong username or password!");
        }
    }
}

class User{
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
