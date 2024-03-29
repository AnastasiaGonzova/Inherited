package movable;

import java.util.Objects;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + "): Speed = (" + xSpeed + ", " + ySpeed + ')';
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRigth() {
        x += xSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovablePoint that = (MovablePoint) o;
        return x == that.x &&
                y == that.y &&
                xSpeed == that.xSpeed &&
                ySpeed == that.ySpeed;
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + Integer.hashCode(x);
        result = 31*result + Integer.hashCode(y);
        result = 31*result + Integer.hashCode(xSpeed);
        result = 31*result + Integer.hashCode(ySpeed);
        return result;
    }
}
