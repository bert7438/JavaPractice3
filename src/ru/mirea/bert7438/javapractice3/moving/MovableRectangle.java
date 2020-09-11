package ru.mirea.bert7438.javapractice3.moving;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    private void checkSpeed(){
        if(topLeft.xSpeed != bottomRight.xSpeed)
            bottomRight.xSpeed = topLeft.xSpeed;
        else if(topLeft.ySpeed != bottomRight.ySpeed)
            bottomRight.ySpeed = topLeft.ySpeed;
    }

    @Override
    public void moveUp() {
        checkSpeed();
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        checkSpeed();
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        checkSpeed();
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        checkSpeed();
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
