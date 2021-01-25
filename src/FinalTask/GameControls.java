package FinalTask;

import java.io.IOException;
import java.util.Scanner;
/*Класс. отвечающий за управление игрой и её состоянием*/
public class GameControls {
    private Board boardOne;
    private Board boardTwo;
    private int player;

    public GameControls() {
        boardOne = new Board();
        boardTwo = new Board();
        player = 1;
        DrawState();
    }

    public Board getBoard() {
        if(this.player == 1) {
            return boardOne;
        }else {
            return boardTwo;
        }
    }

    //Отрисовка обеих досок в зависиомсти от активного игрока
    public void DrawState(){
        if(player == 1){
            System.out.println("PLAYER ONE LEST GO");
            DrawBoard(boardOne, false);
            DrawBoard(boardTwo, true);
        }
        if(player == 2){
            System.out.println("PLAYER TWO LEST GO");
            DrawBoard(boardOne, true);
            DrawBoard(boardTwo, false);
        }
    }
    //Отрисовка доски. Доска противника показывается только там, где ударено
    public void DrawBoard(Board board, boolean hideMode){
        if(hideMode == true){
            System.out.println("OPPONENT BOARD");
        }
        else {
            System.out.println("MY BOARD");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (hideMode == false){
                    if(board.boardState[i][j][0] == 1 && board.boardState[i][j][1] == 0) {
                        System.out.print("⬛");
                    }
                    else if(board.boardState[i][j][0] == 1 && board.boardState[i][j][1] == 1){
                        System.out.print("X");
                    }
                    else {
                        System.out.print("⬜");
                    }
                }
                if (hideMode == true){
                    if(board.boardState[i][j][0] == 1 && board.boardState[i][j][1] == 1){
                        System.out.print("X");
                    }
                    else if(board.boardState[i][j][0] == 0 && board.boardState[i][j][1] == 1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print("? ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
    //Добавление нового корабля на поле
    public void pushShip(int[][] coordinates){
        if(this.player == 1){
            for (int i = 0; i < coordinates.length; i++) {
                boardOne.boardState[coordinates[i][0]][coordinates[i][1]][0] = 1;
            }
        }
        if(this.player == 2){
            for (int i = 0; i < coordinates.length; i++) {
                boardTwo.boardState[coordinates[i][0]][coordinates[i][1]][0] = 1;
            }
        }
    }
    //Смена игрока
    public void switchPlayer() throws IOException {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        if(player == 1) {
            System.out.println("PLAYER SWITCHED TO TWO. PRESS ENTER");
            System.in.read();
            player = 2;
        }else {
            System.out.println("PLAYER SWITCHED TO ONE. PRESS ENTER");
            System.in.read();
            player = 1;
        }
    }
    //Проверка на наличие победителя
    public boolean haveWinner(){
        if(boardOne.isDefeatBoard() || boardTwo.isDefeatBoard()){
            return true;
        }else {
            return false;
        }
    }
    //Получение координат с клавиатуры
    public static int[][] coordinatesGetter(int squares, GameControls controls){
        boolean correctInput = false;
        int[][] xyCoordinates = new int[squares][2];
        while(!correctInput) {
            System.out.print("Enter your "+ squares +" squares ships coordinates\n" +
                    "Format - ");
            for (int i = 0; i < squares; i++) {
                System.out.print("x" + i + "," + "y" + i + ";");
            }
            System.out.print("\n");
            Scanner in = new Scanner(System.in);
            String msg = in.nextLine();
            String[] coordinates = msg.split("\\;", -1);
            if (coordinates.length != squares){
                System.out.println("Wrong coordinates!");
                continue;
            }
            boolean outSide = false;
            for (int i = 0; i < squares; i++) {
                if(coordinates[i].split("\\,",-1).length !=2){
                    System.out.println("Wrong coordinates!");
                    continue;
                }
                else {
                    if((Integer.parseInt(coordinates[i].split("\\,",-1)[0]) >9) ||
                            (Integer.parseInt(coordinates[i].split("\\,",-1)[0]) < 0 )||
                            (Integer.parseInt(coordinates[i].split("\\,",-1)[1]) >9)||
                            (Integer.parseInt(coordinates[i].split("\\,",-1)[0]) < 0))
                    {
                        outSide = true;
                    }
                    xyCoordinates[i][0] = Integer.parseInt(coordinates[i].split("\\,",-1)[0]);
                    xyCoordinates[i][1] = Integer.parseInt(coordinates[i].split("\\,",-1)[1]);
                }
            }
            if(outSide){
                System.out.print("Ship outside borders!");
                continue;
            }
            boolean yAllign = true;
            boolean xAllign = true;
            int first = xyCoordinates[0][0];
            for(int i = 1; i < squares && xAllign; i++)
            {
                if (xyCoordinates[i][0] != first) xAllign = false;
            }
            first = xyCoordinates[0][1];
            for(int i = 1; i < squares && yAllign; i++)
            {
                if (xyCoordinates[i][1] != first) yAllign = false;
            }
            if(xAllign){
                if (squares > 1) {
                    int direction = xyCoordinates[0][1] - xyCoordinates[1][1];
                    if (Math.abs(direction) == 1) {
                        for (int i = 0; i < squares - 1; i++) {
                            if (xyCoordinates[i+1][1] != (xyCoordinates[i][1] - direction)) {
                                xAllign = false;
                                break;
                            }
                        }
                    }
                    else {
                        xAllign = false;
                    }
                }
            }
            if(yAllign){
                if (squares > 1) {
                    int direction = xyCoordinates[0][0] - xyCoordinates[1][0];
                    if (Math.abs(direction) == 1) {
                        for (int i = 0; i < squares - 1; i++) {
                            if (xyCoordinates[i+1][0] != (xyCoordinates[i][0] - direction)) {
                                yAllign = false;
                                break;
                            }
                        }
                    }
                    else {
                        yAllign = false;
                    }
                }
            }
            if (xAllign || yAllign) {
                System.out.println("OK!");
            }
            else {
                System.out.println("Ship is scuffed!");
                continue;
            }

            Board currentBoard = controls.getBoard();
            boolean occupied = false;
            for (int i = 0; i < squares; i++) {
                for (int j = -1; j < 2; j++) {
                    for (int k = -1; k < 2; k++) {
                        if((j+xyCoordinates[i][0] > 0)&&
                                (j+xyCoordinates[i][0] < 9) && (k + xyCoordinates[i][1] <= 9) && (k+ xyCoordinates[i][1] >= 0)){
                            if(currentBoard.boardState[xyCoordinates[i][0] + j][xyCoordinates[i][1] + k][0] == 1){
                                occupied = true;
                            }
                        }
                    }
                }
            }
            if(occupied){
                System.out.println("Too close to existing ship!");
                continue;
            }
            correctInput = true;
        }
        return xyCoordinates;
    }

    //Ввод координат и провкерка попадания
    public boolean hitShip(){
        boolean correctInput = false;
        int[] xyCoordinates = new int[2];
        Board boardHit;
        if(player == 2){
            boardHit = boardOne;
        }
        else {
            boardHit = boardTwo;
        }
        while(!correctInput) {
            DrawState();
            System.out.println("Enter where you want to hit!");
            Scanner in = new Scanner(System.in);
            String msg = in.nextLine();
            String[] coordinates = msg.split("\\,", -1);
            if (coordinates.length != 2) {
                System.out.println("Wrong coordinates!");
                continue;
            }
            for (int i = 0; i < 2; i++) {
                xyCoordinates[i] = Integer.parseInt(coordinates[i]);
            }
            if(xyCoordinates[0] < 0 || xyCoordinates[0] > 9 || xyCoordinates[1]<0  || xyCoordinates[1]>9){
                System.out.println("Nothing there, buddy!");
                continue;
            }
            if(boardHit.boardState[xyCoordinates[0]][xyCoordinates[1]][1] == 1){
                System.out.println("Already hit here!");
                continue;
            }
            correctInput = true;
        }

        if(boardHit.boardState[xyCoordinates[0]][xyCoordinates[1]][0] == 1){
            boardHit.boardState[xyCoordinates[0]][xyCoordinates[1]][1] = 1;
            System.out.println("Thats a hit!");
            return true;
        }else {
            return false;
        }
    }
    public void showWinner(){
        if(boardOne.isDefeatBoard()){
            System.out.println("PLAYER TWO WON!! CONGRATULATIONS!");
        }
        if (boardTwo.isDefeatBoard()){
            System.out.println("PLAYER TWO LOST! BOOOO!!!");
        }
    }
}
