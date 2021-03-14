package com.company;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TheaterApp {
    List<Theater> listTheaters = new ArrayList<>();
    List<Movie> listMovies = new ArrayList<>();
    List<MovieShowing> listShowings = new ArrayList<>();



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
            input.nextLine();
            if (actionNum == 1) {
                System.out.println("List theaters");
                app.listTheaters();
            } else if (actionNum == 2) {
                System.out.println("Add theaters");
                System.out.print("Enter theater name: ");
                String name = input.nextLine();
                app.addTheater(name);
            } else if (actionNum == 3) {
                System.out.println("Remove theaters");
                app.listTheaters();
                System.out.print("Enter theater number: ");
                int theaterIdx = input.nextInt();
                input.nextLine();
                app.removeTheater(theaterIdx);
            } else if (actionNum == 4) {
                System.out.println("List movies");
                app.listMovies();
            } else if (actionNum == 5) {
                System.out.println("Add a movie");
                System.out.print("Enter movie name: ");
                String name = input.nextLine();
                app.addMovie(name);
            } else if (actionNum == 6) {
                System.out.println("Remove movie");
                app.listMovies();
                System.out.print("Enter movie number: ");
                int movieIdx = input.nextInt();
                input.nextLine();
                app.removeMovie(movieIdx);
            } else if (actionNum == 7) {
                System.out.println("List movie showings");
                app.listShowings();
            } else if (actionNum == 8) {
                System.out.println("Add movie showing");
                System.out.print("Enter movie name: ");
                String name = input.nextLine();
                System.out.print("Enter movie date: ");
                String dateTime = input.nextLine();
                app.addShowing(name, dateTime);
            } else if (actionNum == 9) {
                System.out.println("Remove movie showing");
                app.listShowings();
                System.out.print("Enter showing number: ");
                int showingNumber = input.nextInt();
                input.nextLine();
                app.removeShowing(showingNumber);
            } else if (actionNum == 10) {
                System.out.print("Bye!");
                break;
            } else {
                System.out.println("Invalid entry.");
            }
            System.out.println("\n\n\n");
        } while (true);

    }

    private void removeShowing(int showingIdx) {
        listShowings.remove(showingIdx);
    }

    private void addShowing(String showingName, String date) {
        MovieShowing showing = new MovieShowing (showingName, date);
        listShowings.add(showing);
    }

    private void listShowings() {
        for (int i = 0; i < listShowings.size(); i++) {
           MovieShowing d = listShowings.get(i);
           System.out.println(i + " - " + d.movieName + ", " + d.showingDateTime);
       }
    }

    private void removeMovie(int movieIdx) {
        listMovies.remove(movieIdx);
    }

    private void addMovie(String movieName) {
        Movie movie = new Movie(movieName);
        listMovies.add(movie);
    }

    private void listMovies() {
        for (int i = 0; i < listMovies.size(); i++) {
            Movie d = listMovies.get(i);
            System.out.println(i + " - " + d.getName());
        }
    }

    private void removeTheater(int theaterIdx) {
        listTheaters.remove(theaterIdx);
    }

    private void addTheater(String theaterName) {
        Theater theater = new Theater(theaterName);
        listTheaters.add(theater);
    }

    private void listTheaters() {
        for (int i = 0; i < listTheaters.size(); i++) {
            Theater d = listTheaters.get(i);
            System.out.println(i + " - " + d.getName());
        }
    }

}
