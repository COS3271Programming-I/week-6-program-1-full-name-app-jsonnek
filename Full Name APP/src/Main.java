// Jonathan Sonnek
// 2/27/26
// Full Name App

import java.util.Scanner;
public class Main {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName, middleName, lastName, fullName;
        System.out.println("What is your first name?");
        firstName = userInput.nextLine();
        System.out.println("What is your middle name?");
        middleName = userInput.nextLine();
        System.out.println("What is your last name?");
        lastName = userInput.nextLine();
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Your full name is: " + fullName);
    }
}