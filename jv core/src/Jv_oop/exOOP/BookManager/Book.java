package pra.AdditionalExercise.Ex_OOP.BookManager;

public class Book {
    private String nameOfBook;
    private int price;
    private int publicYear;
    private String author;

    public Book(String nameOfBook, int price, int publicYear, String author) {
        this.nameOfBook = nameOfBook;
        this.price = price;
        this.publicYear = publicYear;
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getPrice() {
        return price;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean compareBook(Book book) {
        if (this.publicYear == book.publicYear) {
            return true;
        }else {
            return false;
        }
    }

    public double afterSell(double x) {
        return this.price + (x - 1/100);
    }
}
