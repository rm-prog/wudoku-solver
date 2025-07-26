import java.util.*;

class RandomAgent extends Agent {
    private Random random = new Random();

    public RandomAgent(Field field) {
        super(field);
    }

    @Override
    public List<int[]> decideMoves(List<Tile> tiles) {
        List<int[]> moves = new ArrayList<>();
        Set<Integer> usedIndices = new HashSet<>();
		Field simulation = field.copy();

        for (int t = 0; t < tiles.size(); t++) {
            Tile tile = tiles.get(t);
            List<int[]> validPositions = new ArrayList<>();

            for (int i = 0; i <= 9 - tile.getHeight(); i++) {
                for (int j = 0; j <= 9 - tile.getWidth(); j++) {
                    if (simulation.canPlace(tile, i, j)) {
                        validPositions.add(new int[] { t, i, j });
                    }
                }
            }

            if (!validPositions.isEmpty()) {
                int[] chosen = validPositions.get(random.nextInt(validPositions.size()));
                moves.add(chosen);
				simulation.placeTile(tile, chosen[1], chosen[2]);
				simulation.clearLines();
                usedIndices.add(t);
            }
        }

        return moves.isEmpty() ? null : moves;
    }
}

