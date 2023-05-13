package Jv_oop.CinemaManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    ArrayList<Movie> movies;

    public Movie() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie(int id, String name, int manufacturerYear, String labelManufacturer, double ticketPrice, int premiereDay) {
        this.id = id;
        this.name = name;
        this.manufacturerYear = manufacturerYear;
        this.labelManufacturer = labelManufacturer;
        this.ticketPrice = ticketPrice;
        this.premiereDay = premiereDay;
    }

    public ArrayList<Movie> getMovies() {
        return this.movies;
    }

    public void loadFromFile() throws FileNotFoundException {
        System.out.println("Loading movie...");
        File filmList = new File("C:\\Users\\ASUS\\Documents\\Jv_Core\\src\\Jv_oop\\CinemaManager\\listfilm.txt");
        Scanner sc = new Scanner(filmList);
        ArrayList<String> lines = new ArrayList<>();
        while(sc.hasNext()) {
            lines.add(sc.next());
        }
        for (String line : lines) {
            if (!line.isEmpty()) {
                int id = Integer.parseInt(line.substring(0, 4).trim());
                String name = line.substring(4, 30).trim();
                int year = Integer.parseInt(line.substring(30, 35).trim());
                String labelManufacturer = line.substring(35, 40).trim();
                double ticketPrice = Double.parseDouble(line.substring(45).trim());
                int premiereDay = Integer.parseInt(line.substring(45).trim());

                Movie loadMovie = new Movie(id, name, year, labelManufacturer, ticketPrice, premiereDay);
                this.movies.add(loadMovie);
            }
        }
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    private int id;
    private String name;
    private int manufacturerYear;
    private String labelManufacturer;
    private double ticketPrice;
    private int premiereDay;

    public Movie(String name, int manufacturerYear, String labelManufacturer, double ticketPrice, int premiereDay) {
        this.name = name;
        this.manufacturerYear = manufacturerYear;
        this.labelManufacturer = labelManufacturer;
        this.ticketPrice = ticketPrice;
        this.premiereDay = premiereDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(int manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }

    public String getLabelManufacturer() {
        return labelManufacturer;
    }

    public void setLabelManufacturer(String labelManufacturer) {
        this.labelManufacturer = labelManufacturer;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getPremiereDay() {
        return premiereDay;
    }

    public void setPremiereDay(int premiereDay) {
        this.premiereDay = premiereDay;
    }

    public void printmovies(ArrayList<Movie> movies) {
        if (movies.size() == 0) {
            System.out.println("Current list is empty");
        }else {
            System.out.printf("%-4s %-30s %-35s %-40s %-45s %-50s %n", "ID", "Name", "Manufacture year", "Label enterprise", "Ticket price", "Premiere day");
            for (Movie movie : movies) {
                System.out.println(movie.toString());
            }
        }
    }

//    public boolean add(Book book) {
//        boolean duplicated = false;
//        for (Book value : this.books) {
//            if (value.getId() == book.getId()) {
//                System.out.println("Duplicated ID!");
//                duplicated = true;
//                return false;
//            }
//        }
//        if (!duplicated) {
//            System.out.println("Added successfully.");
//            return this.books.add(book);
//        }
//        return false;
//    }

    public boolean add(Movie movie) {
        boolean duplicated = false;
        for (Movie value : this.movies) {
            if (value.getId() == movie.getId()) {
                System.out.println("Duplicated ID!");
                duplicated = true;
                return false;
            }
        }
        if (!duplicated) {
            System.out.println("Added successfully");
            return this.movies.add(movie);
        }
        return false;
    }

//    private int id;
//    private String name;
//    private int manufacturerYear;
//    private String labelManufacturer;
//    private double ticketPrice;
//    private int premiereDay;

    //    public String toString() {
//        return String.format("%5d %-45s %10.2f", id, name, price);
//    }

//    "%-4s %-30s %-35s %-40s %-45s %n
    @Override
    public String toString() {
        return String.format("%4d %-30s %35d %-40s %45f %50f", id, name, manufacturerYear, labelManufacturer, ticketPrice, premiereDay);
    }

//    public void saveToFile() throws FileNotFoundException {
//        PrintWriter pw = new PrintWriter("books.txt");
//        for (int i = 0; i < this.books.size(); i++) {
//            pw.println(this.books.get(i).toString());
//        }
//        System.out.println("Saving to file...");
//        System.out.println("Bye!");
//        pw.close();
//    }
    public void saveToFile() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("listfilm.txt");
        for (int i = 0; i < this.movies.size(); i++) {
            pw.println(this.movies.get(i).toString());
        }
        System.out.println("Saving to file...");
        System.out.println("Bye!");
        pw.flush();
        pw.close();
    }
}
