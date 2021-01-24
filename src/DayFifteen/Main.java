package DayFifteen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/DayFifteen/missing_shoes.txt", true));
        try (Scanner scanner = new Scanner(new File("src/DayFifteen/shoes.csv"));) {
            while (scanner.hasNextLine()) {
                List<String> record = new ArrayList<>();
                record = getRecordFromLine(scanner.nextLine());
                if(Integer.parseInt(record.get(record.size() - 1)) == 0)
                {
                    System.out.println(record);
                    for (String i:record) {
                        writer.write(i);
                        writer.write(";");
                    }
                    writer.write("\n");
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(";");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
