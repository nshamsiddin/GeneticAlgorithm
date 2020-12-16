package strategies.mutation;

import java.util.List;

import ent.Individual;

public interface Mutation {
	public List<Individual> doMutation(List<Individual> individuals);
}
