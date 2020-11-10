package Scrab;

public class Tile {
    private long id;
    Character Tname;
    long score;

    public int wordValue(char c) {//todo add value of cells

        int value = 0;

        switch (c) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'l':
            case 'n':
            case 's':
            case 't':
            case 'r':
                value = 1;
                break;

            case 'd':
            case 'g':
                value = 2;
                break;

            case 'c':
            case 'b':
            case 'm':
            case 'p':
                value = 3;
                break;

            case 'f':
            case 'h':
            case 'v':
            case 'w':
                value = 4;
                break;

            case 'k':
                value = 5;
                break;

            case 'j':
            case 'x':
                value = 8;
                break;

            case 'q':
            case 'z':
                value = 10;
                break;

            default:
                value = 0;
        }
        return value;
    }

    public int getScore(char[] chars) {//I will add dictionary and make changes
        int score = 0;
        //todo use dictionary here and ckeck if word has meaning + table cells score
        for (int i = 0; i < chars.length; i++) {
            score += wordValue(chars[i]);
        }
        return score;
    }
}
