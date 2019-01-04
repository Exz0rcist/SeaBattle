package main.java.bnc;

public class Player {
    public char MISSMARK = '-';
    public char HITMARK = 'X';
    public char FOGOFAWRMARK = '0';

    private byte battleship_counter = 1;
    private byte cruiser_counter = 2;
    private byte destroyer_counter = 3;
    private byte torpedoBoat_counter = 4;

    public byte getBattleship_counter() {
        return battleship_counter;
    }

    public byte getCruiser_counter() {
        return cruiser_counter;
    }

    public byte getDestroyer_counter() {
        return destroyer_counter;
    }

    public byte getTorpedoBoat_counter() {
        return torpedoBoat_counter;
    }

    private Field my_field = new Field();
    private Field enemy_field = new Field();



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
