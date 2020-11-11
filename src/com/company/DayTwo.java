package com.company;

import java.util.Scanner;

public class DayTwo {
    static void taskTwo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter task number: ");
        String msg = in.nextLine();
        int task = Integer.parseInt(msg);
        switch (task) {
            case 1:
                Scanner inp = new Scanner(System.in);
                System.out.println("Please enter floor number: ");
                int floorNum = inp.nextInt();
                if(floorNum < 1){
                    System.out.println("Ошибка ввода");
                }
                else if(floorNum < 5){
                   System.out.println("Малоэтажный дом");
                }
                else if(floorNum < 9){
                    System.out.println("Среднеэтажный дом");
                }
                else{
                    System.out.println("Многоэтажный дом");
                }

                break;
            case 2:
                Scanner scImp = new Scanner(System.in);
                System.out.println("Please enter two numbers: ");
                int firstNum = scImp.nextInt();
                int secNum = scImp.nextInt();
                if(secNum < firstNum){
                    System.out.println("Ошибка ввода");
                }
                int firstRes;
                if(firstNum % 10 >= 5){
                    firstRes = firstNum + (10-(firstNum % 10)) + 5;
                }else{
                    firstRes = firstNum - (firstNum % 10) + 5;
                }
                for (int i = firstRes;i < secNum; i+=10){
                    System.out.println(i);
                }
                break;
            case 3:
                Scanner scImpW = new Scanner(System.in);
                System.out.println("Please enter two numbers: ");
                int firstNumW = scImpW.nextInt();
                int secNumW = scImpW.nextInt();
                if(secNumW < firstNumW){
                    System.out.println("Ошибка ввода");
                }
                int firstResW;
                if(firstNumW % 10 >= 5){
                    firstResW = firstNumW + (10-(firstNumW % 10)) + 5;
                }else{
                    firstResW = firstNumW - (firstNumW % 10) + 5;
                }
                int i = firstResW;
                while(i < secNumW){
                    System.out.println(i);
                    i += 10;
                }
                break;
            case 4:
                Scanner scImpX = new Scanner(System.in);
                System.out.println("Please enter X: ");
                double x = scImpX.nextDouble();
                double y;
                if(x <= -3) y = 420;
                else if(x < 5) y = (x+3)*(x*x - 2);
                else y = (x*x -10)/(x+7);
                System.out.println(y);
                break;
            default:
                System.out.println("Wrong task!");
                break;
        }
    }
}
