package ru.mirea.bert7438.javapractice3.abstractclass;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        color = "width";
        filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        width = 1;
        length = 2;
        color = "white";
        filled = false;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
