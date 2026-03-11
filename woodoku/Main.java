package woodoku;

import woodoku.Agents.CompoundAgent;
import woodoku.Game.Field;
import woodoku.Game.TileRepository;
import woodoku.Heuristics.CompoundHeuristic;
import woodoku.Heuristics.EmptyLinesHeuristic;
import woodoku.Heuristics.PlacementAvailabilityHeuristic;
import woodoku.Heuristics.WeightedSpaceLeftHeuristic;
import woodoku.Simulation.SimulationRunner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("=== Random woodoku.Agents.Agent Simulation ===");
        // woodoku.woodoku.Game.Game.Field field1 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Agents.RandomAgent randomAgent = new woodoku.Agents.RandomAgent(field1);
        // woodoku.Simulation.SimulationRunner sim1 = new woodoku.Simulation.SimulationRunner(randomAgent, 20);
        // sim1.run();

        // System.out.println("\n=== BruteForce woodoku.Agents.Agent Simulation ===");
        // woodoku.woodoku.Game.Game.Field field2 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Agents.BruteForceAgent bruteAgent = new woodoku.Agents.BruteForceAgent(field2);
        // woodoku.Simulation.SimulationRunner sim2 = new woodoku.Simulation.SimulationRunner(bruteAgent, 20);
        // sim2.run();

        // System.out.println("\n=== SpaceLeft woodoku.Agents.Agent Simulation ===");
        // woodoku.woodoku.Game.Game.Field field3 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Agents.SpaceLeftAgent spaceLeftAgent = new woodoku.Agents.SpaceLeftAgent(field3);
        // woodoku.Simulation.SimulationRunner sim3 = new woodoku.Simulation.SimulationRunner(spaceLeftAgent, 20);
        // sim3.run();

        // System.out.println("\n=== EmptyLines woodoku.Agents.Agent Simulation ===");
        // woodoku.woodoku.Game.Game.Field field4 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Agents.EmptyLinesAgent emptyLinesAgent = new woodoku.Agents.EmptyLinesAgent(field4);
        // woodoku.Simulation.SimulationRunner sim4 = new woodoku.Simulation.SimulationRunner(emptyLinesAgent, 20);
        // sim4.run();

        // System.out.println("\n=== PlacementAvailability woodoku.Agents.Agent Simulation ===");
        // woodoku.woodoku.Game.Game.Field field5 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Agents.PlacementAvailabilityAgent placementAvailabilityAgent = new woodoku.Agents.PlacementAvailabilityAgent(field5);
        // woodoku.Simulation.SimulationRunner sim5 = new woodoku.Simulation.SimulationRunner(placementAvailabilityAgent, 20);
        // sim5.run();
        // System.out.println("\n=== WeightedPlacementAvailability woodoku.Agents.Agent Simulation ===");
        // woodoku.woodoku.Game.Game.Field field6 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Agents.WeightedPlacementAvailabilityAgent weightedPlacementAvailabilityAgent = new woodoku.Agents.WeightedPlacementAvailabilityAgent(field6);
        // woodoku.Simulation.SimulationRunner sim6 = new woodoku.Simulation.SimulationRunner(weightedPlacementAvailabilityAgent, 20);
        // sim6.run();
        // woodoku.woodoku.Game.Game.Field field11 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Heuristics.CompoundHeuristic compoundHeuristic4 = new woodoku.Heuristics.CompoundHeuristic();
        // compoundHeuristic4.addHeuristic(new woodoku.Heuristics.WeightedSpaceLeftHeuristic(), 0.7);
        // compoundHeuristic4.addHeuristic(new woodoku.Heuristics.PlacementAvailabilityHeuristic(woodoku.Game.TileRepository.getAllTiles()), 0.3);
        // woodoku.Agents.CompoundAgent compoundAgent4 = new woodoku.Agents.CompoundAgent(field11, compoundHeuristic4);
        // woodoku.Simulation.SimulationRunner.simulateWithVisualization(compoundAgent4, true);
        //
        System.out.println("\n=== EmptyLines0.7+PlacementAvailability0.3 woodoku.Agents.Agent Simulation ===");
        Field field7 = new Field();
        CompoundHeuristic compoundHeuristic = new CompoundHeuristic();
        compoundHeuristic.addHeuristic(new EmptyLinesHeuristic(), 0.7);
        compoundHeuristic.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.3);
        CompoundAgent compoundAgent = new CompoundAgent(field7, compoundHeuristic); SimulationRunner sim7 = new SimulationRunner(compoundAgent, 20);
        sim7.run();
        System.out.println("\n=== EmptyLines0.9+PlacementAvailability0.1 woodoku.Agents.Agent Simulation ===");
        Field field8 = new Field();
        CompoundHeuristic compoundHeuristic1 = new CompoundHeuristic();
        compoundHeuristic1.addHeuristic(new EmptyLinesHeuristic(), 0.9);
        compoundHeuristic1.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.1);
        CompoundAgent compoundAgent1 = new CompoundAgent(field8, compoundHeuristic1);
        SimulationRunner sim8 = new SimulationRunner(compoundAgent1, 20);
        sim8.run();
        // System.out.println("\n=== EmptyLines0.7+WeightedSpaceLeft0.3 woodoku.Agents.Agent Simulation ===");
        // woodoku.woodoku.Game.Game.Field field9 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Heuristics.CompoundHeuristic compoundHeuristic2 = new woodoku.Heuristics.CompoundHeuristic();
        // compoundHeuristic2.addHeuristic(new woodoku.Heuristics.EmptyLinesHeuristic(), 0.7);
        // compoundHeuristic2.addHeuristic(new woodoku.Heuristics.SpaceLeftHeuristic(), 0.3);
        // woodoku.Agents.CompoundAgent compoundAgent2 = new woodoku.Agents.CompoundAgent(field9, compoundHeuristic2);
        // woodoku.Simulation.SimulationRunner sim9 = new woodoku.Simulation.SimulationRunner(compoundAgent2, 20); //sim9.run();
        // System.out.println("\n=== EmptyLines0.6+PlacementAvailability0.2+WeightedSpaceLeft0.2 woodoku.Agents.Agent Simulation ===");
        // woodoku.woodoku.Game.Game.Field field10 = new woodoku.woodoku.Game.Game.Field();
        // woodoku.Heuristics.CompoundHeuristic compoundHeuristic3 = new woodoku.Heuristics.CompoundHeuristic();
        // compoundHeuristic3.addHeuristic(new woodoku.Heuristics.EmptyLinesHeuristic(), 0.6);
        // compoundHeuristic3.addHeuristic(new woodoku.Heuristics.PlacementAvailabilityHeuristic(woodoku.Game.TileRepository.getAllTiles()), 0.2);
        // compoundHeuristic3.addHeuristic(new woodoku.Heuristics.WeightedSpaceLeftHeuristic(), 0.2);
        // woodoku.Agents.CompoundAgent compoundAgent3 = new woodoku.Agents.CompoundAgent(field10, compoundHeuristic3);
        // woodoku.Simulation.SimulationRunner sim10 = new woodoku.Simulation.SimulationRunner(compoundAgent3, 20);
        // sim10.run();
        System.out.println("\n=== WeightedSpaceLeft0.7+PlacementAvailability0.3 woodoku.Agents.Agent Simulation ===");
        Field field12 = new Field();
        CompoundHeuristic compoundHeuristic5 = new CompoundHeuristic();
        compoundHeuristic5.addHeuristic(new WeightedSpaceLeftHeuristic(), 0.7);
        compoundHeuristic5.addHeuristic(new PlacementAvailabilityHeuristic(TileRepository.getAllTiles()), 0.3);
        CompoundAgent compoundAgent5 = new CompoundAgent(field12, compoundHeuristic);
        SimulationRunner sim12 = new SimulationRunner(compoundAgent5, 20); sim12.run();
    }
}
