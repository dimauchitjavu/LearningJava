package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please entter day: ");
        String msg = in.nextLine();
        int day = Integer.valueOf(msg);
        switch (day) {
            case 1:
                DayOne.taskOne();
                break;
            case 2:
                DayTwo.taskTwo();
                break;
            case 3:
                DayThree.taskThree();
                break;
            case 4:
                DayFour.taskFour();
                break;
            case 5:
                DayFive.taskFive();
                break;
            default:
                System.out.println("Wrong day!");
                break;
        }
    }
}
