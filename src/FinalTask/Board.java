package FinalTask;

//Состояние доски
//Описывает двумерное поле и клетки - есть корабль/нет[i][j][0], ударено/не ударено[i][j][1]
public class Board {
    public int[][][] boardState = new int[10][10][2];

    public Board() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 2; k++) {
                    boardState[i][j][k] = 0;
                }
            }
        }
    }
    //Проверка, подбиты ли все корабли
    public boolean isDefeatBoard() {
        int activeShip = 0;
        int hitShip = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                activeShip += boardState[i][j][0];
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                hitShip += (boardState[i][j][0] * boardState[i][j][1]);
            }
        }
        if(hitShip == activeShip){
            return true;
        }else {
            return false;
        }
    }
}
