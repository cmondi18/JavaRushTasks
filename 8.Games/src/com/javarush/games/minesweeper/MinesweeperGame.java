package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

import java.util.ArrayList;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private final static String MINE = "\uD83D\uDCA3";
    private final static String FLAG = "\uD83D\uDEA9";
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private int score;

    private void createGame() {

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (getRandomNumber(10) >= 8) {
                    gameField[i][j] = new GameObject(j, i, true);
                    countMinesOnField++;
                }
                else {
                    gameField[i][j] = new GameObject(j, i, false);
                }
                setCellColor(j, i, Color.ORANGE);
                setCellValue(j, i, "");
            }
        }
        countFlags = countMinesOnField;
        countMineNeighbors();
    }

    private ArrayList getNeighbors(GameObject g) {
        ArrayList neighboors = new ArrayList<GameObject>();
        int x = g.x;
        int y = g.y;
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                if ((j != x || i != y) && (j >= 0 && i >= 0 && j < SIDE && i < SIDE))
                neighboors.add(gameField[i][j]);
            }
        }
        return neighboors;
    }

    private void countMineNeighbors() {
        ArrayList<GameObject> currentNeighbors = new ArrayList<>();
        for(int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (!gameField[y][x].isMine) {
                    currentNeighbors = getNeighbors(gameField[y][x]);
                    for (int i = 0; i < currentNeighbors.size(); i++) {
                        if (currentNeighbors.get(i).isMine)
                            gameField[y][x].countMineNeighbors++;
                    }
                }
            }
        }
    }

    private void openTile(int x, int y) {
        if (!isGameStopped && !gameField[y][x].isFlag && !gameField[y][x].isOpen) {
            if (gameField[y][x].isMine) {
                setCellValueEx(x, y, Color.RED, MINE);
                gameField[y][x].isOpen = true;
                gameOver();
            } else {
                if (gameField[y][x].countMineNeighbors == 0) {
                    gameField[y][x].isOpen = true;
                    score = score + 5;
                    setScore(score);
                    setCellValue(x, y, "");
                    setCellColor(x, y, Color.GREEN);
                    countClosedTiles--;
                    if (countClosedTiles == countMinesOnField) win();
                    ArrayList<GameObject> cur = getNeighbors(gameField[y][x]);
                    for (GameObject i : cur) {
                        if (!i.isOpen) {
                            openTile(i.x, i.y);
                        }
                    }
                } else {
                    gameField[y][x].isOpen = true;
                    score = score + 5;
                    setScore(score);
                    countClosedTiles--;
                    if (countClosedTiles == countMinesOnField) win();
                    setCellNumber(x, y, gameField[y][x].countMineNeighbors);
                    setCellColor(x, y, Color.GREEN);
                }
            }
        }
    }

    private void markTile(int x, int y) {
        if (!gameField[y][x].isOpen) {
            if (countFlags == 0 && !gameField[y][x].isFlag) {

            } else if (countFlags > 0 && !gameField[y][x].isFlag) {
                gameField[y][x].isFlag = true;
                countFlags--;
                setCellValue(x, y, FLAG);
                setCellColor(x, y, Color.AQUA);
            } else {
                gameField[y][x].isFlag = false;
                countFlags++;
                setCellValue(x, y, "");
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "GAME OVER", Color.RED, 10);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.WHITE, "YOU WIN!", Color.GREEN, 100);
    }

    private void restart() {
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        countMinesOnField = 0;
        setScore(score);
        createGame();

    }

    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) restart();
        else openTile(x, y);
    }

    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }
}
