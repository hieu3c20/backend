package j18_exceptionHandlingAndDebugging.Movie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Store store = new Store();

    public static void main(String[] args) {
        System.out.println("\n********** JAVA VIDEO STORE **********\n");
        store.addMovie(new Movie("The Shawshank redemption", "Blue-Ray", 9.2));
        store.addMovie(new Movie("The Godfather", "Blue-Ray", 9.2));
        store.addMovie(new Movie("The Godfather: Part II", "DVD", 9.2));
        System.out.println(store);

        try {
            loadMovie("movies.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("MOVIE LOADED\n\n");
            System.out.println(store);
            manageMovie();
        }
    }

    public static void loadMovie(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        scanFile.close();
    }

    public static void manageMovie() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nwould you like to\n\ta)purchase\n\tb)rent\n\tc)return");
            String response = scan.nextLine();
            if (!(response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c"))) {
                System.out.println("\nthe input that you provided is not valid. Please try again.");
                continue;
            }

            System.out.print("Enter the name of the movie: ");
            String name = scan.nextLine();
            if (store.getMovie(name) == null) {
                System.out.println("\nthe input that you provided is not valid. Please try again.");
                continue;
            }
            scan.close();
            switch (response) {
                case "a":
                    if (!(store.getMovie(name).isAvailable())) {
                        System.out.println("\nthe movie is not available for purchase. Please try again");
                        continue;
                    }
                    store.action(name, "sell");
                    break;
                case "b":
                    store.action(name, "rent");
                    break;
                case "c":
                    store.action(name, "return");
                    break;
            }
            System.out.println("movie loaded");
            System.out.println(store);
        }
    }
}
