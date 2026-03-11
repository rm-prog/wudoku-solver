public class Main {
    public static void main(String[] args) {
        //System.out.println("=== Random Agent Simulation ===");
        // Field field1 = new Field();
        // RandomAgent randomAgent = new RandomAgent(field1);
        // SimulationRunner sim1 = new SimulationRunner(randomAgent, 20);
        // sim1.run();

        // System.out.println("\n=== BruteForce Agent Simulation ===");
        // Field field2 = new Field();
        // BruteForceAgent bruteAgent = new BruteForceAgent(field2);
        // SimulationRunner sim2 = new SimulationRunner(bruteAgent, 20);
        // sim2.run();

        // System.out.println("\n=== SpaceLeft Agent Simulation ===");
        // Field field3 = new Field();
        // SpaceLeftAgent spaceLeftAgent = new SpaceLeftAgent(field3);
        // SimulationRunner sim3 = new SimulationRunner(spaceLeftAgent, 20);
        // sim3.run();

        // System.out.println("\n=== EmptyLines Agent Simulation ===");
        // Field field4 = new Field();
        // EmptyLinesAgent emptyLinesAgent = new EmptyLinesAgent(field4);
        // SimulationRunner sim4 = new SimulationRunner(emptyLinesAgent, 20);
        // sim4.run();

        // System.out.println("\n=== PlacementAvailability Agent Simulation ===");
        // Field field5 = new Field();
        // PlacementAvailabilityAgent placementAvailabilityAgent = new PlacementAvailabilityAgent(field5);
        // SimulationRunner sim5 = new SimulationRunner(placementAvailabilityAgent, 20);
        // sim5.run();
        // System.out.println("\n=== WeightedPlacementAvailability Agent Simulation ===");
        // Field field6 = new Field();
        // WeightedPlacementAvailabilityAgent weightedPlacementAvailabilityAgent = new WeightedPlacementAvailabilityAgent(field6);
        // SimulationRunner sim6 = new SimulationRunner(weightedPlacementAvailabilityAgent, 20);
        // sim6.run();
        // Field field11 = new Field();
        // CompoundHeuristic compoundHeuristic4 = new CompoundHeuristic();
        // compoundHeuristic4.addHeuristic(new WeightedSpaceLeftHeuristic(), 0.7);
        // compoundHeuristic4.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.3);
        // CompoundAgent compoundAgent4 = new CompoundAgent(field11, compoundHeuristic4);
        // SimulationRunner.simulateWithVisualization(compoundAgent4, true);
        //
        System.out.println("\n=== EmptyLines0.7+PlacementAvailability0.3 Agent Simulation ===");
        Field field7 = new Field();
        CompoundHeuristic compoundHeuristic = new CompoundHeuristic();
        compoundHeuristic.addHeuristic(new EmptyLinesHeuristic(), 0.7);
        compoundHeuristic.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.3);
        CompoundAgent compoundAgent = new CompoundAgent(field7, compoundHeuristic); SimulationRunner sim7 = new SimulationRunner(compoundAgent, 20);
        sim7.run();
        System.out.println("\n=== EmptyLines0.9+PlacementAvailability0.1 Agent Simulation ===");
        Field field8 = new Field();
        CompoundHeuristic compoundHeuristic1 = new CompoundHeuristic();
        compoundHeuristic1.addHeuristic(new EmptyLinesHeuristic(), 0.9);
        compoundHeuristic1.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.1);
        CompoundAgent compoundAgent1 = new CompoundAgent(field8, compoundHeuristic1);
        SimulationRunner sim8 = new SimulationRunner(compoundAgent1, 20);
        sim8.run();
        // System.out.println("\n=== EmptyLines0.7+WeightedSpaceLeft0.3 Agent Simulation ===");
        // Field field9 = new Field();
        // CompoundHeuristic compoundHeuristic2 = new CompoundHeuristic();
        // compoundHeuristic2.addHeuristic(new EmptyLinesHeuristic(), 0.7);
        // compoundHeuristic2.addHeuristic(new SpaceLeftHeuristic(), 0.3);
        // CompoundAgent compoundAgent2 = new CompoundAgent(field9, compoundHeuristic2);
        // SimulationRunner sim9 = new SimulationRunner(compoundAgent2, 20); //sim9.run();
        // System.out.println("\n=== EmptyLines0.6+PlacementAvailability0.2+WeightedSpaceLeft0.2 Agent Simulation ===");
        // Field field10 = new Field();
        // CompoundHeuristic compoundHeuristic3 = new CompoundHeuristic();
        // compoundHeuristic3.addHeuristic(new EmptyLinesHeuristic(), 0.6);
        // compoundHeuristic3.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.2);
        // compoundHeuristic3.addHeuristic(new WeightedSpaceLeftHeuristic(), 0.2);
        // CompoundAgent compoundAgent3 = new CompoundAgent(field10, compoundHeuristic3);
        // SimulationRunner sim10 = new SimulationRunner(compoundAgent3, 20);
        // sim10.run();
        System.out.println("\n=== WeightedSpaceLeft0.7+PlacementAvailability0.3 Agent Simulation ===");
        Field field12 = new Field();
        CompoundHeuristic compoundHeuristic5 = new CompoundHeuristic();
        compoundHeuristic5.addHeuristic(new WeightedSpaceLeftHeuristic(), 0.7);
        compoundHeuristic5.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.3);
        CompoundAgent compoundAgent5 = new CompoundAgent(field12, compoundHeuristic);
        SimulationRunner sim12 = new SimulationRunner(compoundAgent5, 20); sim12.run();
    }
}
