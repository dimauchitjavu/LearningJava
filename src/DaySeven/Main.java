package DaySeven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter task number: ");
        String msg = in.nextLine();
        int task = Integer.parseInt(msg);
        switch (task) {
            case 1:
                Airplane FirstAirplane = new Airplane("Boeing", 2018, 200, 4000);
                Airplane SecondAirplane = new Airplane("Airbus", 2008, 210, 4200);
                Airplane.comparePlanes(FirstAirplane, SecondAirplane);
                break;
            case 2:
                Player Player1 = createPlayer(90);
                Player.info();
                Player Player2 = createPlayer(90);
                Player Player3 = createPlayer(90);
                Player Player4 = createPlayer(90);
                Player Player5 = createPlayer(90);
                Player Player6 = createPlayer(90);
                Player Player7 = createPlayer(90);
                Player.info();
                int i = 90;
                while(i > 0){
                    Player1.run();
                    i--;
                }
                Player.info();
                Player Player8 = createPlayer(90);
                Player.info();
                break;
        }
    }
    private static Player createPlayer(int stamina) {
        Player Player = null;
        try {
            Player = new Player(90);
        } catch (Exception e) {
            System.out.println(e);
        }
        return Player;
    }
}
