import java.util.List;
import java.util.ArrayList;

abstract class AbstractBruteForceAgent extends Agent {
    protected Heuristic heuristic;
	//protected List<List<int[]>> allPermutations = generateTilePlacementOrders(3);

    public AbstractBruteForceAgent(Field field, Heuristic heuristic) {
        super(field);
        this.heuristic = heuristic;
    }

    @Override
    public List<int[]> decideMoves(List<Tile> tiles) {
        List<int[]> bestMoves = null;
        int bestScore = 0;

		List<List<int[]>> validPermutations = TilePlacementGenerator.generateValidCombinations(tiles, field);

        for (List<int[]> moveSet : validPermutations) {
			int score = 0;
            Field simulation = field.copy();
            boolean valid = true;

            for (int[] move : moveSet) {
                int index = move[0], row = move[1], col = move[2];
                Tile tile = tiles.get(index);
                if (simulation.canPlace(tile, row, col)) {
                    simulation.placeTile(tile, row, col);
					score += simulation.getScore();
					simulation.clearLines();
					score += heuristic.evaluate(simulation);
                } else {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                if (score >= bestScore) {
                    bestScore = score;
                    bestMoves = moveSet;
                }
            }
        }

        return bestMoves;
    }

    protected List<List<int[]>> generateTilePlacementOrders(int numberOfTiles) {
        List<List<int[]>> result = new ArrayList<>();

        for (int i = 0; i < numberOfTiles; i++) {
            for (int ri = 0; ri <= 8; ri++) {
                for (int ci = 0; ci <= 8; ci++) {
                    for (int j = 0; j < numberOfTiles; j++) {
                        if (j == i) continue;
                        for (int rj = 0; rj <= 8; rj++) {
                            for (int cj = 0; cj <= 8; cj++) {
                                for (int k = 0; k < numberOfTiles; k++) {
                                    if (k == i || k == j) continue;
                                    for (int rk = 0; rk <= 8; rk++) {
                                        for (int ck = 0; ck <= 8; ck++) {
                                            List<int[]> moves = new ArrayList<>();
                                            moves.add(new int[] { i, ri, ci });
                                            moves.add(new int[] { j, rj, cj });
                                            moves.add(new int[] { k, rk, ck });
                                            result.add(moves);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}

