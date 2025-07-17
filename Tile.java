public class Tile {
    public int[][] shape;

    public Tile(int[][] shape) {
        this.shape = shape;
    }

    public int getHeight() {
        return shape.length;
    }

    public int getWidth() {
        return shape[0].length;
    }
} 
