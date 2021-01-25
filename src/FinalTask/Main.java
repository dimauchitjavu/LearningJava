package FinalTask;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Создание кораблей
        GameControls controls = new GameControls();
        controls.pushShip(controls.coordinatesGetter(4,controls));
        controls.DrawState();
        /*controls.pushShip(controls.coordinatesGetter(3,controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(3, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(2, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(2, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(2, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(1, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(1, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(1, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(1, controls));
        controls.DrawState();
        /*--------*/
        controls.switchPlayer();
        controls.pushShip(controls.coordinatesGetter(4,controls));
        controls.DrawState();
        /*controls.pushShip(controls.coordinatesGetter(3,controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(3, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(2, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(2, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(2, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(1, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(1, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(1, controls));
        controls.DrawState();
        controls.pushShip(controls.coordinatesGetter(1, controls));
        controls.DrawState();*/
        /*------*/
        //Запуск игры
        Random random = new Random();
        if(random.nextBoolean()) {
            controls.switchPlayer();
        }
        while(!controls.haveWinner()){
            if(!controls.hitShip()){
                controls.switchPlayer();
            }
        }
        controls.showWinner();
    }

}
