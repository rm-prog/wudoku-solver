package woodoku.Agents;

import woodoku.Game.Field;
import woodoku.Heuristics.CompoundHeuristic;

public class CompoundAgent extends AbstractBruteForceAgent {
	public CompoundAgent(Field field, CompoundHeuristic compoundHeuristic) {
		super(field, compoundHeuristic);
	}
}
