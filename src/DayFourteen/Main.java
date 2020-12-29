package DayFourteen;

import DayNine.Figure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/DayFourteen/numbers.txt");
            printSumDigits(myObj);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        try {
            File myObj = new File("src/DayFourteen/people.txt");
            System.out.println(parseFileToStringList(myObj));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        try {
            File myObj = new File("src/DayFourteen/people.txt");
            System.out.println(Person.parseFileToStringObj(myObj));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }

    }
    public static void  printSumDigits(File file) throws FileNotFoundException {
        Scanner myReader = new Scanner(file);
        int sum = 0;
        while (myReader.hasNextLine()) {
            sum += Integer.parseInt(myReader.nextLine());
        }
        myReader.close();
        System.out.println(sum);
    }
    public static List<String> parseFileToStringList(File file) throws FileNotFoundException, IllegalArgumentException{
        List<String> names = new ArrayList<>();
        String age;

        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            Scanner reader2 = new Scanner(myReader.nextLine());
            names.add(reader2.next());
            age = reader2.next();
            if(Integer.parseInt(age) < 0){
                throw new IllegalArgumentException();
            }
            names.add(age);
        }
        return names;
    }
}

