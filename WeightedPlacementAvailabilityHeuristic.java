import java.util.List;

class WeightedPlacementAvailabilityHeuristic implements Heuristic {
    private final List<Tile> allTiles;

    public WeightedPlacementAvailabilityHeuristic(List<Tile> allTiles) {
        this.allTiles = allTiles;
    }

    @Override
    public int evaluate(Field field) {
        float score = 0;

        for (Tile tile : allTiles) {
            score += countPlacements(tile, field) / ((10-tile.getHeight())*(10-tile.getWidth()));
        }

        return Math.round(score);
    }

    private int countPlacements(Tile tile, Field field) {
        int count = 0;
        for (int row = 0; row <= 9 - tile.getHeight(); row++) {
            for (int col = 0; col <= 9 - tile.getWidth(); col++) {
                if (field.canPlace(tile, row, col)) {
                    count++;
                }
            }
        }
        return count;
    }
}

