package io.turntabl.ttlabs.tennis;

import java.util.Map;
public class Tennis {
    private static final Map<Integer, String> SCORE_MAPPINGS = Map.of(0, "0", 1, "15", 2, "30", 3, "40");
    public static String toStringScore(Player player, String score) {
        return String.format("Tennis.Player(name=%s, score=%s)", player.getName(), score);
    }

    public static String computeScore(Player player, Player otherPlayer) {
        // Lookup Score
        var score = SCORE_MAPPINGS.get(player.getPoint());

        // Return Score From HashMap
        if (score != null)
            return score;

        var difference = player.getPoint() - otherPlayer.getPoint();

        if (difference < 0)
            score = "40";

        if (difference == 0)
            score = "Deuce";

        if (difference == 1)
            score = "Advantage";

        if (difference >= 2)
            score = "Win";

        return score;
    }

}
