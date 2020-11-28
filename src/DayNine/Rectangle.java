package DayNine;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2*length + 2*width;
    }
}
