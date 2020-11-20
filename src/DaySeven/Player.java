package DaySeven;

public class Player {


    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public int getStamina() {
        return stamina;
    }
    public Player(int stamina) throws Exception {
        this.stamina = stamina;
        if(countPlayers < 6) {
            countPlayers++;
        }
        else {
            throw new Exception("Поле заполнено");
        }
    }
    public void run(){
        this.stamina--;
        if(this.stamina == 0){
            countPlayers--;
        }else if(stamina < 0){
            System.out.println("Player can't run!");
        }
    }
    public static void info(){
        if (countPlayers == 0) {
            System.out.println("На поле никого нет");
        }else if(countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест");
        }else {
            System.out.println("На поле нет мест");
        }
    }
}
