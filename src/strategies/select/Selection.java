package strategies.select;

import java.util.List;

import ent.individual.Individual;

/**
 * An interface that models the selection phase of the genetic algorithm.
 */
public interface Selection {
	List<Individual> doSelection(List<Individual> individuals);
}