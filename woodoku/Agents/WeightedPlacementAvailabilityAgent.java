package woodoku.Agents;

import woodoku.Game.Field;
import woodoku.Game.TileRepository;
import woodoku.Heuristics.PlacementAvailabilityHeuristic;

public class WeightedPlacementAvailabilityAgent extends AbstractBruteForceAgent {
	public WeightedPlacementAvailabilityAgent(Field field) {
		super(field, new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()));
	}
}
