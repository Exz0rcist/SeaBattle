package main.java.bnc;

public class Player {
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

    public Player() {
    }
}
