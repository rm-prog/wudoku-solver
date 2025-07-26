import java.util.List;
import java.util.ArrayList;

abstract class AbstractBruteForceAgent extends Agent {
    protected Heuristic heuristic;

    public AbstractBruteForceAgent(Field field, Heuristic heuristic) {
        super(field);
        this.heuristic = heuristic;
    }

    @Override
    public List<int[]> decideMoves(List<Tile> tiles) {
        List<int[]> bestMoves = null;
        int bestScore = 0;

        List<List<int[]>> allPermutations = generateTilePlacementOrders(tiles);

        for (List<int[]> moveSet : allPermutations) {
			int score = 0;
            Field simulation = field.copy();
            boolean valid = true;

            for (int[] move : moveSet) {
                int index = move[0], row = move[1], col = move[2];
                Tile tile = tiles.get(index);
                if (simulation.canPlace(tile, row, col)) {
                    simulation.placeTile(tile, row, col);
					score += heuristic.evaluate(simulation);
					simulation.clearLines();
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

    protected List<List<int[]>> generateTilePlacementOrders(List<Tile> tiles) {
        List<List<int[]>> result = new ArrayList<>();
        int n = tiles.size();

        for (int i = 0; i < n; i++) {
            Tile ti = tiles.get(i);
            if (ti == null) continue;
            for (int ri = 0; ri <= 9 - ti.getHeight(); ri++) {
                for (int ci = 0; ci <= 9 - ti.getWidth(); ci++) {
                    for (int j = 0; j < n; j++) {
                        if (j == i || tiles.get(j) == null) continue;
                        Tile tj = tiles.get(j);
                        for (int rj = 0; rj <= 9 - tj.getHeight(); rj++) {
                            for (int cj = 0; cj <= 9 - tj.getWidth(); cj++) {
                                for (int k = 0; k < n; k++) {
                                    if (k == i || k == j || tiles.get(k) == null) continue;
                                    Tile tk = tiles.get(k);
                                    for (int rk = 0; rk <= 9 - tk.getHeight(); rk++) {
                                        for (int ck = 0; ck <= 9 - tk.getWidth(); ck++) {
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

