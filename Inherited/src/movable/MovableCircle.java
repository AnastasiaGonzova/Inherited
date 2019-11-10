package movable;

import java.util.Objects;

public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "MovableCircle{ MovablePoint{ (" + center.x + ", " + center.y + "): Speed = ("
                + center.xSpeed + ", " + center.ySpeed + ") }, radius = " + radius + ", center = " + center + " }";
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRigth() {
        center.x += center.xSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovableCircle that = (MovableCircle) o;
        return radius == that.radius &&
                center.equals(that.center);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + Integer.hashCode(radius);
        result = 31*result + center.hashCode();
        return result;
    }
}
