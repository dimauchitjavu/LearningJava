package DayFourteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static List<Person> parseFileToStringObj(File file) throws FileNotFoundException, IllegalArgumentException{
        List<Person> people = new ArrayList<>();
        String age;
        String name;
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            Scanner reader2 = new Scanner(myReader.nextLine());
            name = reader2.next();
            age = reader2.next();
            if(Integer.parseInt(age) < 0){
                throw new IllegalArgumentException();
            }
            people.add(new Person(name, Integer.parseInt(age)));
        }
        return people;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
