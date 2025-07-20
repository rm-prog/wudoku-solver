import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Game {
    private Field field;
	private Random random;
	private ArrayList<Tile> allTiles;
	private Scanner scanner;

	public Game() {
		random = new Random();
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

		allTiles = new ArrayList<Tile>(Arrays.asList(tiles));

	}


    public void start() {
        field = new Field();
        field.print();
		ArrayList<Tile> availableTiles = generateTiles();


        // Placeholder: Add game loop and piece input logic here
        System.out.println("Game initialized. Logic pending...");
    
		while (true) {
			field.print();
			printTiles(availableTiles);
			scanner = new Scanner(System.in);			

			if (availableTiles.stream().allMatch(tile -> !field.hasValidPlacement(tile))) {
				System.out.println("None of the tiles has a valid placement.");
				break;
			}

			System.out.println("Choose a tile (0, 1, 2) or type -1 to quit:");
			int tileIndex = scanner.nextInt(); 
			if (tileIndex < 0 || tileIndex >= availableTiles.size() || availableTiles.get(tileIndex) == null) {
                System.out.println("Invalid tile selection. Try again.");
                continue;
            }
			System.out.println("Enter row and column to place tile (e.g., 0 0):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

			Tile tile = availableTiles.get(tileIndex);
			if (field.placeTile(tile, row, col)) {
				System.out.println("Tile placed");
				availableTiles.remove(tileIndex);
				if (availableTiles.size() <= 0) generateTiles(); 
			} else {
				System.out.println("Invalid Placement. Try again.");
			}
		}		
	
	}

	private ArrayList<Tile> generateTiles() {
		Collections.shuffle(allTiles, random);
		ArrayList<Tile> selected = new ArrayList<Tile>();
	
		int index = 0;

		for (; index < allTiles.size(); index++ ) {
			if (field.hasValidPlacement(allTiles.get(index))) {
				selected.add(allTiles.get(index));
				break;
			}			
		}

		while (selected.size() < 3) {
			index++;
			if (index >= allTiles.size()) index = 0;
			selected.add(allTiles.get(index));
		}

		return selected;
	}

	private void printTiles(ArrayList<Tile> tiles) {
		for (int i = 0; i < tiles.size(); i++) {
			Tile t = tiles.get(i);
			System.out.println("Tile " + i + ":");
			for (int[] row : t.shape) {
                for (int cell : row) {
                    System.out.print(cell == 1 ? "■ " : ". ");
                }
                System.out.println();
            }
            System.out.println();
		}
	}
}
