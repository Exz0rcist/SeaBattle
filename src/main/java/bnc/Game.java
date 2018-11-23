package main.java.bnc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public static void main(String[] args) {
        Player player = new Player();
//        System.out.println(player.getBattleship());
//        System.out.println(player.getCruiser());
//        System.out.println(player.getDestroyer());
//        System.out.println(player.getTorpedo_boat());
        int lengthField = player.getMy_field().get_length_field();

        player.mark_My_field_miss((byte)5,(byte)5);
        player.mark_My_field_hit((byte)1,(byte)5);
        player.mark_Enemy_field_hit((byte)1,(byte)5);
        player.mark_Enemy_field_miss((byte)6,(byte)5);



        for (byte i = 0; i < lengthField; i++) {
            for (byte j = 0; j < lengthField; j++) {
                player.getMy_field().get_field(i,j);
            }
            System.out.print("      ");
            for (byte m = 0; m < lengthField; m++){
                player.getEnemy_field().get_field(i,m);
            }
            System.out.println();
        }
    }
}
