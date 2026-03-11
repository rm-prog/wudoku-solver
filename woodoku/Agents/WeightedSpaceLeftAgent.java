package woodoku.Agents;

import woodoku.Game.Field;
import woodoku.Heuristics.WeightedSpaceLeftHeuristic;

public class WeightedSpaceLeftAgent extends AbstractBruteForceAgent {
	public WeightedSpaceLeftAgent(Field field) {
		super(field, new WeightedSpaceLeftHeuristic());
	}
}
