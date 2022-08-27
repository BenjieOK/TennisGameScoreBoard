package io.turntabl.ttlabs.tennis;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create Players
        var player1 = new Player("Judah");
        var player2 = new Player("Benjamin");

        // End Of Game
        var endOfGame = false;

        while (!endOfGame) {
            // End Of Round Prompt
            System.out.println("Who won?\n[1] Player 1\n[2] Player 2\nEnter 1 or 2");
            var input = new Scanner(System.in).nextInt();

            // Winner
            Player Winner = input == 1 ? player1 : player2;

            // Increment Point
            Winner.setPoint(Winner.getPoint() + 1);

            // Compute Scores
            var player1Score = Tennis.computeScore(player1, player2);
            var player2Score = Tennis.computeScore(player2, player1);

            // Flag End Of Game
            endOfGame = player1Score == "Win" || player2Score == "Win";

            // Print Results
            System.out.println(Tennis.toStringScore(player1, player1Score));
            System.out.println(Tennis.toStringScore(player2, player2Score));
        }
    }
}