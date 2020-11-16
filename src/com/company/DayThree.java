package com.company;

import java.util.Scanner;

public class DayThree {
    static void taskThree() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter task number: ");
        String msg = in.nextLine();
        int task = Integer.parseInt(msg);
        switch (task) {
            case 1:
                String cityName = new String();
                while(!cityName.equals("Stop")) {
                    Scanner inCity = new Scanner(System.in);
                    System.out.println("Please enter city name: ");
                    cityName = inCity.nextLine();
                    switch (cityName) {
                        case "Москва":
                        case "Владивосток":
                        case "Ростов":
                            System.out.println("Россия");
                            break;
                        case "Берлин":
                        case "Мюнхен":
                        case "Кёльн":
                            System.out.println("Германия");
                            break;
                        case "Ливерпуль":
                        case "Манчестер":
                        case "Лондон":
                            System.out.println("Англия");
                            break;
                        case "Милан":
                        case "Рим":
                        case "Турин":
                            System.out.println("Италия");
                            break;
                        case "Stop":
                            break;
                        default:
                            System.out.println("Неизвестная страна");
                            break;
                    }
                }
                break;
            case 2:
                double dNumerator;
                double dDenumenator;
                while(true){
                    Scanner inNumbers = new Scanner(System.in);
                    System.out.println("Please enter two numbers: ");
                    dNumerator = inNumbers.nextDouble();
                    dDenumenator = inNumbers.nextDouble();
                    if(dDenumenator == 0){
                        break;
                    }
                    System.out.println(dNumerator/dDenumenator);
                }
                break;
            case 3:
                double dNumeratorFive;
                double dDenumenatorFive;
                int i = 0;
                while(i < 5){
                    Scanner inNumbersFive = new Scanner(System.in);
                    System.out.println("Please enter two numbers: ");
                    dNumeratorFive = inNumbersFive.nextDouble();
                    dDenumenatorFive = inNumbersFive.nextDouble();
                    if(dDenumenatorFive == 0){
                        System.out.println("Опять на ноль делишь?");
                        continue;
                    }
                    System.out.println(dNumeratorFive/dDenumenatorFive);
                    i++;
                }
                break;
            default:
                break;
        }
    }
}
