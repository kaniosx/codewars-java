package codewars.kaniosx;

import java.util.*;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1 == p2) return "Draw!";

        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("scissorspaper", "Player 1 won!");
        hm.put("scissorsrock", "Player 2 won!");
        hm.put("paperrock", "Player 1 won!");
        hm.put("paperscissors", "Player 2 won!");
        hm.put("rockscissors", "Player 1 won!");
        hm.put("rockpaper", "Player 2 won!");

        return hm.get(p1 + p2);
    }
}