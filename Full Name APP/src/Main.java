// Jonathan Sonnek
// 2/27/26
// Full Name App

import java.util.Scanner;
public class Main {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        System.out.println("What is your first name?");
        name.append(userInput.nextLine());
        System.out.println("What is your middle name?");
        name.append(userInput.nextLine());
        System.out.println("What is your last name?");
        name.append(userInput.nextLine());
        System.out.println("Your full name is: " + name.toString());
    }
}