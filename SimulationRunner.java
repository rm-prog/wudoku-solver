import java.util.List;

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

            System.out.println("Game " + game + " finished with score: " + gameScore);
            totalScore += gameScore;
            maxScore = Math.max(maxScore, gameScore);
        }

        System.out.println("\n=== Simulation Report ===");
        System.out.println("Games played: " + totalGames);
        System.out.println("Average score: " + (totalScore / (double) totalGames));
        System.out.println("Max score: " + maxScore);
        System.out.println("Total rounds played: " + roundsPlayed);
    }
}

