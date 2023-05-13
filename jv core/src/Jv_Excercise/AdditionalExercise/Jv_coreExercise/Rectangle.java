package pra.AdditionalExercise.Ex_OOP;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int areaOfRect() {

        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
