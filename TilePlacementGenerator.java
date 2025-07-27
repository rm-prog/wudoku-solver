import java.util.List;
import java.util.ArrayList;

public class TilePlacementGenerator {

    public static List<List<int[]>> generateValidCombinations(List<Tile> tiles, Field field) {
        List<List<int[]>> results = new ArrayList<>();
        dfs(tiles, field.copy(), new ArrayList<>(), new boolean[tiles.size()], results);
        return results;
    }

    private static void dfs(List<Tile> tiles, Field field,
                            List<int[]> currentMoves, boolean[] usedTiles, List<List<int[]>> results) {

        if (currentMoves.size() == tiles.size()) {
            results.add(new ArrayList<>(currentMoves));
            return;
        }

        for (int t = 0; t < tiles.size(); t++) {
            if (usedTiles[t]) continue;
            Tile tile = tiles.get(t);

            for (int row = 0; row <= 9 - tile.getHeight(); row++) {
                for (int col = 0; col <= 9 - tile.getWidth(); col++) {
                    if (field.canPlace(tile, row, col)) {
                        Field nextField = field.copy();
                        nextField.placeTile(tile, row, col);
                        nextField.clearLines(); // ✅ very important

                        usedTiles[t] = true;
                        currentMoves.add(new int[] { t, row, col });

                        dfs(tiles, nextField, currentMoves, usedTiles, results);

                        usedTiles[t] = false;
                        currentMoves.remove(currentMoves.size() - 1);
                    }
                }
            }
        }
    }
}
