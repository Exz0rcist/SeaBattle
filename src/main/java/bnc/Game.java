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


        for (byte i = 0; i < 11; i++) {
            for (byte j = 0; j < 11; j++) {
                player.getMy_field().get_field(i,j);
            }
            System.out.print("      ");
            for (byte m = 0; m < 11; m++){
                player.getEnemy_field().get_field(i,m);
            }
            System.out.println();
        }
    }
}
