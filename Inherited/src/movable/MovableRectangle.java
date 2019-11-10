package movable;

import java.util.Objects;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int xSpeed, int ySpeed, int x2, int y2) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{ topLeft = { (" + topLeft.x + ", " + topLeft.y + ") }, bottomRight = { ("
        + bottomRight.x + ", " + bottomRight.y + ") }, Speed = { " + topLeft.xSpeed + ", "
                + bottomRight.ySpeed + " }";

    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRigth() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovableRectangle that = (MovableRectangle) o;
        return topLeft.equals(that.topLeft) &&
                bottomRight.equals(that.bottomRight);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + topLeft.hashCode();
        result = 31*result + bottomRight.hashCode();
        return result;
    }
}
