public class Field {
    private static final int SIZE = 9;
    private int[][] grid;

    public Field() {
        grid = new int[SIZE][SIZE];
    }

    public boolean placeTile(Tile tile, int row, int col) {
        if (!canPlace(tile, row, col)) return false;

        for (int i = 0; i < tile.getHeight(); i++) {
            for (int j = 0; j < tile.getWidth(); j++) {
                if (tile.shape[i][j] == 1) {
                    grid[row + i][col + j] = 1;
                }
            }
        }

        clearLines();
        return true;
    }

    public boolean canPlace(Tile tile, int row, int col) {
        for (int i = 0; i < tile.getHeight(); i++) {
            for (int j = 0; j < tile.getWidth(); j++) {
                if (tile.shape[i][j] == 1) {
                    if (row + i >= SIZE || col + j >= SIZE || grid[row + i][col + j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void clearLines() {
        // Placeholder: Implement row, column, and 3x3 box clearing logic
    }

    public void print() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] == 1 ? "■ " : ". ");
            }
            System.out.println();
        }
    }
}
