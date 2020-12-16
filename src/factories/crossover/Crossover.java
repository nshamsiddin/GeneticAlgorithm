package factories.crossover;

import java.util.List;

import ent.individual.Individual;

public interface Crossover {
	public List<Individual> doCrossover(List<Individual> individuals);
}
