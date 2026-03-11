package woodoku.Heuristics;

import woodoku.Game.Field;
import woodoku.Heuristics.Heuristic;

public class ZeroHeuristic implements Heuristic {
	public int evaluate(Field field) {
		return 0;
	}
}
