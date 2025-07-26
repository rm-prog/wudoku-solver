import java.util.List;

abstract class Agent {
    protected Field field;

    public Agent(Field field) {
        this.field = field;
    }

    // Returns a list of placements: [tileIndex, row, col]
    public abstract List<int[]> decideMoves(List<Tile> tiles);
}
