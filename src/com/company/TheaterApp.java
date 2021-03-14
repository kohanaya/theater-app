package com.company;

import java.util.Scanner;

public class TheaterApp {

    public static void main(String[] args) {
        TheaterApp app = new TheaterApp();

        System.out.println("Welcome to the Theater Application");

        do {
            System.out.println("What would you like to do?");
            System.out.println("1. List theaters");
            System.out.println("2. Add theater");
            System.out.println("3. Remove theater");
            System.out.println("4. List movies");
            System.out.println("5. Add movie");
            System.out.println("6. Remove movie");
            System.out.println("7. List movie showings");
            System.out.println("8. Add movie showing");
            System.out.println("9. Remove movie showing");
            System.out.println("10. Exit");
            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            int actionNum = input.nextInt();
            if (actionNum == 1) {
                System.out.println("List theaters");
            } else if (actionNum == 2) {
                System.out.println("Add theaters");
            } else if (actionNum == 3) {
                System.out.println("Remove theaters");
            } else if (actionNum == 4) {
                System.out.println("List movies");
            } else if (actionNum == 5) {
                System.out.println("Add movie");
            } else if (actionNum == 6) {
                System.out.println("Remove movie");
            } else if (actionNum == 7) {
                System.out.println("List movie showings");
            } else if (actionNum == 8) {
                System.out.println("Add movie showing");
            } else if (actionNum == 9) {
                System.out.println("Remove movie showing");
            } else if (actionNum == 10) {
                System.out.print("Bye!");
                break;
            } else {
                System.out.println("Invalid entry.");
            }
            System.out.println("\n\n\n");
        } while (true);

    }

}
