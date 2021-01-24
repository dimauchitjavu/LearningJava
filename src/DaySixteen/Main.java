package DaySixteen;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws IOException {
        File myObj = new File("src/DayFourteen/numbers.txt");
        Task1.printResult(myObj);
        int randArray[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
            randArray[i] = ThreadLocalRandom.current().nextInt(0, 101);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/DaySixteen/file1.txt", true));
        for (int i = 0; i < 1000; i++) {
            writer.write(String.valueOf(randArray[i]));
            writer.write("\n");
        }
        writer.close();
        BufferedWriter writerTwo = new BufferedWriter(new FileWriter("src/DaySixteen/file2.txt", true));
        for (int i = 1; i < 50; i++) {
            double sum = randArray[0];
            for (int j = 1; j < 20; j++) {
                sum += (double)randArray[j*(i+1)];
            }
            writerTwo.write(String.valueOf(sum/20));
            writerTwo.write("\n");
        }
        writerTwo.close();
        try {
            File myObject = new File("src/DaySixteen/file2.txt");
            printSumDigits(myObject);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
    public static void  printSumDigits(File file) throws FileNotFoundException {
        Scanner myReader = new Scanner(file);
        int sum = 0;
        while (myReader.hasNextDouble()) {
            sum += (int)myReader.nextDouble();
        }
        myReader.close();
        System.out.println("Сумма");
        System.out.println(sum);
    }
}
