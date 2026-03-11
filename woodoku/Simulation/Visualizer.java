package woodoku.Simulation;

import woodoku.Game.Field;
import woodoku.Game.Tile;

import java.util.List;

public class Visualizer {

    public static void printField(Field field, int score, int round) {
        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.printf("║  Round: %-3d   |   Score: %-5d                     ║\n", round, score);
        System.out.println("╚════════════════════════════════════════════════════╝");

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("   +---------+---------+-");
            System.out.print("   |");

            for (int j = 0; j < 9; j++) {
                boolean filled = field.getCell(i, j) == 1;
                String cell = filled ? "██" : "  ";
                System.out.print(cell);

                if ((j + 1) % 3 == 0) System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("   +---------+---------+-");
    }

    public static void printTiles(List<Tile> tiles) {
        System.out.println("\nAvailable tiles:");
        for (int t = 0; t < tiles.size(); t++) {
            System.out.println("woodoku.Game.Tile " + (t + 1) + ":");
            printTile(tiles.get(t));
            System.out.println();
        }
    }

    private static void printTile(Tile tile) {
        for (int i = 0; i < tile.getHeight(); i++) {
            System.out.print("   ");
            for (int j = 0; j < tile.getWidth(); j++) {
                System.out.print(tile.shape[i][j] == 1 ? "██" : "  ");
            }
            System.out.println();
        }
    }
}

