package com.company;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DaySix {
    static void taskSix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter task number: ");
        String msg = in.nextLine();
        int task = Integer.parseInt(msg);
        switch (task) {
            case 1:
                CarS MyCar = new CarS();
                MyCar.setColor("red");
                MyCar.setModel("jiguli");
                MyCar.setYear(1986);
                System.out.println("My car is " + MyCar.getColor() + " " + MyCar.getModel() + " and was made in " + MyCar.getYear());
                MyCar.info();
                MotorbikeS MyMotorbike = new MotorbikeS(1988, "Blue", "Ural");
                System.out.println("My motorbike is " + MyMotorbike.getColor() + " " + MyMotorbike.getModel() + " and was made in " + MyMotorbike.getYearMade());
                MyMotorbike.info();
                System.out.println("car is this old: " + MyCar.yearDifference(Calendar.getInstance().get(Calendar.YEAR)));
                System.out.println("motorbike is this old: " + MyMotorbike.yearDifference(Calendar.getInstance().get(Calendar.YEAR)));
                break;
            case 2:
                Airplane MyPlane = new Airplane("Lockheed-Martin",1980,120,900);
                MyPlane.info();
                System.out.println("Please enter task new year made: ");
                int newYear = in.nextInt();
                MyPlane.setYear(newYear);
                System.out.println("Please enter task new length: ");
                double newLength = in.nextDouble();
                MyPlane.setLength(newLength);
                System.out.println("Plane was refueled twice");
                MyPlane.fillUp(20);
                MyPlane.fillUp(65.2);
                MyPlane.info();
                break;
            case 3:
                Teacher Vasilich = new Teacher("Василич","Матеша");
                Student Shket = new Student("Шкет");
                Vasilich.evaluate(Shket);
                break;
        }
    }
}
class CarS{
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
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int year){
        return Math.abs(year-yearMade);
    }
}

class MotorbikeS{
    private int yearMade;
    private String color;
    private String model;

    MotorbikeS(int yearMade, String color, String model) {
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
    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int year){
        return Math.abs(year-yearMade);
    }
}

class Airplane{
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    public void info()
    {
        System.out.println("Изготовитель: " + this.producer +
                " , год выпуска: " + this.year + "  , длина: " + this.length +
                " , вес: "+ this.weight + " , количество топлива в баке: " + this.fuel);
    }
    public void fillUp(double fuel)
    {
        this.fuel += fuel;
    }

}

class Teacher{
    private String name;
    private String subject;

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void evaluate(Student TheStudent){
        String evaluation = "";
        switch(ThreadLocalRandom.current().nextInt(2, 6)){
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + TheStudent.getName() +
                " по предмету " + this.getSubject() + " на оценку " + evaluation + ".");
    }
}
class Student{
    public String getName() {
        return name;
    }

    private String name;
    public Student(String name){
        this.name = name;
    }
}