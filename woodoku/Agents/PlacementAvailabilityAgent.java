package woodoku.Agents;

import woodoku.Game.Field;
import woodoku.Game.TileRepository;
import woodoku.Heuristics.PlacementAvailabilityHeuristic;

public class PlacementAvailabilityAgent extends AbstractBruteForceAgent {
	public PlacementAvailabilityAgent(Field field) {
		super(field, new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()));
	}
}
