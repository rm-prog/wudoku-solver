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

	public int size() {
		int size = 0;
		for (int i=0; i < shape.length; i++) {
			for (int j=0; j <shape[i].length; j++) {
				if (shape[i][j] == 1) size++;
			}
		}
		return size;
	}
} 
