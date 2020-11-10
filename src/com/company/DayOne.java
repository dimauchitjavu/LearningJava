package com.company;

import java.util.Scanner;

public class DayOne {
    static void taskOne() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter task number: ");
        String msg = in.nextLine();
        int task = Integer.parseInt(msg);
        switch (task) {
            case 1:
                int a = 10;
                while(a > 0) {
                    System.out.print("JAVA ");
                    a--;
                }
                break;
            case 2:
                for(int i = 0; i < 10; i++)
                {
                    System.out.print("JAVA ");
                }
                break;
            case 3:
                for(int i = 0; i < 10; i++)
                {
                    System.out.println("JAVA");
                }
                break;
            case 4:
                int year = 1980;
                while(year <= 2020)
                {
                    System.out.printf("Олимпиада %d года\n", year);
                    year += 4;
                }
                break;
            case 5:
                for(year = 1980;year <= 2020;year += 4)
                {
                    System.out.printf("Олимпиада %d года\n", year);
                }
                break;
            case 6:
                Scanner inputLine = new Scanner(System.in);
                System.out.println("Please enter your number: ");
                String number = inputLine.nextLine();
                int outNum = Integer.parseInt(number);
                for(int i = 0; i < 10; i++)
                {
                    System.out.printf("%d x %d = %d\n",outNum,i,outNum*i);
                }
                break;
            default:
                System.out.println("Wrong task!");
                break;
        }
    }
}
