package main.java.bnc;

public class Player {
    public char MISSMARK = '-';
    public char HITMARK = 'X';
    public char FOGOFAWRMARK = '0';

    private byte battleship = 1;
    private byte cruiser = 2;
    private byte destroyer = 3;
    private byte torpedo_boat = 4;

    private Field my_field = new Field();
    private Field enemy_field = new Field();

    public byte getBattleship() {
        return battleship;
    }

    public byte getCruiser() {
        return cruiser;
    }

    public byte getDestroyer() {
        return destroyer;
    }

    public byte getTorpedo_boat() {
        return torpedo_boat;
    }

    public Field getMy_field() {
        return my_field;
    }

    public Field getEnemy_field() {
        return enemy_field;
    }

    public void mark_My_field_miss(byte x, byte y){        this.my_field.set_mark(x, y, MISSMARK);    }
    public void mark_My_field_hit(byte x, byte y){        this.my_field.set_mark(x, y, HITMARK);    }
    public void mark_Enemy_field_miss(byte x, byte y){        this.enemy_field.set_mark(x, y, MISSMARK);    }
    public void mark_Enemy_field_hit(byte x, byte y){        this.enemy_field.set_mark(x, y, HITMARK);    }

    public void setMy_field(Field my_field) {
        this.my_field = my_field;
    }

    public void setEnemy_field(Field enemy_field) {
        this.enemy_field = enemy_field;
    }

    public Player() {
    }
}
