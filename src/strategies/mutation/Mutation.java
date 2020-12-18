package strategies.mutation;

import java.util.List;

import ent.individual.Individual;

/**
 * An interface that models the mutation phase of the genetic algorithm.
 */
public interface Mutation {
	List<Individual> doMutation(List<Individual> individuals);
}