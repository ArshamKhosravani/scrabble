package Scrab;

public class Game {

    public static char[][] cell = new char[15][15];

    public void table(char a[][]) {
        cell = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = ' ';
            }
        }
    }

    public char[][] getTable() {
        return cell;
    }

    public boolean isFull(int x, int y) {

        if (x <= cell.length && x >= 0 && y <= cell[0].length && y >= 0) {

            if (cell[x][y] != ' ')
                return true;
        }
        return false;
    }

    public void putWords(char c, int x, int y) {
        if (!isFull(x, y))
            cell[x][y] = c;
    }


}
