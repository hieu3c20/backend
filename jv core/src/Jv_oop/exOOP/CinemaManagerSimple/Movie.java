package Jv_oop.exOOP.CinemaManagerSimple;

public class Movie {
    private String nameOfFilm;
    private int manufacturerYear;
    private Label label;
    private double priceTicket;
    private Premier dayPremier;

    public Movie(String nameOfFilm, int manufacturerYear, Label label, double priceTicket, Premier dayPremier) {
        this.nameOfFilm = nameOfFilm;
        this.manufacturerYear = manufacturerYear;
        this.label = label;
        this.priceTicket = priceTicket;
        this.dayPremier = dayPremier;
    }

    public String getNameOfFilm() {
        return nameOfFilm;
    }

    public void setNameOfFilm(String nameOfFilm) {
        this.nameOfFilm = nameOfFilm;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public void setManufacturerYear(int manufacturerYear) {
        this.manufacturerYear = manufacturerYear;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    public Premier getDayPremier() {
        return dayPremier;
    }

    public void setDayPremier(Premier dayPremier) {
        this.dayPremier = dayPremier;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "nameOfFilm='" + nameOfFilm + '\'' +
                ", manufacturerYear=" + manufacturerYear +
                ", label=" + label +
                ", priceTicket=" + priceTicket +
                ", dayPremier=" + dayPremier +
                '}';
    }
}
