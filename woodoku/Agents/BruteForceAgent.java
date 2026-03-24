package woodoku.Agents;

import woodoku.Game.Field;
import woodoku.Heuristics.ZeroHeuristic;

public class BruteForceAgent extends AbstractBruteForceAgent {
    public BruteForceAgent(Field field) {
        super(field, new ZeroHeuristic());
    }
}
