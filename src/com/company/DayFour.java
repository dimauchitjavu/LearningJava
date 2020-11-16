package com.company;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DayFour {
    static void taskFour() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter task number: ");
        String msg = in.nextLine();
        int task = Integer.parseInt(msg);
        switch (task) {
            case 1:
                Scanner intScan = new Scanner(System.in);
                System.out.println("Please enter length of array: ");
                int n = intScan.nextInt();
                int[] randArray = new int[n];
                System.out.println("Cоздан массив");
                int nOnes = 0;
                int nMoreThanEight = 0;
                int nEven = 0;
                int nUneven = 0;
                for(int i = 0;i < n;i++){
                    randArray[i] = ThreadLocalRandom.current().nextInt(0, 11);
                    System.out.print(randArray[i] + " ");
                    if(randArray[i] == 1){
                        nOnes++;
                    }else if(randArray[i] > 8){
                        nMoreThanEight++;
                    }
                    if(randArray[i]%2 == 0){
                        nEven++;
                    }else{
                        nUneven++;
                    }
                }

                System.out.println("\nКоличество чисел больше 8: " + nMoreThanEight);
                System.out.println("Количество чисел равных 1: " + nOnes);
                System.out.println("Количество четных чисел: " + nEven);
                System.out.println("Количество нечетных чисел: " + nUneven);
                System.out.println("Сумма всех элементов массива: " + IntStream.of(randArray).sum());
                break;
            case 2:
                int[] randArrayHundred = new int[100];
                for(int i = 0;i < 100;i++) {
                    randArrayHundred[i] = ThreadLocalRandom.current().nextInt(0, 1001);
                }
                int nZeroSum = 0;
                int nZeroNum = 0;
                int hundredMin = 1001;
                int hundredMax = 0;
                for (int i:
                     randArrayHundred) {
                    if(i%10 == 0){
                        nZeroNum++;
                        nZeroSum+=i;
                    }
                    if (hundredMax < i){
                        hundredMax = i;
                    }
                    if(hundredMin > i){
                        hundredMin = i;
                    }
                }
                System.out.println("Количество чисел кратных 10: " + nZeroNum);
                System.out.println("Сумма  чисел кратных 10: " + nZeroSum);
                System.out.println("Максимум: " + hundredMax);
                System.out.println("Минимум: " + hundredMin);
                break;
            case 3:
                int[][] twoDMass = new int[12][8];
                for (int i = 0; i < 12; i++) {
                    for (int j = 0; j < 8; j++) {
                        twoDMass[i][j] = ThreadLocalRandom.current().nextInt(0, 51);
                        System.out.print(twoDMass[i][j] + " ");
                    }
                    System.out.println();
                }
                int max = 0;
                for (int[] line: twoDMass) {
                    if(IntStream.of(line).sum() > max){
                        max = IntStream.of(line).sum();
                    }
                }
                System.out.println("Max " + max);
                break;
            case 4:
                int[] triples = new int[100];
                for (int j = 0; j < 100; j++) {
                    triples[j] = ThreadLocalRandom.current().nextInt(0, 10001);
                    System.out.print(triples[j] + " ");
                }
                int[] triplesSum = new int[100];
                int arrMax = 0;
                int arrMaxInd = 0;
                for (int j = 1; j < 99; j++) {
                    triplesSum[j] = triples[j - 1] + triples[j] + triples[j + 1];
                    if(arrMax < triplesSum[j]){
                        arrMax = triplesSum[j];
                        arrMaxInd = j-1;
                    }
                }
                System.out.println();
                System.out.println("Максимум: " + arrMax);
                System.out.println("Индекс максимума: " + arrMaxInd);
                break;
            default:
                System.out.println("Wrong task!");
                break;
        }
    }
}
