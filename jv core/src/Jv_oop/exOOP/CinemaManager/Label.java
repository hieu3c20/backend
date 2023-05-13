package Jv_oop.CinemaManager;

public class Label {
    private String nameLabel;
    private String national;

    public Label(String nameLabel, String national) {
        this.nameLabel = nameLabel;
        this.national = national;
    }

    public String getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(String nameLabel) {
        this.nameLabel = nameLabel;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }
}
