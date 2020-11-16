package com.company;

public class DayFive {
    static void taskFive() {
        Car MyCar = new Car();
        MyCar.setColor("red");
        MyCar.setModel("jiguli");
        MyCar.setYear(1986);
        System.out.println("My car is " + MyCar.getColor() + " " + MyCar.getModel() + " and was made in " + MyCar.getYear());
        Motorbike MyMotorbike = new Motorbike(1988,"Blue","Ural");
        System.out.println("My motorbike is " + MyMotorbike.getColor() + " " + MyMotorbike.getModel() + " and was made in " + MyMotorbike.getYearMade());
    }
}
class Car{
    private int yearMade;
    private String color;
    private String model;
    public void setYear(int year){
        yearMade = year;
    }
    public void setColor(String inpColor){
        color = inpColor;
    }
    public void setModel(String inpModel){
        model = inpModel;
    }
    public int getYear(){
        return yearMade;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}
class Motorbike{
    private int yearMade;
    private String color;
    private String model;

    Motorbike(int yearMade, String color, String model) {
        this.yearMade = yearMade;
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYearMade() {
        return yearMade;
    }
}
