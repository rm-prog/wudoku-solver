package woodoku.Agents;

import woodoku.Game.Field;
import woodoku.Heuristics.SpaceLeftHeuristic;

public class SpaceLeftAgent extends AbstractBruteForceAgent {
	public SpaceLeftAgent(Field field) {
		super(field, new SpaceLeftHeuristic());
	}
}
