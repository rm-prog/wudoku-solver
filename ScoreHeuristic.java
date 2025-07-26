class ScoreHeuristic implements Heuristic {
    public int evaluate(Field field) {
        return field.getScore();
    }
}
