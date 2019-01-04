package main.java.bnc;

public class Field {

    private char field[][];

    public Field() {
        this.field = new char[][]{
                {'-', 'a', 'b', 'c', 'd', 'e', 'f', 'j', 'h', 'i', 'k'},
                {'0',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'1',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'2',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'3',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'4',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'5',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'6',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'7',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'8',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'9',' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
    }

    public Field(char mark){
        this.field = new char[] []{
                {'-', 'a', 'b', 'c', 'd', 'e', 'f', 'j', 'h', 'i', 'k'},
                {'0',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'1',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'2',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'3',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'4',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'5',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'6',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'7',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'8',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark},
                {'9',mark, mark, mark, mark, mark, mark, mark, mark, mark, mark}
        };
    }

    public void get_field(byte i, byte j){
        System.out.print((field[i][j]) + " ");
    }

    public int get_length_field(){
        return field.length;
    }

    public void set_mark(byte x, byte y, char mark){
        this.field[x][y] = mark;
    }

}
