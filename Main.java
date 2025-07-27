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


	}
}
