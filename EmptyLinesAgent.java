public class EmptyLinesAgent extends AbstractBruteForceAgent {
	public EmptyLinesAgent(Field field) {
		super(field, new EmptyLinesHeuristic());
	}
}
