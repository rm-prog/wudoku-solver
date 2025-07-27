class BruteForceAgent extends AbstractBruteForceAgent {
    public BruteForceAgent(Field field) {
        super(field, new ZeroHeuristic());
    }
}
