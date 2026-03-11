package woodoku.Simulation;

import woodoku.Agents.Agent;
import woodoku.Game.Field;
import woodoku.Game.Tile;
import woodoku.Game.TileFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SimulationRunner {
    private Agent agent;
    private int totalGames;

    public SimulationRunner(Agent agent, int totalGames) {
        this.agent = agent;
        this.totalGames = totalGames;
    }

    public void run() {
        int totalScore = 0;
        int maxScore = 0;
        int roundsPlayed = 0;

        List<Integer> scores = new ArrayList<>();

        for (int game = 1; game <= totalGames; game++) {
            Field field = new Field();
            agent.field = field; 
            int gameScore = 0;
            boolean alive = true;

            while (alive) {
                List<Tile> tiles = TileFactory.generateTiles(field);
                if (tiles.isEmpty()) {
                    break;
                }

                List<int[]> moves = agent.decideMoves(tiles);
                if (moves == null) break;

                for (int[] move : moves) {
                    int index = move[0];
                    int row = move[1];
                    int col = move[2];
                    Tile tile = tiles.get(index);

                    if (field.canPlace(tile, row, col)) {
                        field.placeTile(tile, row, col);
                        int roundScore = field.getScore();
						field.clearLines();
                        gameScore += roundScore;
						gameScore += tile.size();
                    } else {
                        alive = false;
                        break;
                    }
                }
				roundsPlayed++;
				if (moves.size() < 3) break;
            }

            System.out.println("woodoku.Game.Game " + game + " finished with score: " + gameScore);
            scores.add(gameScore);
            totalScore += gameScore;
            maxScore = Math.max(maxScore, gameScore);
        }

        System.out.println("\n=== Simulation Report ===");
        System.out.println("Games played: " + totalGames);
        System.out.println("Average score: " + (totalScore / (double) totalGames));
        System.out.println("Median score: " + computeMedian(scores));
        System.out.println("Max score: " + maxScore);
        System.out.println("Total rounds played: " + roundsPlayed);
    }

    public static void simulateWithVisualization(Agent agent, boolean slowMode) {
        Field field = new Field();
        agent.field = field;
        int score = 0;
        int round = 0;
        boolean alive = true;
        Scanner scanner = new Scanner(System.in);
        while (alive) {
            List<Tile> tiles = TileFactory.generateTiles(field);
            Visualizer.printTiles(tiles);
            if (tiles.isEmpty()) {
                break;
            }
            List<int[]> moves = agent.decideMoves(tiles);
            if (moves == null) break;
            for (int[] move : moves) {
                int index = move[0];
                int row = move[1];
                int col = move[2];
                Tile tile = tiles.get(index);
                if (field.canPlace(tile, row, col))
                {
                    field.placeTile(tile, row, col);
                    int roundScore = field.getScore();
                    field.clearLines();
                    score += roundScore;
                    score += tile.size();
                    Visualizer.printField(field, score, round);
                    System.out.println("Press ENTER to continue;");
                    scanner.nextLine();
                } else {
                    alive = false;
                    break;
                }
            }
            round++;
            if (moves.size() < 3) break;
        }
        scanner.close();
    }

    private double computeMedian(List<Integer> scores) {
        if (scores.isEmpty()) return 0.0;
        List<Integer> sorted = new ArrayList<>(scores);
        Collections.sort(sorted);
        int n = sorted.size();
        if (n % 2 == 1) return sorted.get(n / 2);
        else return (sorted.get(n / 2 - 1) + sorted.get(n / 2)) / 2.0;
    }

}

