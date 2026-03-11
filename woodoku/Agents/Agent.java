package woodoku.Agents;

import woodoku.Game.Field;
import woodoku.Game.Tile;

import java.util.List;

public abstract class Agent {
    public woodoku.Game.Field field;

    public Agent(Field field) {
        this.field = field;
    }

    // Returns a list of placements: [tileIndex, row, col]
    public abstract List<int[]> decideMoves(List<Tile> tiles);
}
