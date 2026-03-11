package woodoku.Agents;

import woodoku.Game.Field;
import woodoku.Heuristics.EmptyLinesHeuristic;

public class EmptyLinesAgent extends AbstractBruteForceAgent {
	public EmptyLinesAgent(Field field) {
		super(field, new EmptyLinesHeuristic());
	}
}
