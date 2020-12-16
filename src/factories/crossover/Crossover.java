package factories.crossover;

import java.util.List;

import ent.Individual;

public interface Crossover {
	public List<Individual> doCrossover(List<Individual> individuals);
}
