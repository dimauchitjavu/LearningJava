package DayNine;

public class Main {
    public static void main(String[] args) {
        //1
        Student studentOne = new Student("Иван","Первая");
        Teacher teacherOne = new Teacher("Иванов","Иванология");
        System.out.println(studentOne.getGroupName());
        System.out.println(teacherOne.getSubject());
        studentOne.printInfo();
        teacherOne.printInfo();

        //2
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double perimeter = 0;
        for (Figure i:figures) {
            if(i.color == "Red"){
                perimeter += i.perimeter();
            }
        }
        return perimeter;
    }
    public static double calculateRedArea(Figure[] figures){
        double area = 0;
        for (Figure i:figures) {
            if(i.color == "Red"){
                area += i.area();
            }
        }
        return area;
    }
}
    
