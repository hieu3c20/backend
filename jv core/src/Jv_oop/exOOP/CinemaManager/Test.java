package Jv_oop.CinemaManager;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    static void showMenu() {

    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Movie mv = new Movie();
        ArrayList<Movie> movies = new ArrayList<Movie>();
        mv.loadFromFile();

        while(true) {
            System.out.println("=================== GETTING STARTED ====================");
            System.out.println("______________________Menu Movie _______________________");
            System.out.println("1. Print list film");
            System.out.println("2. Add film");
            System.out.println("3. Edit information of film");
            System.out.println("4. Delete film out of list");
            System.out.println("5. Search name of film");
            System.out.println("6. Sort film descending in price\n");
            System.out.println("0. Save and exist");
            System.out.println("---------------------------------------------------------");
            System.out.print("_  Your option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    PrintWriter pw = new PrintWriter("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_oop\\CinemaManager\\listfilm.txt");
                    pw.println(movies.toString());
                    mv.printmovies(movies);
                    pw.close();
                    break;
                case 2:
                    System.out.print("Enter ID of movie: ");
                    int addId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name of movie: ");
                    String addName = sc.nextLine();
                    System.out.print("Enter manufacture year: ");
                    int addYear = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter label of manufacture: ");
                    String addlabel = sc.nextLine();
                    System.out.print("Enter ticket price: ");
                    double addTicketPrice = sc.nextDouble(); sc.nextLine();
                    System.out.print("Enter premiere day: ");
                    int addPremiere = sc.nextInt(); sc.nextLine();
                    Movie addMovie = new Movie(addId, addName, addYear, addlabel, addTicketPrice, addPremiere);
                    mv.add(addMovie);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
//                bm.saveToFile();
//                System.exit(0);
//                break;
                case 0:
                    mv.loadFromFile();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid ID!");
                    break;
            }
        }
    }
}
