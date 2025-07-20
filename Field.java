public class Field {
    private static final int SIZE = 9;
    private static final int BOX_SIZE = SIZE / 3;
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

	public boolean hasValidPlacement(Tile tile) {
		for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (canPlace(tile, row, col)) {
                    return true;
                }
            }
        }
        return false;
	}

    private void clearLines() {
    	boolean[] clearRow = new boolean[SIZE];
        boolean[] clearCol = new boolean[SIZE];
        boolean[][] clearBox = new boolean[BOX_SIZE][BOX_SIZE];

        // Mark full rows and columns
        for (int i = 0; i < SIZE; i++) {
            clearRow[i] = true;
            clearCol[i] = true;
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] == 0) clearRow[i] = false;
                if (grid[j][i] == 0) clearCol[i] = false;
            }
        }

        // Mark full boxes
        for (int boxRow = 0; boxRow < BOX_SIZE; boxRow++) {
            for (int boxCol = 0; boxCol < BOX_SIZE; boxCol++) {
                boolean full = true;
                for (int i = 0; i < BOX_SIZE; i++) {
                    for (int j = 0; j < BOX_SIZE; j++) {
                        if (grid[boxRow * BOX_SIZE + i][boxCol * BOX_SIZE + j] == 0) {
                            full = false;
                            break;
                        }
                    }
                    if (!full) break;
                }
                clearBox[boxRow][boxCol] = full;
            }
        }

        // Clear rows and columns
        for (int i = 0; i < SIZE; i++) {
            if (clearRow[i]) {
                for (int j = 0; j < SIZE; j++) grid[i][j] = 0;
            }
            if (clearCol[i]) {
                for (int j = 0; j < SIZE; j++) grid[j][i] = 0;
            }
        }

        // Clear 3x3 boxes
        for (int boxRow = 0; boxRow < BOX_SIZE; boxRow++) {
            for (int boxCol = 0; boxCol < BOX_SIZE; boxCol++) {
                if (clearBox[boxRow][boxCol]) {
                    for (int i = 0; i < BOX_SIZE; i++) {
                        for (int j = 0; j < BOX_SIZE; j++) {
                            grid[boxRow * BOX_SIZE + i][boxCol * BOX_SIZE + j] = 0;
                        }
                    }
                }
            }
        }
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
