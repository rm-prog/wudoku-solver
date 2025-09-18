public class WeightedPlacementAvailabilityAgent extends AbstractBruteForceAgent {
	public WeightedPlacementAvailabilityAgent(Field field) {
		super(field, new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()));
	}
}
