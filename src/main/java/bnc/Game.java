package main.java.bnc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public static void main(String[] args) {
        Player player = new Player();
        System.out.println(player.getBattleship());
        System.out.println(player.getCruiser());
        System.out.println(player.getDestroyer());
        System.out.println(player.getTorpedo_boat());


//        Field my_field = new Field();
//        Field my_enemy_field = new Field();
        for (byte i = 0; i < 10; i++) {
            for (byte j = 0; j < 10; j++) {
                player.getMy_field().get_field(i,j);
            }
            System.out.print("      ");
            for (byte m = 0; m < 10; m++){
                player.getEnemy_field().get_field(i,m);
            }
            System.out.println();
        }
    }
}
