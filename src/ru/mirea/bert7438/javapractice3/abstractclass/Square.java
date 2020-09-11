package ru.mirea.bert7438.javapractice3.abstractclass;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square() {
        //квадрат со стороной 1
        super(1,1, "white", false);
    }

    public double getSide(){
        return super.width;
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{side= " + super.getWidth() +", color= " + super.getColor() +
                ", filled= " + super.isFilled() +"}";
    }
}
