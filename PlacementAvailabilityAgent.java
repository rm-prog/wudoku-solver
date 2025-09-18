public class PlacementAvailabilityAgent extends AbstractBruteForceAgent {
	public PlacementAvailabilityAgent(Field field) {
		super(field, new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()));
	}
}
