package DaySixteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void printResult (File file) throws FileNotFoundException {
        Scanner myReader = new Scanner(file);
        int sum = 0;
        int iterations = 0;
        while (myReader.hasNextLine()) {
            sum += Integer.parseInt(myReader.nextLine());
            iterations++;
        }
        double average = (double)sum/iterations;
        myReader.close();
        System.out.println(average);
    }
}
