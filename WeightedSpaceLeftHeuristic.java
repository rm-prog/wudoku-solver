class WeightedSpaceLeftHeuristic implements Heuristic {
    @Override
    public int evaluate(Field field) {
        int score = 0;
        int center = 4;

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (field.getCell(r, c) == 0) {
                    int dr = r - center;
                    int dc = c - center;
                    double distance = Math.sqrt(dr * dr + dc * dc);
                    score += (int) Math.round(10.0 / (distance + 1));
                }
            }
        }
        return score;
    }
}

