public class SpaceLeftAgent extends AbstractBruteForceAgent {
	public SpaceLeftAgent(Field field) {
		super(field, new SpaceLeftHeuristic());
	}
}
