package DayNine;

public class Triangle extends Figure{
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree,String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }


    public double area() {
        double p = (sideOne + sideTwo + sideThree)/2;
        return Math.pow(p*(p - sideOne)*(p - sideTwo)*(p - sideThree), 0.5);
    }

    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
