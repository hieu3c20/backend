package Jv_oop.exOOP.CinemaManagerSimple;

public class Test {
    public static void main(String[] args) {
        Premier day1 = new Premier(20, 12, 2002);
        Premier day2 = new Premier(21, 12, 2002);
        Premier day3 = new Premier(22, 12, 2002);

        Label label1 = new Label("HVH", "VN");
        Label label2 = new Label("Ho Van Hieu", "VN");

        Movie movie1 = new Movie("The shutdown", 2020, label1, 20, day1);
        System.out.println(movie1);
    }
}
