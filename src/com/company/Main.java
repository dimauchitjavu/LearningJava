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
            default:
                System.out.println("Wrong day!");
                break;
        }
    }
}
