public class WeightedSpaceLeftAgent extends AbstractBruteForceAgent {
	public WeightedSpaceLeftAgent(Field field) {
		super(field, new WeightedSpaceLeftHeuristic());
	}
}
