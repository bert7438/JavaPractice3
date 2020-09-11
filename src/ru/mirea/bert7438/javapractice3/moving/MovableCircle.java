package ru.mirea.bert7438.javapractice3.moving;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){
        center.moveUp();
    }
    public void moveDown(){
        center.moveDown();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}
