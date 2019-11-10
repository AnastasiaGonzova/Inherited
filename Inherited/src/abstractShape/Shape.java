package abstractShape;

import java.util.Objects;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{ " + "color = " + color + ", filled is " + filled + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return filled == shape.filled &&
                color.equals(shape.color);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31*result + color.hashCode();
        result = 31*result + Boolean.hashCode(filled);
        return result;
    }
}
