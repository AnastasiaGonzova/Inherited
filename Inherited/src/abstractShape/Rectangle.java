package abstractShape;

import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;

    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
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

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{ " + " width = " + width + ", length = " + length + ", color = " + getColor() +
                ", filled is " + isFilled() + " )";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.length, length) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31*result + Double.hashCode(width);
        result = 31*result + Double.hashCode(length);
        return result;
    }
}
