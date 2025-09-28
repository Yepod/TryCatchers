package se.jensen.william.scannerchallenges;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please enter your profession: ");
        String profession = input.nextLine();

        Person person1 = new Person(name, age, profession);
        person1.personPrint();

        System.out.println("\nIf you have changed profession, please enter new profession: ");
        String newProfession = input.nextLine();
        person1.setProfession(newProfession);
        System.out.println();
        person1.personPrint();

    }
}

    class Person {
        private String name;
        private int age;
        private String profession;

        public Person(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        public void setProfession(String newProfession) {
            this.profession = newProfession;
        }

        public void personPrint() {
            System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nProfession: " + this.profession);
        }
    }


