package main.java.bnc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) {
        Field my_field = new Field();
        Field my_enemy_field = new Field();
        for (byte i = 0; i < 10; i++) {
            for (byte j = 0; j < 10; j++) {
                my_field.get_field(i,j);
            }
            System.out.print("      ");
            for (byte m = 0; m < 10; m++){
                my_enemy_field.get_field(i,m);
            }
            System.out.println();
        }
    }
}
