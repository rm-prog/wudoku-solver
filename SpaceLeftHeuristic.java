class SpaceLeftHeuristic implements Heuristic {
    public int evaluate(Field field) {
        return field.countEmptyCells();
    }
}
