package j18_exceptionHandlingAndDebugging.Movie;

public class Movie {
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable;

    public Movie(String name, String format, double rating) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name must contain a value");
        }
        if (!(format.equals("DVD") || format.equals("Blue-Ray"))) {
            throw new IllegalArgumentException("format must be DVD or Blue-Ray");
        }
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("invalid rating");
        }
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.sellingPrice = format.equals("Blue-Ray") ? 4.25 : 2.25;
        this.rentalPrice = format.equals("Blue-Ray") ? 1.99 : 0.99;
        this.isAvailable = true;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.sellingPrice = source.sellingPrice;
        this.rentalPrice = source.rentalPrice;
        this.isAvailable = source.isAvailable;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    private void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    private void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name can not be null or blank");
        }
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (!(format.equals("DVD") || format.equals("Blue-Ray"))) {
            throw new IllegalArgumentException("format must be DVD or Blue-Ray");
        }
        setSellingPrice(format.equals("Blue-Ray") ? 4.25 : 2.25);
        setRentalPrice(format.equals("Blue-Ray") ? 1.99 : 0.99);
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("invalid rating");
        }
        this.rating = rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString() {
        return "\tname: " + this.name + "\n" +
                "\tformat: " + this.format + "\n" +
                "\trating: " + this.rating + "\n" +
                "\tselling price: " + this.sellingPrice + "\n" +
                "\trental price: " + this.rentalPrice + "\n" +
                "\tavailability: " + (this.isAvailable ? "in-stock" : "rented") + "\n";
    }
}
