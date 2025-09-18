import javax.swing.text.PlainDocument;

public class Main {
    public static void main(String[] args) {
    	System.out.println("=== Random Agent Simulation ===");
        Field field1 = new Field();
        RandomAgent randomAgent = new RandomAgent(field1);
        SimulationRunner sim1 = new SimulationRunner(randomAgent, 20);
        sim1.run();

        System.out.println("\n=== BruteForce Agent Simulation ===");
        Field field2 = new Field();
        BruteForceAgent bruteAgent = new BruteForceAgent(field2);
        SimulationRunner sim2 = new SimulationRunner(bruteAgent, 20);
        sim2.run();
		
		System.out.println("\n=== SpaceLeft Agent Simulation ===");
        Field field3 = new Field();
        SpaceLeftAgent spaceLeftAgent = new SpaceLeftAgent(field3);
        SimulationRunner sim3 = new SimulationRunner(spaceLeftAgent, 20);
        sim3.run();

		System.out.println("\n=== EmptyLines Agent Simulation ===");
        Field field4 = new Field();
        EmptyLinesAgent emptyLinesAgent = new EmptyLinesAgent(field4);
        SimulationRunner sim4 = new SimulationRunner(emptyLinesAgent, 20);
        sim4.run();

		//System.out.println("\n=== PlacementAvailability Agent Simulation ===");
        //Field field5 = new Field();
        //PlacementAvailabilityAgent placementAvailabilityAgent = new PlacementAvailabilityAgent(field5);
        //SimulationRunner sim5 = new SimulationRunner(placementAvailabilityAgent, 20);
        //sim5.run();

		System.out.println("\n=== WeightedPlacementAvailability Agent Simulation ===");
        Field field6 = new Field();
        WeightedPlacementAvailabilityAgent weightedPlacementAvailabilityAgent = new WeightedPlacementAvailabilityAgent(field6);
        SimulationRunner sim6 = new SimulationRunner(weightedPlacementAvailabilityAgent, 20);
        sim6.run();
		
		System.out.println("\n=== CompoundHeuristic Agent Simulation ===");
		Field field7 = new Field();
       	CompoundHeuristic compoundHeuristic = new CompoundHeuristic();
		compoundHeuristic.addHeuristic(new EmptyLinesHeuristic(), 0.7);
		compoundHeuristic.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.3);
		CompoundAgent compoundAgent = new CompoundAgent(field7, compoundHeuristic);
		SimulationRunner sim7 = new SimulationRunner(compoundAgent, 20);
		sim7.run();

	}
}
