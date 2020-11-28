package DayNine;

public class Circle extends Figure{
    double radius;

    public Circle(double radius,String color) {
        super(color);
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return Math.PI * radius * 2;
    }
}
