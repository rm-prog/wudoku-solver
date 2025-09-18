import java.util.List;

class PlacementAvailabilityHeuristic implements Heuristic {
    private final List<Tile> allTiles;

    public PlacementAvailabilityHeuristic(List<Tile> allTiles) {
        this.allTiles = allTiles;
    }

    @Override
    public int evaluate(Field field) {
        int count = 0;

        for (Tile tile : allTiles) {
            if (canPlaceAnywhere(tile, field)) {
                count++;
            }
        }

        return count;
    }

    private boolean canPlaceAnywhere(Tile tile, Field field) {
        for (int row = 0; row <= 9 - tile.getHeight(); row++) {
            for (int col = 0; col <= 9 - tile.getWidth(); col++) {
                if (field.canPlace(tile, row, col)) {
                    return true;
                }
            }
        }
        return false;
    }
}

