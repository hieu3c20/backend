package Jv_Collection.Jv_ArrayList.Jv_SchoolManager;

public class Student {
    private int id;
    private String name;
    private double grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, double grade, int feesPaid, int feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
