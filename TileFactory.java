import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TileFactory {

	private static Random random = new Random();

	private static List<Tile> ALL_TILES = TileRepository.getAllTiles();

	public static List<Tile> generateTiles(Field field) {
		Collections.shuffle(ALL_TILES, random);
		ArrayList<Tile> selected = new ArrayList<Tile>();
	
		int index = 0;

		for (; index < ALL_TILES.size(); index++ ) {
			if (field.hasValidPlacement(ALL_TILES.get(index))) {
				selected.add(ALL_TILES.get(index));
				break;
			}			
		}

		while (selected.size() < 3) {
			index++;
			if (index >= ALL_TILES.size()) index = 0;
			selected.add(ALL_TILES.get(index));
		}

		return selected;

	} 

}
