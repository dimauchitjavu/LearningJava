package DayEight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter task number: ");
        String msg = in.nextLine();
        int task = Integer.parseInt(msg);
        switch (task) {
            case 1:
                long startTime = System.nanoTime();
                String UsualString = "";
                for (int i = 0; i <= 20000; i++) {
                    UsualString += (" " + i);
                }

                long endTime = System.nanoTime();

                long duration = (endTime - startTime);
                System.out.println("Время обычного исполнения " + duration);

                startTime = System.nanoTime();
                StringBuilder UnusualString = new StringBuilder();
                for (int i = 0; i <= 20000; i++) {
                    UnusualString.append(" " + i);
                }
                endTime = System.nanoTime();

                duration = (endTime - startTime);
                System.out.println("Время исполнения с StringBuilder  " + duration);
                break;
            case 2:
                Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
                System.out.println(airplane);
                break;
        }
    }
}
