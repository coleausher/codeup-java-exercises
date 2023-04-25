package Movies;

import util.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);

        Movie[] movies = MoviesArray.findAll();

        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category\n");

        int choice = input.getInt(0, 5, "Enter your choice: ");

        while (choice != 0) {
            switch (choice) {
                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    String category = getCategoryFromChoice(choice);
                    ArrayList<Movie> moviesInCategory = filterMoviesByCategory(movies, category);
                    for (Movie movie : moviesInCategory) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                default:
                    break;
            }

            System.out.println("\nWhat would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category\n");

            choice = input.getInt(0, 5, "Enter your choice: ");
        }
    }

    private static String getCategoryFromChoice(int choice) {
        switch (choice) {
            case 2:
                return "animated";
            case 3:
                return "drama";
            case 4:
                return "horror";
            case 5:
                return "scifi";
            default:
                return "";
        }
    }

    private static ArrayList<Movie> filterMoviesByCategory(Movie[] movies, String category) {
        ArrayList<Movie> moviesInCategory = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                moviesInCategory.add(movie);
            }
        }
        return moviesInCategory;
    }
}
