import java.util.ArrayList;
import java.util.Arrays;

public class TileRepository {

	public static ArrayList<Tile> getAllTiles() {
		Tile[] tiles = new Tile[] {
            new Tile(new int[][] { {1} }),
            new Tile(new int[][] { {1, 1} }),
            new Tile(new int[][] { {1}, {1} }),
            new Tile(new int[][] { {1, 0}, {0, 1} }),
            new Tile(new int[][] { {0, 1}, {1, 0} }),
            new Tile(new int[][] { {1, 1, 1} }),
            new Tile(new int[][] { {1}, {1}, {1} }),
            new Tile(new int[][] { {1, 0}, {1, 1} }),
            new Tile(new int[][] { {0, 1}, {1, 1} }),
            new Tile(new int[][] { {1, 1}, {1, 0} }),
            new Tile(new int[][] { {1, 1}, {0, 1} }),
            new Tile(new int[][] { {1, 0, 0}, {0, 1, 0}, {0, 0, 1} }),
            new Tile(new int[][] { {0, 0, 1}, {0, 1, 0}, {1, 0, 0} }),
            new Tile(new int[][] { {1, 0}, {1, 1}, {1, 0} }),
            new Tile(new int[][] { {0, 1}, {1, 1}, {0, 1} }),
            new Tile(new int[][] { {0, 1, 0}, {1, 1, 1} }),
            new Tile(new int[][] { {1, 1, 1}, {0, 1, 0} }),
            new Tile(new int[][] { {1, 1}, {1, 1} }),
            new Tile(new int[][] { {1, 1, 1, 1} }),
            new Tile(new int[][] { {1}, {1}, {1}, {1} }),
            new Tile(new int[][] { {1, 1}, {1, 0}, {1, 0} }),
            new Tile(new int[][] { {1, 1}, {0, 1}, {0, 1} }),
            new Tile(new int[][] { {1, 0, 0}, {1, 1, 1} }),
            new Tile(new int[][] { {1, 1, 1}, {1, 0, 0} }),
            new Tile(new int[][] { {1, 0}, {1, 0}, {1, 1} }),
            new Tile(new int[][] { {0, 1}, {0, 1}, {1, 1} }),
            new Tile(new int[][] { {1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1} }),
            new Tile(new int[][] { {0,0,0,1}, {0,0,1,0}, {0,1,0,0}, {1,0,0,0} }),
            new Tile(new int[][] { {0, 0, 1}, {1, 1, 1} }),
            new Tile(new int[][] { {1, 1, 1}, {0, 0, 1} }),
            new Tile(new int[][] { {1, 1, 0}, {0, 1, 1} }),
            new Tile(new int[][] { {0, 1, 1}, {1, 1, 0} }),
            new Tile(new int[][] { {0, 1}, {1, 1}, {1, 0} }),
            new Tile(new int[][] { {1, 0}, {1, 1}, {0, 1} }),
            new Tile(new int[][] { {1}, {1}, {1}, {1}, {1} }),
            new Tile(new int[][] { {1, 1, 1, 1, 1} }),
            new Tile(new int[][] { {0, 1, 0}, {1, 1, 1}, {0, 1, 0} }),
            new Tile(new int[][] { {1,0,0,0,0}, {0,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,0}, {0,0,0,0,1 } }),
            new Tile(new int[][] { {0,0,0,0,1}, {0,0,0,1,0}, {0,0,1,0,0}, {0,1,0,0,0}, {1,0,0,0,0} }),
            new Tile(new int[][] { {1, 0, 0}, {1, 1, 1}, {1, 0, 0} }),
            new Tile(new int[][] { {0, 0, 1}, {1, 1, 1}, {0, 0, 1} }),
            new Tile(new int[][] { {0, 1, 0}, {0, 1, 0}, {1, 1, 1} }),
            new Tile(new int[][] { {1, 1, 1}, {0, 1, 0}, {0, 1, 0} }),
            new Tile(new int[][] { {1, 0, 0}, {1, 0, 0}, {1, 1, 1} }),
            new Tile(new int[][] { {0, 0, 1}, {0, 0, 1}, {1, 1, 1} }),
            new Tile(new int[][] { {1, 1, 1}, {1, 0, 0}, {1, 0, 0} }),
            new Tile(new int[][] { {1, 1, 1}, {0, 0, 1}, {0, 0, 1} }),
            new Tile(new int[][] { {1, 0, 1}, {1, 1, 1} }),
            new Tile(new int[][] { {1, 1, 1}, {1, 0, 1} }),
            new Tile(new int[][] { {1, 1}, {1, 0}, {1, 1} }),
            new Tile(new int[][] { {1, 1}, {0, 1}, {1, 1} })
        };

		return new ArrayList<Tile>(Arrays.asList(tiles));

	}

}
