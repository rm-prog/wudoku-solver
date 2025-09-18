import java.util.*;

class CompoundHeuristic implements Heuristic {
    private final List<Heuristic> heuristics = new ArrayList<>();
    private final List<Double> weights = new ArrayList<>();

    public void addHeuristic(Heuristic heuristic, double weight) {
        heuristics.add(heuristic);
        weights.add(weight);
    }

    @Override
    public int evaluate(Field field) {
        double score = 0.0;

        for (int i = 0; i < heuristics.size(); i++) {
            int hScore = heuristics.get(i).evaluate(field);
            score += weights.get(i) * hScore;
        }

        return (int) Math.round(score);
    }
}

