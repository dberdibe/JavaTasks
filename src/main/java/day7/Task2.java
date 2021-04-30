package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(100-90) + 90;

        Player player1 = new Player(result);
        player1.run();
        Player player2 = new Player(result);
        player2.run();
        Player player3 = new Player(result);
        player3.run();
        Player player4 = new Player(result);
        player4.run();
        Player player5 = new Player(result);
        player5.run();
        Player player6 = new Player(result);
        player6.run();
        //for (int i = 0; i < result; i++) {
        //player6.run();
        //}



        Player player7 = new Player(result);
        player7.run();

        Player.info();
        System.out.println(Player.getCountPlayers());




    }
}
