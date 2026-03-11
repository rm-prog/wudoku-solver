package woodoku.Heuristics;

import woodoku.Game.Field;
import woodoku.Heuristics.Heuristic;

public class ScoreHeuristic implements Heuristic {
    public int evaluate(Field field) {
        return field.getScore();
    }
}
