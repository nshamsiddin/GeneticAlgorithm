package factories.crossover;

import java.util.List;

import ent.individual.Individual;

/**
 * An interface that models the reproduction phase of the genetic algorithm.
 */
public interface Crossover {
	List<Individual> doCrossover(List<Individual> individuals);
}